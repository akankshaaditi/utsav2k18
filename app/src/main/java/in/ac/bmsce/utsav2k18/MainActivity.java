package in.ac.bmsce.utsav2k18;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;

import android.text.Html;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import in.ac.bmsce.utsav2k18.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    GridLayout mainGrid;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid)
        //
        //
        // -------slide view of image----------////
    /*    ViewPager mViewPager =  findViewById(R.id.viewPageAndroid);
       MainActivity2 mi = new MainActivity2(getApplicationContext());
       mViewPager.setAdapter(mi);

*/ viewPager = findViewById(R.id.viewpager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);

        viewPager.setAdapter(viewPagerAdapter);

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(),1000,2000);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /* FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
    public class MyTimerTask extends TimerTask {


        @Override
        public void run() {

            MainActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {


                    if(viewPager.getCurrentItem() == 0){

                        viewPager.setCurrentItem(1);
                    } else if (viewPager.getCurrentItem() == 1) {
                        viewPager.setCurrentItem(2);
                    }  else if (viewPager.getCurrentItem() == 2) {
                        viewPager.setCurrentItem(3);
                    } else if (viewPager.getCurrentItem() == 3) {
                        viewPager.setCurrentItem(4);
                    } else if (viewPager.getCurrentItem() == 4) {
                        viewPager.setCurrentItem(5);
                    } else if (viewPager.getCurrentItem() == 5) {
                        viewPager.setCurrentItem(6);
                    } else if (viewPager.getCurrentItem() == 6) {
                        viewPager.setCurrentItem(7);
                    }else {

                        viewPager.setCurrentItem(0);
                    }

                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0){
                        Intent intent = new Intent(MainActivity.this,MainActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);


                    }else if(finalI==1){
                        Intent intent = new Intent(MainActivity.this,EventActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);


                    }else if(finalI==2){
                        Intent intent = new Intent(MainActivity.this,ScheduleActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);

                    }else if(finalI==3){
                        Intent intent = new Intent(MainActivity.this,GalleryActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);


                    }else if(finalI==4){
                        Intent intent = new Intent(MainActivity.this,SponsersActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);

                    }else if(finalI==5){
                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);


                    }else if(finalI==6){
                        Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);


                    }else if(finalI==7){
                        Intent intent = new Intent(MainActivity.this,DevelopersActivity.class);
                        intent.putExtra("info","This is activity from developers");
                        startActivity(intent);

                    }


                }
            });
        }
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
      //  if (id == R.id.action_settings) {
         //   return true;
      ////  }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the home  action
            Intent intent = new Intent(getBaseContext(),MainActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);
        } else if (id == R.id.nav_events) {

            Intent intent = new Intent(MainActivity.this,EventActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);


        } else if (id == R.id.nav_schedule) {

            Intent intent = new Intent(MainActivity.this,ScheduleActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MainActivity.this,GalleryActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_contacts) {


            Intent intent = new Intent(MainActivity.this,HomeActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(MainActivity.this,SponsersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_maps) {

            Intent intent = new Intent(MainActivity.this,MapsActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_developers) {

            Intent intent = new Intent(MainActivity.this,DevelopersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
