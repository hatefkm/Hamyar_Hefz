package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class AyamHafte1Activity extends AppCompatActivity {


    Button resetBtnSeshanbe;
    Button addBtnSeshanbe;
    TextView resultTvSeshanbe;

    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";

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





        resetBtnSeshanbe = findViewById(R.id.btn_resetSeshanbe);
        addBtnSeshanbe = findViewById(R.id.btn_addSeshanbe);
        resultTvSeshanbe = findViewById(R.id.tv_resultSeshanbe);

        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);
        counter = prefs.getInt("COUNTER_KEY",0);
       // resultTvSeshanbe.setText(String.valueOf(counter));

       // addBtnSeshanbe.setOnClickListener(view -> {
       //     counter++;
      //      resultTvSeshanbe.setText(String.valueOf(counter));
      //  });

       // resetBtnSeshanbe.setOnClickListener(view -> {
       //     counter = 0;
       //     resultTvSeshanbe.setText(String.valueOf(counter));

      //  });







    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS" , MODE_PRIVATE).edit();
        editor.putInt("COUNTER_KEY" , counter);
        editor.apply();
    }


}