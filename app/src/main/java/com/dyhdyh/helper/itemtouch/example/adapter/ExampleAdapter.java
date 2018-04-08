package com.dyhdyh.helper.itemtouch.example.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dyhdyh.helper.itemtouch.example.R;
import com.dyhdyh.helper.itemtouch.example.exampledata.ExampleData;

import java.util.List;

/**
 * @author dengyuhan
 *         created 2018/3/21 19:16
 */
public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ItemHolder> {
    private List<ExampleData> mData;

    public ExampleAdapter(List<ExampleData> data) {
        this.mData = data;
    }


    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_example, parent, false));
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        final ExampleData item = mData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(item.getCover())
                .into(holder.iv);

    }

    public ExampleData getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ItemHolder extends RecyclerView.ViewHolder {
        ImageView iv;

        public ItemHolder(View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.iv_example);
        }
    }
}
