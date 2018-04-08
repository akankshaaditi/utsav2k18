package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 17-03-2018.
 */

public class PhotographyAdapter extends BaseAdapter {//

    private ArrayList<Photography> photographyList;//
    private Context context;
    private LayoutInflater inflater;

    public PhotographyAdapter(Context context, ArrayList<Photography> photographyList){//
        this.context = context;
        this.photographyList = photographyList;//
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return photographyList.size();
    }//

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

        convertView = inflater.inflate(R.layout.photography_r, parent, false);

        TextView tvPhotography = convertView.findViewById(R.id.tvPhotography);//

        Photography photography = photographyList.get(position);//

        tvPhotography.setText(photography.getPhotographyName());//

        return convertView;
    }

}