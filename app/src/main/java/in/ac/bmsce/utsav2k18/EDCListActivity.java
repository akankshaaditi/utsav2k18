package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EDCListActivity extends AppCompatActivity {

    ArrayList<EDC> edcList;
    ListView lvEDC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edc_list);
        lvEDC = findViewById(R.id.lvEDC);
        initialiseEDC();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EDCAdapter edcAdapter = new EDCAdapter(this,edcList);
        lvEDC.setAdapter(edcAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvEDC.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","EDC");
                        intent.putExtra("event","stock_market");
                        intent.putExtra("name","Stock Market");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","EDC");
                        intent1.putExtra("event","treasure_hunt");
                        intent1.putExtra("name","Treasure Hunt");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","EDC");
                        intent2.putExtra("event","cultural_sante");
                        intent2.putExtra("name","Cultural Sante");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","EDC");
                        intent3.putExtra("event","marketing");
                        intent3.putExtra("name","Marketing Genius");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","EDC");
                        intent4.putExtra("event","stress_test");
                        intent4.putExtra("name","Stress Test");
                        startActivity(intent4);
                        break;

                }
            }
        });
    }

    private void initialiseEDC() {

        edcList = new ArrayList<EDC>();
        edcList.add(new EDC("Stock Market"));
        edcList.add(new EDC("Treasure Hunt"));
        edcList.add(new EDC("Cultural Santhe"));
        edcList.add(new EDC("Marketing Genius(TV Based"));
        edcList.add(new EDC("Stress Test"));


    }
}
