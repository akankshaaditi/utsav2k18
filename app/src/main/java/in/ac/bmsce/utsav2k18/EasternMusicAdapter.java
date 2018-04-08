package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class EasternMusicAdapter extends BaseAdapter {

    private ArrayList<EasternMusic> easternMusicList;
    private Context context;
    private LayoutInflater inflater;

    public EasternMusicAdapter(Context context, ArrayList<EasternMusic> easternMusicList){
        this.context = context;
        this.easternMusicList = easternMusicList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return easternMusicList.size();
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

        convertView = inflater.inflate(R.layout.eastern_music_r, parent, false);

        TextView tvEasternMusic = convertView.findViewById(R.id.tvEasternMusic);

        EasternMusic easternMusic = easternMusicList.get(position);

        tvEasternMusic.setText(easternMusic.getEasternMusicName());

        return convertView;
    }
}