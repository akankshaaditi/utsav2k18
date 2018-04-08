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

public class EDCAdapter extends BaseAdapter {//

    private ArrayList<EDC> edcList;//
    private Context context;
    private LayoutInflater inflater;

    public EDCAdapter(Context context, ArrayList<EDC> edcList){//
        this.context = context;
        this.edcList = edcList;//
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return edcList.size();
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

        convertView = inflater.inflate(R.layout.edc_r, parent, false);

        TextView tvEDC = convertView.findViewById(R.id.tvEDC);//

        EDC dance = edcList.get(position);//

        tvEDC.setText(dance.getEDCName());//

        return convertView;
    }
    
}
