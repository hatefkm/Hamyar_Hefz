package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class TozihatAmalActivity extends AppCompatActivity {
    TextView txt_tozihat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tozihat_amal);

        txt_tozihat=findViewById(R.id.txt_tozihat);
        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/yekan.ttf");
        txt_tozihat.setTypeface(type);

    }
}