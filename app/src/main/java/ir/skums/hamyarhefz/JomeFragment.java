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

public class JomeFragment extends Fragment {


    public JomeFragment() {
        // Required empty public constructor
    }


    Button resetBtn,btnPlay;
    Button addBtn;
    TextView resultTv,zekr_roz_jome;
    Button menhaBtn;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";
    static MediaPlayer mediaPlayer;


    // TODO: Rename and change types and number of parameters
    public static JomeFragment newInstance(String param1, String param2) {
        JomeFragment fragment = new JomeFragment();
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
        View view =inflater.inflate(R.layout.fragment_jome, container, false);



        resetBtn = view.findViewById(R.id.btn_resetJome);
        addBtn = view.findViewById(R.id.btn_addJome);
        menhaBtn = view.findViewById(R.id.btn_menhaJome);
        resultTv = view.findViewById(R.id.tv_resultJome);
        zekr_roz_jome = view.findViewById(R.id.zekr_roz_jome);


        btnPlay=view.findViewById(R.id.btn_playJome);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.jome_audio);





        SharedPreferences prefsJome = requireContext().getSharedPreferences("MY_PREFSJome", Context.MODE_PRIVATE);
        counter = prefsJome.getInt("COUNTER_KEY",0);
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
        Typeface type2=Typeface.createFromAsset(getActivity().getAssets(), "fonts/b_nazanin.TTF");
        resultTv.setTypeface(type);
        zekr_roz_jome.setTypeface(type2);

        return view;
    }


    @Override
    public void onStop() {
        super.onStop();

        SharedPreferences.Editor editorJome = requireContext().getSharedPreferences("MY_PREFSJome" , Context.MODE_PRIVATE).edit();
        editorJome.putInt("COUNTER_KEY" , counter);
        editorJome.apply();

    }
}