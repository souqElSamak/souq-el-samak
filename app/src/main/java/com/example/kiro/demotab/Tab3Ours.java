package com.example.kiro.demotab;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kiro on 4/10/18.
 */

public class Tab3Ours extends Fragment {

    String[] name={"Mango","Banana","watermelon","Grapes","kiwi","Apple"};
    String[] status={"this","is","mango","This","is","grapes"};
    Integer[] imgid={R.drawable.mango,R.drawable.banana,R.drawable.water,R.drawable.grapes,R.drawable.kiwi,R.drawable.apple};
    String[] contact={"a","b","c","d","e","f"};
    List<RowItem> rowItems;
    ListView mylistview;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3ours, container,false);
/*//shaghalin
        mylistview = (ListView) rootView.findViewById(R.id.listview3);
        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,name);
        mylistview.setAdapter(adapter);
*/

        CustomListAdapter adapter=new CustomListAdapter(getActivity(), name, imgid);
        Log.d("creation",adapter.getItem(1));
        mylistview=(ListView) rootView.findViewById(R.id.listview3);
        mylistview.setAdapter(adapter);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= name[+position];
                Toast.makeText(getContext(), Slecteditem, Toast.LENGTH_SHORT).show();

            }
        });
        return rootView;
    }
}