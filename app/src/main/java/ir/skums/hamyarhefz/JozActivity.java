package ir.skums.hamyarhefz;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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



/*     ArrayList<String> arrayList = new ArrayList<>();
        for (String s : Arrays.asList("جزء 1", "جزء 2", "جزء 3", "جزء 4", "جزء 5", "جزء 6", "جزء 7", "جزء 8", "جزء 9", "جزء 10", "جزء 11", "جزء 12", "جزء 13", "جزء 14", "جزء 15", "جزء 16", "جزء 17", "جزء 18", "جزء 19", "جزء 20", "جزء 21", "جزء 22", "جزء 23", "جزء 24", "جزء 25", "جزء 26", "جزء 27", "جزء 28", "جزء 29", "جزء 30")) {
            arrayList.add(s);
        }

        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);


        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }

*/



        listViewJozha=findViewById(R.id.listViewJozha);
        jozhaList=new ArrayList<>();
        showJozhaFromDatabase();

        listViewJozha.setAdapter(adapter);

        listViewJozha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(JozActivity.this, AyatActivity.class);

                startActivity(intent);


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