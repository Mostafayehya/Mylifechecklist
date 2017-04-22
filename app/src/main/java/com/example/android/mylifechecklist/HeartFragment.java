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
public class HeartFragment extends Fragment {


    public HeartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.todo_list, container, false);
        ArrayList<CheckBox> heartToDos = new ArrayList<>();

        CheckBox toDo = new CheckBox(getActivity());
        toDo.setText(R.string.first_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.second_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.third_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.fourth_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.fifth_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.sixth_heart);
        heartToDos.add(toDo);


        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.sixth_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.seventh_heart);
        heartToDos.add(toDo);

        toDo = new CheckBox(getActivity());
        toDo.setText(R.string.eighth_heart);
        heartToDos.add(toDo);


        TodoAdapter toDoAdapter = new TodoAdapter(getActivity(), heartToDos);

        ListView todoList = (ListView) rootView.findViewById(R.id.todo_listview);
        todoList.setAdapter(toDoAdapter);
        return rootView;
    }

}
