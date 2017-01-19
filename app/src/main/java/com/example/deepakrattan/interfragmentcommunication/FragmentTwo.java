package com.example.deepakrattan.interfragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Deepak Rattan on 25-Dec-16.
 */

public class FragmentTwo extends Fragment {

    TextView txtClick;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two_layout, container, false);
        txtClick = (TextView) view.findViewById(R.id.txtClick);
        return view;
    }

    public void changeData(String data) {
        txtClick.setText(data);
    }


}
