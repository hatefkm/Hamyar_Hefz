package ir.skums.hamyarhefz;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RahnamaActivity extends AppCompatActivity {
    TextView txtMatn,txtTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rahnama);
        txtMatn=findViewById(R.id.txtRahnamaMatn);
        txtTitle=findViewById(R.id.txtRahnamaTitle);

        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/yekan.ttf");
        txtMatn.setTypeface(type);
        txtTitle.setTypeface(type);


    }
}