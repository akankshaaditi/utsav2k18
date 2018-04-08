package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main7Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ListView list1;


    String[] name2 = {"Sagar Jogdanker",
            "Faraz Khan",
            "Harshith Muppiri",
            "Sandeep Kumar M",
            "Gajanan Kamble",
            "Srujan MJ",
            "Niyathi Singh"
    };


    String[] phone2 = {"948263443",
            "8050332624",
            "8105554114",
            "7795039253",
            "8147688713",
            "8867559212",
            "9008005000"
    };


    int[] image2 = {
            R.drawable.core_sagar,
            R.drawable.core_faraz,
            R.drawable.core_harshith,
            R.drawable.core_sandeei,
            R.drawable.core_gajanan,
            R.drawable.core_srujan,
            R.drawable.core_niyati

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        list1 =  findViewById(R.id.lv_core);

       CustomAdopterT adapter2 = new CustomAdopterT();

        list1.setAdapter(adapter2);

             btn4.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     Intent intent = new Intent(Main7Activity.this,Main6Activity.class);

                     startActivity(intent);

                 }
             });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main7Activity.this,HomeActivity.class);

                startActivity(intent);

            }
        });


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

            Intent intent = new Intent(Main7Activity.this,EventActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);


        } else if (id == R.id.nav_schedule) {

            Intent intent = new Intent(Main7Activity.this,ScheduleActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(Main7Activity.this,GalleryActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_contacts) {


            Intent intent = new Intent(Main7Activity.this,HomeActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(Main7Activity.this,SponsersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_maps) {

            Intent intent = new Intent(Main7Activity.this,MapsActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_developers) {

            Intent intent = new Intent(Main7Activity.this,DevelopersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




    class CustomAdopterT extends BaseAdapter {

        @Override
        public int getCount() {
            return image2.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.list1, null);
            ImageView simage = view.findViewById(R.id.img);
            TextView stext = view.findViewById(R.id.txt);
            TextView stext1 = view.findViewById(R.id.txt2);

            simage.setImageResource(image2[position]);
            stext.setText(name2[position]);
            stext1.setText(phone2[position]);

            return view;
        }
    }




}

