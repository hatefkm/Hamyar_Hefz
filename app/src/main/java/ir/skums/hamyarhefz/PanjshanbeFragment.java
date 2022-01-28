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

public class PanjshanbeFragment extends Fragment {


    public PanjshanbeFragment() {
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
    public static PanjshanbeFragment newInstance(String param1, String param2) {
        PanjshanbeFragment fragment = new PanjshanbeFragment();
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
        View view= inflater.inflate(R.layout.fragment_panjshanbe, container, false);



        resetBtn = view.findViewById(R.id.btn_resetPanjshanbe);
        addBtn = view.findViewById(R.id.btn_addPanjshanbe);
        resultTv = view.findViewById(R.id.tv_resultPanjshanbe);


        btnPlay=view.findViewById(R.id.btn_playPanjshanbe);
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.panjshanbe_audio);




        SharedPreferences prefsPanjShanbe = requireContext().getSharedPreferences("MY_PREFSPanjShanbe", Context.MODE_PRIVATE);
        counter = prefsPanjShanbe.getInt("COUNTER_KEY",0);
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

        SharedPreferences.Editor editorPanjShanbe = requireContext().getSharedPreferences("MY_PREFSPanjShanbe" , Context.MODE_PRIVATE).edit();
        editorPanjShanbe.putInt("COUNTER_KEY" , counter);
        editorPanjShanbe.apply();

    }
}