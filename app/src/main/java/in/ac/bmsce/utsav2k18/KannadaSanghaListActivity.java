package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class KannadaSanghaListActivity extends AppCompatActivity {

    ArrayList<KannadaSangha> kannadaSanghaList;
    ListView lvKannadaSangha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kannada_sangha_list);
        lvKannadaSangha = findViewById(R.id.lvKannadaSangha);
        initialiseKannadaSangha();
    }

    @Override
    protected void onStart() {
        super.onStart();
        KannadaSanghaAdapter kannadaSanghaAdapter = new KannadaSanghaAdapter(this,kannadaSanghaList);
        lvKannadaSangha.setAdapter(kannadaSanghaAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvKannadaSangha.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","CHIRANTANA");
                        intent.putExtra("event","anthakshari");
                        intent.putExtra("name","Anthakshari");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","CHIRANTANA");
                        intent1.putExtra("event","kannada debate");
                        intent1.putExtra("name","Kannada debate");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","CHIRANTANA");
                        intent2.putExtra("event","rasaprashne");
                        intent2.putExtra("name","Rasaprashne");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","CHIRANTANA");
                        intent3.putExtra("event","chakravyuha");
                        intent3.putExtra("name","Chakravyuha");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","CHIRANTANA");
                        intent4.putExtra("event","mookaabhinaya");
                        intent4.putExtra("name","Mookaabhinaya");
                        startActivity(intent4);
                        break;

                }

            }
        });
    }

    private void initialiseKannadaSangha() {

        kannadaSanghaList = new ArrayList<KannadaSangha>();
        kannadaSanghaList.add(new KannadaSangha("Anthyakshari"));
        kannadaSanghaList.add(new KannadaSangha("Charchasparde"));
        kannadaSanghaList.add(new KannadaSangha("Rasaprashne"));
        kannadaSanghaList.add(new KannadaSangha("Chakravyuha"));
        kannadaSanghaList.add(new KannadaSangha("Mookabhinaya"));

    }
}

