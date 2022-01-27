package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ir.skums.hamyarhefz.soalat.EbEnJ9Activity;

public class Soal1ActivityJ9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal1);
    }

    public void btnSoal1(View view) {
        Intent intent = new Intent(Soal1ActivityJ9.this, EbEnJ9Activity.class);
        startActivity(intent);
    }
}