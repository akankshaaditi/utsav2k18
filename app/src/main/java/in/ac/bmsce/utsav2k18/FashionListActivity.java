package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FashionListActivity extends AppCompatActivity {

    ArrayList<Fashion> fashionList;
    ListView lvFashion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion_list);
        lvFashion = findViewById(R.id.lvFashion);
        initialiseFashion();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FashionAdapter fashionAdapter = new FashionAdapter(this,fashionList);
        lvFashion.setAdapter(fashionAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvFashion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","fashion");
                        intent.putExtra("event","fashion show");
                        intent.putExtra("name","Fashion Show");
                        startActivity(intent);
                        break;

                }

            }
        });
    }

    private void initialiseFashion() {

        fashionList = new ArrayList<Fashion>();
        fashionList.add(new Fashion("Fashion Show"));

    }
}