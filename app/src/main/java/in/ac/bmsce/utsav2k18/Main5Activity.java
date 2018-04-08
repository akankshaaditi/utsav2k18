package in.ac.bmsce.utsav2k18;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {


    String string = "<h3>There was a time when Johnny Bravo and Shakalaka Boom Boom ruled the TV. A time where Scooby Doo and the Mystery Inc. were out solving crime while we looked for clues. A time where dial-up connections were the gateway to the internet. A time where the Nokia 6600 was chic. \n" +
            "A time where GTA San Andreas was the epitome of gaming. A time where all that we talked about was WWE, sports and school. A time before phones got smarter. A time before Facebook likes and Instagram stories took over the world. A time where friendships were made on playgrounds. A time where we owned the world without a care in the world.\n" +
            "<br/><br/>" +
            "Get ready for a trip down nostalgia lane for this year we go back in time and flip through the pages of the diary of our lives.<br/>" +
            "<br/>We present to you the theme of this year's edition -<b> The Diary of a 90's kid </b><br/><br/>" +
            "#Utsav2018<br/>" +
            "The festival of faith,<br/>" +
            "The spirit of celebration,<br/>" +
            "The UTSAV fever!<br/>" +
            "BMSCE's oldest love affair is finally back and it is here to stay!<br/>" +
            "<br/><br/>" +
            "Let the suspense end and the excitement begin!<br/><br/>" +
            "<br/>" +
            "Come create. Come participate. </h3>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button btn1 = findViewById(R.id.btn1);
        TextView textView = findViewById(R.id.tv_main5);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Main6Activity.class);
                intent.putExtra("info","This is activity from developers");
                startActivity(intent);

            }
        });

        textView.setText(Html.fromHtml(string));

    }
}
