package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class AllahAkbarkFragment extends Fragment {


    public AllahAkbarkFragment() {
        // Required empty public constructor
    }




    Button resetBtn;
    Button addBtn;
    Button menhaBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";

    // TODO: Rename and change types and number of parameters
    public static AllahAkbarkFragment newInstance(String param1, String param2) {
        AllahAkbarkFragment fragment = new AllahAkbarkFragment();
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
        View view= inflater.inflate(R.layout.fragment_allah_akbark, container, false);




        resetBtn = view.findViewById(R.id.btn_resetAllah);
        addBtn = view.findViewById(R.id.btn_addAllah);
        menhaBtn = view.findViewById(R.id.btn_menhaAllah);
        resultTv = view.findViewById(R.id.tv_resultAllah);



        SharedPreferences prefsAlahakbar = requireContext().getSharedPreferences("MY_PREFSAlahakbar", Context.MODE_PRIVATE);
        counter = prefsAlahakbar.getInt("COUNTER_KEY",0);
        resultTv.setText(String.valueOf(counter));

        if (counter<=0){
            menhaBtn.setEnabled(false);
        }else if (counter>=0){
            menhaBtn.setEnabled(true);
        }


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter++;
                resultTv.setText(String.valueOf(counter));
                if (counter<=0){
                    menhaBtn.setEnabled(false);
                }else if (counter>=0){
                    menhaBtn.setEnabled(true);
                }
            }
        });
        menhaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter--;
                resultTv.setText(String.valueOf(counter));
                if (counter<=0){
                    menhaBtn.setEnabled(false);
                }else if (counter>=0){
                    menhaBtn.setEnabled(true);
                }
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter = 0;
                resultTv.setText(String.valueOf(counter));
                if (counter<=0){
                    menhaBtn.setEnabled(false);
                }else if (counter>=0){
                    menhaBtn.setEnabled(true);
                }
            }
        });

        Typeface type=Typeface.createFromAsset(getActivity().getAssets(), "fonts/b_titr.TTF");
        resultTv.setTypeface(type);


        return view;
    }

    @Override
    public void onStop() {
        super.onStop();

        SharedPreferences.Editor editorAlahakbar = requireContext().getSharedPreferences("MY_PREFSAlahakbar" , Context.MODE_PRIVATE).edit();
        editorAlahakbar.putInt("COUNTER_KEY" , counter);
        editorAlahakbar.apply();

    }
}