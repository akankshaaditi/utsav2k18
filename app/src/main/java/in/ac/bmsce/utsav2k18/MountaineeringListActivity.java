package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MountaineeringListActivity extends AppCompatActivity {

    ArrayList<Mountaineering> mountaineeringList;
    ListView lvMountaineering;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaineering_list);
        lvMountaineering = findViewById(R.id.lvMountaineering);
        initialiseMountaineering();
    }

    @Override
    protected void onStart() {
        super.onStart();
        MountaineeringAdapter mountaineeringAdapter = new MountaineeringAdapter(this,mountaineeringList);
        lvMountaineering.setAdapter(mountaineeringAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvMountaineering.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","mountaineering");
                        intent.putExtra("event","adrenaline");
                        intent.putExtra("name","Adrenaline");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","mountaineering");
                        intent1.putExtra("event","obstacle_cycle");
                        intent1.putExtra("name","Obstacle Cycle");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","mountaineering");
                        intent2.putExtra("event","rapelling");
                        intent2.putExtra("name","Rapelling");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","mountaineering");
                        intent3.putExtra("event","tyroline");
                        intent3.putExtra("name","Tyroline");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","mountaineering");
                        intent4.putExtra("event","wall_climbing");
                        intent4.putExtra("name","Wall Climbing");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","mountaineering");
                        intent5.putExtra("event","zipline");
                        intent5.putExtra("name","Zipline");

                        startActivity(intent5);
                        break;

                }

            }
        });
    }

    private void initialiseMountaineering() {

        mountaineeringList = new ArrayList<Mountaineering>();
        mountaineeringList.add(new Mountaineering("Adrenaline"));
        mountaineeringList.add(new Mountaineering("Obstacle Cycling"));
        mountaineeringList.add(new Mountaineering("Rapelling"));
        mountaineeringList.add(new Mountaineering("Tyroline"));
        mountaineeringList.add(new Mountaineering("Wall Climbing"));
        mountaineeringList.add(new Mountaineering("Zipline"));
    }
}