package in.ac.bmsce.utsav2k18;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.TypedArray;
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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EventActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private static final String TAG ="Gallery activity";

    ArrayList<Integer> eventList;
    ListView lvEvents;
    TypedArray eventPictures;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
//kiran code
        lvEvents = findViewById(R.id.lvEvents);
        initialiseEvents();
//kiran end
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

    //kiran code starts

    @Override
    protected void onStart() {
        super.onStart();
        EventsAdapter eventsAdapter = new EventsAdapter(this,eventList);
        lvEvents.setAdapter(eventsAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();


        lvEvents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){

                    case 0:
                        Intent intent0 = new Intent(getApplicationContext(), DanceListActivity.class);
                        startActivity(intent0);
                        //Toast.makeText(getBaseContext(), "Going to Dance Page ",Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), EasternMusicListActivity.class);
                        startActivity(intent1);
                        //Toast.makeText(getBaseContext(), "Going to Eastern Music Page ",Toast.LENGTH_SHORT).show();
                        break;

                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), EDCListActivity.class);
                        startActivity(intent2);
                        //Toast.makeText(getBaseContext(), "Going to EDC Page ",Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), FashionListActivity.class);
                        startActivity(intent3);
                       // Toast.makeText(getBaseContext(), "Going to Fashion Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Intent intent4 = new Intent(getApplicationContext(), FineArtsListActivity.class);
                        startActivity(intent4);
                       // Toast.makeText(getBaseContext(), "Going to Fine Arts Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Intent intent5 = new Intent(getApplicationContext(), GameListActivity.class);
                        startActivity(intent5);
                       // Toast.makeText(getBaseContext(), "Going to Game Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Intent intent6 = new Intent(getApplicationContext(), KannadaSanghaListActivity.class);
                        startActivity(intent6);
                       // Toast.makeText(getBaseContext(), "Going to Kannada Sangha Page ",Toast.LENGTH_SHORT).show();
                        break;

                    case 7:
                        Intent intent7 = new Intent(getApplicationContext(), LiteratureListActivity.class);
                        startActivity(intent7);
                       // Toast.makeText(getBaseContext(), "Going to Literature Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Intent intent8 = new Intent(getApplicationContext(), MathListActivity.class);
                        startActivity(intent8);
                      //  Toast.makeText(getBaseContext(), "Going to Math Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Intent intent9 = new Intent(getApplicationContext(), PhotographyListActivity.class);
                        startActivity(intent9);
                       // Toast.makeText(getBaseContext(), "Going to Photography Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Intent intent10 = new Intent(getApplicationContext(), QuizListActivity.class);
                        startActivity(intent10);
                       // Toast.makeText(getBaseContext(), "Going to Quiz Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Intent intent11 = new Intent(getApplicationContext(), TechListActivity.class);
                        startActivity(intent11);
                      //  Toast.makeText(getBaseContext(), "Going to Tech Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Intent intent12 = new Intent(getApplicationContext(), TheatreListActivity.class);
                        startActivity(intent12);
                       // Toast.makeText(getBaseContext(), "Going to Theatre Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        Intent intent13 = new Intent(getApplicationContext(),WesternMusicListActivity.class);
                        startActivity(intent13);
                       // Toast.makeText(getBaseContext(), "Going to Western Music Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 14:
                        Intent intent14 = new Intent(getApplicationContext(),MountaineeringListActivity.class);
                        startActivity(intent14);
                      //  Toast.makeText(getBaseContext(), "Going to Mountaineering Page ",Toast.LENGTH_SHORT).show();
                        break;
                    case 15:
                        Intent intent15 = new Intent(getApplicationContext(),InformalListActivity.class);
                        startActivity(intent15);
                      //  Toast.makeText(getBaseContext(), "Going to Informal Page ",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    @SuppressLint("ResourceType")
    private void initialiseEvents() {

        //eventPictures = getResources().obtainTypedArray(R.array.events);

        eventList = new ArrayList<Integer>();
       /* eventList.add(new Event(eventPictures.getResourceId(0, R.drawable.events_background)));
        eventList.add(new Event(eventPictures.getResourceId(1,R.drawable.events_background)));
        eventList.add(new Event(eventPictures.getResourceId(2,R.drawable.events_background)));
        eventList.add(new Event(eventPictures.getResourceId(3,R.drawable.events_background)));
        eventList.add(new Event(eventPictures.getResourceId(4,R.drawable.events_background)));
        eventList.add(new Event(eventPictures.getResourceId(5,R.drawable.events_background)));
        eventList.add(new Event("Kannada Sangha",eventPictures.getResourceId(6,R.drawable.events_background)));
        eventList.add(new Event("Literature",eventPictures.getResourceId(7,R.drawable.events_background)));
        eventList.add(new Event("Math",eventPictures.getResourceId(8,R.drawable.events_background)));
        eventList.add(new Event("Photography",eventPictures.getResourceId(9,R.drawable.events_background)));
        eventList.add(new Event("Quiz",eventPictures.getResourceId(10,R.drawable.events_background)));
        eventList.add(new Event("Tech",eventPictures.getResourceId(11,R.drawable.events_background)));
        eventList.add(new Event("Theatre",eventPictures.getResourceId(12,R.drawable.events_background)));
        eventList.add(new Event("Music(Western)",eventPictures.getResourceId(13,R.drawable.events_background)));
        eventList.add(new Event("Mountaineering",eventPictures.getResourceId(14,R.drawable.events_background)));
        eventList.add(new Event("Informal Events",eventPictures.getResourceId(15,R.drawable.events_background)));
    */
eventList.add(R.drawable.dance);

        eventList.add(R.drawable.eastern_music);
        eventList.add(R.drawable.edc);
        eventList.add(R.drawable.fashion);
        eventList.add(R.drawable.fine_arts);
        eventList.add(R.drawable.game);
        eventList.add(R.drawable.kannada);
        eventList.add(R.drawable.literature);
        eventList.add(R.drawable.math);
        eventList.add(R.drawable.photography);
        eventList.add(R.drawable.quiz);
        eventList.add(R.drawable.tech);
        eventList.add(R.drawable.theatre);
        eventList.add(R.drawable.western_music);
        eventList.add(R.drawable.mountaineering);
        eventList.add(R.drawable.mr_utsav);

    }
    //kiran code ends
}
