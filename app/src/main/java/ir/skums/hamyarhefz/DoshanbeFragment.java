package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
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



    Button resetBtn,btnPlay;
    Button addBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";
    static MediaPlayer mediaPlayer;


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


        btnPlay=view.findViewById(R.id.btn_playDoshanbe);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.doshanbe_audio);



        SharedPreferences prefsDoShanbe = requireContext().getSharedPreferences("MY_PREFSDoShanbe", Context.MODE_PRIVATE);
        counter = prefsDoShanbe.getInt("COUNTER_KEY",0);
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

        SharedPreferences.Editor editorDoShanbe = requireContext().getSharedPreferences("MY_PREFSDoShanbe" , Context.MODE_PRIVATE).edit();
        editorDoShanbe.putInt("COUNTER_KEY" , counter);
        editorDoShanbe.apply();

    }
}