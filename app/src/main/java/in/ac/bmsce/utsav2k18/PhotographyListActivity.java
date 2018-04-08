package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PhotographyListActivity extends AppCompatActivity {


    ArrayList<Photography> photographyList;
    ListView lvPhotography;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photography_list);
        lvPhotography = findViewById(R.id.lvPhotography);
        initialisePhotography();
    }

    @Override
    protected void onStart() {
        super.onStart();
        PhotographyAdapter photographyAdapter = new PhotographyAdapter(this,photographyList);
        lvPhotography.setAdapter(photographyAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvPhotography.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","photography_club");
                        intent.putExtra("event","photostage_2018_a_photography_symposium");
                        intent.putExtra("name","Photo Stage 2018");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","photography_club");
                        intent1.putExtra("event","panorama_2018_onspot_photography_contest");
                        intent1.putExtra("name","Panorama 2018");
                        startActivity(intent1);
                        break;

                }

            }
        });
    }

    private void initialisePhotography() {

        photographyList = new ArrayList<Photography>();
        photographyList.add(new Photography("Photo Stage 2018"));
        photographyList.add(new Photography("Panorama 2018"));


    }
}

