package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private static final String TAG ="Gallery activity";
    ImageView iv11;
    ImageView iv12;
    ImageView iv21;
    ImageView iv22;
    ImageView iv31;
    ImageView iv32;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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

            Intent intent = new Intent(GalleryActivity.this,EventActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);


        } else if (id == R.id.nav_schedule) {

            Intent intent = new Intent(GalleryActivity.this,ScheduleActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(GalleryActivity.this,GalleryActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_contacts) {


            Intent intent = new Intent(GalleryActivity.this,HomeActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(GalleryActivity.this,SponsersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_maps) {

            Intent intent = new Intent(GalleryActivity.this,MapsActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_developers) {

            Intent intent = new Intent(GalleryActivity.this,DevelopersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    protected void onResume() {
        super.onResume();
        iv11 = findViewById(R.id.iv11);
        iv12 = findViewById(R.id.iv12);
        iv21 = findViewById(R.id.iv21);
        iv22 = findViewById(R.id.iv22);
        iv31 = findViewById(R.id.iv31);
        iv32 = findViewById(R.id.iv32);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","First");
                startActivity(intent);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                // Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Second");
                startActivity(intent);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Third");
                startActivity(intent);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Fourth");
                startActivity(intent);
            }
        });
        iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","five");
                startActivity(intent);
            }
        });
        iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","sixth");
                startActivity(intent);
            }
        });
    }
}
