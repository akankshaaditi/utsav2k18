package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LiteratureListActivity extends AppCompatActivity {

    ArrayList<Literature> literatureList;
    ListView lvLiterature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literature_list);
        lvLiterature = findViewById(R.id.lvLiterature);
        initialiseLiterature();
    }

    @Override
    protected void onStart() {
        super.onStart();
        LiteratureAdapter literatureAdapter = new LiteratureAdapter(this,literatureList);
        lvLiterature.setAdapter(literatureAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvLiterature.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","inksanity");
                        intent.putExtra("event","creative_writing");
                        intent.putExtra("name","Creative Writing");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","inksanity");
                        intent1.putExtra("event","slam_poetry");
                        intent1.putExtra("name","Slam Poetry");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","inksanity");
                        intent2.putExtra("event","potpourri");
                        intent2.putExtra("name","Potpourri");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","inksanity");
                        intent3.putExtra("event","jam");
                        intent3.putExtra("name","JAM (Just-A-Minute)");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","inksanity");
                        intent4.putExtra("event","debate");
                        intent4.putExtra("name","Debate");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","inksanity");
                        intent5.putExtra("event","the_balls_in_your_court");
                        intent5.putExtra("name","Courtroom Debate");
                        startActivity(intent5);
                        break;

                }
            }
        });
    }

    private void initialiseLiterature() {

        literatureList = new ArrayList<Literature>();
        literatureList.add(new Literature("Creative Writing"));
        literatureList.add(new Literature("Slam Poetry"));
        literatureList.add(new Literature("Potpourri"));
        literatureList.add(new Literature("JAM (Just-A-Minute)"));
        literatureList.add(new Literature("Debate"));
        literatureList.add(new Literature("Courtroom Debate"));

    }
}