package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TheatreAdapter extends BaseAdapter {

    private ArrayList<Theatre> theatreList;
    private Context context;
    private LayoutInflater inflater;

    public TheatreAdapter(Context context, ArrayList<Theatre> theatreList){
        this.context = context;
        this.theatreList = theatreList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return theatreList.size();
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

        convertView = inflater.inflate(R.layout.theatre_r, parent, false);

        TextView tvTheatre = convertView.findViewById(R.id.tvTheatre);

        Theatre theatre = theatreList.get(position);

        tvTheatre.setText(theatre.getTheatreName());

        return convertView;
    }

}
