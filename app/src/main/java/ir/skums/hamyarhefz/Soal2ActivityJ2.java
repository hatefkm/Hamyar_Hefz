package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ir.skums.hamyarhefz.soalat.EbJ2Activity;
import ir.skums.hamyarhefz.soalat.EnJ2Activity;

public class Soal2ActivityJ2 extends AppCompatActivity {

    Button btnEb,btnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);





    }

    public void btnEnteha(View view) {
        Intent intent = new Intent(Soal2ActivityJ2.this, EnJ2Activity.class);
        startActivity(intent);

    }

    public void btnEbteda(View view) {
        Intent intent = new Intent(Soal2ActivityJ2.this, EbJ2Activity.class);
        startActivity(intent);

    }
}