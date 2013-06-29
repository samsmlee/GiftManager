package com.samsmlee.giftmanager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sam on 6/29/13.
 * Fragment for displaying gifts
 */
public class GiftFragment extends Fragment {
    public GiftFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);






    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View rootView = inflater.inflate(R.layout.fragment_gift, container, false);
        TextView dummyTextView = (TextView) rootView.findViewById(R.id.gift_text);
        if(dummyTextView != null)
            dummyTextView.setText("HELLO WORLD");
        return rootView;
    }
}
