package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {
    TextView txt_test;
    int fontsize=16;
    SeekBar seekBar_size;

    SharedPreferences  pref;
    String Mypre="Save",SIZE="size",FONT_N="nazanin",FONT_T="titr",FONT_K="koodak",SCREEN="screen",Rotate="rotate";

    RadioButton rd_nazanin,rd_koodak,rd_titr;
    Button btn_save;
    Typeface font_nazanin,font_titr,font_koodak;

    CheckBox checkbox_screen,checkbox_rotate;

    int brightness;
    ContentResolver cResolver;
    Window window;
    TextView txt_prec;
    SeekBar seekBar_brightness;


    SharePref sharePref;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharePref=new SharePref(this);
        if (sharePref.loadNightModeState()==true){
            setTheme(R.style.Dark_Theme_Setting2);
        }else {
            setTheme(R.style.Theme_Setting2);
        }




        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        pref=getSharedPreferences(Mypre,0);

        Cast();
        permission();
        changeFontSize();
        changeFontStyle();
        keepScreen();

        disableAutoRotate();
        changeBrightness();

        nightMode();
    }

    private void Cast(){
        seekBar_size=(SeekBar)findViewById(R.id.seekbar_size);
        txt_test=(TextView) findViewById(R.id.text_test);

        rd_nazanin=(RadioButton) findViewById(R.id.rd_nazanin);
        rd_koodak=(RadioButton) findViewById(R.id.rd_koodak);
        rd_titr=(RadioButton) findViewById(R.id.rd_titr);
        btn_save=(Button) findViewById(R.id.btn_save);

        aSwitch=(Switch) findViewById(R.id.aswitch);

        checkbox_rotate=(CheckBox) findViewById(R.id.checkbox_rotate);
        checkbox_screen=(CheckBox) findViewById(R.id.checkbox_screen_on);

        seekBar_brightness=(SeekBar)findViewById(R.id.seekbar_brightness);
        txt_prec=(TextView) findViewById(R.id.txt_precentage);


    }

    private void nightMode(){
        if (sharePref.loadNightModeState()==true){
            aSwitch.setChecked(true);
        }
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    sharePref.setNightModState(true);
                    restartApp();
                }else {
                    sharePref.setNightModState(false);
                    restartApp();
                }
            }
        });
    }

    private void permission(){
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if (Settings.System.canWrite(this)){
            }else {

                Intent intent = new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                intent.setData(Uri.parse("package:" + this.getPackageName()));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        }
    }

    private void changeFontSize(){
        seekBar_size.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {



            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                SharedPreferences.Editor editor=pref.edit();
                fontsize=i;
                txt_test.setTextSize(fontsize);
                editor.putInt(SIZE,fontsize);
                editor.apply();

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                if (fontsize<16){
                    fontsize=16;
                    seekBar_size.setProgress(fontsize);
                }

            }
        });

        if (pref.contains(SIZE)){
            fontsize=pref.getInt(SIZE,0);
            seekBar_size.setProgress(fontsize);
            txt_test.setTextSize(fontsize);
        }


    }

    private void changeFontStyle(){

        font_nazanin=Typeface.createFromAsset(getAssets(), "fonts/b_nazanin.TTF");
        font_titr=Typeface.createFromAsset(getAssets(), "fonts/b_titr.TTF");
        font_koodak=Typeface.createFromAsset(getAssets(),"fonts/b_koodak.TTF");

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences.Editor editor= pref.edit();
                if (rd_nazanin.isChecked()) {
                    txt_test.setTypeface(font_nazanin);
                } else if (rd_titr.isChecked()) {
                    txt_test.setTypeface(font_titr);
                } else if (rd_koodak.isChecked()) {
                    txt_test.setTypeface(font_koodak);
                }
                editor.putBoolean(FONT_N, rd_nazanin.isChecked());
                editor.putBoolean(FONT_K, rd_koodak.isChecked());
                editor.putBoolean(FONT_T, rd_titr.isChecked());
                editor.apply();
            }
        });

        if (pref.contains(FONT_K)&&pref.contains(FONT_N)&&pref.contains(FONT_T)) {
            rd_nazanin.setChecked(pref.getBoolean(FONT_N, false));
            rd_koodak.setChecked(pref.getBoolean(FONT_K, false));
            rd_titr.setChecked(pref.getBoolean(FONT_T, false));

            if (rd_nazanin.isChecked() == true) {
                txt_test.setTypeface(font_nazanin);
            } else if (rd_titr.isChecked() == true) {
                txt_test.setTypeface(font_titr);
            } else if (rd_koodak.isChecked() == true) {
                txt_test.setTypeface(font_koodak);
            }


        }

    }

    private void keepScreen(){

        checkbox_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkbox_screen.isChecked()==true){
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

                    SharedPreferences.Editor editor=pref.edit();
                    editor.putBoolean(SCREEN,checkbox_screen.isChecked());
                    editor.apply();
                }else {
                    SharedPreferences.Editor editor=pref.edit();
                    editor.remove(SCREEN);
                    editor.apply();
                }
            }
        });

        if (pref.contains(SCREEN)){
            checkbox_screen.setChecked(pref.getBoolean(SCREEN,false));
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
    }

    private void disableAutoRotate(){
        checkbox_rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkbox_rotate.isChecked()==true){
                    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

                    SharedPreferences.Editor editor=pref.edit();
                    editor.putBoolean(Rotate,checkbox_rotate.isChecked());
                    editor.apply();
                }else {
                    SharedPreferences.Editor editor=pref.edit();
                    editor.remove(Rotate);
                    editor.apply();
                }
            }
        });

        if (pref.contains(Rotate)){
            checkbox_rotate.setChecked(pref.getBoolean(Rotate,false));
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

    private void changeBrightness(){
        cResolver=getContentResolver();
        window=getWindow();
        seekBar_brightness.setMax(255);
        seekBar_brightness.setKeyProgressIncrement(1);

        try {
            brightness=Settings.System.getInt(cResolver,Settings.System.SCREEN_BRIGHTNESS);

        }catch (Settings.SettingNotFoundException e){
            e.printStackTrace();
            Toast.makeText(this,e.getMessage() , Toast.LENGTH_SHORT).show();
        }
        seekBar_brightness.setProgress(brightness);
        seekBar_brightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i<=20){
                    brightness=20;
                }else {
                    brightness=i;
                }
                float prec=(brightness/(float)255)*100;
                txt_prec.setText((int) prec+"%");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Settings.System.putInt(cResolver,Settings.System.SCREEN_BRIGHTNESS,brightness);
                WindowManager.LayoutParams layoutParams=window.getAttributes();
                layoutParams.screenBrightness=brightness/(float) 255;
                window.setAttributes(layoutParams);

            }
        });
    }

    private void restartApp(){
        Intent res=new Intent(getApplicationContext(),SettingActivity.class);
        startActivity(res);
        finish();
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(SettingActivity.this,HomeActivity.class));
        super.onBackPressed();
    }
}