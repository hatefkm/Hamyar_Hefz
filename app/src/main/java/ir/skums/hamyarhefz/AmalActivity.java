package ir.skums.hamyarhefz;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nightonke.boommenu.Animation.EaseEnum;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.TextInsideCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

public class AmalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amal);





        //Start BoomMenu

        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);

        bmb.setButtonEnum(ButtonEnum.TextInsideCircle);


        bmb.setShowMoveEaseEnum(EaseEnum.EaseInOutBack);
        bmb.setHideScaleEaseEnum(EaseEnum.EaseInBack);

        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_5_3);

        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_5_3);



        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder();

            switch (i) {
                case 0:
                    builder.normalImageRes(R.drawable.ebadat_person)
                            .normalColor(Color.rgb(1,87,155))
                            .normalText("عبادات")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(AmalActivity.this, EbadatActivity.class);
                                    startActivity(intent);
                                }
                            });
                    break;

                case 1:

                    builder.normalImageRes(R.drawable.amal_nik)
                            .normalColor(Color.rgb(1,87,155))
                            .normalText("اعمال نیک")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(AmalActivity.this, AmalNikActivity.class);
                                    startActivity(intent);
                                }
                            });

                    break;

                case 2:
                    builder.normalImageRes(R.drawable.ic_baseline_info_24)
                            .normalColor(Color.rgb(1,87,155))
                            .normalText("توضیحات")
                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(AmalActivity.this, TozihatAmalActivity.class);
                                    startActivity(intent);
                                }
                            });

                    break;

                case 3:
                    builder.normalImageRes(R.drawable.amal_bad)
                            .normalColor(Color.rgb(1,87,155))
                            .normalText("اعمال بد")

                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(AmalActivity.this, AmalBadActivity.class);
                                    startActivity(intent);
                                }
                            });
                break;

                case 4:
                    builder.normalImageRes(R.drawable.amal_bad)
                            .normalColor(Color.rgb(1,87,155))
                            .normalText("اخلاق بد")

                            .listener(new OnBMClickListener() {
                                @Override
                                public void onBoomButtonClick(int index) {
                                    // When the boom-button corresponding this builder is clicked.
                                    Intent intent = new Intent(AmalActivity.this, AkhlaghBAdActivity.class);
                                    startActivity(intent);
                                }
                            });
                break;



            }


            bmb.addBuilder(builder);
        }
        //end BoomMenu


    }
}