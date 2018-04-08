package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class InformalListActivity extends AppCompatActivity {

    ArrayList<Informal> informalList;
    ListView lvInformal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informal_list);
        lvInformal = findViewById(R.id.lvInformal);
        initialiseInformal();
    }

    @Override
    protected void onStart() {
        super.onStart();
        InformalAdapter informalAdapter = new InformalAdapter(this,informalList);
        lvInformal.setAdapter(informalAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvInformal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","Informal");
                        intent.putExtra("event","Hogathon");
                        intent.putExtra("name","Hogathon");

                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","Informal");
                        intent1.putExtra("event","Mr Utsav");
                        intent1.putExtra("name","Mr Utsav");
                        startActivity(intent1);
                        break;

                }

            }
        });
    }

    private void initialiseInformal() {

        informalList = new ArrayList<Informal>();
        informalList.add(new Informal("Hogathon"));
        informalList.add(new Informal("Mr UTSAV"));
    }
}