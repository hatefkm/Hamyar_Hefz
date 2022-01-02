package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
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

        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);

        counterQeibatKardan = prefs.getInt("COUNTER_KEY",0);
        counterTarkNAmaz = prefs.getInt("COUNTER_KEY",0);
        counterEsrafKrdn = prefs.getInt("COUNTER_KEY",0);
        counterSoutHaram= prefs.getInt("COUNTER_KEY",0);
        counterAsabaniat = prefs.getInt("COUNTER_KEY",0);
        counterKhianat = prefs.getInt("COUNTER_KEY",0);
        counterTohmat = prefs.getInt("COUNTER_KEY",0);
        counterTafraqe = prefs.getInt("COUNTER_KEY",0);
        counterNegahHaram = prefs.getInt("COUNTER_KEY",0);
        counterRezqHaram = prefs.getInt("COUNTER_KEY",0);
        counterAbroo = prefs.getInt("COUNTER_KEY",0);
        counterZakhmZaban = prefs.getInt("COUNTER_KEY",0);
        counterPeyman = prefs.getInt("COUNTER_KEY",0);
        counterSokhanParidn = prefs.getInt("COUNTER_KEY",0);
        counterBeEhterami = prefs.getInt("COUNTER_KEY",0);
        counterTohin= prefs.getInt("COUNTER_KEY",0);
        counterFekrHaram = prefs.getInt("COUNTER_KEY",0);
        counterMasrafAlkol= prefs.getInt("COUNTER_KEY",0);



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
}