package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ir.skums.hamyarhefz.soalat.EbJ8Activity;
import ir.skums.hamyarhefz.soalat.EnJ28Activity;
import ir.skums.hamyarhefz.soalat.EnJ8Activity;

public class Soal2ActivityJ8 extends AppCompatActivity {

    Button btnEb,btnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);





    }

    public void btnEnteha(View view) {
        Intent intent = new Intent(Soal2ActivityJ8.this, EnJ8Activity.class);
        startActivity(intent);

    }

    public void btnEbteda(View view) {
        Intent intent = new Intent(Soal2ActivityJ8.this, EbJ8Activity.class);
        startActivity(intent);

    }
}