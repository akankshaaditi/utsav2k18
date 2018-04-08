package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class InformalAdapter extends BaseAdapter {

    private ArrayList<Informal> informalList;
    private Context context;
    private LayoutInflater inflater;

    public InformalAdapter(Context context, ArrayList<Informal> informalList){
        this.context = context;
        this.informalList = informalList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return informalList.size();
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

        convertView = inflater.inflate(R.layout.informal_r, parent, false);

        TextView tvInformal = convertView.findViewById(R.id.tvInformal);

        Informal informal = informalList.get(position);

        tvInformal.setText(informal.getInformalName());

        return convertView;
    }

}