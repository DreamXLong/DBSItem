package com.xlong.dbsitem;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by SLP on 2017/4/11.
 */

public class DBSItemAdapter<T> extends BaseAdapter {
    protected Context context;
    protected LayoutInflater mInflater;
    protected List<T> mDatas;
    protected int mItemLayoutId;
    private DBSItemStyleSheet styleSheet;
    private convertInterface convertInterface;

    public DBSItemAdapter(Context context, List<T> mDatas, int mItemLayoutId, DBSItemStyleSheet styleSheet) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.mDatas = mDatas;
        this.mItemLayoutId = mItemLayoutId;
        this.styleSheet = styleSheet;
    }

    public DBSItemAdapter(Context context, int mItemLayoutId, DBSItemStyleSheet styleSheet) {
        this.context = context;
        this.mInflater = LayoutInflater.from(context);
        this.mItemLayoutId = mItemLayoutId;
        this.styleSheet = styleSheet;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public T getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final DBSItemViewHolder viewHolder = getViewHolder(position, convertView, parent);
        if (convertInterface != null) {
            convertInterface.convert(viewHolder, getItem(position));
        }
        return viewHolder.runSwitchLayout(mItemLayoutId, styleSheet);
    }

    public interface convertInterface<T> {
        void convert(DBSItemViewHolder helper, T item);
    }

    public void setConvertInterface(convertInterface convertInterface) {
        this.convertInterface = convertInterface;
    }

    private DBSItemViewHolder getViewHolder(int position, View convertView, ViewGroup parent) {
        return DBSItemViewHolder.get(context, convertView, parent, mItemLayoutId, position);
    }
}
