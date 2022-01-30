package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ShanbeFragment extends Fragment {





    public ShanbeFragment() {
        // Required empty public constructor
    }


    Button resetBtn,btnPlay;
    Button addBtn;
    Button menhaBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";
    static MediaPlayer mediaPlayer;

    // TODO: Rename and change types and number of parameters
    public static ShanbeFragment newInstance(String param1, String param2) {
        ShanbeFragment fragment = new ShanbeFragment();
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
       View view = inflater.inflate(R.layout.fragment_shanbe, container, false);



        resetBtn = view.findViewById(R.id.btn_resetShanbe);
        addBtn = view.findViewById(R.id.btn_addShanbe);
        menhaBtn = view.findViewById(R.id.btn_menhaShanbe);
        resultTv = view.findViewById(R.id.tv_resultShanbe);


        btnPlay=view.findViewById(R.id.btn_playShanbe);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.shanbe_audio);



        SharedPreferences prefsShanbe = requireContext().getSharedPreferences("MY_PREFSShanbe", Context.MODE_PRIVATE);
        counter = prefsShanbe.getInt("COUNTER_KEY",0);
        resultTv.setText(String.valueOf(counter));



        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter++;
                resultTv.setText(String.valueOf(counter));
            }
        });

        menhaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                counter--;
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



        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {

                //Checking playing any songs or not
                if (mediaPlayer.isPlaying()) {

                    //setting the play icon
                    btnPlay.setBackgroundResource(R.drawable.play_song_icon);

                    //Pausing the current media
                    mediaPlayer.pause();

                } else {

                    //Setting the pause icon
                    btnPlay.setBackgroundResource(R.drawable.pause_song_icon);

                    //Starting the media player
                    mediaPlayer.start();
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

        SharedPreferences.Editor editorShanbe = requireContext().getSharedPreferences("MY_PREFSShanbe" , Context.MODE_PRIVATE).edit();
        editorShanbe.putInt("COUNTER_KEY" , counter);
        editorShanbe.apply();

    }
}