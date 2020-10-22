package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.awt.font.TextAttribute;

public class FragmentDetail extends Fragment {
    TextView txtId;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        txtId = (TextView) view.findViewById(R.id.txtId);
        Bundle bundle = getArguments();
        txtId.setText(bundle.getString("id: ").toString());

        return view;
    }
}
