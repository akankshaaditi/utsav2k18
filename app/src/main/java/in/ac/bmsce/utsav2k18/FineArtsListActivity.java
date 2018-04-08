package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FineArtsListActivity extends AppCompatActivity {

    ArrayList<FineArts> fineArtsList;
    ListView lvFineArts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fine_arts_list);
        lvFineArts = findViewById(R.id.lvFineArts);
        initialiseFineArts();
    }

    @Override
    protected void onStart() {
        super.onStart();
        FineArtsAdapter fineArtsAdapter = new FineArtsAdapter(this,fineArtsList);
        lvFineArts.setAdapter(fineArtsAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvFineArts.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title", "fine_arts_club");
                        intent.putExtra("event", "dexters_canvas");
                        intent.putExtra("name", "Dexter's Canvas (painting)");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title", "fine_arts_club");
                        intent1.putExtra("event", "sketching");
                        intent1.putExtra("name", "50 shades of the 90's");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title", "fine_arts_club");
                        intent2.putExtra("event", "face_off");
                        intent2.putExtra("name", "Face off");
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title", "fine_arts_club");
                        intent3.putExtra("event", "quilling");
                        intent3.putExtra("name", "Glue, Paper, Scissors");
                        startActivity(intent3);
                        break;
                }
            }
        });
    }

    private void initialiseFineArts() {

        fineArtsList = new ArrayList<FineArts>();
        fineArtsList.add(new FineArts("Dexter's Canvas (painting)"));
        fineArtsList.add(new FineArts("50 shades of the 90's(sketching)"));
        fineArtsList.add(new FineArts("Face off (face painting)"));
        fineArtsList.add(new FineArts("Glue, Paper, Scissors(Quilling)"));

    }
}