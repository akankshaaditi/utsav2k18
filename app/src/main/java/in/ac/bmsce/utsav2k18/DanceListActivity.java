package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DanceListActivity extends AppCompatActivity {

    ArrayList<Dance> danceList;
    ListView lvDance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dance_list);
        lvDance = findViewById(R.id.lvDance);
        initialiseDance();
    }

    @Override
    protected void onStart() {
        super.onStart();
        DanceAdapter danceAdapter = new DanceAdapter(this,danceList);
        lvDance.setAdapter(danceAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvDance.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","bmsce_dance_crew");
                        intent.putExtra("event","western_group_dance");
                        intent.putExtra("name","Western Group Dance");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","bmsce_dance_crew");
                        intent1.putExtra("event","eastern_group_dance");
                        intent1.putExtra("name","Eastern Group Dance");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","bmsce_dance_crew");
                        intent2.putExtra("event","solo_dance");
                        intent2.putExtra("name","Solo Dance");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","bmsce_dance_crew");
                        intent3.putExtra("event","turtle_jam11");
                        intent3.putExtra("name","Turtle Jam (One on One)");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","bmsce_dance_crew");
                        intent4.putExtra("event","turtle_jam22");
                        intent4.putExtra("name","Turtle Jam (Two on Two)");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","bmsce_dance_crew");
                        intent5.putExtra("event","turtle_jamcc");
                        intent5.putExtra("name","Turtle Jam (Crew on Crew)");
                        startActivity(intent5);
                        break;

                }

            }
        });
    }

    private void initialiseDance() {

        danceList = new ArrayList<Dance>();
        danceList.add(new Dance("Western Group Dance"));
        danceList.add(new Dance("Eastern Group Dance"));
        danceList.add(new Dance("Solo Dance"));
        danceList.add(new Dance("Turtle Jam(One on One)"));
        danceList.add(new Dance("Turtle Jam(Two on Two)"));
        danceList.add(new Dance("Turtle Jam(Crew on Crew)"));

    }
}