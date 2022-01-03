package ir.skums.hamyarhefz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.nightonke.boommenu.Animation.EaseEnum;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class AmalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amal);






    }

    public void ebadat(View view) {
        Intent intent = new Intent(AmalActivity.this, EbadatActivity.class);
        startActivity(intent);
    }

    public void Akhlagh_bad(View view) {
        Intent intent = new Intent(AmalActivity.this, AkhlaghBAdActivity.class);
        startActivity(intent);
    }

    public void Amal_nik(View view) {
        Intent intent = new Intent(AmalActivity.this, AmalNikActivity.class);
        startActivity(intent);
    }

    public void Amal_bad(View view) {
        Intent intent = new Intent(AmalActivity.this, AmalBadActivity.class);
        startActivity(intent);
    }

    public void btn_TozihatAmal(View view) {
        Intent intent = new Intent(AmalActivity.this, TozihatAmalActivity.class);
        startActivity(intent);
    }
}