package com.kevinging.sunshine;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class DetailActivityFragment extends Fragment {

    public DetailActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Intent x = getActivity().getIntent();
        String z = x.getStringExtra(Intent.EXTRA_TEXT);


        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView detail = (TextView) rootView.findViewById(R.id.detail_text_view);
        detail.setText(z);

        return rootView;
    }
}
