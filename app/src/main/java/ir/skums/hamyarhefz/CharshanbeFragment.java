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

public class CharshanbeFragment extends Fragment {




    public CharshanbeFragment() {
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
    public static CharshanbeFragment newInstance(String param1, String param2) {
        CharshanbeFragment fragment = new CharshanbeFragment();
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
        View view = inflater.inflate(R.layout.fragment_charshanbe, container, false);





        resetBtn = view.findViewById(R.id.btn_resetCharshanbe);
        addBtn = view.findViewById(R.id.btn_addCharshanbe);
        menhaBtn = view.findViewById(R.id.btn_menhaCharshanbe);
        resultTv = view.findViewById(R.id.tv_resultCharshanbe);




        btnPlay=view.findViewById(R.id.btn_playCharshanbe);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.charshanbe_audio);


        SharedPreferences prefsCharShanbe = requireContext().getSharedPreferences("MY_PREFSCharShanbe", Context.MODE_PRIVATE);
        counter = prefsCharShanbe.getInt("COUNTER_KEY",0);
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
        resultTv.setTypeface(type);


        return view;

    }

    @Override
    public void onStop() {
        super.onStop();

        SharedPreferences.Editor editorCharShanbe = requireContext().getSharedPreferences("MY_PREFSCharShanbe" , Context.MODE_PRIVATE).edit();
        editorCharShanbe.putInt("COUNTER_KEY" , counter);
        editorCharShanbe.apply();

    }
}