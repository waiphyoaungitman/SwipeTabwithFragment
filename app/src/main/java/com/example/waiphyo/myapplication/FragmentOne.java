package com.example.waiphyo.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    TextView textView;
    Button button;
    ListView listView;
    ArrayList<String> arrayList;
    int i=0;
    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragmentone,container,false);
       textView = v.findViewById(R.id.frag1txt);
       button = v.findViewById(R.id.frag1btn);
       listView = v.findViewById(R.id.listview);
       arrayList = new ArrayList<>();
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               i++;
               textView.setText(i + "");
               arrayList.add("Hello");
               ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getContext(),android.R.layout.simple_list_item_1,arrayList);
               listView.setAdapter(arrayAdapter);
           }
       });
        return v;
    }

}
