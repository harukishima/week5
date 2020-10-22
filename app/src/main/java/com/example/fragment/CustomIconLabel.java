package com.example.fragment;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomIconLabel extends ArrayAdapter<Student> {
    Context context; Student[] a;
    public CustomIconLabel(@NonNull Context context, int resource, Student[] a) {
        super(context, resource, a);
        this.context = context;
        this.a = a;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.custom_row_icon_label, null);
        TextView item_name = (TextView) row.findViewById(android.R.id.text1);
        ImageView icon = (ImageView) row.findViewById(android.R.id.icon);
        item_name.setText(a[position].id);
        icon.setImageResource(a[position].thumbnail);
        return (row);
    }
}
