package ir.skums.hamyarhefz;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePref {

    SharedPreferences sharedPreferences;

    public SharePref(Context context){
        sharedPreferences=context.getSharedPreferences("filename",Context.MODE_PRIVATE);
    }
    public void setNightModState(Boolean state){
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putBoolean("NightMode",state);
        editor.commit();

    }
    public Boolean loadNightModeState(){
        Boolean state=sharedPreferences.getBoolean("NightMode",false);
        return state;

    }
}
