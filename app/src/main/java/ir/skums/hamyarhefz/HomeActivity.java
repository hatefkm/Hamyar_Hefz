package ir.skums.hamyarhefz;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.drawerlayout.widget.DrawerLayout;




import android.view.View;

import androidx.core.view.GravityCompat;


import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;





import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;


import com.nightonke.boommenu.Animation.EaseEnum;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class HomeActivity extends AppCompatActivity {

    private String TAG = "HomeActivity";
    private DrawerLayout navDrawer;
    private NavigationView navigationView;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        DrawerLayout drawer = findViewById(R.id.navDrawer);
        NavigationView navigationView = findViewById(R.id.navigationView);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                if (id == R.id.Rt_nav) {

                } else if (id == R.id.DrMa_nav) {
                    Intent intent = new Intent(HomeActivity.this,UsActivity.class);
                    startActivity(intent);

                } else if (id == R.id.Mn_nav) {
                    Intent intent = new Intent(HomeActivity.this,ManabeActivity.class);
                    startActivity(intent);


                }

                DrawerLayout drawerLayout = findViewById(R.id.navDrawer);
                drawerLayout.closeDrawer(GravityCompat.START);


                return true;
            }
        });





    }


    public void exitBtn(View view) {


        // TODO Auto-generated method stub
        finish();
        System.exit(0);

    }


    public void btn_hfzQuran(View view) {

        Intent intent = new Intent(HomeActivity.this,JozActivity.class);
        startActivity(intent);


    }

    public void btn_zekrsalavatShomar(View view) {

        Intent intent = new Intent(HomeActivity.this,ZekrActivity.class);
        startActivity(intent);


    }

    public void btn_Amal(View view) {

        Intent intent = new Intent(HomeActivity.this,AmalActivity.class);
        startActivity(intent);


    }

    public void btn_rahnama(View view) {

        Intent intent = new Intent(HomeActivity.this,RahnamaActivity.class);
        startActivity(intent);


    }
}