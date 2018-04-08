package in.ac.bmsce.utsav2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DeleteThis extends AppCompatActivity {
    private DatabaseReference mdatabase;
    private FirebaseDatabase minstance;
    String cat,eve,nam;
    private ChildEventListener mlistener;
    TextView where,when,fee,winner,runner,coordinator,team,desc,rule,title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_this);
        where=(TextView)findViewById(R.id.tvwhere);
        when=(TextView)findViewById(R.id.tvwhen);
        fee=(TextView)findViewById(R.id.tvfee);
        winner=(TextView)findViewById(R.id.tvwinner);
        runner=(TextView)findViewById(R.id.tvrunner);
        coordinator=(TextView)findViewById(R.id.tvcoordinate);
        title=(TextView)findViewById(R.id.tvtitle);
        Toast.makeText(getBaseContext(),"CONNECT TO INTERNET",Toast.LENGTH_LONG).show();
        Toast.makeText(getBaseContext(),"CONNECT TO INTERNET",Toast.LENGTH_LONG).show();
        Toast.makeText(getBaseContext(),"CONNECT TO INTERNET",Toast.LENGTH_LONG).show();
        minstance = FirebaseDatabase.getInstance();
        mdatabase = minstance.getReference();

        nam=getIntent().getStringExtra("name");

        cat=getIntent().getStringExtra("title");
        eve=getIntent().getStringExtra("event");
        team=(TextView)findViewById(R.id.tvteam);
        desc=(TextView)findViewById(R.id.tvdesc);
        rule=(TextView)findViewById(R.id.tvrules);

        mdatabase.child(cat).child(eve).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                events value = dataSnapshot.getValue(events.class);
                where.setText(value.where);
                when.setText(value.when);
                fee.setText(""+(value.registration_fee));
                title.setText(nam);
                winner.setText(""+(value.winner_prize));
                runner.setText(""+value.runner_up_prize);
                coordinator.setText(value.coordinator1name+" : "+value.coordinator1no+" \n"+value.coordinator2name+" : "+value.coordinator2no);
                team.setText(""+value.team_size);
                desc.setText(value.description);
                rule.setText(value.rules);

            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }


}
