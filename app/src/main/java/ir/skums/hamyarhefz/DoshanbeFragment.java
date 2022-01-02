package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeViewModelKt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DoshanbeFragment extends Fragment {


    // TODO: Rename and change types of parameters


    public DoshanbeFragment() {
        // Required empty public constructor
    }



    Button resetBtn;
    Button addBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";


    // TODO: Rename and change types and number of parameters
    public static DoshanbeFragment newInstance(String param1, String param2) {
        DoshanbeFragment fragment = new DoshanbeFragment();
        Bundle args = new Bundle();

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
       View view=inflater.inflate(R.layout.fragment_doshanbe, container, false);





        resetBtn = view.findViewById(R.id.btn_resetDoshanbe);
        addBtn = view.findViewById(R.id.btn_addDoshanbe);
        resultTv = view.findViewById(R.id.tv_resultDoshanbe);



        SharedPreferences prefs = requireContext().getSharedPreferences("MY_PREFS", Context.MODE_PRIVATE);
        counter = prefs.getInt("COUNTER_KEY",0);
        resultTv.setText(String.valueOf(counter));


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter++;
                resultTv.setText(String.valueOf(counter));
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter = 0;
                resultTv.setText(String.valueOf(counter));
            }
        });



        return view;

    }
}