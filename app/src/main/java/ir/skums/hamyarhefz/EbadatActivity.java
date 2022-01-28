package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EbadatActivity extends AppCompatActivity {



    int counterQuran=0;
    int counterEtaat=0;
    int counterTavajoh=0;
    int counterTaqibat=0;
    int counterNamazSarVaqt=0;
    int counterAtamMasakin=0;
    int counterDaemVozo=0;
    int counterSalavat=0;
    int counterHefzNegah=0;
    int counterSadaqe=0;
    int counterNamazShab=0;
    int counterAmrBeMArof=0;
    int counterTobe=0;
    int counterNahiAzMonkar=0;
    int counterMosiqiMojaz=0;
    int counterEtaatKhoda=0;
    int counterResaneHaram=0;
    int counterAnjamTaqibat=0;
    int counterFateheAmvat=0;
    int counterYadAkherat=0;
    TextView tv_resultQuran,tv_resultEtaat,tv_resultTavajoh,tv_resultTaqibat,tv_resultNamazSarVaqt,tv_resultAtamMasakin,tv_resultDaemVozo,tv_resultSalavat,tv_resultHefzNegah,tv_resultSadaqe,tv_resultNamazShab,tv_resultAmrBeMArof,tv_resultTobe,tv_resultNahiAzMonkar,tv_resultMosiqiMojaz,tv_resultEtaatKhoda,tv_resultResaneHaram,tv_resultAnjamTaqibat,tv_resultFateheAmvat,tv_resultYadAkherat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebadat);



        tv_resultQuran = findViewById(R.id.tv_resultQuran);
        tv_resultEtaat = findViewById(R.id.tv_resultEtaat);
        tv_resultTavajoh = findViewById(R.id.tv_resultTavajoh);
        tv_resultTaqibat = findViewById(R.id.tv_resultTaqibat);
        tv_resultNamazSarVaqt = findViewById(R.id.tv_resultNamazSarVaqt);
        tv_resultAtamMasakin = findViewById(R.id.tv_resultAtamMasakin);
        tv_resultDaemVozo = findViewById(R.id.tv_resultDaemVozo);
        tv_resultSalavat = findViewById(R.id.tv_resultSalavat);
        tv_resultHefzNegah = findViewById(R.id.tv_resultHefzNegah);
        tv_resultSadaqe = findViewById(R.id.tv_resultSadaqe);
        tv_resultNamazShab = findViewById(R.id.tv_resultNamazShab);
        tv_resultAmrBeMArof = findViewById(R.id.tv_resultAmrBeMArof);
        tv_resultTobe = findViewById(R.id.tv_resultTobe);
        tv_resultNahiAzMonkar = findViewById(R.id.tv_resultNahiAzMonkar);
        tv_resultMosiqiMojaz = findViewById(R.id.tv_resultMosiqiMojaz);
        tv_resultEtaatKhoda = findViewById(R.id.tv_resultEtaatKhoda);
        tv_resultResaneHaram = findViewById(R.id.tv_resultResaneHaram);
        tv_resultAnjamTaqibat = findViewById(R.id.tv_resultAnjamTaqibat);
        tv_resultFateheAmvat = findViewById(R.id.tv_resultFateheAmvat);
        tv_resultYadAkherat = findViewById(R.id.tv_resultYadAkherat);




        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);

        counterQuran = prefs.getInt("COUNTER_KEY",0);
        counterEtaat = prefs.getInt("COUNTER_KEY",0);
        counterTavajoh = prefs.getInt("COUNTER_KEY",0);
        counterTaqibat= prefs.getInt("COUNTER_KEY",0);
        counterNamazSarVaqt = prefs.getInt("COUNTER_KEY",0);
        counterAtamMasakin = prefs.getInt("COUNTER_KEY",0);
        counterDaemVozo = prefs.getInt("COUNTER_KEY",0);
        counterSalavat = prefs.getInt("COUNTER_KEY",0);
        counterHefzNegah = prefs.getInt("COUNTER_KEY",0);
        counterSadaqe = prefs.getInt("COUNTER_KEY",0);
        counterNamazShab = prefs.getInt("COUNTER_KEY",0);
        counterAmrBeMArof = prefs.getInt("COUNTER_KEY",0);
        counterTobe = prefs.getInt("COUNTER_KEY",0);
        counterNahiAzMonkar = prefs.getInt("COUNTER_KEY",0);
        counterMosiqiMojaz = prefs.getInt("COUNTER_KEY",0);
        counterEtaatKhoda= prefs.getInt("COUNTER_KEY",0);
        counterResaneHaram = prefs.getInt("COUNTER_KEY",0);
        counterAnjamTaqibat= prefs.getInt("COUNTER_KEY",0);
        counterFateheAmvat = prefs.getInt("COUNTER_KEY",0);
        counterYadAkherat = prefs.getInt("COUNTER_KEY",0);

        tv_resultQuran.setText(String.valueOf(counterQuran));
        tv_resultEtaat.setText(String.valueOf(counterEtaat));
        tv_resultTavajoh.setText(String.valueOf(counterTavajoh));
        tv_resultTaqibat.setText(String.valueOf(counterTaqibat));
        tv_resultNamazSarVaqt.setText(String.valueOf(counterNamazSarVaqt));
        tv_resultAtamMasakin.setText(String.valueOf(counterAtamMasakin));
        tv_resultDaemVozo.setText(String.valueOf(counterDaemVozo));
        tv_resultSalavat.setText(String.valueOf(counterSalavat));
        tv_resultHefzNegah.setText(String.valueOf(counterHefzNegah));
        tv_resultSadaqe.setText(String.valueOf(counterSadaqe));
        tv_resultNamazShab.setText(String.valueOf(counterNamazShab));
        tv_resultAmrBeMArof.setText(String.valueOf(counterAmrBeMArof));
        tv_resultTobe.setText(String.valueOf(counterTobe));
        tv_resultNahiAzMonkar.setText(String.valueOf(counterNahiAzMonkar));
        tv_resultMosiqiMojaz.setText(String.valueOf(counterMosiqiMojaz));
        tv_resultEtaatKhoda.setText(String.valueOf(counterEtaatKhoda));
        tv_resultResaneHaram.setText(String.valueOf(counterResaneHaram));
        tv_resultAnjamTaqibat.setText(String.valueOf(counterAnjamTaqibat));
        tv_resultFateheAmvat.setText(String.valueOf(counterFateheAmvat));
        tv_resultYadAkherat.setText(String.valueOf(counterYadAkherat));


        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");
        tv_resultQuran.setTypeface(type);
        tv_resultEtaat.setTypeface(type);
        tv_resultTavajoh.setTypeface(type);
        tv_resultTaqibat.setTypeface(type);
        tv_resultNamazSarVaqt.setTypeface(type);
        tv_resultAtamMasakin.setTypeface(type);
        tv_resultDaemVozo.setTypeface(type);
        tv_resultSalavat.setTypeface(type);
        tv_resultHefzNegah.setTypeface(type);
        tv_resultSadaqe.setTypeface(type);
        tv_resultNamazShab.setTypeface(type);
        tv_resultAmrBeMArof.setTypeface(type);
        tv_resultTobe.setTypeface(type);
        tv_resultNahiAzMonkar.setTypeface(type);
        tv_resultMosiqiMojaz.setTypeface(type);
        tv_resultEtaatKhoda.setTypeface(type);
        tv_resultResaneHaram.setTypeface(type);
        tv_resultAnjamTaqibat.setTypeface(type);
        tv_resultFateheAmvat.setTypeface(type);
        tv_resultYadAkherat.setTypeface(type);


    }

    public void btn_addQuran(View view) {
        counterQuran++;
        tv_resultQuran.setText(String.valueOf(counterQuran));
    }

    public void btn_removQuran(View view) {

        counterQuran = 0;
        tv_resultQuran.setText(String.valueOf(counterQuran));
    }

    public void btn_addEtaat(View view) {

        counterEtaat++;
        tv_resultEtaat.setText(String.valueOf(counterEtaat));
    }

    public void btn_removEtaat(View view) {
        counterEtaat = 0;
        tv_resultEtaat.setText(String.valueOf(counterEtaat));


    }

    public void btn_addTavajoh(View view) {


        counterTavajoh++;
        tv_resultTavajoh.setText(String.valueOf(counterTavajoh));
    }

    public void btn_removTavajoh(View view) {

        counterTavajoh = 0;
        tv_resultTavajoh.setText(String.valueOf(counterTavajoh));

    }

    public void btn_addTaqibat(View view) {


        counterTaqibat++;
        tv_resultTaqibat.setText(String.valueOf(counterTaqibat));

    }

    public void btn_removTaqibat(View view) {

        counterTaqibat = 0;
        tv_resultTaqibat.setText(String.valueOf(counterTaqibat));
    }

    public void btn_addNamazSarVaqt(View view) {


        counterNamazSarVaqt++;
        tv_resultNamazSarVaqt.setText(String.valueOf(counterNamazSarVaqt));
    }

    public void btn_removNamazSarVaqt(View view) {

        counterNamazSarVaqt = 0;
        tv_resultNamazSarVaqt.setText(String.valueOf(counterNamazSarVaqt));
    }

    public void btn_addAtamMasakin(View view) {

        counterAtamMasakin++;
        tv_resultAtamMasakin.setText(String.valueOf(counterAtamMasakin));


    }

    public void btn_removAtamMasakin(View view) {

        counterAtamMasakin = 0;
        tv_resultAtamMasakin.setText(String.valueOf(counterAtamMasakin));
    }

    public void btn_addDaemVozo(View view) {

        counterDaemVozo++;
        tv_resultDaemVozo.setText(String.valueOf(counterDaemVozo));


    }

    public void btn_removDaemVozo(View view) {

        counterDaemVozo = 0;
        tv_resultDaemVozo.setText(String.valueOf(counterDaemVozo));
    }

    public void btn_addSalavat(View view) {

        counterSalavat++;
        tv_resultSalavat.setText(String.valueOf(counterSalavat));

    }

    public void btn_removSalavat(View view) {


        counterSalavat = 0;
        tv_resultSalavat.setText(String.valueOf(counterSalavat));
    }

    public void btn_addHefzNegah(View view) {
        counterHefzNegah++;
        tv_resultHefzNegah.setText(String.valueOf(counterHefzNegah));

    }

    public void btn_removHefzNegah(View view) {


        counterHefzNegah = 0;
        tv_resultHefzNegah.setText(String.valueOf(counterHefzNegah));
    }

    public void btn_addSadaqe(View view) {

        counterSadaqe++;
        tv_resultSadaqe.setText(String.valueOf(counterSadaqe));
    }

    public void btn_removSadaqe(View view) {


        counterSadaqe = 0;
        tv_resultSadaqe.setText(String.valueOf(counterSadaqe));
    }

    public void btn_addNamazShab(View view) {
        counterNamazShab++;
        tv_resultNamazShab.setText(String.valueOf(counterNamazShab));

    }

    public void btn_removNamazShab(View view) {


        counterNamazShab = 0;
        tv_resultNamazShab.setText(String.valueOf(counterNamazShab));
    }

    public void btn_addAmrBeMArof(View view) {

        counterAmrBeMArof++;
        tv_resultAmrBeMArof.setText(String.valueOf(counterAmrBeMArof));


    }

    public void btn_removAmrBeMArof(View view) {

        counterAmrBeMArof = 0;
        tv_resultAmrBeMArof.setText(String.valueOf(counterAmrBeMArof));
    }

    public void btn_addTobe(View view) {

        counterTobe++;
        tv_resultTobe.setText(String.valueOf(counterTobe));


    }

    public void btn_removTobe(View view) {

        counterTobe = 0;
        tv_resultTobe.setText(String.valueOf(counterTobe));
    }

    public void btn_addNahiAzMonkar(View view) {

        counterNahiAzMonkar++;
        tv_resultNahiAzMonkar.setText(String.valueOf(counterNahiAzMonkar));
    }

    public void btn_removNahiAzMonkar(View view) {

        counterNahiAzMonkar = 0;
        tv_resultNahiAzMonkar.setText(String.valueOf(counterNahiAzMonkar));
    }

    public void btn_addMosiqiMojaz(View view) {

        counterMosiqiMojaz++;
        tv_resultMosiqiMojaz.setText(String.valueOf(counterMosiqiMojaz));


    }

    public void btn_removMosiqiMojaz(View view) {
        counterMosiqiMojaz = 0;
        tv_resultMosiqiMojaz.setText(String.valueOf(counterMosiqiMojaz));
    }

    public void btn_addEtaatKhoda(View view) {

        counterEtaatKhoda++;
        tv_resultEtaatKhoda.setText(String.valueOf(counterEtaatKhoda));


    }

    public void btn_removEtaatKhoda(View view) {
        counterEtaatKhoda = 0;
        tv_resultEtaatKhoda.setText(String.valueOf(counterEtaatKhoda));
    }

    public void btn_addResaneHaram(View view) {
        counterResaneHaram++;
        tv_resultResaneHaram.setText(String.valueOf(counterResaneHaram));

    }

    public void btn_removResaneHaram(View view) {

        counterResaneHaram = 0;
        tv_resultResaneHaram.setText(String.valueOf(counterResaneHaram));
    }

    public void btn_addAnjamTaqibat(View view) {

        counterAnjamTaqibat++;
        tv_resultAnjamTaqibat.setText(String.valueOf(counterAnjamTaqibat));
    }

    public void btn_removAnjamTaqibat(View view) {

        counterAnjamTaqibat = 0;
        tv_resultAnjamTaqibat.setText(String.valueOf(counterAnjamTaqibat));
    }

    public void btn_addFateheAmvat(View view) {

        counterFateheAmvat++;
        tv_resultFateheAmvat.setText(String.valueOf(counterFateheAmvat));


    }

    public void btn_removFateheAmvat(View view) {

        counterFateheAmvat = 0;
        tv_resultFateheAmvat.setText(String.valueOf(counterFateheAmvat));
    }

    public void btn_addYadAkherat(View view) {

        counterYadAkherat++;
        tv_resultYadAkherat.setText(String.valueOf(counterYadAkherat));
    }

    public void btn_removYadAkherat(View view) {
        counterYadAkherat = 0;
        tv_resultYadAkherat.setText(String.valueOf(counterYadAkherat));


    }

    @Override
    protected void onResume() {
        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);

        super.onResume();
    }
}