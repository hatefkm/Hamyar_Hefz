package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Toolbar mToolbar ;
     ListView mListView;
    String[] menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mToolbar = (Toolbar) findViewById(R.id.m_toolbar);
        setSupportActionBar(mToolbar);
        mListView = findViewById(R.id.list_item);
        menu= new String[]{"تنظیمات","امتیاز دهید ","درباره ما و راه های ارتباطی","منابع","خروج"};

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, menu);

        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent intent = new Intent(HomeActivity.this,SettingActivity.class);
                    startActivity(intent);
                }
                else if(i==1){
                    Toast.makeText(HomeActivity.this, "Item Number " + i , Toast.LENGTH_SHORT).show();
                }
                else if(i==2){
                 Intent intent = new Intent(HomeActivity.this,UsActivity.class);
                 startActivity(intent);

                }
                else if(i==3){
                   Intent intent = new Intent(HomeActivity.this,ManabeActivity.class);
                   startActivity(intent);
                }
                else {

                }

            }
        });

        }
}