package ir.skums.hamyarhefz;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ir.skums.hamyarhefz.ayatnavigationbar.NoteFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.QuestionFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.HomeFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.NamSoreFragment;


public class AyatActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);




        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigationbar);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, new HomeFragment()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp = null;
                switch (item.getItemId()) {
                    case R.id.Home:
                        temp = new HomeFragment();
                        break;
                    case R.id.Note:
                        temp = new NoteFragment();
                        break;
                    case R.id.Question:
                        temp = new QuestionFragment();
                        break;
                    case R.id.Translate:
                        temp = new NamSoreFragment();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, temp).commit();
                return true;
            }

        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutPlay, new PlayPanleFragment()).addToBackStack(null).commit();


            }

        });








    }




    public void btnSoal(View view) {
        Intent intent = new Intent(AyatActivity.this, Soal2ActivityJ1.class);
        startActivity(intent);
    }













}