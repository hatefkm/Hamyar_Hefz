package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AkhlaghBAdActivity extends AppCompatActivity {


    int counterEtlafVaqt=0;
    int counterQororBija=0;
    int counterDoroq=0;
    int counterLajbazi=0;
    int counterNHesadat=0;
    int counterNaOmidi=0;
    int counterBokhl=0;
    int counterHavas=0;
    int counterTakabor=0;
    int counterPorKhori=0;
    int counterSosti=0;
    int counterAdamRaz=0;
    int counterRia=0;
    int counterBadAkhlaqi=0;
    int counterFozoli=0;
    int counterKhabarChini=0;



    TextView tv_resultEtlafVaqt,tv_resultQororBija,tv_resultDoroq,tv_resultLajbazi,tv_resultNHesadat,tv_resultNaOmidi,tv_resultBokhl,tv_resultHavas,tv_resultTakabor,tv_resultPorKhori,tv_resultSosti,tv_resultAdamRaz,tv_resultRia,tv_resultBadAkhlaqi,tv_resultFozoli,tv_resultKhabarChini;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akhlagh_bad);



        tv_resultEtlafVaqt = findViewById(R.id.tv_resultEtlafVaqt);
        tv_resultQororBija = findViewById(R.id.tv_resultQororBija);
        tv_resultDoroq = findViewById(R.id.tv_resultDoroq);
        tv_resultLajbazi = findViewById(R.id.tv_resultLajbazi);
        tv_resultNHesadat = findViewById(R.id.tv_resultNHesadat);
        tv_resultNaOmidi = findViewById(R.id.tv_resultNaOmidi);
        tv_resultBokhl = findViewById(R.id.tv_resultBokhl);
        tv_resultHavas = findViewById(R.id.tv_resultHavas);
        tv_resultTakabor = findViewById(R.id.tv_resultTakabor);
        tv_resultPorKhori = findViewById(R.id.tv_resultPorKhori);
        tv_resultSosti = findViewById(R.id.tv_resultSosti);
        tv_resultAdamRaz = findViewById(R.id.tv_resultAdamRaz);
        tv_resultRia = findViewById(R.id.tv_resultRia);
        tv_resultBadAkhlaqi = findViewById(R.id.tv_resultBadAkhlaqi);
        tv_resultFozoli = findViewById(R.id.tv_resultFozoli);
        tv_resultKhabarChini = findViewById(R.id.tv_resultKhabarChini);

        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");



        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);

        counterEtlafVaqt = prefs.getInt("COUNTER_KEY",0);
        counterQororBija = prefs.getInt("COUNTER_KEY",0);
        counterDoroq = prefs.getInt("COUNTER_KEY",0);
        counterLajbazi= prefs.getInt("COUNTER_KEY",0);
        counterNHesadat = prefs.getInt("COUNTER_KEY",0);
        counterNaOmidi = prefs.getInt("COUNTER_KEY",0);
        counterBokhl = prefs.getInt("COUNTER_KEY",0);
        counterHavas = prefs.getInt("COUNTER_KEY",0);
        counterTakabor = prefs.getInt("COUNTER_KEY",0);
        counterPorKhori = prefs.getInt("COUNTER_KEY",0);
        counterSosti = prefs.getInt("COUNTER_KEY",0);
        counterAdamRaz = prefs.getInt("COUNTER_KEY",0);
        counterRia = prefs.getInt("COUNTER_KEY",0);
        counterBadAkhlaqi = prefs.getInt("COUNTER_KEY",0);
        counterFozoli = prefs.getInt("COUNTER_KEY",0);
        counterKhabarChini= prefs.getInt("COUNTER_KEY",0);



        tv_resultEtlafVaqt.setText(String.valueOf(counterEtlafVaqt));
        tv_resultQororBija.setText(String.valueOf(counterQororBija));
        tv_resultDoroq.setText(String.valueOf(counterDoroq));
        tv_resultLajbazi.setText(String.valueOf(counterLajbazi));
        tv_resultNHesadat.setText(String.valueOf(counterNHesadat));
        tv_resultNaOmidi.setText(String.valueOf(counterNaOmidi));
        tv_resultBokhl.setText(String.valueOf(counterBokhl));
        tv_resultHavas.setText(String.valueOf(counterHavas));
        tv_resultTakabor.setText(String.valueOf(counterTakabor));
        tv_resultPorKhori.setText(String.valueOf(counterPorKhori));
        tv_resultSosti.setText(String.valueOf(counterSosti));
        tv_resultAdamRaz.setText(String.valueOf(counterAdamRaz));
        tv_resultRia.setText(String.valueOf(counterRia));
        tv_resultBadAkhlaqi.setText(String.valueOf(counterBadAkhlaqi));
        tv_resultFozoli.setText(String.valueOf(counterFozoli));
        tv_resultKhabarChini.setText(String.valueOf(counterKhabarChini));




    }

    public void btn_addEtlafVaqt(View view) {
        counterEtlafVaqt++;
        tv_resultEtlafVaqt.setText(String.valueOf(counterEtlafVaqt));

    }

    public void btn_removEtlafVaqt(View view) {


        counterEtlafVaqt = 0;
        tv_resultEtlafVaqt.setText(String.valueOf(counterEtlafVaqt));
    }

    public void btn_addQororBija(View view) {

        counterQororBija++;
        tv_resultQororBija.setText(String.valueOf(counterQororBija));
    }

    public void btn_removQororBija(View view) {

        counterQororBija = 0;
        tv_resultQororBija.setText(String.valueOf(counterQororBija));
    }

    public void btn_addDoroq(View view) {

        counterDoroq++;
        tv_resultDoroq.setText(String.valueOf(counterDoroq));
    }

    public void btn_removDoroq(View view) {

        counterDoroq = 0;
        tv_resultDoroq.setText(String.valueOf(counterDoroq));
    }

    public void btn_addLajbazi(View view) {

        counterLajbazi++;
        tv_resultLajbazi.setText(String.valueOf(counterLajbazi));
    }

    public void btn_removLajbazi(View view) {

        counterLajbazi = 0;
        tv_resultLajbazi.setText(String.valueOf(counterLajbazi));
    }

    public void btn_addHesadat(View view) {

        counterNHesadat++;
        tv_resultNHesadat.setText(String.valueOf(counterNHesadat));
    }

    public void btn_removHesadat(View view) {

        counterNHesadat = 0;
        tv_resultNHesadat.setText(String.valueOf(counterNHesadat));
    }

    public void btn_addNaOmidi(View view) {

        counterNaOmidi++;
        tv_resultNaOmidi.setText(String.valueOf(counterNaOmidi));
    }

    public void btn_removNaOmidi(View view) {

        counterNaOmidi = 0;
        tv_resultNaOmidi.setText(String.valueOf(counterNaOmidi));
    }

    public void btn_addBokhl(View view) {

        counterBokhl++;
        tv_resultBokhl.setText(String.valueOf(counterBokhl));
    }

    public void btn_removBokhl(View view) {

        counterBokhl = 0;
        tv_resultBokhl.setText(String.valueOf(counterBokhl));
    }

    public void btn_addHavas(View view) {

        counterHavas++;
        tv_resultHavas.setText(String.valueOf(counterHavas));
    }

    public void btn_removHavas(View view) {

        counterHavas = 0;
        tv_resultHavas.setText(String.valueOf(counterHavas));
    }

    public void btn_addTakabor(View view) {

        counterTakabor++;
        tv_resultTakabor.setText(String.valueOf(counterTakabor));
    }

    public void btn_removTakabor(View view) {

        counterTakabor = 0;
        tv_resultTakabor.setText(String.valueOf(counterTakabor));
    }

    public void btn_addPorKhori(View view) {
        counterPorKhori++;
        tv_resultPorKhori.setText(String.valueOf(counterPorKhori));
    }

    public void btn_removPorKhori(View view) {

        counterPorKhori = 0;
        tv_resultPorKhori.setText(String.valueOf(counterPorKhori));
    }

    public void btn_addSosti(View view) {

        counterSosti++;
        tv_resultSosti.setText(String.valueOf(counterSosti));
    }

    public void btn_removSosti(View view) {

        counterSosti = 0;
        tv_resultSosti.setText(String.valueOf(counterSosti));
    }

    public void btn_addAdamRaz(View view) {
        counterAdamRaz++;
        tv_resultAdamRaz.setText(String.valueOf(counterAdamRaz));
    }

    public void btn_removAdamRaz(View view) {

        counterAdamRaz = 0;
        tv_resultAdamRaz.setText(String.valueOf(counterAdamRaz));
    }

    public void btn_addRia(View view) {

        counterRia++;
        tv_resultRia.setText(String.valueOf(counterRia));
    }

    public void btn_removRia(View view) {

        counterRia = 0;
        tv_resultRia.setText(String.valueOf(counterRia));
    }

    public void btn_addBadAkhlaqi(View view) {

        counterBadAkhlaqi++;
        tv_resultBadAkhlaqi.setText(String.valueOf(counterBadAkhlaqi));
    }

    public void btn_removBadAkhlaqi(View view) {

        counterBadAkhlaqi = 0;
        tv_resultBadAkhlaqi.setText(String.valueOf(counterBadAkhlaqi));
    }

    public void btn_addFozoli(View view) {
        counterFozoli++;
        tv_resultFozoli.setText(String.valueOf(counterFozoli));
    }

    public void btn_removFozoli(View view) {

        counterFozoli = 0;
        tv_resultFozoli.setText(String.valueOf(counterFozoli));
    }

    public void btn_addKhabarChini(View view) {

        counterKhabarChini++;
        tv_resultKhabarChini.setText(String.valueOf(counterKhabarChini));
    }

    public void btn_removKhabarChini(View view) {

        counterKhabarChini = 0;
        tv_resultKhabarChini.setText(String.valueOf(counterKhabarChini));
    }
}