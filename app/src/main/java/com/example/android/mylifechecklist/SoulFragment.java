package com.example.android.mylifechecklist;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ListView;

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
        View rootView = inflater.inflate(R.layout.todo_list, container, false);
        ArrayList<CheckBox> soulToDos = new ArrayList<>();
        CheckBox toDo = new CheckBox(getActivity());
        toDo.setText(R.string.first_soul);
        soulToDos.add(toDo);

        toDo.setText(R.string.second_soul);
        soulToDos.add(toDo);
//        soulToDos.add(R.string.fifth_soul);
//        soulToDos.add(R.string.third_soul);
//        soulToDos.add(R.string.fourth_soul);
        TodoAdapter toDoAdapter = new TodoAdapter(getActivity(), soulToDos);

        ListView todoList = (ListView) rootView.findViewById(R.id.todo_listview);
        todoList.setAdapter(toDoAdapter);
        return rootView;
    }

}
