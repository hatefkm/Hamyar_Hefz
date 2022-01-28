package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class UsActivity extends AppCompatActivity {
    TextView txtMatn,txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_us);
        txtMatn=findViewById(R.id.txtUsTitle);
        txtTitle=findViewById(R.id.us_text);

        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/yekan.ttf");
        txtMatn.setTypeface(type);
        txtTitle.setTypeface(type);



    }
}