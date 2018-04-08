package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitymaduri extends AppCompatActivity {

    ImageView iv11;
    ImageView iv12;
    ImageView iv21;
    ImageView iv22;
    ImageView iv31;
    ImageView iv32;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmaduri);
    }

    @Override
    protected void onResume() {
        super.onResume();
        iv11 = findViewById(R.id.iv11);
        iv12 = findViewById(R.id.iv12);
        iv21 = findViewById(R.id.iv21);
        iv22 = findViewById(R.id.iv22);
        iv31 = findViewById(R.id.iv31);
        iv32 = findViewById(R.id.iv32);

        iv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","First");
                startActivity(intent);
            }
        });
        iv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
               // Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Second");
                startActivity(intent);
            }
        });
        iv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Third");
                startActivity(intent);
            }
        });
        iv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","Fourth");
                startActivity(intent);
            }
        });
        iv31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","five");
                startActivity(intent);
            }
        });
        iv32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                //Toast.makeText(getApplicationContext(),Toast.LENGTH_SHORT).show();
                intent.putExtra("image","sixth");
                startActivity(intent);
            }
        });
    }
}
