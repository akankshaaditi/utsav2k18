package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FineArtsAdapter extends BaseAdapter {

    private ArrayList<FineArts> fineArtsList;
    private Context context;
    private LayoutInflater inflater;

    public FineArtsAdapter(Context context, ArrayList<FineArts> fineArtsList){
        this.context = context;
        this.fineArtsList = fineArtsList;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return fineArtsList.size();
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

        convertView = inflater.inflate(R.layout.fine_arts_r, parent, false);

        TextView tvFineArts = convertView.findViewById(R.id.tvFineArts);

        FineArts fineArts = fineArtsList.get(position);

        tvFineArts.setText(fineArts.getFineArtsName());

        return convertView;
    }

}