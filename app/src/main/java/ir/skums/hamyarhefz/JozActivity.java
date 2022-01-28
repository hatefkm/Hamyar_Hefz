package ir.skums.hamyarhefz;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JozActivity extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase database;


    List<Jozha> jozhaList;
    ListView listViewJozha;
    JozhaAdapter adapter;
    TextView txtview;


    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joz);

        databaseHelper=new DatabaseHelper(this);
        try {
            databaseHelper.updateDatabase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        database=databaseHelper.getReadableDatabase();




        listViewJozha=findViewById(R.id.listViewJozha);
        jozhaList=new ArrayList<>();
        showJozhaFromDatabase();

        listViewJozha.setAdapter(adapter);







        listViewJozha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


                if (i==0){
                    Intent intent = new Intent(JozActivity.this, AyatActivity.class);
                    startActivity(intent);

                }else if (i==1){
                    Intent intent = new Intent(JozActivity.this, AyatActivity1.class);
                    startActivity(intent);


                }else if (i==2){
                    Intent intent = new Intent(JozActivity.this, AyatActivity2.class);
                    startActivity(intent);

                }else if (i==3){
                    Intent intent = new Intent(JozActivity.this, AyatActivity3.class);
                    startActivity(intent);

                }else if (i==4){
                    Intent intent = new Intent(JozActivity.this, AyatActivity4.class);
                    startActivity(intent);

                }else if (i==5){ Intent intent = new Intent(JozActivity.this, AyatActivity5.class);
                    startActivity(intent);


                }else if (i==6){ Intent intent = new Intent(JozActivity.this, AyatActivity6.class);
                    startActivity(intent);

                }else if (i==7){ Intent intent = new Intent(JozActivity.this, AyatActivity7.class);
                    startActivity(intent);

                }else if (i==8){ Intent intent = new Intent(JozActivity.this, AyatActivity8.class);
                    startActivity(intent);

                }else if (i==9){ Intent intent = new Intent(JozActivity.this, AyatActivity9.class);
                    startActivity(intent);

                }else if (i==10){ Intent intent = new Intent(JozActivity.this, AyatActivity10.class);
                    startActivity(intent);

                }else if (i==11){ Intent intent = new Intent(JozActivity.this, AyatActivity11.class);
                    startActivity(intent);

                }else if (i==12){ Intent intent = new Intent(JozActivity.this, AyatActivity12.class);
                    startActivity(intent);

                }else if (i==13){ Intent intent = new Intent(JozActivity.this, AyatActivity13.class);
                    startActivity(intent);

                }else if (i==14){ Intent intent = new Intent(JozActivity.this, AyatActivity14.class);
                    startActivity(intent);

                }else if (i==15){ Intent intent = new Intent(JozActivity.this, AyatActivity15.class);
                    startActivity(intent);

                }else if (i==16){ Intent intent = new Intent(JozActivity.this, AyatActivity16.class);
                    startActivity(intent);

                }else if (i==17){ Intent intent = new Intent(JozActivity.this, AyatActivity17.class);
                    startActivity(intent);

                }else if (i==18){ Intent intent = new Intent(JozActivity.this, AyatActivity18.class);
                    startActivity(intent);

                }else if (i==19){ Intent intent = new Intent(JozActivity.this, AyatActivity19.class);
                    startActivity(intent);

                }else if (i==20){ Intent intent = new Intent(JozActivity.this, AyatActivity20.class);
                    startActivity(intent);

                }else if (i==21){ Intent intent = new Intent(JozActivity.this, AyatActivity21.class);
                    startActivity(intent);

                }else if (i==22){ Intent intent = new Intent(JozActivity.this, AyatActivity22.class);
                    startActivity(intent);

                }else if (i==23){ Intent intent = new Intent(JozActivity.this, AyatActivity23.class);
                    startActivity(intent);

                }else if (i==24){ Intent intent = new Intent(JozActivity.this, AyatActivity24.class);
                    startActivity(intent);

                }else if (i==25){ Intent intent = new Intent(JozActivity.this, AyatActivity25.class);
                    startActivity(intent);

                }else if (i==26){ Intent intent = new Intent(JozActivity.this, AyatActivity26.class);
                    startActivity(intent);

                }else if (i==27){ Intent intent = new Intent(JozActivity.this, AyatActivity27.class);
                    startActivity(intent);

                }else if (i==28){ Intent intent = new Intent(JozActivity.this, AyatActivity28.class);
                    startActivity(intent);

                }else if (i==29){ Intent intent = new Intent(JozActivity.this, AyatActivity29.class);
                    startActivity(intent);

                }



            }
        });


    }




    private void showJozhaFromDatabase() {
        Cursor cursorJozha=database.rawQuery("select * from tblquran",null);
        if (cursorJozha.moveToFirst()){
            do {
                jozhaList.add(new Jozha(
                        cursorJozha.getInt(0),
                        cursorJozha.getString(1)));
            }while (cursorJozha.moveToNext());
        }

        cursorJozha.close();
        adapter=new JozhaAdapter(this,R.layout.list_layout_joz,jozhaList,database);
        listViewJozha.setAdapter(adapter);

    }


}