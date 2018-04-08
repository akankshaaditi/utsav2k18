package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



import android.widget.ArrayAdapter;
import android.widget.Spinner;


import java.util.ArrayList;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,AdapterView.OnItemSelectedListener,NavigationView.OnNavigationItemSelectedListener {

    private GoogleMap mMap;
    Spinner spinner;
    ImageView imgbtn1,imgbtn2,imgbtn3,imgbtn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_map2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        ArrayAdapter<String> arrayAdapter;
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("BMSCE CAMPUS");
        arrayList.add("INDOOR STADIUM");
        arrayList.add("PG BLOCK");
        arrayList.add("MECHANICAL BLOCK");
        arrayList.add("CANTEEN");
        arrayList.add("MAIN STAGE");
        arrayList.add("EC/CSE BLOCK");
        arrayList.add("PARKING LOT");
        arrayList.add("ALLAHABAD BANK");
        imgbtn1=findViewById(R.id.btnfacebook);
        imgbtn2=findViewById(R.id.btninsta);
        imgbtn3=findViewById(R.id.btnyoutube);
        imgbtn4=findViewById(R.id.btntwitter);
        spinner = findViewById(R.id.spinner);
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,arrayList);
        spinner.setAdapter(arrayAdapter);

        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://www.facebook.com/utsavbmsce/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://www.instagram.com/bmsce_utsav/");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://www.youtube.com/channel/UC0kwxgOfXDe0KwN0gOm_j0A");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uriUrl = Uri.parse("https://twitter.com/bmsce_utsav?lang=en");
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        // tv = findViewById(R.id.textView);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //  tv.setText(adapterView.getItemAtPosition(i).toString());
                if(i==0) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.9417177, 77.5668428), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.9417177, 77.5668428))
                            .title("BMSCE CAMPUS"));
                }
                else if(i==1) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.940590, 77.565969), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.940590, 77.565969))
                            .title("INDOOR STADIUM"));
                }
                else if(i==2) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.941618, 77.565786), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.941618, 77.565786))
                            .title("PG BLOCK"));
                }
                else if(i==3) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.942181, 77.565406), 18));

                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.942181, 77.565406))
                            .title("MECHANICAL BLOCK"));
                }
                else if(i==4) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.9404551,77.5658731), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.9404551,77.5658731))
                            .title("CANTEEN"));
                }
                else if(i==5) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.9410952,77.5659847), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.9410952,77.5659847))
                            .title("MAIN STAGE"));
                }
                else if(i==6) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.942352, 77.565926), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.942352, 77.565926))
                            .title("EC/CSE BLOCK"));
                }
                else if(i==7) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.9409053,77.5651986), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.9409053,77.5651986))
                            .title("PARKING LOT"));
                }
                else if(i==8) {
                    mMap.clear();
                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.9398967,77.5651179), 18));
                    mMap.addMarker(new MarkerOptions()
                            .position(new LatLng(12.9398967,77.5651179))
                            .title("ALLAHABAD BANK"));
                }

            }



            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        //  googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.941642, -77.565852), 15));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom( new LatLng( 12.940806, 77.566010), 15));
        //googleMap.animateCamera(CameraUpdateFactory.zoomTo(12), 1000, null);
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(12.940806, 77.566010))
                .title("Hello world"));

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

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

            Intent intent = new Intent(MapsActivity.this,EventActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);


        } else if (id == R.id.nav_schedule) {

            Intent intent = new Intent(MapsActivity.this,ScheduleActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(MapsActivity.this,GalleryActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        } else if (id == R.id.nav_contacts) {


            Intent intent = new Intent(MapsActivity.this,HomeActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_sponsers) {

            Intent intent = new Intent(MapsActivity.this,SponsersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_maps) {

            Intent intent = new Intent(MapsActivity.this,MapsActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }else if (id == R.id.nav_developers) {

            Intent intent = new Intent(MapsActivity.this,DevelopersActivity.class);
            intent.putExtra("info","This is activity from developers");
            startActivity(intent);



        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}




