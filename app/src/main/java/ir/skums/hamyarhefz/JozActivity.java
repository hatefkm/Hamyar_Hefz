package ir.skums.hamyarhefz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class JozActivity extends AppCompatActivity {


    ListView listView ;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joz);

        listView = (ListView) findViewById(R.id.listView_JZ);

        ArrayList<String> arrayList = new ArrayList<>();
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
                else if(i==1){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==2){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==3){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==4){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==5){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==6){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==7){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==8){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==9){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==10){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==11){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==12){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==13){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==14){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==15){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==16){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==17){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==18){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==19){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==20){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==21){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==22){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }else if(i==23){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==24){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==25){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==26){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==27){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==28){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }
                else if(i==29){
                    Intent intent = new Intent(JozActivity.this,AyatActivity.class);
                    startActivity(intent);
                }



            }
        });



    }


}