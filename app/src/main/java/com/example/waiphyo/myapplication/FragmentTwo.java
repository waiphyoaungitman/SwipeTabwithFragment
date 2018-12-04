package com.example.waiphyo.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    ProgressBar progressBar;
    TextView textView;
    int i =0;
    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two,container,false);
        progressBar = v.findViewById(R.id.progressBar);
        textView = v.findViewById(R.id.texttwo);
        progressBar.setMax(100);
        Thread thread = new Thread(new Progres());
        thread.start();
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onPause() {
        Toast.makeText(getContext(),"Pause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    class Progres implements Runnable{

        @Override
        public void run() {
            while(true){
             i++;
             progressBar.setProgress(i);
             textView.setText(i + "");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
