package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AmalBadActivity extends AppCompatActivity {

    int counterQeibatKardan=0;
    int counterTarkNAmaz=0;
    int counterEsrafKrdn=0;
    int counterSoutHaram=0;
    int counterAsabaniat=0;
    int counterKhianat=0;
    int counterTohmat=0;
    int counterTafraqe=0;
    int counterNegahHaram=0;
    int counterRezqHaram=0;
    int counterAbroo=0;
    int counterZakhmZaban=0;
    int counterPeyman=0;
    int counterSokhanParidn=0;
    int counterBeEhterami=0;
    int counterTohin=0;
    int counterFekrHaram=0;
    int counterMasrafAlkol=0;

    TextView tv_resultQeibatKardan,tv_resultTarkNAmaz,tv_resultEsrafKrdn,tv_resultSoutHaram,tv_resultAsabaniat,tv_resultKhianat,tv_resultTohmat,tv_resultTafraqe,tv_resultNegahHaram,tv_resultRezqHaram,tv_resultAbroo,tv_resultZakhmZaban,tv_resultPeyman,tv_resultSokhanParidn,tv_resultBeEhterami,tv_resultTohin,tv_resultFekrHaram,tv_resultMasrafAlkol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amal_bad);



        tv_resultQeibatKardan = findViewById(R.id.tv_resultQeibatKardan);
        tv_resultTarkNAmaz = findViewById(R.id.tv_resultTarkNAmaz);
        tv_resultEsrafKrdn = findViewById(R.id.tv_resultEsrafKrdn);
        tv_resultSoutHaram = findViewById(R.id.tv_resultSoutHaram);
        tv_resultAsabaniat = findViewById(R.id.tv_resultAsabaniat);
        tv_resultKhianat = findViewById(R.id.tv_resultKhianat);
        tv_resultTohmat = findViewById(R.id.tv_resultTohmat);
        tv_resultTafraqe = findViewById(R.id.tv_resultTafraqe);
        tv_resultNegahHaram = findViewById(R.id.tv_resultNegahHaram);
        tv_resultRezqHaram = findViewById(R.id.tv_resultRezqHaram);
        tv_resultAbroo = findViewById(R.id.tv_resultAbroo);
        tv_resultZakhmZaban = findViewById(R.id.tv_resultZakhmZaban);
        tv_resultPeyman = findViewById(R.id.tv_resultPeyman);
        tv_resultSokhanParidn = findViewById(R.id.tv_resultSokhanParidn);
        tv_resultBeEhterami = findViewById(R.id.tv_resultBeEhterami);
        tv_resultTohin = findViewById(R.id.tv_resultTohin);
        tv_resultFekrHaram = findViewById(R.id.tv_resultFekrHaram);
        tv_resultMasrafAlkol = findViewById(R.id.tv_resultMasrafAlkol);

        SharedPreferences prefsQeibatKardan = getSharedPreferences("MY_PREFSQeibatKardan" , MODE_PRIVATE);
        SharedPreferences prefsTarkNAmaz = getSharedPreferences("MY_PREFSTarkNAmaz" , MODE_PRIVATE);
        SharedPreferences prefsEsrafKrdn = getSharedPreferences("MY_PREFSEsrafKrdn" , MODE_PRIVATE);
        SharedPreferences prefsSoutHaram = getSharedPreferences("MY_PREFSSoutHaram" , MODE_PRIVATE);
        SharedPreferences prefsAsabaniat = getSharedPreferences("MY_PREFSAsabaniat" , MODE_PRIVATE);
        SharedPreferences prefsKhianat = getSharedPreferences("MY_PREFSKhianat" , MODE_PRIVATE);
        SharedPreferences prefsTohmat = getSharedPreferences("MY_PREFSTohmat" , MODE_PRIVATE);
        SharedPreferences prefsTafraqe = getSharedPreferences("MY_PREFSTafraqe" , MODE_PRIVATE);
        SharedPreferences prefsNegahHaram = getSharedPreferences("MY_PREFSNegahHaram" , MODE_PRIVATE);
        SharedPreferences prefsRezqHaram = getSharedPreferences("MY_PREFSRezqHaram" , MODE_PRIVATE);
        SharedPreferences prefsAbroo = getSharedPreferences("MY_PREFSAbroo" , MODE_PRIVATE);
        SharedPreferences prefsZakhmZaban = getSharedPreferences("MY_PREFSZakhmZaban" , MODE_PRIVATE);
        SharedPreferences prefsPeyman = getSharedPreferences("MY_PREFSPeyman" , MODE_PRIVATE);
        SharedPreferences prefsSokhanParidn = getSharedPreferences("MY_PREFSSokhanParidn" , MODE_PRIVATE);
        SharedPreferences prefsBeEhterami = getSharedPreferences("MY_PREFSBeEhterami" , MODE_PRIVATE);
        SharedPreferences prefsTohin = getSharedPreferences("MY_PREFSTohin" , MODE_PRIVATE);
        SharedPreferences prefsFekrHaram = getSharedPreferences("MY_PREFSFekrHaram" , MODE_PRIVATE);
        SharedPreferences prefsMasrafAlkol = getSharedPreferences("MY_PREFSMasrafAlkol" , MODE_PRIVATE);

        counterQeibatKardan = prefsQeibatKardan.getInt("COUNTER_KEY",0);
        counterTarkNAmaz = prefsTarkNAmaz.getInt("COUNTER_KEY",0);
        counterEsrafKrdn = prefsEsrafKrdn.getInt("COUNTER_KEY",0);
        counterSoutHaram= prefsSoutHaram.getInt("COUNTER_KEY",0);
        counterAsabaniat = prefsAsabaniat.getInt("COUNTER_KEY",0);
        counterKhianat = prefsKhianat.getInt("COUNTER_KEY",0);
        counterTohmat = prefsTohmat.getInt("COUNTER_KEY",0);
        counterTafraqe = prefsTafraqe.getInt("COUNTER_KEY",0);
        counterNegahHaram = prefsNegahHaram.getInt("COUNTER_KEY",0);
        counterRezqHaram = prefsRezqHaram.getInt("COUNTER_KEY",0);
        counterAbroo = prefsAbroo.getInt("COUNTER_KEY",0);
        counterZakhmZaban = prefsZakhmZaban.getInt("COUNTER_KEY",0);
        counterPeyman = prefsPeyman.getInt("COUNTER_KEY",0);
        counterSokhanParidn = prefsSokhanParidn.getInt("COUNTER_KEY",0);
        counterBeEhterami = prefsBeEhterami.getInt("COUNTER_KEY",0);
        counterTohin= prefsTohin.getInt("COUNTER_KEY",0);
        counterFekrHaram = prefsFekrHaram.getInt("COUNTER_KEY",0);
        counterMasrafAlkol= prefsMasrafAlkol.getInt("COUNTER_KEY",0);

        tv_resultQeibatKardan.setText(String.valueOf(counterQeibatKardan));
        tv_resultTarkNAmaz.setText(String.valueOf(counterTarkNAmaz));
        tv_resultEsrafKrdn.setText(String.valueOf(counterEsrafKrdn));
        tv_resultSoutHaram.setText(String.valueOf(counterSoutHaram));
        tv_resultAsabaniat.setText(String.valueOf(counterAsabaniat));
        tv_resultKhianat.setText(String.valueOf(counterKhianat));
        tv_resultTohmat.setText(String.valueOf(counterTohmat));
        tv_resultTafraqe.setText(String.valueOf(counterTafraqe));
        tv_resultNegahHaram.setText(String.valueOf(counterRezqHaram));
        tv_resultRezqHaram.setText(String.valueOf(counterRezqHaram));
        tv_resultAbroo.setText(String.valueOf(counterAbroo));
        tv_resultZakhmZaban.setText(String.valueOf(counterZakhmZaban));
        tv_resultPeyman.setText(String.valueOf(counterSokhanParidn));
        tv_resultSokhanParidn.setText(String.valueOf(counterSokhanParidn));
        tv_resultBeEhterami.setText(String.valueOf(counterBeEhterami));
        tv_resultTohin.setText(String.valueOf(counterTohin));
        tv_resultFekrHaram.setText(String.valueOf(counterFekrHaram));
        tv_resultMasrafAlkol.setText(String.valueOf(counterMasrafAlkol));

        Typeface type=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");
        tv_resultQeibatKardan.setTypeface(type);
        tv_resultTarkNAmaz.setTypeface(type);
        tv_resultEsrafKrdn.setTypeface(type);
        tv_resultSoutHaram.setTypeface(type);
        tv_resultAsabaniat.setTypeface(type);
        tv_resultKhianat.setTypeface(type);
        tv_resultTohmat.setTypeface(type);
        tv_resultTafraqe.setTypeface(type);
        tv_resultNegahHaram.setTypeface(type);
        tv_resultRezqHaram.setTypeface(type);
        tv_resultAbroo.setTypeface(type);
        tv_resultZakhmZaban.setTypeface(type);
        tv_resultPeyman.setTypeface(type);
        tv_resultSokhanParidn.setTypeface(type);
        tv_resultBeEhterami.setTypeface(type);
        tv_resultTohin.setTypeface(type);
        tv_resultFekrHaram.setTypeface(type);
        tv_resultMasrafAlkol.setTypeface(type);





    }

    public void btn_addQeibatKardan(View view) {

        counterQeibatKardan++;
        tv_resultQeibatKardan.setText(String.valueOf(counterQeibatKardan));
    }

    public void btn_removQeibatKardan(View view) {

        counterQeibatKardan = 0;
        tv_resultQeibatKardan.setText(String.valueOf(counterQeibatKardan));
    }

    public void btn_addTarkNAmaz(View view) {

        counterTarkNAmaz++;
        tv_resultTarkNAmaz.setText(String.valueOf(counterTarkNAmaz));
    }

    public void btn_removTarkNAmaz(View view) {

        counterTarkNAmaz = 0;
        tv_resultTarkNAmaz.setText(String.valueOf(counterTarkNAmaz));
    }

    public void btn_addEsrafKrdn(View view) {

        counterEsrafKrdn++;
        tv_resultEsrafKrdn.setText(String.valueOf(counterEsrafKrdn));
    }

    public void btn_removEsrafKrdn(View view) {


        counterEsrafKrdn = 0;
        tv_resultEsrafKrdn.setText(String.valueOf(counterEsrafKrdn));
    }

    public void btn_addSoutHaram(View view) {

        counterSoutHaram++;
        tv_resultSoutHaram.setText(String.valueOf(counterSoutHaram));
    }

    public void btn_removSoutHaram(View view) {


        counterSoutHaram = 0;
        tv_resultSoutHaram.setText(String.valueOf(counterSoutHaram));
    }

    public void btn_addAsabaniat(View view) {

        counterAsabaniat++;
        tv_resultAsabaniat.setText(String.valueOf(counterAsabaniat));
    }

    public void btn_removAsabaniat(View view) {


        counterAsabaniat = 0;
        tv_resultAsabaniat.setText(String.valueOf(counterAsabaniat));
    }

    public void btn_addKhianat(View view) {

        counterKhianat++;
        tv_resultKhianat.setText(String.valueOf(counterKhianat));
    }

    public void btn_removKhianat(View view) {


        counterKhianat = 0;
        tv_resultKhianat.setText(String.valueOf(counterKhianat));
    }

    public void btn_addTohmat(View view) {

        counterTohmat++;
        tv_resultTohmat.setText(String.valueOf(counterTohmat));
    }

    public void btn_removTohmat(View view) {


        counterTohmat = 0;
        tv_resultTohmat.setText(String.valueOf(counterTohmat));
    }

    public void btn_addTafraqe(View view) {

        counterTafraqe++;
        tv_resultTafraqe.setText(String.valueOf(counterTafraqe));
    }

    public void btn_removTafraqe(View view) {


        counterTafraqe = 0;
        tv_resultTafraqe.setText(String.valueOf(counterTafraqe));
    }

    public void btn_addNegahHaram(View view) {

        counterNegahHaram++;
        tv_resultNegahHaram.setText(String.valueOf(counterNegahHaram));
    }

    public void btn_removNegahHaram(View view) {


        counterNegahHaram = 0;
        tv_resultNegahHaram.setText(String.valueOf(counterNegahHaram));
    }

    public void btn_addRezqHaram(View view) {

        counterRezqHaram++;
        tv_resultRezqHaram.setText(String.valueOf(counterRezqHaram));
    }

    public void btn_removRezqHaram(View view) {


        counterRezqHaram = 0;
        tv_resultRezqHaram.setText(String.valueOf(counterRezqHaram));
    }

    public void btn_addAbroo(View view) {

        counterAbroo++;
        tv_resultAbroo.setText(String.valueOf(counterAbroo));
    }

    public void btn_removAbroo(View view) {


        counterAbroo = 0;
        tv_resultAbroo.setText(String.valueOf(counterAbroo));
    }

    public void btn_addZakhmZaban(View view) {

        counterZakhmZaban++;
        tv_resultZakhmZaban.setText(String.valueOf(counterZakhmZaban));
    }

    public void btn_removZakhmZaban(View view) {


        counterZakhmZaban = 0;
        tv_resultZakhmZaban.setText(String.valueOf(counterZakhmZaban));
    }

    public void btn_addPeyman(View view) {

        counterPeyman++;
        tv_resultPeyman.setText(String.valueOf(counterPeyman));
    }

    public void btn_removPeyman(View view) {


        counterPeyman = 0;
        tv_resultPeyman.setText(String.valueOf(counterPeyman));
    }

    public void btn_addSokhanParidn(View view) {

        counterSokhanParidn++;
        tv_resultSokhanParidn.setText(String.valueOf(counterSokhanParidn));
    }

    public void btn_removSokhanParidn(View view) {


        counterSokhanParidn = 0;
        tv_resultSokhanParidn.setText(String.valueOf(counterSokhanParidn));
    }

    public void btn_addBeEhterami(View view) {

        counterBeEhterami++;
        tv_resultBeEhterami.setText(String.valueOf(counterBeEhterami));
    }

    public void btn_removBeEhterami(View view) {


        counterBeEhterami = 0;
        tv_resultBeEhterami.setText(String.valueOf(counterBeEhterami));
    }

    public void btn_addTohin(View view) {

        counterTohin++;
        tv_resultTohin.setText(String.valueOf(counterTohin));
    }

    public void btn_removTohin(View view) {


        counterTohin = 0;
        tv_resultTohin.setText(String.valueOf(counterTohin));
    }

    public void btn_addFekrHaram(View view) {

        counterFekrHaram++;
        tv_resultFekrHaram.setText(String.valueOf(counterFekrHaram));
    }

    public void btn_removFekrHaram(View view) {


        counterFekrHaram = 0;
        tv_resultFekrHaram.setText(String.valueOf(counterFekrHaram));
    }

    public void btn_addMasrafAlkol(View view) {

        counterMasrafAlkol++;
        tv_resultMasrafAlkol.setText(String.valueOf(counterMasrafAlkol));
    }

    public void btn_removMasrafAlkol(View view) {

        counterMasrafAlkol = 0;
        tv_resultMasrafAlkol.setText(String.valueOf(counterMasrafAlkol));
    }


    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences.Editor editorQeibatKardan = getSharedPreferences("MY_PREFSQeibatKardan", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTarkNAmaz = getSharedPreferences("MY_PREFSTarkNAmaz", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorEsrafKrdn = getSharedPreferences("MY_PREFSEsrafKrdn", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSoutHaram = getSharedPreferences("MY_PREFSSoutHaram", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAsabaniat = getSharedPreferences("MY_PREFSAsabaniat", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorKhianat = getSharedPreferences("MY_PREFSKhianat", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTohmat = getSharedPreferences("MY_PREFSTohmat", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTafraqe = getSharedPreferences("MY_PREFSTafraqe", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorNegahHaram = getSharedPreferences("MY_PREFSNegahHaram", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorRezqHaram = getSharedPreferences("MY_PREFSRezqHaram", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorAbroo = getSharedPreferences("MY_PREFSAbroo", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorZakhmZaban = getSharedPreferences("MY_PREFSZakhmZaban", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorPeyman = getSharedPreferences("MY_PREFSPeyman", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorSokhanParidn = getSharedPreferences("MY_PREFSSokhanParidn", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorBeEhterami = getSharedPreferences("MY_PREFSBeEhterami", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorTohin = getSharedPreferences("MY_PREFSTohin", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorFekrHaram = getSharedPreferences("MY_PREFSFekrHaram", MODE_PRIVATE).edit();
        SharedPreferences.Editor editorMasrafAlkol = getSharedPreferences("MY_PREFSMasrafAlkol", MODE_PRIVATE).edit();

        editorQeibatKardan.putInt("COUNTER_KEY",counterQeibatKardan);
        editorTarkNAmaz.putInt("COUNTER_KEY",counterTarkNAmaz);
        editorEsrafKrdn.putInt("COUNTER_KEY",counterEsrafKrdn);
        editorSoutHaram.putInt("COUNTER_KEY",counterSoutHaram);
        editorAsabaniat.putInt("COUNTER_KEY",counterAsabaniat);
        editorKhianat.putInt("COUNTER_KEY",counterKhianat);
        editorTohmat.putInt("COUNTER_KEY",counterTohmat);
        editorTafraqe.putInt("COUNTER_KEY",counterTafraqe);
        editorNegahHaram.putInt("COUNTER_KEY",counterNegahHaram);
        editorRezqHaram.putInt("COUNTER_KEY",counterRezqHaram);
        editorAbroo.putInt("COUNTER_KEY",counterAbroo);
        editorZakhmZaban.putInt("COUNTER_KEY",counterZakhmZaban);
        editorPeyman.putInt("COUNTER_KEY",counterPeyman);
        editorSokhanParidn.putInt("COUNTER_KEY",counterSokhanParidn);
        editorBeEhterami.putInt("COUNTER_KEY",counterBeEhterami);
        editorTohin.putInt("COUNTER_KEY",counterTohin);
        editorFekrHaram.putInt("COUNTER_KEY",counterFekrHaram);
        editorMasrafAlkol.putInt("COUNTER_KEY",counterMasrafAlkol);

        editorQeibatKardan.apply();
        editorTarkNAmaz.apply();
        editorEsrafKrdn.apply();
        editorSoutHaram.apply();
        editorAsabaniat.apply();
        editorKhianat.apply();
        editorTohmat.apply();
        editorTafraqe.apply();
        editorNegahHaram.apply();
        editorRezqHaram.apply();
        editorAbroo.apply();
        editorZakhmZaban.apply();
        editorPeyman.apply();
        editorSokhanParidn.apply();
        editorBeEhterami.apply();
        editorTohin.apply();
        editorFekrHaram.apply();
        editorMasrafAlkol.apply();




    }


    }