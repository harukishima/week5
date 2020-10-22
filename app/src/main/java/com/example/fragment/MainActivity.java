package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {
    FragmentList fragmentList;
    FragmentDetail fragmentDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentList = new FragmentList();
        fragmentDetail = new FragmentDetail();
        fragmentTransaction.replace(R.id.main_holder_list, fragmentList, "LIST");
        //fragmentTransaction.replace(R.id.main_holder_detail, fragmentDetail);
        fragmentTransaction.commit();
    }

}