package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ir.skums.hamyarhefz.soalat.EbJ28Activity;
import ir.skums.hamyarhefz.soalat.EnJ28Activity;

public class Soal2ActivityJ28 extends AppCompatActivity {

    Button btnEb,btnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);





    }

    public void btnEnteha(View view) {
        Intent intent = new Intent(Soal2ActivityJ28.this, EnJ28Activity.class);
        startActivity(intent);

    }

    public void btnEbteda(View view) {
        Intent intent = new Intent(Soal2ActivityJ28.this, EbJ28Activity.class);
        startActivity(intent);

    }
}