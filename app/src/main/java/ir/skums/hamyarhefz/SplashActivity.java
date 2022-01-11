package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th = new Thread() {
            @Override
            public void run() {
                try {

                    sleep(5000);
                    Intent i = new Intent(getBaseContext(), HomeActivity.class);
                    startActivity(i);
                    finish();

                } catch (Exception e) {
                }

            }


        };
        th.start();
    }
}