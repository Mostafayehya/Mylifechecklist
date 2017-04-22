package com.example.android.mylifechecklist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;

import java.util.ArrayList;

/**
 * Created by mostafayehya on 20/04/17.
 */

public class TodoAdapter extends ArrayAdapter<CheckBox> {

    public TodoAdapter(Context context, ArrayList<CheckBox> items) {

        super(context, 0, items);
    }


    @Override
    public View getView(int position,  View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            //notice the difference between inflating the xml file in
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the first item of the todolist
        CheckBox currentCheckBox = getItem(position);
        //referencing the checkBox in the xml file
        CheckBox checkBoxView  = (CheckBox) listItemView.findViewById(R.id.checkbox_view);

        checkBoxView.setText(currentCheckBox.getText());
        //
        return listItemView;
    }
}
