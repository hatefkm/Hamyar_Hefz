package ir.skums.hamyarhefz;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ir.skums.hamyarhefz.ayatnavigationbar.HomeFragment9;
import ir.skums.hamyarhefz.ayatnavigationbar.NamSoreFragment9;
import ir.skums.hamyarhefz.ayatnavigationbar.NoteFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.QuestionFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.NamSoreFragment;


public class AyatActivity9 extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);




        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomnavigationbar);
        bottomNavigationView.setBackground(null);
        bottomNavigationView.getMenu().getItem(2).setEnabled(false);
        getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, new HomeFragment9()).commit();
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp = null;
                switch (item.getItemId()) {
                    case R.id.Home:
                        temp = new HomeFragment9();
                        break;
                    case R.id.Note:
                        temp = new NoteFragment();
                        break;
                    case R.id.Question:
                        temp = new QuestionFragment();
                        break;
                    case R.id.Translate:
                        temp = new NamSoreFragment9();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.framecontainer, temp).commit();
                return true;
            }

        });
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.FrameLayoutPlay, new PlayPanleFragment9()).addToBackStack(null).commit();

            }

        });








    }




    public void btnSoal(View view) {
        Intent intent = new Intent(AyatActivity9.this, Soal1ActivityJ10.class);
        startActivity(intent);
    }













}