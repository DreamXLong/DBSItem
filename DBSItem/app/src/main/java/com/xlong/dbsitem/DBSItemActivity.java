package com.xlong.dbsitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;

import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainImage;
import com.xlong.dbsitem.DBSItemViewParameter.DBSItemStyleSheetMainTitle;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;

public class DBSItemActivity extends AppCompatActivity {

    private DBSItemAdapter adapter;
    private ListView listView;
    private DBSItemStyleSheet styleSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbsitem);
        final List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        listView = (ListView) findViewById(R.id.listview);
        styleSheet = new DBSItemStyleSheet();
        styleSheet.getStyleSheetMainTitle().setListText(list);
        adapter = new DBSItemAdapter<String>(this, list, DBSItemViewHolder.DBSItemTypeSetting, styleSheet);
        listView.setAdapter(adapter);
    }
}
