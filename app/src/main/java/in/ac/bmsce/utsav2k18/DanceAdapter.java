package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class DanceAdapter extends BaseAdapter {

    private ArrayList<Dance> danceList;
    private Context context;
    private LayoutInflater inflater;

    public DanceAdapter(Context context, ArrayList<Dance> danceList){
        this.context = context;
        this.danceList = danceList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return danceList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.dance_r, parent, false);

        TextView tvDance = convertView.findViewById(R.id.tvDance);

        Dance dance = danceList.get(position);

        tvDance.setText(dance.getDanceName());

        return convertView;
    }

}