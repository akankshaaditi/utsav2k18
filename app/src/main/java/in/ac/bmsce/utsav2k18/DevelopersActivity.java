package in.ac.bmsce.utsav2k18;

import android.app.Activity;
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
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class DevelopersActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static final String TAG ="Gallery activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        Customlistinput adapter = new
                Customlistinput(DevelopersActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(DevelopersActivity.this, "Hello I am " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }
    ListView list;
    String[] web = {

            "Shilpi Kumari",
            "Madhuri Neelavar",
            "Neha Reddy V",
            "Naveen R J",
            "Omkar T P",
            "Kiran C Nayak"

    } ;
    Integer[] imageId = {

            R.drawable.team_shilpi,
            R.drawable.team_madhuri,
            R.drawable.team_nehav,
            R.drawable.team_naveen,
            R.drawable.team_omkar,
            R.drawable.team_kiran





    };

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

            Intent intent = new Intent(getBaseContext(),EventActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);


        } else if (id == R.id.nav_schedule) {

            Intent intent = new Intent(getBaseContext(),ScheduleActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(getBaseContext(),GalleryActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_contacts) {


            Intent intent = new Intent(getBaseContext(),HomeActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(getBaseContext(),SponsersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_maps) {

            Intent intent = new Intent(getBaseContext(),MapsActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_developers) {

            Intent intent = new Intent(getBaseContext(),DevelopersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
