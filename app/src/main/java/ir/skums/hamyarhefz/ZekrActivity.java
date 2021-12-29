package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ZekrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zekr);
    }

    public void btnSlvt(View view) {

        Intent intent = new Intent(ZekrActivity.this,Salavat1Activity.class);
        startActivity(intent);


    }

    public void btnAyamHfte(View view) {

        Intent intent = new Intent(ZekrActivity.this,AyamHafte1Activity.class);
        startActivity(intent);



    }

    public void btnTsbihat(View view) {

        Intent intent = new Intent(ZekrActivity.this,TasbihatActivity.class);
        startActivity(intent);



    }
}