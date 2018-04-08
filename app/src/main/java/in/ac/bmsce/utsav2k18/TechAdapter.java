package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TechAdapter extends BaseAdapter {

    private ArrayList<Tech> techList;
    private Context context;
    private LayoutInflater inflater;

    public TechAdapter(Context context, ArrayList<Tech> techList){
        this.context = context;
        this.techList = techList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return techList.size();
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

        convertView = inflater.inflate(R.layout.tech_r, parent, false);

        TextView tvTech = convertView.findViewById(R.id.tvTech);

        Tech tech = techList.get(position);

        tvTech.setText(tech.getTechName());

        return convertView;
    }

}