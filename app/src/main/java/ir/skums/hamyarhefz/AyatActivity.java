package ir.skums.hamyarhefz;

import static com.google.android.material.floatingactionbutton.FloatingActionButton.*;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.MenuItem;
import android.view.SurfaceControl;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import ir.skums.hamyarhefz.ayatnavigationbar.NoteFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.QuestionFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.HomeFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.TranslateFragment;



import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;


public class AyatActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    Button btnPlay, btnPause, btnDownload;
    TextView  txtSongStart, txtSongEnd;
    SeekBar seekMusicBar;


    ImageView imageView;

    LinearLayout layout ;
    PlayPanleFragment playPanleFragment;


    String songName;
    public static final String EXTRA_NAME = "song_name";
    static MediaPlayer mediaPlayer;
    int position;


    Thread updateSeekBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigationbar);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer,new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp = null;
                switch (item.getItemId())
                {
                    case R.id.Home:  temp = new HomeFragment();
                        break;
                    case R.id.Note:  temp = new NoteFragment();
                        break;
                    case R.id.Question:  temp = new QuestionFragment();
                        break;
                    case R.id.Translate:  temp = new TranslateFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer,temp).commit();
                return true;
            }

        });






        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();



                    getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutPlay,new PlayPanleFragment()).addToBackStack(null).commit();


                  //  FragmentManager fm=getSupportFragmentManager();
                    //fm.beginTransaction().add(R.id.FrameLayoutPlay,new PlayPanleFragment()).commit();




            }

        });








        //Assigning the address of the andorid Materials
        btnPlay = (Button) findViewById(R.id.BtnPlay);
        btnPause = (Button) findViewById(R.id.BtnPause);
        btnDownload = (Button) findViewById(R.id.BtnDownload);


        txtSongStart = (TextView) findViewById(R.id.TxtSongStart);
        txtSongEnd = (TextView) findViewById(R.id.TxtSongEnd);


        seekMusicBar = (SeekBar) findViewById(R.id.SeekBar);



        //Checking if any song playing or not
        if (mediaPlayer != null) {

            //we will start mediaPlayer if currently there is no songs in it
            mediaPlayer.start();
            mediaPlayer.release();
        }


        //Getting the Required Details from the past Intent
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();



















    }



    public void BtnExPl(View view) {
     //   FragmentManager fm=getSupportFragmentManager();
      //  fm.beginTransaction().add(R.id.FrameLayoutPlay,new PlayPanleFragment()).commit();
      //  fm.beginTransaction().remove(PlayPanleFragment.getInstance()).commit();
        //getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutPlay,new PlayPanleFragment()).addToBackStack(null).commit();


    }


    @Override
    public void onBackPressed() {
      //  FragmentManager fm=getSupportFragmentManager();
      //  fm.beginTransaction().add(R.id.FrameLayoutPlay,new PlayPanleFragment()).commit();
      //  fm.beginTransaction().remove(PlayPanleFragment.getInstance()).commit();



        super.onBackPressed();
    }

    public void btnSoal(View view) {
        Intent intent = new Intent(AyatActivity.this,Soal1Activity.class);
        startActivity(intent);
    }







}