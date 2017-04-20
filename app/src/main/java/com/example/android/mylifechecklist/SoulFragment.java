package com.example.android.mylifechecklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SoulFragment extends Fragment {


    public SoulFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<CheckBox> souldToDos = new ArrayList<>();
        souldToDos.add(new CustomCheckBox(getActivity(), R.string.first_soul));

        return container;
    }

}
