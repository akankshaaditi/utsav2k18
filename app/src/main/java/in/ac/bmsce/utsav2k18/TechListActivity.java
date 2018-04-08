package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class TechListActivity extends AppCompatActivity {

    ArrayList<Tech> techList;
    ListView lvTech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_list);
        lvTech = findViewById(R.id.lvTech);
        initialiseTech();
    }

    @Override
    protected void onStart() {
        super.onStart();
        TechAdapter techAdapter = new TechAdapter(this,techList);
        lvTech.setAdapter(techAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvTech.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","tech_team");
                        intent.putExtra("event","codathon");
                        intent.putExtra("name","Codathon");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","tech_team");
                        intent1.putExtra("event","android_app_development");
                        intent1.putExtra("name","Android App Development");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","tech_team");
                        intent2.putExtra("event","diffuse_the_bomb");
                        intent2.putExtra("name","Diffuse The Bomb");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","tech_team");
                        intent3.putExtra("event","online_treasure_hunt");
                        intent3.putExtra("name","Online Treasure Hunt");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","tech_team");
                        intent4.putExtra("event","tech_symphosium");
                        intent4.putExtra("name","Tech Symphosium");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","tech_team");
                        intent5.putExtra("event","stay_connected");
                        intent5.putExtra("name","Stay Connected");
                        startActivity(intent5);
                        break;

                }
            }
        });
    }

    private void initialiseTech() {

        techList = new ArrayList<Tech>();
        techList.add(new Tech("CODATHON"));
        techList.add(new Tech("Android App Development"));
        techList.add(new Tech("Diffuse the bomb"));
        techList.add(new Tech("Online Treasure Hunt"));
        techList.add(new Tech("TECH SYSMPOSIUM"));
        techList.add(new Tech("Stay Connected"));

    }
}