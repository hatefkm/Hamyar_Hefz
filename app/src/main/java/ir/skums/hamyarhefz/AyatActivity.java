package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import ir.skums.hamyarhefz.ayatnavigationbar.NoteFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.QuestionFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.HomeFragment;
import ir.skums.hamyarhefz.ayatnavigationbar.TranslateFragment;


public class AyatActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
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
    }
}