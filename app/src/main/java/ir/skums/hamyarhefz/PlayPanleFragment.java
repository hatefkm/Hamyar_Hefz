package ir.skums.hamyarhefz;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class PlayPanleFragment extends Fragment {


    public PlayPanleFragment() {
        // Required empty public constructor
    }


    Button btnPlay, btnDownload;
    TextView txtSongStart, txtSongEnd, txtView;
    SeekBar seekMusicBar;

    static MediaPlayer mediaPlayer;
    int position;
    private int timeInt;

    ArrayList<File> mySongs;

    Thread updateSeekBar;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_play_panle, container, false);


        //media player
        //Assigning the address of the andorid Materials
        btnPlay = view.findViewById(R.id.BtnPlay_frgPlayPanel);

        btnDownload = view.findViewById(R.id.BtnDownload_frgPlayPanle);
        txtSongStart = view.findViewById(R.id.TxtSongStart_frgPlayPanel);
        txtSongEnd = view.findViewById(R.id.TxtSongEnd_frgPlayPanel);

        seekMusicBar = view.findViewById(R.id.SeekBar_frgPlayPanel);

        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.audio);

        try {
            // 1- check song duration
            setSongDuration();


            // 2- set seekbar info
            seekMusicBar.setMax(mediaPlayer.getDuration());


            // 3- run thread
            updateSeekBar = new Thread() {
                @Override
                public void run() {

                    int TotalDuration = mediaPlayer.getDuration();
                    int CurrentPosition = 0;

                    while (CurrentPosition < TotalDuration) {
                        try {

                            sleep(500);
                            CurrentPosition = mediaPlayer.getCurrentPosition();
                            seekMusicBar.setProgress(CurrentPosition);

                        } catch (InterruptedException | IllegalStateException e) {

                            e.printStackTrace();
                        }
                    }

                }
            };


            // 4- start thread
            updateSeekBar.start();


            //Setting the Music player from the position of the seekbar
            seekMusicBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                    //getting the progress of the seek bar and setting it to Media Player
                    mediaPlayer.seekTo(seekBar.getProgress());

                }
            });


            //Creating the Handler to update the current duration
            final Handler handler = new Handler();
            final int delay = 1000;

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //Getting the current duration from the media player
                  //  String currentTime = String.valueOf(mediaPlayer.getCurrentPosition());

                    int crTime= mediaPlayer.getCurrentPosition();
                    //Setting the current duration in textView
                    String time = "";

                    int min = crTime / 1000 / 60;
                    int sec = crTime / 1000 % 60;

                   time = time + min +":" + sec ;
                   if (sec < 10) {

                     time = min +":"+"0"+sec;

                   }
                    txtSongStart.setText(time);
                    handler.postDelayed(this,delay);


                }

            }, delay);


            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

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



        } catch (Exception ex) {
            Log.d("=error", "onCreateView: " + ex.getMessage());
        }

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }


    //Preparing the Time format for setting to textView
    public void setSongDuration() {

        int duration = mediaPlayer.getDuration();



        String time = "";
        int min = duration / 1000 / 60;
        int sec = duration / 1000 % 60;

        time = time + min +":" +sec;

        //if (sec < 10) {

         //  time += "0";

      //  }


        txtSongEnd.setText(time);

    }
}