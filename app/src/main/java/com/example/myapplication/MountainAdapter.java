package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MountainAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<String> arrayMountain;

    private ViewHolder mViewHolder;

    public MountainAdapter(Context mContext, ArrayList<String> arrayMountain) {
        this.mContext = mContext;
        this.arrayMountain = arrayMountain;
    }

    @Override
    public int getCount() {
        return arrayMountain.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayMountain.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    // ViewHolder패턴
        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.layout_mountain_item, parent, false);
            mViewHolder = new ViewHolder(convertView);
            convertView.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        mViewHolder.txt_name.setText(arrayMountain.get(position));

        return convertView;

    }

    public class ViewHolder {
        private TextView txt_name;

        public ViewHolder(View convertView) {
            txt_name = (TextView) convertView.findViewById(R.id.txt_name);
        }
    }
}
