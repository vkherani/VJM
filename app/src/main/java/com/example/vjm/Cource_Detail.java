package com.example.vjm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.vjm.Adapter.ExpandedListAdapter;
import com.example.vjm.POJO.ExpandableListDataPump;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cource_Detail extends AppCompatActivity {

    ExpandableListView expandableListView;
    HashMap<String, List<String>> expandableListDetail;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cource__detail);
        expandableListView = findViewById(R.id.expandableListView);
        expandableListDetail = ExpandableListDataPump.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new ExpandedListAdapter(this,expandableListTitle,expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);

//        Toast.makeText(this, ""+expandableListTitle.get(0), Toast.LENGTH_SHORT).show();
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {

            }
        });

    }
}
