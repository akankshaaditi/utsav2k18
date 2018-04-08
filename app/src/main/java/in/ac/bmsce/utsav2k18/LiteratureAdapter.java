package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class LiteratureAdapter extends BaseAdapter {

    private ArrayList<Literature> literatureList;
    private Context context;
    private LayoutInflater inflater;

    public LiteratureAdapter(Context context, ArrayList<Literature> literatureList){
        this.context = context;
        this.literatureList = literatureList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return literatureList.size();
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

        convertView = inflater.inflate(R.layout.literature_r, parent, false);

        TextView tvLiterature = convertView.findViewById(R.id.tvLiterature);

        Literature literature = literatureList.get(position);

        tvLiterature.setText(literature.getLiteratureName());

        return convertView;
    }

}