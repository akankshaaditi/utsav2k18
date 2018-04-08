package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class WesternMusicListActivity extends AppCompatActivity {

    ArrayList<WesternMusic> westernMusicList;
    ListView lvWesternMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_western_music_list);
        lvWesternMusic = findViewById(R.id.lvWesternMusic);
        initialiseEvents();
    }

    @Override
    protected void onStart() {
        super.onStart();
        WesternMusicAdapter westernMusicAdapter = new WesternMusicAdapter(this,westernMusicList);
        lvWesternMusic.setAdapter(westernMusicAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvWesternMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title", "western_music");
                        intent.putExtra("event", "battle_of_bands");
                        intent.putExtra("name", "Battle Of Bands");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title", "western_music");
                        intent1.putExtra("event", "western_vocal_solo");
                        intent1.putExtra("name", "Western Vocal Solo");
                        startActivity(intent1);
                        break;
                }

                }
        });
    }

    private void initialiseEvents() {

        westernMusicList = new ArrayList<WesternMusic>();
        westernMusicList.add(new WesternMusic("Battle of Bands"));
        westernMusicList.add(new WesternMusic("Western Solo"));
    }
}