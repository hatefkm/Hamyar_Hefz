package ir.skums.hamyarhefz.ayatnavigationbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.io.IOException;

import ir.skums.hamyarhefz.DatabaseHelper;
import ir.skums.hamyarhefz.R;

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }
    TextView textView;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;





    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        databaseHelper =new DatabaseHelper(getActivity());
        try {
            databaseHelper.updateDatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }

        database=databaseHelper.getReadableDatabase();


        try {



        Cursor c=database.rawQuery("SELECT matn FROM tblquran WHERE id=1 ",null);
       // textView.setText(c.getString(1));


        String matn;

        if (c.moveToFirst()){
            do {
                matn=c.getString(0);
            }while (c.moveToNext());
            textView.setText(matn);

        }

        c.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return view;
    }
}