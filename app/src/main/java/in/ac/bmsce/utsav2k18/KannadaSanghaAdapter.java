package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class KannadaSanghaAdapter extends BaseAdapter {//

    private ArrayList<KannadaSangha> kannadasanghaList;//
    private Context context;
    private LayoutInflater inflater;

    public KannadaSanghaAdapter(Context context, ArrayList<KannadaSangha> kannadasanghaList){//
        this.context = context;
        this.kannadasanghaList = kannadasanghaList;//
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return kannadasanghaList.size();
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

        convertView = inflater.inflate(R.layout.kannada_sangha_r, parent, false);

        TextView tvkannadaSangha = convertView.findViewById(R.id.tvKannadaSangha);//

        KannadaSangha kannadaSangha = kannadasanghaList.get(position);//

        tvkannadaSangha.setText(kannadaSangha.getkannadaSanghaName());//

        return convertView;
    }


}
