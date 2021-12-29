package ir.skums.hamyarhefz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.SharedPreferences;
import android.os.Bundle;


import android.widget.Button;
import android.widget.TextView;

public class TasbihatActivity extends AppCompatActivity {

    Button resetBtnAllah,resetBtnSobhan,resetBtnAlhamd;
    Button addBtnAllah,addBtnSobhan,addBtnAlhamd;
    TextView resultTvAllah,resultTvSobhan,resultTvAlhamd;
    int counter =0;
    private static final String MY_PREFS = "counterPref";
    private static final String COUNTER_KEY = "counterKey";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbihat);


        FragmentManager fm=getSupportFragmentManager();
        fm.beginTransaction().add(R.id.frameAllahAkbar,new AllahAkbarkFragment()).commit();

        fm.beginTransaction().add(R.id.frameAlhamd,new AlhamdFragment()).commit();

        fm.beginTransaction().add(R.id.frameSobhan,new SobhanFragment()).commit();


      //  resetBtnAllah = findViewById(R.id.btn_resetAllah);
      //  resetBtnSobhan = findViewById(R.id.btn_resetSobhan);
      //  resetBtnAlhamd = findViewById(R.id.btn_resetAlhamd);
     //   addBtnAllah = findViewById(R.id.btn_addAllah);
      //  addBtnSobhan = findViewById(R.id.btn_addSobhan);
     //   addBtnAlhamd = findViewById(R.id.btn_addAlhamd);
     //   resultTvAllah = findViewById(R.id.tv_resultAllah);
      //  resultTvSobhan = findViewById(R.id.tv_resultSobhan);
      //  resultTvAlhamd = findViewById(R.id.tv_resultAlhamd);



      //  SharedPreferences prefs = getSharedPreferences("MY_PREFS" , MODE_PRIVATE);
     //   counter = prefs.getInt("COUNTER_KEY",0);
     //   resultTvAllah.setText(String.valueOf(counter));
       // resultTvSobhan.setText(String.valueOf(counter));
     //   resultTvAlhamd.setText(String.valueOf(counter));

     //   addBtnAllah.setOnClickListener(view -> {
      //      counter++;
       //     resultTvAllah.setText(String.valueOf(counter));
      //  });

       // addBtnSobhan.setOnClickListener(view -> {
      //      counter++;
      //      resultTvSobhan.setText(String.valueOf(counter));
      //  });


     //   addBtnAlhamd.setOnClickListener(view -> {
     //       counter++;
     //       resultTvAlhamd.setText(String.valueOf(counter));
    //    });

     //   resetBtnAllah.setOnClickListener(view -> {
      //      counter = 0;
      //      resultTvAllah.setText(String.valueOf(counter));
//
      //  });

    //    resetBtnSobhan.setOnClickListener(view -> {
      //      counter = 0;
      //      resultTvSobhan.setText(String.valueOf(counter));

       // });

     //   resetBtnAlhamd.setOnClickListener(view -> {
      //      counter = 0;
      //      resultTvAlhamd.setText(String.valueOf(counter));

      //  });
    }

  //  @Override
//    protected void onStop() {
  //      super.onStop();
  //      SharedPreferences.Editor editor = getSharedPreferences("MY_PREFS" , MODE_PRIVATE).edit();
  //      editor.putInt("COUNTER_KEY" , counter);
  //      editor.apply();
   // }
}
