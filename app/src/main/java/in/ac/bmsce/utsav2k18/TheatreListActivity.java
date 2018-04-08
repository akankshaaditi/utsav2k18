package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TheatreListActivity extends AppCompatActivity {

    ArrayList<Theatre> theatreList;
    ListView lvTheatre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theatre_list);
        lvTheatre = findViewById(R.id.lvTheatre);
        initialiseTheatre();
    }

    @Override
    protected void onStart() {
        super.onStart();
        TheatreAdapter theatreAdapter = new TheatreAdapter(this,theatreList);
        lvTheatre.setAdapter(theatreAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvTheatre.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","theatre");
                        intent.putExtra("event","street_play");
                        intent.putExtra("name","Street Play");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","theatre");
                        intent1.putExtra("event","improv");
                        intent1.putExtra("name","Improv");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","theatre");
                        intent2.putExtra("event","mime");
                        intent2.putExtra("name","MIME");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","theatre");
                        intent3.putExtra("event","mad_acts");
                        intent3.putExtra("name","Mad Acts");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","theatre");
                        intent4.putExtra("event","short_movie");
                        intent4.putExtra("name","Short Movie");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","theatre");
                        intent5.putExtra("event","baby_got_act");
                        intent5.putExtra("name","Baby Got Act");                        startActivity(intent5);
                        break;

                }
            }
        });
    }

    private void initialiseTheatre() {

        theatreList = new ArrayList<Theatre>();
        theatreList.add(new Theatre("Street Play(AAO KABHI NUKKAD PE)"));
        theatreList.add(new Theatre("IMPROV(Mission Improv-able)"));
        theatreList.add(new Theatre("MIME"));
        theatreList.add(new Theatre("MAD ACTS"));
        theatreList.add(new Theatre("Short Movie Making"));
        theatreList.add(new Theatre("BABY GOT ACT"));

    }
}
