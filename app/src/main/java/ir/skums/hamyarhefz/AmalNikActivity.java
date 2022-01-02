package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AmalNikActivity extends AppCompatActivity {


    int counterVafaBeAhd=0;
    int counterBarnameRizi=0;
    int counterSaboor=0;
    int counterMohebat=0;
    int counterRaayatHijab=0;
    int counterPoozesh=0;
    int counterEhteram=0;
    int counterKhoshro=0;
    int counterFrotan=0;
    int counterEsraf=0;
    int counterBesmeallah=0;
    int counterBakhshidn=0;
    int counterFaragiriElm=0;
    int counterSokhanHaq=0;
    int counterRAstGoii=0;


    int counterEfatKalam=0;
    int counterMashverat=0;
    int counterFroBrdnKhashm=0;
    int counterSalamAval=0;
    int counterMesvak=0;
    int counterKomakBeDigaran=0;
    int counterRaayatNazm=0;
    int counterIsar=0;
    int counterMotalee=0;
    int counterQeibatNakardn=0;
    int counterAmanat=0;
    int counterHamsardari=0;
    int counterRezq=0;
    int counterVarzesh=0;
    int counterEib=0;



    TextView tv_resultVafaBeAhd,tv_resultBarnameRizi,tv_resultSaboor,tv_resultMohebat,tv_resultRaayatHijab,tv_resultPoozesh,tv_resultEhteram,tv_resultKhoshro,tv_resultFrotan,tv_resultEsraf,tv_resultBesmeallah,tv_resultBakhshidn,tv_resultFaragiriElm,tv_resultSokhanHaq,tv_resultRAstGoii,tv_resultEfatKalam,tv_resultMashverat,tv_resultFroBrdnKhashm,tv_resultSalamAval,tv_resultMesvak,tv_resultKomakBeDigaran,tv_resultRaayatNazm,tv_resultIsar,tv_resultMotalee,tv_resultQeibatNakardn,tv_resultAmanat,tv_resultHamsardari,tv_resultRezq,tv_resultVarzesh,tv_resultEib;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amal_nik);



        tv_resultVafaBeAhd = findViewById(R.id.tv_resultVafaBeAhd);
        tv_resultBarnameRizi = findViewById(R.id.tv_resultBarnameRizi);
        tv_resultSaboor = findViewById(R.id.tv_resultSaboor);
        tv_resultMohebat = findViewById(R.id.tv_resultMohebat);
        tv_resultRaayatHijab = findViewById(R.id.tv_resultRaayatHijab);
        tv_resultPoozesh = findViewById(R.id.tv_resultPoozesh);
        tv_resultEhteram = findViewById(R.id.tv_resultEhteram);
        tv_resultKhoshro = findViewById(R.id.tv_resultKhoshro);
        tv_resultFrotan = findViewById(R.id.tv_resultFrotan);
        tv_resultEsraf = findViewById(R.id.tv_resultEsraf);
        tv_resultBesmeallah = findViewById(R.id.tv_resultBesmeallah);
        tv_resultBakhshidn = findViewById(R.id.tv_resultBakhshidn);
        tv_resultFaragiriElm = findViewById(R.id.tv_resultFaragiriElm);
        tv_resultSokhanHaq = findViewById(R.id.tv_resultSokhanHaq);
        tv_resultRAstGoii = findViewById(R.id.tv_resultRAstGoii);
        tv_resultEfatKalam = findViewById(R.id.tv_resultEfatKalam);
        tv_resultMashverat = findViewById(R.id.tv_resultMashverat);
        tv_resultFroBrdnKhashm = findViewById(R.id.tv_resultFroBrdnKhashm);
        tv_resultSalamAval = findViewById(R.id.tv_resultSalamAval);
        tv_resultMesvak = findViewById(R.id.tv_resultMesvak);
        tv_resultKomakBeDigaran = findViewById(R.id.tv_resultKomakBeDigaran);
        tv_resultRaayatNazm = findViewById(R.id.tv_resultRaayatNazm);
        tv_resultIsar = findViewById(R.id.tv_resultIsar);
        tv_resultMotalee = findViewById(R.id.tv_resultMotalee);
        tv_resultQeibatNakardn = findViewById(R.id.tv_resultQeibatNakardn);
        tv_resultAmanat = findViewById(R.id.tv_resultAmanat);
        tv_resultHamsardari = findViewById(R.id.tv_resultHamsardari);
        tv_resultRezq = findViewById(R.id.tv_resultRezq);
        tv_resultVarzesh = findViewById(R.id.tv_resultVarzesh);
        tv_resultEib = findViewById(R.id.tv_resultEib);

        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);

        counterVafaBeAhd = prefs.getInt("COUNTER_KEY",0);
        counterBarnameRizi = prefs.getInt("COUNTER_KEY",0);
        counterSaboor = prefs.getInt("COUNTER_KEY",0);
        counterMohebat= prefs.getInt("COUNTER_KEY",0);
        counterRaayatHijab = prefs.getInt("COUNTER_KEY",0);
        counterPoozesh = prefs.getInt("COUNTER_KEY",0);
        counterEhteram = prefs.getInt("COUNTER_KEY",0);
        counterKhoshro = prefs.getInt("COUNTER_KEY",0);
        counterFrotan = prefs.getInt("COUNTER_KEY",0);
        counterEsraf = prefs.getInt("COUNTER_KEY",0);
        counterBesmeallah = prefs.getInt("COUNTER_KEY",0);
        counterBakhshidn = prefs.getInt("COUNTER_KEY",0);
        counterFaragiriElm = prefs.getInt("COUNTER_KEY",0);
        counterSokhanHaq = prefs.getInt("COUNTER_KEY",0);
        counterRAstGoii = prefs.getInt("COUNTER_KEY",0);
        counterEfatKalam= prefs.getInt("COUNTER_KEY",0);
        counterMashverat = prefs.getInt("COUNTER_KEY",0);
        counterFroBrdnKhashm= prefs.getInt("COUNTER_KEY",0);
        counterSalamAval = prefs.getInt("COUNTER_KEY",0);
        counterMesvak = prefs.getInt("COUNTER_KEY",0);
        counterKomakBeDigaran = prefs.getInt("COUNTER_KEY",0);
        counterRaayatNazm = prefs.getInt("COUNTER_KEY",0);
        counterIsar = prefs.getInt("COUNTER_KEY",0);
        counterMotalee = prefs.getInt("COUNTER_KEY",0);
        counterQeibatNakardn = prefs.getInt("COUNTER_KEY",0);
        counterAmanat = prefs.getInt("COUNTER_KEY",0);
        counterHamsardari = prefs.getInt("COUNTER_KEY",0);
        counterRezq = prefs.getInt("COUNTER_KEY",0);
        counterVarzesh = prefs.getInt("COUNTER_KEY",0);
        counterEib = prefs.getInt("COUNTER_KEY",0);

        tv_resultVafaBeAhd.setText(String.valueOf(counterVafaBeAhd));
        tv_resultBarnameRizi.setText(String.valueOf(counterBarnameRizi));
        tv_resultSaboor.setText(String.valueOf(counterSaboor));
        tv_resultMohebat.setText(String.valueOf(counterMohebat));
        tv_resultRaayatHijab.setText(String.valueOf(counterRaayatHijab));
        tv_resultPoozesh.setText(String.valueOf(counterPoozesh));
        tv_resultEhteram.setText(String.valueOf(counterEhteram));
        tv_resultKhoshro.setText(String.valueOf(counterKhoshro));
        tv_resultFrotan.setText(String.valueOf(counterFrotan));
        tv_resultEsraf.setText(String.valueOf(counterEsraf));
        tv_resultBesmeallah.setText(String.valueOf(counterBesmeallah));
        tv_resultBakhshidn.setText(String.valueOf(counterBakhshidn));
        tv_resultFaragiriElm.setText(String.valueOf(counterFaragiriElm));
        tv_resultSokhanHaq.setText(String.valueOf(counterSokhanHaq));
        tv_resultRAstGoii.setText(String.valueOf(counterRAstGoii));
        tv_resultEfatKalam.setText(String.valueOf(counterEfatKalam));
        tv_resultMashverat.setText(String.valueOf(counterMashverat));
        tv_resultFroBrdnKhashm.setText(String.valueOf(counterFroBrdnKhashm));
        tv_resultSalamAval.setText(String.valueOf(counterSalamAval));
        tv_resultMesvak.setText(String.valueOf(counterMesvak));
        tv_resultKomakBeDigaran.setText(String.valueOf(counterKomakBeDigaran));
        tv_resultRaayatNazm.setText(String.valueOf(counterRaayatNazm));
        tv_resultIsar.setText(String.valueOf(counterIsar));
        tv_resultMotalee.setText(String.valueOf(counterMotalee));
        tv_resultQeibatNakardn.setText(String.valueOf(counterQeibatNakardn));
        tv_resultAmanat.setText(String.valueOf(counterAmanat));
        tv_resultHamsardari.setText(String.valueOf(counterHamsardari));
        tv_resultRezq.setText(String.valueOf(counterRezq));
        tv_resultVarzesh.setText(String.valueOf(counterVarzesh));
        tv_resultEib.setText(String.valueOf(counterEib));



    }

    public void btn_addVafaBeAhd(View view) {
        counterVafaBeAhd++;
        tv_resultVafaBeAhd.setText(String.valueOf(counterVafaBeAhd));
    }

    public void btn_removVafaBeAhd(View view) {
        counterVafaBeAhd = 0;
        tv_resultVafaBeAhd.setText(String.valueOf(counterVafaBeAhd));
    }

    public void btn_addBarnameRizi(View view) {
        counterBarnameRizi++;
        tv_resultBarnameRizi.setText(String.valueOf(counterBarnameRizi));
    }

    public void btn_removBarnameRizi(View view) {
        counterBarnameRizi = 0;
        tv_resultBarnameRizi.setText(String.valueOf(counterBarnameRizi));
    }

    public void btn_addSaboor(View view) {
        counterSaboor++;
        tv_resultSaboor.setText(String.valueOf(counterSaboor));
    }

    public void btn_removSaboor(View view) {
        counterSaboor = 0;
        tv_resultSaboor.setText(String.valueOf(counterSaboor));
    }

    public void btn_addMohebat(View view) {
        counterMohebat++;
        tv_resultMohebat.setText(String.valueOf(counterMohebat));
    }

    public void btn_removMohebat(View view) {
        counterMohebat = 0;
        tv_resultMohebat.setText(String.valueOf(counterMohebat));
    }

    public void btn_addRaayatHijab(View view) {
        counterRaayatHijab++;
        tv_resultRaayatHijab.setText(String.valueOf(counterRaayatHijab));
    }

    public void btn_removRaayatHijab(View view) {
        counterRaayatHijab = 0;
        tv_resultRaayatHijab.setText(String.valueOf(counterRaayatHijab));
    }

    public void btn_addPoozesh(View view) {
        counterPoozesh++;
        tv_resultPoozesh.setText(String.valueOf(counterPoozesh));
    }

    public void btn_removPoozesh(View view) {
        counterPoozesh = 0;
        tv_resultPoozesh.setText(String.valueOf(counterPoozesh));
    }

    public void btn_addEhteram(View view) {
        counterEhteram++;
        tv_resultEhteram.setText(String.valueOf(counterEhteram));
    }

    public void btn_removEhteram(View view) {
        counterEhteram = 0;
        tv_resultEhteram.setText(String.valueOf(counterEhteram));
    }

    public void btn_addKhoshro(View view) {
        counterKhoshro++;
        tv_resultKhoshro.setText(String.valueOf(counterKhoshro));
    }

    public void btn_removKhoshro(View view) {
        counterKhoshro = 0;
        tv_resultKhoshro.setText(String.valueOf(counterKhoshro));
    }

    public void btn_addFrotan(View view) {
        counterFrotan++;
        tv_resultFrotan.setText(String.valueOf(counterFrotan));
    }

    public void btn_removFrotan(View view) {
        counterFrotan = 0;
        tv_resultFrotan.setText(String.valueOf(counterFrotan));
    }

    public void btn_addEsraf(View view) {
        counterEsraf++;
        tv_resultEsraf.setText(String.valueOf(counterEsraf));
    }

    public void btn_removEsraf(View view) {
        counterEsraf = 0;
        tv_resultEsraf.setText(String.valueOf(counterEsraf));
    }

    public void btn_addBesmeallah(View view) {
        counterBesmeallah++;
        tv_resultBesmeallah.setText(String.valueOf(counterBesmeallah));
    }

    public void btn_removBesmeallah(View view) {
        counterBesmeallah = 0;
        tv_resultBesmeallah.setText(String.valueOf(counterBesmeallah));
    }

    public void btn_addBakhshidn(View view) {
        counterBakhshidn++;
        tv_resultBakhshidn.setText(String.valueOf(counterBakhshidn));
    }

    public void btn_removBakhshidn(View view) {
        counterBakhshidn = 0;
        tv_resultBakhshidn.setText(String.valueOf(counterBakhshidn));
    }

    public void btn_addFaragiriElm(View view) {
        counterFaragiriElm++;
        tv_resultFaragiriElm.setText(String.valueOf(counterFaragiriElm));
    }

    public void btn_removFaragiriElm(View view) {
        counterFaragiriElm = 0;
        tv_resultFaragiriElm.setText(String.valueOf(counterFaragiriElm));
    }

    public void btn_addSokhanHaq(View view) {
        counterSokhanHaq++;
        tv_resultSokhanHaq.setText(String.valueOf(counterSokhanHaq));
    }

    public void btn_removSokhanHaq(View view) {
        counterSokhanHaq = 0;
        tv_resultSokhanHaq.setText(String.valueOf(counterSokhanHaq));
    }

    public void btn_addRAstGoii(View view) {
        counterRAstGoii++;
        tv_resultRAstGoii.setText(String.valueOf(counterRAstGoii));
    }

    public void btn_removRAstGoii(View view) {
        counterRAstGoii = 0;
        tv_resultRAstGoii.setText(String.valueOf(counterRAstGoii));
    }

    public void btn_addEfatKalam(View view) {
        counterEfatKalam++;
        tv_resultEfatKalam.setText(String.valueOf(counterEfatKalam));
    }

    public void btn_removEfatKalam(View view) {
        counterEfatKalam = 0;
        tv_resultEfatKalam.setText(String.valueOf(counterEfatKalam));
    }

    public void btn_addMashverat(View view) {
        counterMashverat++;
        tv_resultMashverat.setText(String.valueOf(counterMashverat));
    }

    public void btn_removMashverat(View view) {
        counterMashverat = 0;
        tv_resultMashverat.setText(String.valueOf(counterMashverat));
    }

    public void btn_addFroBrdnKhashm(View view) {
        counterFroBrdnKhashm++;
        tv_resultFroBrdnKhashm.setText(String.valueOf(counterFroBrdnKhashm));
    }

    public void btn_removFroBrdnKhashm(View view) {
         counterFroBrdnKhashm= 0;
        tv_resultFroBrdnKhashm.setText(String.valueOf(counterFroBrdnKhashm));
    }

    public void btn_addSalamAval(View view) {
        counterSalamAval++;
        tv_resultSalamAval.setText(String.valueOf(counterSalamAval));
    }

    public void btn_removSalamAval(View view) {
        counterSalamAval = 0;
        tv_resultSalamAval.setText(String.valueOf(counterSalamAval));
    }

    public void btn_addMesvak(View view) {
        counterMesvak++;
        tv_resultMesvak.setText(String.valueOf(counterMesvak));
    }

    public void btn_removMesvak(View view) {
        counterMesvak = 0;
        tv_resultMesvak.setText(String.valueOf(counterMesvak));
    }

    public void btn_addKomakBeDigaran(View view) {
        counterKomakBeDigaran++;
        tv_resultKomakBeDigaran.setText(String.valueOf(counterKomakBeDigaran));
    }

    public void btn_removKomakBeDigaran(View view) {
        counterKomakBeDigaran = 0;
        tv_resultKomakBeDigaran.setText(String.valueOf(counterKomakBeDigaran));
    }

    public void btn_addRaayatNazm(View view) {
        counterRaayatNazm++;
        tv_resultRaayatNazm.setText(String.valueOf(counterRaayatNazm));
    }

    public void btn_removRaayatNazm(View view) {
        counterRaayatNazm = 0;
        tv_resultRaayatNazm.setText(String.valueOf(counterRaayatNazm));
    }

    public void btn_addIsar(View view) {
        counterIsar++;
        tv_resultIsar.setText(String.valueOf(counterIsar));
    }

    public void btn_removIsar(View view) {
        counterIsar = 0;
        tv_resultIsar.setText(String.valueOf(counterIsar));
    }

    public void btn_addMotalee(View view) {
        counterMotalee++;
        tv_resultMotalee.setText(String.valueOf(counterMotalee));
    }

    public void btn_removMotalee(View view) {
        counterMotalee = 0;
        tv_resultMotalee.setText(String.valueOf(counterMotalee));
    }

    public void btn_addQeibatNakardn(View view) {
        counterQeibatNakardn++;
        tv_resultQeibatNakardn.setText(String.valueOf(counterQeibatNakardn));
    }

    public void btn_removQeibatNakardn(View view) {
        counterQeibatNakardn = 0;
        tv_resultQeibatNakardn.setText(String.valueOf(counterQeibatNakardn));
    }

    public void btn_addAmanat(View view) {
        counterAmanat++;
        tv_resultAmanat.setText(String.valueOf(counterAmanat));
    }

    public void btn_removAmanat(View view) {
        counterAmanat = 0;
        tv_resultAmanat.setText(String.valueOf(counterAmanat));
    }

    public void btn_addHamsardari(View view) {
        counterHamsardari++;
        tv_resultHamsardari.setText(String.valueOf(counterHamsardari));
    }

    public void btn_removHamsardari(View view) {
        counterHamsardari = 0;
        tv_resultHamsardari.setText(String.valueOf(counterHamsardari));
    }

    public void btn_addRezq(View view) {
        counterRezq++;
        tv_resultRezq.setText(String.valueOf(counterRezq));
    }

    public void btn_removRezq(View view) {
        counterRezq = 0;
        tv_resultRezq.setText(String.valueOf(counterRezq));
    }

    public void btn_addVarzesh(View view) {
        counterVarzesh++;
        tv_resultVarzesh.setText(String.valueOf(counterVarzesh));

    }

    public void btn_removVarzesh(View view) {
        counterVarzesh = 0;
        tv_resultVarzesh.setText(String.valueOf(counterVarzesh));
    }

    public void btn_addEib(View view) {
        counterEib++;
        tv_resultEib.setText(String.valueOf(counterEib));
    }

    public void btn_removEib(View view) {
        counterEib = 0;
        tv_resultEib.setText(String.valueOf(counterEib));
    }
}