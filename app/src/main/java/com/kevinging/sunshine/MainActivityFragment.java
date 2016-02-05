package com.kevinging.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        List<String> forecast= new ArrayList<>();
        forecast.add("Today - Sunny - 88/63");
        forecast.add("Tomorrow - Foggy - 70/46");
        forecast.add("Weds - Cloudy - 72/63");
        forecast.add("Thurs - Rainy - 64/51");
        forecast.add("Fri - Cloudy - 70/46");
        forecast.add("Sat - Sunny - 76/68");

        return rootView;

    }
}
