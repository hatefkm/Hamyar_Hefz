package ir.skums.hamyarhefz.ayatnavigationbar;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import java.io.IOException;

import ir.skums.hamyarhefz.DatabaseHelper;
import ir.skums.hamyarhefz.R;

public class HomeFragment3 extends Fragment {


    public HomeFragment3() {
        // Required empty public constructor
    }
    TextView textView;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;





    // TODO: Rename and change types and number of parameters
    public static HomeFragment3 newInstance(String param1, String param2) {
        HomeFragment3 fragment = new HomeFragment3();
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
         View view =inflater.inflate(R.layout.fragment_home3, container, false);


        return view;
    }
}