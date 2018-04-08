package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EasternMusicListActivity extends AppCompatActivity {

    ArrayList<EasternMusic> easternMusicList;
    ListView lvEasternMusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eastern_music_list);
        lvEasternMusic = findViewById(R.id.lvEasternMusic);
        initialiseEvents();
    }

    @Override
    protected void onStart() {
        super.onStart();
        EasternMusicAdapter easternMusicAdapter = new EasternMusicAdapter(this,easternMusicList);
        lvEasternMusic.setAdapter(easternMusicAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvEasternMusic.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title", "Eastern music");
                        intent.putExtra("event", "Classical Vocal Solo");
                        intent.putExtra("name","Classical Vocal Solo");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title", "Eastern music");
                        intent1.putExtra("event", "Instrumental Solo");
                        intent1.putExtra("name", "Instrumental Solo");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title", "Eastern music");
                        intent2.putExtra("event", "Light Vocal Solo");
                        intent2.putExtra("name", "Light Vocal Solo");
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title", "Eastern music");
                        intent3.putExtra("event", "Indian Group Music");
                        intent3.putExtra("name", "Indian Group Music");
                        startActivity(intent3);
                        break;
                }
            }
        });
    }

    private void initialiseEvents() {

        easternMusicList = new ArrayList<EasternMusic>();
        easternMusicList.add(new EasternMusic("Classical Vocal Solo"));
        easternMusicList.add(new EasternMusic("Instrumental Solo"));
        easternMusicList.add(new EasternMusic("Light Vocal Solo"));
        easternMusicList.add(new EasternMusic("Indian Group Music"));

    }
}