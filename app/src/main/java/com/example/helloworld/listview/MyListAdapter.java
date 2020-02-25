package com.example.helloworld.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.helloworld.R;

/**
 *
 */

public class MyListAdapter extends BaseAdapter {

    private Context mContext;
    private LayoutInflater mLayoutInfater;

    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayoutInfater = LayoutInflater.from(context);
    }

    //返回列表长度
    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        ImageView imageView;
        TextView tvTitle,tvTime,tvContent;
    }

    //给ListView的每一item设置视图
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            //实列化一个view
            convertView = mLayoutInfater.inflate(R.layout.layout_list_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_context);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        //给控件赋值
        holder.tvTitle.setText("标题");
        holder.tvTime.setText("这是时间 ");
        holder.tvContent.setText("这是内容");
        Glide.with(mContext).load("https://static.oschina.net/uploads/space/2016/1214/143430_DHyz_2903254.jpg").into(holder.imageView);
        return convertView;
    }
}
