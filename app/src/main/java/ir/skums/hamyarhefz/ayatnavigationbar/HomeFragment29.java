package ir.skums.hamyarhefz.ayatnavigationbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ir.skums.hamyarhefz.DatabaseHelper;
import ir.skums.hamyarhefz.Matn;
import ir.skums.hamyarhefz.MatnAdapter;
import ir.skums.hamyarhefz.R;

public class HomeFragment29 extends Fragment {


    public HomeFragment29() {
        // Required empty public constructor
    }

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;

    List<Matn> matnList;
    ListView listViewJozha;
    MatnAdapter adapter;




    // TODO: Rename and change types and number of parameters
    public static HomeFragment29 newInstance(String param1, String param2) {
        HomeFragment29 fragment = new HomeFragment29();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);
        databaseHelper=new DatabaseHelper(getActivity());
        try {
            databaseHelper.updateDatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        database=databaseHelper.getReadableDatabase();

        listViewJozha=view.findViewById(R.id.listViewJozha);
        matnList =new ArrayList<>();
        showJozhaFromDatabase();

        listViewJozha.setAdapter(adapter);

        listViewJozha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



            }
        });

        return view;
    }


    private void showJozhaFromDatabase() {
        Cursor cursorJozha=database.rawQuery("SELECT matn FROM tblquran WHERE id=30",null);
        if (cursorJozha.moveToFirst()){
            do {
                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(0)));
            }while (cursorJozha.moveToNext());
        }

        cursorJozha.close();
        adapter=new MatnAdapter(getActivity(),R.layout.list_layout_joz, matnList,database);
        listViewJozha.setAdapter(adapter);

    }

}