package ir.skums.hamyarhefz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.icu.text.IDNA;
import android.os.Build;
import android.system.ErrnoException;

import androidx.annotation.Nullable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataBaseHelper extends SQLiteOpenHelper {
    public DataBaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
private static String db_name ="matnuran.db";
    private static String db_path="";
    private static int db_version=1;


    private SQLiteDatabase database;
    private Context context;
    private boolean needUpdate=false;

    public DataBaseHelper(Context context){
        super(context,db_name,null,db_version);
        if(Build.VERSION.SDK_INT>=17){
            db_path=context.getApplicationInfo().dataDir+"/databases";

            }else {
            db_path="/data/data/"+context.getPackageName()+"/databases/";
        }
     this.context=context;
        copyDatabase();
        this.getReadableDatabase();
    }

    private void copyDatabase() {
        if(!CheckDatabase()){
            this.getReadableDatabase();
            try{
                copyDBFile();
            }catch (IOException e ) {
                throw new ErrnoException("Error copying Databese."+db_path,e);

            }//chatch
        }//if
    }//copydatabase

    private void copyDBFile() throws IOException {
        InputStream inputStream =context.getAssets().open(db_name);
        OutputStream outputStream=new FileOutputStream(db_path+db_name);
        Byte [] buffer = new Byte[1024];
        int lenght;
        while((lenght= inputStream.read(buffer)) > 0){
            outputStream.write(buffer,0,lenght);
        }
    }

    private boolean CheckDatabase() {
        File db_file = new File(db_path,db_name);
        if (db_file.exists()){
            return true;
        }else
            return false;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
