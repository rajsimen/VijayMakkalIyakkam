package ccorp.mobile.vijaymakkaliyakkam.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chabbal.slidingdotsplash.SlidingSplashView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ccorp.mobile.vijaymakkaliyakkam.R;

/**
 * Created by JMI Guest on 6/22/2017.
 */

public class HomeFragment extends Fragment implements ViewPager.OnPageChangeListener {

    Context mContext;
    TextView home1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container,
                false);
        getWidget(view);

        return view;
    }

    protected void getWidget(View view){
        SlidingSplashView splashView  = (SlidingSplashView) view.findViewById(R.id.splash);
        splashView.addOnPageChangeListener(this);
        home1=(TextView)view.findViewById(R.id.textView1);


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Log.d("OnPageScrolled", String.valueOf(position));
    }

    @Override
    public void onPageSelected(int position) {
        Log.d("OnPageSelected", String.valueOf(position));

    }

    @Override
    public void onPageScrollStateChanged(int state) {
        Log.d("PageScrollStateChanged", String.valueOf(state));

    }
}
