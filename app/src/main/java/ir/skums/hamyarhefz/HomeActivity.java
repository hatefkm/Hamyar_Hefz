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

import com.nightonke.boommenu.Animation.EaseEnum;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

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


        //BoomMenu

        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);

        bmb.setButtonEnum(ButtonEnum.Ham);


        bmb.setShowMoveEaseEnum(EaseEnum.EaseInOutBack);
        bmb.setHideScaleEaseEnum(EaseEnum.EaseInBack);

        bmb.setPiecePlaceEnum(PiecePlaceEnum.HAM_4);

        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_4);



        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder().rotateImage(false);

            switch (i) {
                case 0:
                    builder.normalImageRes(R.drawable.user_profile)
                            .normalText("حفظ قرآن")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(HomeActivity.this, JozActivity.class);
                                    startActivity(intent);
                                }
                            });
                    break;

                case 1:
                    builder.normalImageRes(R.drawable.user_profile)
                            .normalText("ذکر ایام هفته")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(HomeActivity.this, ZekrActivity.class);
                                    startActivity(intent);
                                }
                            });
                    break;

                case 2:
                    builder.normalImageRes(R.drawable.user_profile)
                            .normalText("اعمال روزانه")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(HomeActivity.this, AmalActivity.class);
                                    startActivity(intent);
                                }
                            });
                    break;

                case 3:
                    builder.normalImageRes(R.drawable.user_profile)
                            .normalText("راهنما")

                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(HomeActivity.this, RahnamaActivity.class);
                                    startActivity(intent);
                                }
                            });
                    break;



            }


            bmb.addBuilder(builder);
        }


    }
}