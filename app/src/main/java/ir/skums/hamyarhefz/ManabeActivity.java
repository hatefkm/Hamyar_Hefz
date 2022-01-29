package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class ManabeActivity extends AppCompatActivity {
    TextView txtMatn,txtTitle,txtmtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manabe);
        txtMatn=findViewById(R.id.textManabeQ);
        txtTitle=findViewById(R.id.txtManabeTitle);
        txtmtn2=findViewById(R.id.txt_parhizgar);


        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_nazanin.TTF");
        txtMatn.setTypeface(type);
        txtTitle.setTypeface(type);
        txtmtn2.setTypeface(type);
    }
}