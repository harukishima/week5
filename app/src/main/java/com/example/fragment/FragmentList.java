package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class FragmentList extends Fragment {
    Student[] students = {new Student("Nguyen Van A", "1231", "8", 10, R.drawable.avatar_female),
            new Student("Nguyen Van B", "12311", "9", 8, R.drawable.avatar_female)};
    ListView list;
    TextView txtMs;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_list, container, false);
        list = (ListView) view.findViewById(R.id.list_item);
        txtMs = (TextView) view.findViewById(R.id.txtMaSo);

        CustomIconLabel adapter = new CustomIconLabel(getActivity(), R.layout.custom_row_icon_label, students);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txtMs.setText("Ma so: " + students[position].id);
                Bundle bundle = new Bundle();
                bundle.putString("name: ", students[position].name);
                bundle.putString("id: ", students[position].id);
                bundle.putString("grade: ", students[position].grade);

                FragmentList a = new FragmentList();
                a = (FragmentList) getFragmentManager().findFragmentByTag("LIST");
                a.setArguments(bundle);
            }
        });


        return view;
    }


}
