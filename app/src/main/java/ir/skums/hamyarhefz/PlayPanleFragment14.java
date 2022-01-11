package ir.skums.hamyarhefz;

import static android.content.Context.DOWNLOAD_SERVICE;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.File;
import java.util.ArrayList;


public class PlayPanleFragment14 extends Fragment {


    private static final int PERMISSION_STORAGE_CODE = 1000;

    public PlayPanleFragment14() {
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

    private Uri uri;
    private long downloadId;


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

        //download
        getActivity().registerReceiver(onDowbloadComplete,new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));



        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                beginDownload();






            }
        });

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

    private void beginDownload(){
        File file=new File(getActivity().getExternalFilesDir(null),"Joz15"+".mp3" );
        DownloadManager.Request request=null;

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
             request=new DownloadManager.Request(Uri.parse("https://uploadb.me/direct/ajyeempylj47/PART-15.mp3.html"))
                    .setTitle("Joz15"+".mp3")
                    .setDescription("در حال دانلود")
                    .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    .setDestinationUri(Uri.fromFile(file))
                    .setRequiresCharging(false)
                    .setAllowedOverMetered(true)
                    .setAllowedOverRoaming(true);
        }
        else {
             request=new DownloadManager.Request(Uri.parse("https://uploadb.me/direct/ajyeempylj47/PART-15.mp3.html"))
                    .setTitle("Joz15"+".mp3")
                    .setDescription("در حال دانلود")
                    .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                    .setDestinationUri(Uri.fromFile(file))
                    .setAllowedOverRoaming(true);



        }

        DownloadManager downloadManager=(DownloadManager)getActivity().getSystemService(DOWNLOAD_SERVICE);
        downloadId=downloadManager.enqueue(request);


    }

    private BroadcastReceiver onDowbloadComplete = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            long id=intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID,-1);
            if (downloadId==id){

                Toast.makeText(getActivity(), "دانلود کامل شد" ,Toast.LENGTH_SHORT).show();
            }

        }
    };

    @Override
    public void onDestroy() {
        super.onDestroy();
       getActivity().unregisterReceiver(onDowbloadComplete);
    }
}