package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Typeface;
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

        SharedPreferences prefsVafaBeAhd  = getSharedPreferences("MY_PREFSVafaBeAhd" , MODE_PRIVATE);
        SharedPreferences prefsBarnameRizi = getSharedPreferences("MY_PREFSBarnameRizi" , MODE_PRIVATE);
        SharedPreferences prefsSaboor  = getSharedPreferences("MY_PREFSSaboor" , MODE_PRIVATE);
        SharedPreferences prefsMohebat  = getSharedPreferences("MY_PREFSMohebat" , MODE_PRIVATE);
        SharedPreferences prefsRaayatHijab  = getSharedPreferences("MY_PREFSRaayatHijab" , MODE_PRIVATE);
        SharedPreferences prefsPoozesh  = getSharedPreferences("MY_PREFSPoozesh" , MODE_PRIVATE);
        SharedPreferences prefsEhteram   = getSharedPreferences("MY_PREFSEhteram" , MODE_PRIVATE);
        SharedPreferences prefsKhoshro  = getSharedPreferences("MY_PREFSKhoshro" , MODE_PRIVATE);
        SharedPreferences prefsFrotan  = getSharedPreferences("MY_PREFSFrotan" , MODE_PRIVATE);
        SharedPreferences prefsEsraf  = getSharedPreferences("MY_PREFSEsraf" , MODE_PRIVATE);
        SharedPreferences prefsBesmeallah  = getSharedPreferences("MY_PREFSBesmeallah" , MODE_PRIVATE);
        SharedPreferences prefsBakhshidn  = getSharedPreferences("MY_PREFSBakhshidn" , MODE_PRIVATE);
        SharedPreferences prefsFaragiriElm  = getSharedPreferences("MY_PREFSFaragiriElm" , MODE_PRIVATE);
        SharedPreferences prefsSokhanHaq = getSharedPreferences("MY_PREFSSokhanHaq" , MODE_PRIVATE);
        SharedPreferences prefsRAstGoii = getSharedPreferences("MY_PREFSRAstGoii" , MODE_PRIVATE);
        SharedPreferences prefsEfatKalam  = getSharedPreferences("MY_PREFSEfatKalam" , MODE_PRIVATE);
        SharedPreferences prefsMashverat  = getSharedPreferences("MY_PREFSMashverat" , MODE_PRIVATE);
        SharedPreferences prefsBrdnKhashm  = getSharedPreferences("MY_PREFSBrdnKhashm" , MODE_PRIVATE);
        SharedPreferences prefsMesvak  = getSharedPreferences("MY_PREFSMesvak" , MODE_PRIVATE);
        SharedPreferences prefsSalamAval  = getSharedPreferences("MY_PREFSSalamAval" , MODE_PRIVATE);
        SharedPreferences prefsKomakBeDigaran  = getSharedPreferences("MY_PREFSKomakBeDigaran" , MODE_PRIVATE);
        SharedPreferences prefsRaayatNazm  = getSharedPreferences("MY_PREFSRaayatNazm" , MODE_PRIVATE);
        SharedPreferences prefsIsar  = getSharedPreferences("MY_PREFSIsar" , MODE_PRIVATE);
        SharedPreferences prefsMotalee  = getSharedPreferences("MY_PREFSMotalee" , MODE_PRIVATE);
        SharedPreferences prefsQeibatNakardn  = getSharedPreferences("MY_PREFSQeibatNakardn" , MODE_PRIVATE);
        SharedPreferences prefsAmanat  = getSharedPreferences("MY_PREFSAmanat" , MODE_PRIVATE);
        SharedPreferences prefsHamsardari  = getSharedPreferences("MY_PREFSHamsardari" , MODE_PRIVATE);
        SharedPreferences prefsRezq  = getSharedPreferences("MY_PREFSRezq" , MODE_PRIVATE);
        SharedPreferences prefsVarzesh  = getSharedPreferences("MY_PREFSVarzesh" , MODE_PRIVATE);
        SharedPreferences prefsEib  = getSharedPreferences("MY_PREFSEib" , MODE_PRIVATE);

        counterVafaBeAhd = prefsVafaBeAhd .getInt("COUNTER_KEY",0);
        counterBarnameRizi = prefsBarnameRizi.getInt("COUNTER_KEY",0);
        counterSaboor = prefsSaboor.getInt("COUNTER_KEY",0);
        counterMohebat= prefsMohebat.getInt("COUNTER_KEY",0);
        counterRaayatHijab = prefsRaayatHijab.getInt("COUNTER_KEY",0);
        counterPoozesh = prefsPoozesh.getInt("COUNTER_KEY",0);
        counterEhteram = prefsEhteram .getInt("COUNTER_KEY",0);
        counterKhoshro = prefsKhoshro.getInt("COUNTER_KEY",0);
        counterFrotan = prefsFrotan.getInt("COUNTER_KEY",0);
        counterEsraf = prefsEsraf.getInt("COUNTER_KEY",0);
        counterBesmeallah = prefsBesmeallah.getInt("COUNTER_KEY",0);
        counterBakhshidn = prefsBakhshidn.getInt("COUNTER_KEY",0);
        counterFaragiriElm = prefsFaragiriElm.getInt("COUNTER_KEY",0);
        counterSokhanHaq = prefsSokhanHaq.getInt("COUNTER_KEY",0);
        counterRAstGoii = prefsRAstGoii.getInt("COUNTER_KEY",0);
        counterEfatKalam= prefsEfatKalam.getInt("COUNTER_KEY",0);
        counterMashverat = prefsMashverat.getInt("COUNTER_KEY",0);
        counterFroBrdnKhashm= prefsBrdnKhashm.getInt("COUNTER_KEY",0);
        counterSalamAval = prefsSalamAval.getInt("COUNTER_KEY",0);
        counterMesvak = prefsMesvak.getInt("COUNTER_KEY",0);
        counterKomakBeDigaran = prefsKomakBeDigaran.getInt("COUNTER_KEY",0);
        counterRaayatNazm = prefsRaayatNazm.getInt("COUNTER_KEY",0);
        counterIsar = prefsIsar.getInt("COUNTER_KEY",0);
        counterMotalee = prefsMotalee.getInt("COUNTER_KEY",0);
        counterQeibatNakardn = prefsQeibatNakardn.getInt("COUNTER_KEY",0);
        counterAmanat = prefsAmanat.getInt("COUNTER_KEY",0);
        counterHamsardari = prefsHamsardari.getInt("COUNTER_KEY",0);
        counterRezq = prefsRezq.getInt("COUNTER_KEY",0);
        counterVarzesh = prefsVarzesh.getInt("COUNTER_KEY",0);
        counterEib = prefsEib.getInt("COUNTER_KEY",0);

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


        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");
        tv_resultVafaBeAhd.setTypeface(type);
        tv_resultBarnameRizi.setTypeface(type);
        tv_resultSaboor.setTypeface(type);
        tv_resultMohebat.setTypeface(type);
        tv_resultRaayatHijab.setTypeface(type);
        tv_resultPoozesh.setTypeface(type);
        tv_resultEhteram.setTypeface(type);
        tv_resultKhoshro.setTypeface(type);
        tv_resultFrotan.setTypeface(type);
        tv_resultEsraf.setTypeface(type);
        tv_resultBesmeallah.setTypeface(type);
        tv_resultBakhshidn.setTypeface(type);
        tv_resultFaragiriElm.setTypeface(type);
        tv_resultSokhanHaq.setTypeface(type);
        tv_resultRAstGoii.setTypeface(type);
        tv_resultEfatKalam.setTypeface(type);
        tv_resultMashverat.setTypeface(type);
        tv_resultFroBrdnKhashm.setTypeface(type);
        tv_resultSalamAval.setTypeface(type);
        tv_resultMesvak.setTypeface(type);
        tv_resultKomakBeDigaran.setTypeface(type);
        tv_resultRaayatNazm.setTypeface(type);
        tv_resultIsar.setTypeface(type);
        tv_resultMotalee.setTypeface(type);
        tv_resultQeibatNakardn.setTypeface(type);
        tv_resultAmanat.setTypeface(type);
        tv_resultHamsardari.setTypeface(type);
        tv_resultRezq.setTypeface(type);
        tv_resultVarzesh.setTypeface(type);
        tv_resultEib.setTypeface(type);



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


    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editorVafaBeAhd = getSharedPreferences("MY_PREFSVafaBeAhd" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBarnameRizi = getSharedPreferences("MY_PREFSBarnameRizi" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSaboor = getSharedPreferences("MY_PREFSSaboor" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMohebat = getSharedPreferences("MY_PREFSMohebat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRaayatHijab = getSharedPreferences("MY_PREFSRaayatHijab" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorPoozesh = getSharedPreferences("MY_PREFSPoozesh" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEhteram = getSharedPreferences("MY_PREFSEhteram" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorKhoshro = getSharedPreferences("MY_PREFSKhoshro" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorFrotan = getSharedPreferences("MY_PREFSFrotan" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEsraf = getSharedPreferences("MY_PREFSEsraf" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBesmeallah = getSharedPreferences("MY_PREFSBesmeallah" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBakhshidn = getSharedPreferences("MY_PREFSBakhshidn" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorFaragiriElm = getSharedPreferences("MY_PREFSFaragiriElm" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSokhanHaq = getSharedPreferences("MY_PREFSSokhanHaq" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRAstGoii = getSharedPreferences("MY_PREFSRAstGoii" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEfatKalam= getSharedPreferences("MY_PREFSEfatKalam" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMashverat = getSharedPreferences("MY_PREFSMashverat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBrdnKhashm = getSharedPreferences("MY_PREFSBrdnKhashm" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMesvak = getSharedPreferences("MY_PREFSMesvak" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSalamAval = getSharedPreferences("MY_PREFSSalamAval" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorKomakBeDigaran = getSharedPreferences("MY_PREFSKomakBeDigaran" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRaayatNazm = getSharedPreferences("MY_PREFSRaayatNazm" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorIsar = getSharedPreferences("MY_PREFSIsar" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMotalee = getSharedPreferences("MY_PREFSMotalee" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorQeibatNakardn = getSharedPreferences("MY_PREFSQeibatNakardn" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAmanat = getSharedPreferences("MY_PREFSAmanat" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorHamsardari = getSharedPreferences("MY_PREFSHamsardari" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRezq = getSharedPreferences("MY_PREFSRezq" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorVarzesh = getSharedPreferences("MY_PREFSVarzesh" , MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEib = getSharedPreferences("MY_PREFSEib" , MODE_PRIVATE).edit();

        editorVafaBeAhd.putInt("COUNTER_KEY",counterVafaBeAhd);
        editorBarnameRizi.putInt("COUNTER_KEY",counterBarnameRizi);
        editorSaboor.putInt("COUNTER_KEY",counterSaboor);
        editorMohebat.putInt("COUNTER_KEY",counterMohebat);
        editorRaayatHijab.putInt("COUNTER_KEY",counterRaayatHijab);
        editorPoozesh.putInt("COUNTER_KEY",counterPoozesh);
        editorEhteram.putInt("COUNTER_KEY",counterEhteram);
        editorKhoshro.putInt("COUNTER_KEY",counterKhoshro);
        editorFrotan.putInt("COUNTER_KEY",counterFrotan);
        editorEsraf.putInt("COUNTER_KEY",counterEsraf);
        editorBesmeallah.putInt("COUNTER_KEY",counterBesmeallah);
        editorBakhshidn.putInt("COUNTER_KEY",counterBakhshidn);
        editorFaragiriElm.putInt("COUNTER_KEY",counterFaragiriElm);
        editorSokhanHaq.putInt("COUNTER_KEY",counterSokhanHaq);
        editorRAstGoii.putInt("COUNTER_KEY",counterRAstGoii);
        editorEfatKalam.putInt("COUNTER_KEY",counterEfatKalam);
        editorMashverat.putInt("COUNTER_KEY",counterMashverat);
        editorBrdnKhashm.putInt("COUNTER_KEY",counterFroBrdnKhashm);
        editorMesvak.putInt("COUNTER_KEY",counterSalamAval);
        editorSalamAval.putInt("COUNTER_KEY",counterMesvak);
        editorKomakBeDigaran.putInt("COUNTER_KEY",counterKomakBeDigaran);
        editorRaayatNazm.putInt("COUNTER_KEY",counterRaayatNazm);
        editorIsar.putInt("COUNTER_KEY",counterIsar);
        editorMotalee.putInt("COUNTER_KEY",counterMotalee);
        editorQeibatNakardn.putInt("COUNTER_KEY",counterQeibatNakardn);
        editorAmanat.putInt("COUNTER_KEY",counterAmanat);
        editorHamsardari.putInt("COUNTER_KEY",counterHamsardari);
        editorRezq.putInt("COUNTER_KEY",counterRezq);
        editorVarzesh.putInt("COUNTER_KEY",counterVarzesh);
        editorEib.putInt("COUNTER_KEY",counterEib);




        editorVafaBeAhd.apply();
        editorBarnameRizi.apply();
        editorSaboor.apply();
        editorMohebat.apply();
        editorRaayatHijab.apply();
        editorPoozesh.apply();
        editorEhteram.apply();
        editorKhoshro.apply();
        editorFrotan.apply();
        editorEsraf.apply();
        editorBesmeallah.apply();
        editorBakhshidn.apply();
        editorFaragiriElm.apply();
        editorSokhanHaq.apply();
        editorRAstGoii.apply();
        editorEfatKalam.apply();
        editorMashverat.apply();
        editorBrdnKhashm.apply();
        editorMesvak.apply();
        editorSalamAval.apply();
        editorKomakBeDigaran.apply();
        editorRaayatNazm.apply();
        editorIsar.apply();
        editorMotalee.apply();
        editorQeibatNakardn.apply();
        editorAmanat.apply();
        editorHamsardari.apply();
        editorRezq.apply();
        editorVarzesh.apply();
        editorEib.apply();





    }
}