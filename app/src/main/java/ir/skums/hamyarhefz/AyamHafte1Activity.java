package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class AyamHafte1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayam_hafte1);



        FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.frameShanbe,new ShanbeFragment()).commit();

        fm.beginTransaction().add(R.id.frameYesh,new YekshanbeFragment()).commit();

        fm.beginTransaction().add(R.id.frameDosh,new DoshanbeFragment()).commit();

        fm.beginTransaction().add(R.id.frameSesh,new SeshanbeFragment()).commit();

        fm.beginTransaction().add(R.id.frameCharsh,new CharshanbeFragment()).commit();

        fm.beginTransaction().add(R.id.framePanjsh,new PanjshanbeFragment()).commit();

        fm.beginTransaction().add(R.id.frameJome,new JomeFragment()).commit();








    }
}