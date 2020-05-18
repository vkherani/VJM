package com.example.vjm.Adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.vjm.R;

import java.util.HashMap;
import java.util.List;

public class ExpandedListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> expandedListTitle;
    private HashMap<String,List<String>> expandableListDetail;

    public ExpandedListAdapter(Context context, List<String> expandedListTitle, HashMap<String, List<String>> expandableListDetail) {
        this.context = context;
        this.expandedListTitle = expandedListTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public int getGroupCount() {
        return this.expandedListTitle.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return this.expandableListDetail.get(this.expandedListTitle.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return this.expandedListTitle.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return this.expandableListDetail.get(this.expandedListTitle.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String listTitle = (String) getGroup(groupPosition);
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expanded_list_group,null);
        }

        TextView listItemTextView = (TextView) convertView.findViewById(R.id.listTitle);
        listItemTextView.setTypeface(null, Typeface.BOLD);
        listItemTextView.setText(listTitle);

        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        final String expandedListText = (String) getChild(groupPosition,childPosition);

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.expanded_list_item,null);
        }

        TextView expandedListTextView = (TextView) convertView.findViewById(R.id.expandedListItem);

        if(expandedListText.contains("SEM")){
           expandedListTextView.setTypeface(null,Typeface.BOLD);
        }

        expandedListTextView.setText(expandedListText);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
