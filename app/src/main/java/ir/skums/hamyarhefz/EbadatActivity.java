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





        SharedPreferences prefsQuran = getSharedPreferences("MY_PREFS_Quran" , MODE_PRIVATE);
        SharedPreferences prefsTavajoh = getSharedPreferences("MY_PREFS_Tavajoh" , MODE_PRIVATE);
        SharedPreferences prefsTaqibat = getSharedPreferences("MY_PREFS_Taqibat" , MODE_PRIVATE);
        SharedPreferences prefsNamazSarVaqt = getSharedPreferences("MY_PREFS_NamazSarVaqt" , MODE_PRIVATE);
        SharedPreferences prefsAtamMasakin = getSharedPreferences("MY_PREFS_AtamMasakin" , MODE_PRIVATE);
        SharedPreferences prefsDaemVozo = getSharedPreferences("MY_PREFS_DaemVozo" , MODE_PRIVATE);
        SharedPreferences prefsSalavat = getSharedPreferences("MY_PREFS_Salavat" , MODE_PRIVATE);
        SharedPreferences prefsHefzNegah = getSharedPreferences("MY_PREFS_HefzNegah" , MODE_PRIVATE);
        SharedPreferences prefsSadaqe = getSharedPreferences("MY_PREFS_Sadaqe" , MODE_PRIVATE);
        SharedPreferences prefsNamazShab  = getSharedPreferences("MY_PREFS_NamazShab" , MODE_PRIVATE);
        SharedPreferences prefsAmrBeMArof = getSharedPreferences("MY_PREFS_AmrBeMArof" , MODE_PRIVATE);
        SharedPreferences prefsEtaat = getSharedPreferences("MY_PREFS_Etaat" , MODE_PRIVATE);
        SharedPreferences prefsTobe = getSharedPreferences("MY_PREFS_Tobe" , MODE_PRIVATE);
        SharedPreferences prefsNahiAzMonkar = getSharedPreferences("MY_PREFS_NahiAzMonkar" , MODE_PRIVATE);
        SharedPreferences prefsMosiqiMojaz = getSharedPreferences("MY_PREFS_MosiqiMojaz" , MODE_PRIVATE);
        SharedPreferences prefsResaneHaram = getSharedPreferences("MY_PREFS_ResaneHaram" , MODE_PRIVATE);
        SharedPreferences prefsEtaatKhoda = getSharedPreferences("MY_PREFS_EtaatKhoda" , MODE_PRIVATE);
        SharedPreferences prefsAnjamTaqibat = getSharedPreferences("MY_PREFS_AnjamTaqibat" , MODE_PRIVATE);
        SharedPreferences prefsFateheAmvat= getSharedPreferences("MY_PREFS_FateheAmvat" , MODE_PRIVATE);
        SharedPreferences prefsYadAkherat = getSharedPreferences("MY_PREFS_YadAkherat" , MODE_PRIVATE);

        counterQuran = prefsQuran.getInt("COUNTER_KEY",0);
        counterEtaat = prefsEtaat.getInt("COUNTER_KEY",0);
        counterTavajoh = prefsTavajoh.getInt("COUNTER_KEY",0);
        counterTaqibat= prefsTaqibat.getInt("COUNTER_KEY",0);
        counterNamazSarVaqt = prefsNamazSarVaqt.getInt("COUNTER_KEY",0);
        counterAtamMasakin = prefsAtamMasakin.getInt("COUNTER_KEY",0);
        counterDaemVozo = prefsDaemVozo.getInt("COUNTER_KEY",0);
        counterSalavat = prefsSalavat.getInt("COUNTER_KEY",0);
        counterHefzNegah = prefsHefzNegah.getInt("COUNTER_KEY",0);
        counterSadaqe = prefsSadaqe.getInt("COUNTER_KEY",0);
        counterNamazShab = prefsNamazShab.getInt("COUNTER_KEY",0);
        counterAmrBeMArof = prefsAmrBeMArof.getInt("COUNTER_KEY",0);
        counterTobe = prefsTobe.getInt("COUNTER_KEY",0);
        counterNahiAzMonkar = prefsNahiAzMonkar.getInt("COUNTER_KEY",0);
        counterMosiqiMojaz = prefsMosiqiMojaz.getInt("COUNTER_KEY",0);
        counterEtaatKhoda= prefsEtaatKhoda.getInt("COUNTER_KEY",0);
        counterResaneHaram = prefsResaneHaram.getInt("COUNTER_KEY",0);
        counterAnjamTaqibat= prefsAnjamTaqibat.getInt("COUNTER_KEY",0);
        counterFateheAmvat = prefsFateheAmvat.getInt("COUNTER_KEY",0);
        counterYadAkherat = prefsYadAkherat.getInt("COUNTER_KEY",0);

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
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editorQuran = getSharedPreferences("MY_PREFS_Quran" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEtaat = getSharedPreferences("MY_PREFS_Etaat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTavajoh = getSharedPreferences("MY_PREFS_Tavajoh" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTaqibat = getSharedPreferences("MY_PREFS_Taqibat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNamazSarVaqt = getSharedPreferences("MY_PREFS_NamazSarVaqt" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAtamMasakin = getSharedPreferences("MY_PREFS_AtamMasakin" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorDaemVozo = getSharedPreferences("MY_PREFS_DaemVozo" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSalavat = getSharedPreferences("MY_PREFS_Salavat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorHefzNegah = getSharedPreferences("MY_PREFS_HefzNegah" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSadaqe = getSharedPreferences("MY_PREFS_Sadaqe" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNamazShab = getSharedPreferences("MY_PREFS_NamazShab" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAmrBeMArof = getSharedPreferences("MY_PREFS_AmrBeMArof" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTobe = getSharedPreferences("MY_PREFS_Tobe" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNahiAzMonkar = getSharedPreferences("MY_PREFS_NahiAzMonkar" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMosiqiMojaz = getSharedPreferences("MY_PREFS_MosiqiMojaz" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEtaatKhoda = getSharedPreferences("MY_PREFS_EtaatKhoda" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorResaneHaram = getSharedPreferences("MY_PREFS_ResaneHaram" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAnjamTaqibat = getSharedPreferences("MY_PREFS_AnjamTaqibat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorFateheAmvat = getSharedPreferences("MY_PREFS_FateheAmvat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorYadAkherat = getSharedPreferences("MY_PREFS_YadAkherat" , MODE_PRIVATE).edit();

        editorQuran.putInt("COUNTER_KEY" , counterQuran);
        editorEtaat.putInt("COUNTER_KEY" , counterEtaat);
        editorTavajoh.putInt("COUNTER_KEY" , counterTavajoh);
        editorTaqibat.putInt("COUNTER_KEY" , counterTaqibat);
        editorNamazSarVaqt.putInt("COUNTER_KEY" , counterNamazSarVaqt);
        editorAtamMasakin.putInt("COUNTER_KEY" , counterAtamMasakin);
        editorDaemVozo.putInt("COUNTER_KEY" , counterDaemVozo);
        editorSalavat.putInt("COUNTER_KEY" , counterSalavat);
        editorHefzNegah.putInt("COUNTER_KEY" , counterHefzNegah);
        editorSadaqe.putInt("COUNTER_KEY" , counterSadaqe);
        editorNamazShab.putInt("COUNTER_KEY" , counterNamazShab);
        editorAmrBeMArof.putInt("COUNTER_KEY" , counterAmrBeMArof);
        editorTobe.putInt("COUNTER_KEY" , counterTobe);
        editorNahiAzMonkar.putInt("COUNTER_KEY" , counterNahiAzMonkar);
        editorMosiqiMojaz.putInt("COUNTER_KEY" , counterMosiqiMojaz);
        editorEtaatKhoda.putInt("COUNTER_KEY" , counterEtaatKhoda);
        editorResaneHaram.putInt("COUNTER_KEY" , counterResaneHaram);
        editorAnjamTaqibat.putInt("COUNTER_KEY" , counterAnjamTaqibat);
        editorFateheAmvat.putInt("COUNTER_KEY" , counterFateheAmvat);
        editorYadAkherat.putInt("COUNTER_KEY" , counterYadAkherat);

        editorQuran.apply();
        editorEtaat.apply();
        editorTavajoh.apply();
        editorTaqibat.apply();
        editorNamazSarVaqt.apply();
        editorAtamMasakin.apply();
        editorDaemVozo.apply();
        editorSalavat.apply();
        editorHefzNegah.apply();
        editorSadaqe.apply();
        editorNamazShab.apply();
        editorAmrBeMArof.apply();
        editorTobe.apply();
        editorNahiAzMonkar.apply();
        editorMosiqiMojaz.apply();
        editorEtaatKhoda.apply();
        editorResaneHaram.apply();
        editorAnjamTaqibat.apply();
        editorFateheAmvat.apply();
        editorYadAkherat.apply();
    }
}