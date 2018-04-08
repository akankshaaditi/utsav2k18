package in.ac.bmsce.utsav2k18;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class Main3Activity extends AppCompatActivity {

    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),2000,4000);



    }

    public class MyTimerTask extends TimerTask{


        @Override
        public void run() {

            Main3Activity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {


                     if(viewPager.getCurrentItem() == 0){

                         viewPager.setCurrentItem(1);
                     } else if (viewPager.getCurrentItem() == 1) {
                         viewPager.setCurrentItem(2);
                     }else {

                         viewPager.setCurrentItem(0);
                     }

                }
            });
        }
    }
}
