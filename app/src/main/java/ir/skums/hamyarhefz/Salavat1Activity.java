package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;


public class Salavat1Activity extends AppCompatActivity {


    Button resetBtn;
    Button addBtn;
    TextView resultTv;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salavat1);


        resetBtn = findViewById(R.id.btn_reset);
        addBtn = findViewById(R.id.btn_add);
        resultTv = findViewById(R.id.tv_result);



        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);
        counter = prefs.getInt("COUNTER_KEY",0);
        resultTv.setText(String.valueOf(counter));

        addBtn.setOnClickListener(view -> {
            counter++;
            resultTv.setText(String.valueOf(counter));
        });

        resetBtn.setOnClickListener(view -> {
            counter = 0;
            resultTv.setText(String.valueOf(counter));

        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS" , MODE_PRIVATE).edit();
        editor.putInt("COUNTER_KEY" , counter);
        editor.apply();
    }
}