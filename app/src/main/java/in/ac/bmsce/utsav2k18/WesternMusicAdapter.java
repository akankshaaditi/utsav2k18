package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class WesternMusicAdapter extends BaseAdapter {

    private ArrayList<WesternMusic> westernMusicList;
    private Context context;
    private LayoutInflater inflater;

    public WesternMusicAdapter(Context context, ArrayList<WesternMusic> westernMusicList){
        this.context = context;
        this.westernMusicList = westernMusicList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return westernMusicList.size();
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

        convertView = inflater.inflate(R.layout.western_music_r, parent, false);

        TextView tvWesternMusic = convertView.findViewById(R.id.tvWesternMusic);

        WesternMusic westernMusic = westernMusicList.get(position);

        tvWesternMusic.setText(westernMusic.getWesternMusicName());

        return convertView;
    }

}