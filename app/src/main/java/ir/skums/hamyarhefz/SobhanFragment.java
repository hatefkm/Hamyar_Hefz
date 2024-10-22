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

public class SobhanFragment extends Fragment {


    public SobhanFragment() {
        // Required empty public constructor
    }


    Button resetBtn;
    Button menhaBtn;
    Button addBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";

    // TODO: Rename and change types and number of parameters
    public static SobhanFragment newInstance(String param1, String param2) {
        SobhanFragment fragment = new SobhanFragment();
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
        View view= inflater.inflate(R.layout.fragment_sobhan, container, false);


        resetBtn = view.findViewById(R.id.btn_resetSobhan);
        addBtn = view.findViewById(R.id.btn_addSobhan);
        menhaBtn = view.findViewById(R.id.btn_menhaSobhan);
        resultTv = view.findViewById(R.id.tv_resultSobhan);



        SharedPreferences prefsSobhan = requireContext().getSharedPreferences("MY_PREFSSobhan", Context.MODE_PRIVATE);
        counter = prefsSobhan.getInt("COUNTER_KEY",0);
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

        SharedPreferences.Editor editorSobhan = requireContext().getSharedPreferences("MY_PREFSSobhan" , Context.MODE_PRIVATE).edit();
        editorSobhan.putInt("COUNTER_KEY" , counter);
        editorSobhan.apply();

    }
}