package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AlhamdFragment extends Fragment {


    public AlhamdFragment() {
        // Required empty public constructor
    }



    Button resetBtn;
    Button addBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";



    // TODO: Rename and change types and number of parameters
    public static AlhamdFragment newInstance(String param1, String param2) {
        AlhamdFragment fragment = new AlhamdFragment();
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
        View view = inflater.inflate(R.layout.fragment_alhamd, container, false);


        resetBtn = view.findViewById(R.id.btn_resetAlhamd);
        addBtn = view.findViewById(R.id.btn_addAlhamd);
        resultTv = view.findViewById(R.id.tv_resultAlhamd);





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