package ir.skums.hamyarhefz.soalat;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ir.skums.hamyarhefz.DatabaseHelper;
import ir.skums.hamyarhefz.Matn;
import ir.skums.hamyarhefz.MatnAdapter;
import ir.skums.hamyarhefz.R;

public class EbEnJ30Activity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;


    List<Matn> matnList;
    ListView listViewJozha;
    MatnAdapter adapter;
    Button btn_Badi,btn_qabli;
    Cursor cursorJozha;


    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal_javab);


        databaseHelper=new DatabaseHelper(this);
        try {
            databaseHelper.updateDatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        database=databaseHelper.getReadableDatabase();




        listViewJozha=findViewById(R.id.listViewJozha);
        matnList =new ArrayList<>();
        showJozhaFromDatabase();

        listViewJozha.setAdapter(adapter);

        btn_Badi=findViewById(R.id.btn_badi);
        btn_qabli=findViewById(R.id.btn_qabli);




        SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);
        i = prefs.getInt("COUNTER_KEY",0);

        if (i==0){
            btn_qabli.setVisibility(View.INVISIBLE);
        }


        listViewJozha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {



            }
        });


    }




    private void showJozhaFromDatabase() {




        cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=1",null);

        if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

        }

        if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

        }
        if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

        }

        cursorJozha.close();
        adapter=new MatnAdapter(this,R.layout.list_layout_joz, matnList,database);
        listViewJozha.setAdapter(adapter);

    }


    public void btn_Badi(View view) {
        i++;
        if (i==0){
            btn_qabli.setVisibility(View.INVISIBLE);
        }


        if (i==1){
            btn_qabli.setVisibility(View.VISIBLE);
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=2",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==2){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=3",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==3){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=4",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==4){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=5",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            } if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }



        }if (i==5){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=6",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }



        }if (i==6){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=7",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(9)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(10)));

            }



        }if (i==7){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=8",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }



        }if (i==8){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=9",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }



        }if (i==9){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=10",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==10){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=11",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==11){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=12",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            } if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }



        }if (i==12){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=13",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==13){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=14",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==14){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=15",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==15){
            btn_Badi.setVisibility(View.INVISIBLE);
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=16",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }



    }

    public void btn_qabli(View view) {
        i--;
        if (i==0){
            btn_qabli.setVisibility(View.INVISIBLE);

            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=1",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }



        }



        if (i==1){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=2",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==2){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=3",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==3){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=4",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==4){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=5",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            } if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }



        }if (i==5){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=6",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }



        }if (i==6){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=7",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(9)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(10)));

            }



        }if (i==7){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=8",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }



        }if (i==8){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=9",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }



        }if (i==9){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=10",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==10){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=11",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==11){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=12",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            } if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(5)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(6)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(7)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(8)));

            }



        }if (i==12){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=13",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }




        }if (i==13){
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=14",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==14){
            btn_Badi.setVisibility(View.VISIBLE);
            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=15",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }



        }if (i==15){



            adapter.notifyDataSetChanged();
            adapter.clear();
            cursorJozha=database.rawQuery("SELECT * FROM AyatEbEnJ30 WHERE id=16",null);

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));

            }

            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(2)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(3)));

            }
            if (cursorJozha.moveToFirst()){

                matnList.add(new Matn(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(4)));

            }




        }



    }


}