package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class CarFragment extends Fragment {

    private  View view;
    Button textView4,button;
    EditText editextdetails;
    private static final String NUMBER_OF_RECEIVER_NEXT = "nextPage";
    Context context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_car, container, false);
        context = getActivity();
        textView4 = view.findViewById(R.id.textView4);
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("position");
                intent.putExtra("value","2");
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);

            }
        }); textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("position");
                intent.putExtra("value","4");
                LocalBroadcastManager.getInstance(context).sendBroadcast(intent);

            }
        });
        return view;
    }
}