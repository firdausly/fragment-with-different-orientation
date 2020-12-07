package com.example.fragmentexample;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class DetailsActivity extends FragmentActivity {


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            //if the screen is in landscape mode, we can show the dialog in-line with the list
            //so we dont need this activity
            finish();
            return;
        }

        if(savedInstanceState==null){
            //During initial setup, plug in the DetailsFragment
            DetailsFragment details=new DetailsFragment();
            details.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(android.R.id.content,details).commit();
        }
    }
}
