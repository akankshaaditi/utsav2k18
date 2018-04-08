package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class GameAdapter extends BaseAdapter {

    private ArrayList<Game> gameList;
    private Context context;
    private LayoutInflater inflater;

    public GameAdapter(Context context, ArrayList<Game> gameList){
        this.context = context;
        this.gameList = gameList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return gameList.size();
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

        convertView = inflater.inflate(R.layout.game_r, parent, false);

        TextView tvGame = convertView.findViewById(R.id.tvGame);

        Game game = gameList.get(position);

        tvGame.setText(game.getGameName());

        return convertView;
    }

}