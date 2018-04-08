package in.ac.bmsce.utsav2k18;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v4.view.animation.FastOutLinearInInterpolator;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.app.Activity;

public class DeveloperActivity extends Activity {
    ListView list;
    String[] web = {

            "Shilpi Kumari",
            "Madhuri Neelavar",
            "Neha Reddy V",
            "Navven RJ",
            "Omkar T P",
            "Kiran C Nayak"

    } ;
    Integer[] imageId = {

            R.drawable.team_shilpi,
            R.drawable.team_madhuri,
            R.drawable.team_nehav,
            R.drawable.team_naveen,
            R.drawable.team_omkar,
            R.drawable.team_kiran





    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        Customlistinput adapter = new
                Customlistinput(DeveloperActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(DeveloperActivity.this, "Hello I am " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}
