package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.*;
import java.util.ArrayList;

public class MathListActivity extends AppCompatActivity {

        ArrayList<Math> mathList;
        ListView lvMath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_list);
        lvMath = findViewById(R.id.lvMath);
        initialiseMath();
    }

        @Override
        protected void onStart() {
            super.onStart();
            MathAdapter mathAdapter = new MathAdapter(this,mathList);
            lvMath.setAdapter(mathAdapter);
        }

        @Override
        protected void onResume() {
            super.onResume();
            lvMath.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch(position){
                        case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                            intent.putExtra("title","math");
                            intent.putExtra("event","infinte_amaze");
                            intent.putExtra("name","InfinIte Amaze");
                            startActivity(intent);
                            break;
                        case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                            intent1.putExtra("title","math");
                            intent1.putExtra("event","battleship");
                            intent1.putExtra("name","Battleship");
                            startActivity(intent1);
                            break;
                        case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                            intent2.putExtra("title","math");
                            intent2.putExtra("event","gamblarena");
                            intent2.putExtra("name","Gamblarena");
                            startActivity(intent2);
                            break;

                        case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                            intent3.putExtra("title","math");
                            intent3.putExtra("event","strategist_day-out");
                            intent3.putExtra("name","Strategist's day out");
                            startActivity(intent3);
                            break;

                    }
                }
            });
        }

    private void initialiseMath() {

        mathList = new ArrayList<Math>();
        mathList.add(new Math("Infinite amaze"));
        mathList.add(new Math("Battleship 2.0"));
        mathList.add(new Math("gamblArena of math"));
        mathList.add(new Math("strategist's day out"));

    }
}
    
