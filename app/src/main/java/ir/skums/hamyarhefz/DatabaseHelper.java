package ir.skums.hamyarhefz;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static String db_name="matnquran.db";
    private static String db_path="";
    private static int db_version=1;

    private SQLiteDatabase database;
    private Context context;
    private boolean needUpdate=false;

    public DatabaseHelper(Context context){
        super(context,db_name,null,db_version);

        if (Build.VERSION.SDK_INT >=17)
            db_path=context.getApplicationInfo().dataDir+"/databases/";
        else
            db_path="/data/data/"+context.getPackageName()+"/databases/";
        this.context=context;
        copyDatabase();
        this.getReadableDatabase();

    }

    private void copyDatabase() {
        if (!checkDatabase()){

            this.getReadableDatabase();
            try{
                copyDBFile();

            }catch(IOException e){
                throw new Error("Error copying database.");
            }
        }

    }

    private void copyDBFile() throws IOException{
        InputStream inputStream=context.getAssets().open(db_name);
        OutputStream outputStream=new FileOutputStream(db_path+db_name);
        byte[] buffer = new byte[1024];
        int length;
        while ((length=inputStream.read(buffer))>0)
            outputStream.write(buffer,0,length);
        outputStream.flush();
        outputStream.close();
        inputStream.close();



    }

    private boolean checkDatabase() {
        File dbFile=new File(db_path+db_name);
        if (dbFile.exists())
            return true;
        else
            return false;

    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        if (i1>i)
            needUpdate=true;

    }

    public void updateDatabase() throws IOException{
        if(needUpdate){
            File dbFile=new File(db_path+db_name);
            if (dbFile.exists())
               dbFile.delete();
            copyDatabase();
            needUpdate=false;
        }
    }


    @Override
    public synchronized void close() {

        if (database!=null)
            database.close();
        super.close();
    }
}
