package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class EventsAdapter extends BaseAdapter {

    private ArrayList<Integer> eventList;
    private Context context;
    private LayoutInflater inflater;

    public EventsAdapter(Context context, ArrayList<Integer> eventList){
        this.context = context;
        this.eventList = eventList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return eventList.size();
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

        convertView = inflater.inflate(R.layout.event_r, parent, false);


        Integer event = eventList.get(position);

        ImageView ivEventPicture = convertView.findViewById(R.id.ivEventPicture);
        ivEventPicture.setImageResource(event);



        return convertView;
    }

}