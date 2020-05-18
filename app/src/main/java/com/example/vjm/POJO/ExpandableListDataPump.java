package com.example.vjm.POJO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData(){
        HashMap<String,List<String>> expandedListData = new HashMap<String, List<String>>();

        List<String> BCA = new ArrayList<String>();
        BCA.add("SEM-1");
        BCA.add("BCA-SUB-1");
        BCA.add("BCA-SUB-2");
        BCA.add("BCA-SUB-3");
        BCA.add("BCA-SUB-4");
        BCA.add("BCA-SUB-5");
        List<String> MCA = new ArrayList<String>();
        MCA.add("SEM-1");
        MCA.add("MCA-SUB-1");
        MCA.add("MCA-SUB-2");
        MCA.add("MCA-SUB-3");
        MCA.add("MCA-SUB-4");
        MCA.add("MCA-SUB-5");

        expandedListData.put("BCA",BCA);
        expandedListData.put("MCA",MCA);

        return  expandedListData;
    }

}
