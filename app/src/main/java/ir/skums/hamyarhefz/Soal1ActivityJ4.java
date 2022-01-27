package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ir.skums.hamyarhefz.soalat.EbEnJ4Activity;

public class Soal1ActivityJ4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
    }

    public void btnSoal1(View view) {
        Intent intent = new Intent(Soal1ActivityJ4.this, EbEnJ4Activity.class);
        startActivity(intent);
    }
}