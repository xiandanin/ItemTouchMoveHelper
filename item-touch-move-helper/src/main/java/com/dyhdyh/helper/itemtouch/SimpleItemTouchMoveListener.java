package com.dyhdyh.helper.itemtouch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/**
 * 简单的滑动触摸监听
 *
 * @author dengyuhan
 *         created 2018/4/8 14:22
 */
public class SimpleItemTouchMoveListener extends RecyclerView.SimpleOnItemTouchListener implements OnItemTouchMoveListener {
    private ItemTouchMoveHelper mItemTouchMoveHelper;

    public SimpleItemTouchMoveListener(Context context) {
        mItemTouchMoveHelper = new ItemTouchMoveHelper(context);
        mItemTouchMoveHelper.setOnItemTouchMoveListener(this);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return mItemTouchMoveHelper.onInterceptTouchEvent(rv, e);
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        mItemTouchMoveHelper.onTouchEvent(rv, e);
    }

    @Override
    public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {

    }
}
