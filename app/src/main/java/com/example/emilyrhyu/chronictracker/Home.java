package com.example.emilyrhyu.chronictracker;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Home extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        Button buttonClick = rootView.findViewById(R.id.yo);


        buttonClick.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // if play name already exists
                AlertDialog.Builder dialog = new AlertDialog.Builder(getActivity());
                dialog.setCancelable(false);
                dialog.setMessage("Player Name Already Exists. Please Find a New Name.");
                dialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // BUILDS A NEW SLEEP - ADD IT TO THE SLEEP DATA LIST
                        Sleep test = new Sleep(true);
                        ((Main) getActivity()).setSleepEntry(test);
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
