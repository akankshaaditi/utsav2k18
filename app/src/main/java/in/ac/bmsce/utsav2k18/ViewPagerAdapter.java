package in.ac.bmsce.utsav2k18;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by jyothiramesh on 18-Mar-18.
 */

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] imagees = {R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.d};

    public ViewPagerAdapter(Context context) {

        this.context = context;
    }

    @Override
    public int getCount() {
        return imagees.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

         View view = layoutInflater.inflate(R.layout.containt_plane,null);
        ImageView imageView = view.findViewById(R.id.ivImage);
        //imageView.setImageResource(imagees[position]);

        imageView.setImageBitmap(ImageSmoothener.decodeSampledBitmapFromResource(context.getResources(),imagees[position],200,200));
        ViewPager vp =(ViewPager) container;

        vp.addView(view,0);
        return  view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {


        ViewPager vp = (ViewPager) container;
        View view = (View)  object;
        vp.removeView(view);

    }
}
