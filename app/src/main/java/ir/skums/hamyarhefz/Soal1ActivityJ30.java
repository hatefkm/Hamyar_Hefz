package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ir.skums.hamyarhefz.soalat.EbEnJ30Activity;

public class Soal1ActivityJ30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
    }

    public void btnSoal1(View view) {
        Intent intent = new Intent(Soal1ActivityJ30.this, EbEnJ30Activity.class);
        startActivity(intent);
    }
}