package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FashionAdapter extends BaseAdapter {

    private ArrayList<Fashion> fashionList;
    private Context context;
    private LayoutInflater inflater;

    public FashionAdapter(Context context, ArrayList<Fashion> fashionList){
        this.context = context;
        this.fashionList = fashionList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return fashionList.size();
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

        convertView = inflater.inflate(R.layout.fashion_r, parent, false);

        TextView tvFashion = convertView.findViewById(R.id.tvFashion);

        Fashion fashion = fashionList.get(position);

        tvFashion.setText(fashion.getFashionName());

        return convertView;
    }

}