package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MountaineeringAdapter extends BaseAdapter {

    private ArrayList<Mountaineering> mountaineeringList;
    private Context context;
    private LayoutInflater inflater;

    public MountaineeringAdapter(Context context, ArrayList<Mountaineering> mountaineeringList){
        this.context = context;
        this.mountaineeringList = mountaineeringList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mountaineeringList.size();
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

        convertView = inflater.inflate(R.layout.mountaineering_r, parent, false);

        TextView tvMountaineering = convertView.findViewById(R.id.tvMountaineering);

        Mountaineering mountaineering = mountaineeringList.get(position);

        tvMountaineering.setText(mountaineering.getMountaineeringName());

        return convertView;
    }

}