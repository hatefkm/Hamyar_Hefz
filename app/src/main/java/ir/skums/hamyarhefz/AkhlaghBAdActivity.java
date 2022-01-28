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






        SharedPreferences prefsEtlafVaqt = getSharedPreferences("MY_PREFSEtlafVaqt" , MODE_PRIVATE);
        SharedPreferences prefsQororBija = getSharedPreferences("MY_PREFSQororBija" , MODE_PRIVATE);
        SharedPreferences prefsDoroq = getSharedPreferences("MY_PREFSDoroq" , MODE_PRIVATE);
        SharedPreferences prefsLajbazi = getSharedPreferences("MY_PREFSLajbazi" , MODE_PRIVATE);
        SharedPreferences prefsNHesadat = getSharedPreferences("MY_PREFSNHesadat" , MODE_PRIVATE);
        SharedPreferences prefsNaOmidi = getSharedPreferences("MY_PREFSNaOmidi" , MODE_PRIVATE);
        SharedPreferences prefsBokhl = getSharedPreferences("MY_PREFSBokhl" , MODE_PRIVATE);
        SharedPreferences prefsHavas = getSharedPreferences("MY_PREFSHavas" , MODE_PRIVATE);
        SharedPreferences prefsTakabor = getSharedPreferences("MY_PREFSTakabor" , MODE_PRIVATE);
        SharedPreferences prefsPorKhori = getSharedPreferences("MY_PREFSPorKhori" , MODE_PRIVATE);
        SharedPreferences prefsSosti = getSharedPreferences("MY_PREFSSosti" , MODE_PRIVATE);
        SharedPreferences prefsAdamRaz = getSharedPreferences("MY_PREFSAdamRaz" , MODE_PRIVATE);
        SharedPreferences prefsRia = getSharedPreferences("MY_PREFSRia" , MODE_PRIVATE);
        SharedPreferences prefsBadAkhlaqi = getSharedPreferences("MY_PREFSBadAkhlaqi" , MODE_PRIVATE);
        SharedPreferences prefsFozoli = getSharedPreferences("MY_PREFSFozoli" , MODE_PRIVATE);
        SharedPreferences prefsKhabarChini = getSharedPreferences("MY_PREFSKhabarChini" , MODE_PRIVATE);

        counterEtlafVaqt = prefsEtlafVaqt.getInt("COUNTER_KEY",0);
        counterQororBija = prefsQororBija.getInt("COUNTER_KEY",0);
        counterDoroq = prefsDoroq.getInt("COUNTER_KEY",0);
        counterLajbazi= prefsLajbazi.getInt("COUNTER_KEY",0);
        counterNHesadat = prefsNHesadat.getInt("COUNTER_KEY",0);
        counterNaOmidi = prefsNaOmidi.getInt("COUNTER_KEY",0);
        counterBokhl = prefsBokhl.getInt("COUNTER_KEY",0);
        counterHavas = prefsHavas.getInt("COUNTER_KEY",0);
        counterTakabor = prefsTakabor.getInt("COUNTER_KEY",0);
        counterPorKhori = prefsPorKhori.getInt("COUNTER_KEY",0);
        counterSosti = prefsSosti.getInt("COUNTER_KEY",0);
        counterAdamRaz = prefsAdamRaz.getInt("COUNTER_KEY",0);
        counterRia = prefsRia.getInt("COUNTER_KEY",0);
        counterBadAkhlaqi = prefsBadAkhlaqi.getInt("COUNTER_KEY",0);
        counterFozoli = prefsFozoli.getInt("COUNTER_KEY",0);
        counterKhabarChini= prefsKhabarChini.getInt("COUNTER_KEY",0);



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



        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");
        tv_resultEtlafVaqt.setTypeface(type);
        tv_resultQororBija.setTypeface(type);
        tv_resultDoroq.setTypeface(type);
        tv_resultLajbazi.setTypeface(type);
        tv_resultNHesadat.setTypeface(type);
        tv_resultNaOmidi.setTypeface(type);
        tv_resultBokhl.setTypeface(type);
        tv_resultHavas.setTypeface(type);
        tv_resultTakabor.setTypeface(type);
        tv_resultPorKhori.setTypeface(type);
        tv_resultSosti.setTypeface(type);
        tv_resultAdamRaz.setTypeface(type);
        tv_resultRia.setTypeface(type);
        tv_resultBadAkhlaqi.setTypeface(type);
        tv_resultFozoli.setTypeface(type);
        tv_resultKhabarChini.setTypeface(type);




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

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editorEtlafVaqt = getSharedPreferences("MY_PREFSEtlafVaqt" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorQororBija = getSharedPreferences("MY_PREFSQororBija" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorDoroq = getSharedPreferences("MY_PREFSDoroq" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorLajbazi = getSharedPreferences("MY_PREFSLajbazi" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNHesadat = getSharedPreferences("MY_PREFSNHesadat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNaOmidi = getSharedPreferences("MY_PREFSNaOmidi" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBokhl = getSharedPreferences("MY_PREFSBokhl" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorHavas = getSharedPreferences("MY_PREFSHavas" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTakabor = getSharedPreferences("MY_PREFSTakabor" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorPorKhori = getSharedPreferences("MY_PREFSPorKhori" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSosti = getSharedPreferences("MY_PREFSSosti" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAdamRaz = getSharedPreferences("MY_PREFSAdamRaz" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRia = getSharedPreferences("MY_PREFSRia" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBadAkhlaqi = getSharedPreferences("MY_PREFSBadAkhlaqi" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorFozoli = getSharedPreferences("MY_PREFSFozoli" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorKhabarChini = getSharedPreferences("MY_PREFSKhabarChini" , MODE_PRIVATE).edit();

        editorEtlafVaqt.putInt("COUNTER_KEY",counterEtlafVaqt);
        editorQororBija.putInt("COUNTER_KEY",counterQororBija);
        editorDoroq.putInt("COUNTER_KEY",counterDoroq);
        editorLajbazi.putInt("COUNTER_KEY",counterLajbazi);
        editorNHesadat.putInt("COUNTER_KEY",counterNHesadat);
        editorNaOmidi.putInt("COUNTER_KEY",counterNaOmidi);
        editorBokhl.putInt("COUNTER_KEY",counterBokhl);
        editorHavas.putInt("COUNTER_KEY",counterHavas);
        editorTakabor.putInt("COUNTER_KEY",counterTakabor);
        editorPorKhori.putInt("COUNTER_KEY",counterPorKhori);
        editorSosti.putInt("COUNTER_KEY",counterSosti);
        editorAdamRaz.putInt("COUNTER_KEY",counterAdamRaz);
        editorRia.putInt("COUNTER_KEY",counterRia);
        editorBadAkhlaqi.putInt("COUNTER_KEY",counterBadAkhlaqi);
        editorFozoli.putInt("COUNTER_KEY",counterFozoli);
        editorKhabarChini.putInt("COUNTER_KEY",counterKhabarChini);

        editorEtlafVaqt.apply();
        editorQororBija.apply();
        editorDoroq.apply();
        editorLajbazi.apply();
        editorNHesadat.apply();
        editorNaOmidi.apply();
        editorBokhl.apply();
        editorHavas.apply();
        editorTakabor.apply();
        editorPorKhori.apply();
        editorSosti.apply();
        editorAdamRaz.apply();
        editorRia.apply();
        editorBadAkhlaqi.apply();
        editorFozoli.apply();
        editorKhabarChini.apply();







    }



}