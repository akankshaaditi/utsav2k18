package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondmaduri);
        imageView = findViewById(R.id.ivImage);
        Intent inte = getIntent();
        if(inte.getExtras().getString("image").equals("First")){
            imageView.setImageResource(R.drawable.ua);
        }
        if(inte.getExtras().getString("image").equals("Second")){
            imageView.setImageResource(R.drawable.ub);
        }
        if(inte.getExtras().getString("image").equals("Third")){
            imageView.setImageResource(R.drawable.uc);
        }
        if(inte.getExtras().getString("image").equals("Fourth")){
            imageView.setImageResource(R.drawable.ud);
        }
        if(inte.getExtras().getString("image").equals("five")){
            imageView.setImageResource(R.drawable.ue);
        }
        if(inte.getExtras().getString("image").equals("sixth")){
            imageView.setImageResource(R.drawable.uf);
        }
    }
}
