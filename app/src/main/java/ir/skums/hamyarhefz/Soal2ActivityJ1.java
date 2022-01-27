package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ir.skums.hamyarhefz.soalat.EbJ1Activity;
import ir.skums.hamyarhefz.soalat.EnJ1Activity;

public class Soal2ActivityJ1 extends AppCompatActivity {

    Button btnEb,btnEn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal2);





    }

    public void btnEnteha(View view) {
        Intent intent = new Intent(Soal2ActivityJ1.this, EnJ1Activity.class);
        startActivity(intent);

    }

    public void btnEbteda(View view) {
        Intent intent = new Intent(Soal2ActivityJ1.this, EbJ1Activity.class);
        startActivity(intent);

    }
}