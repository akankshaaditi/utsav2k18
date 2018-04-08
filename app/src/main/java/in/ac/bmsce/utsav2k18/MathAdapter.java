package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.lang.*;
import java.util.ArrayList;

public class MathAdapter extends BaseAdapter {//

    private ArrayList<Math> mathList;//
    private Context context;
    private LayoutInflater inflater;

    public MathAdapter(Context context, ArrayList<Math> mathList){//
        this.context = context;
        this.mathList = mathList;//
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mathList.size();
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

        convertView = inflater.inflate(R.layout.math_r, parent, false);

        TextView tvMath = convertView.findViewById(R.id.tvMath);//

        Math math = mathList.get(position);//

        tvMath.setText(math.getMathName());//

        return convertView;
    }

}
