package com.example.deepakrattan.interfragmentcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Deepak Rattan on 25-Dec-16.
 */

public class FragmentOne extends Fragment {
    Communicator communicator;
    Button btnClickMe;
    int counter = 0;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one_layout, container, false);
        btnClickMe = (Button) view.findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                communicator = (Communicator) getActivity();
                counter++;
                communicator.respond(" Button was clicked " + counter + " number of times");
            }
        });
        return view;
    }


}
