package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizListActivity extends AppCompatActivity {

    ArrayList<Quiz> quizList;
    ListView lvQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_list);
        lvQuiz = findViewById(R.id.lvQuiz);
        initialiseQuiz();
    }

    @Override
    protected void onStart() {
        super.onStart();
        QuizAdapter quizAdapter = new QuizAdapter(this,quizList);
        lvQuiz.setAdapter(quizAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        lvQuiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0: Intent intent = new Intent(getApplicationContext(), DeleteThis.class);
                        intent.putExtra("title","quiz_club");
                        intent.putExtra("event","arbit_quiz");
                        intent.putExtra("name","Arbit Quiz");

                        startActivity(intent);
                        break;
                    case 1: Intent intent1 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent1.putExtra("title","quiz_club");
                        intent1.putExtra("event","general_quiz");
                        intent1.putExtra("name","General Quiz");
                        startActivity(intent1);
                        break;
                    case 2: Intent intent2 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent2.putExtra("title","quiz_club");
                        intent2.putExtra("event","india_quiz");
                        intent2.putExtra("name","India Quiz");
                        startActivity(intent2);
                        break;

                    case 3: Intent intent3 = new Intent(getApplicationContext(), DeleteThis.class);
                        intent3.putExtra("title","quiz_club");
                        intent3.putExtra("event","scibiztech_quiz");
                        intent3.putExtra("name","Scibiztech Quiz");
                        startActivity(intent3);
                        break;

                }

            }
        });
    }

    private void initialiseQuiz() {

        quizList = new ArrayList<Quiz>();
        quizList.add(new Quiz("Arbit Quiz"));
        quizList.add(new Quiz("General Quiz"));
        quizList.add(new Quiz("India Quiz"));
        quizList.add(new Quiz("SciBiTech Quiz"));

    }
}