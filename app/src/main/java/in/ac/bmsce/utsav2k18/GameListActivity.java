package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class GameListActivity extends AppCompatActivity {

    ArrayList<Game> gameList;
    ListView lvGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
        lvGame = findViewById(R.id.lvGame);
        initialiseGame();
    }

    @Override
    protected void onStart() {
        super.onStart();
        GameAdapter gameAdapter = new GameAdapter(this,gameList);
        lvGame.setAdapter(gameAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvGame.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","gaming");
                        intent.putExtra("event","counter_strike");
                        intent.putExtra("name","Counter Strike");
                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","gaming");
                        intent1.putExtra("event","dota 2");
                        intent1.putExtra("name","Dota 2");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","gaming");
                        intent2.putExtra("event","fifa 18");
                        intent2.putExtra("name","FIFA 18");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","gaming");
                        intent3.putExtra("event","ar_based");
                        intent3.putExtra("name","AR Based");
                        startActivity(intent3);
                        break;
                    case 4: Intent intent4 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent4.putExtra("title","gaming");
                        intent4.putExtra("event","vr_based");
                        intent4.putExtra("name","VR Based");
                        startActivity(intent4);
                        break;
                    case 5: Intent intent5 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent5.putExtra("title","gaming");
                        intent5.putExtra("event","road_rash");
                        intent5.putExtra("name","Road Rash");
                        startActivity(intent5);
                        break;
                    case 6: Intent intent6 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent6.putExtra("title","gaming");
                        intent6.putExtra("event","laser_tag");
                        intent6.putExtra("name","Laser Tag");
                        startActivity(intent6);
                        break;

                }

            }
        });
    }

    private void initialiseGame() {

        gameList = new ArrayList<Game>();
        gameList.add(new Game("Counter Strike"));
        gameList.add(new Game("Dota2"));
        gameList.add(new Game("FIFA"));
        gameList.add(new Game("AR based"));
        gameList.add(new Game("VR based"));
        gameList.add(new Game("Road Rash"));
        gameList.add(new Game("Laser Tag"));


    }
}