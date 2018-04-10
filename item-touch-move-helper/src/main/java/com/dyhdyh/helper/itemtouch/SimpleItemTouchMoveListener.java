package com.dyhdyh.helper.itemtouch;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

/**
 * 普通的滑动触摸监听
 *
 * @author dengyuhan
 *         created 2018/4/8 14:22
 */
public abstract class SimpleItemTouchMoveListener extends RecyclerView.SimpleOnItemTouchListener implements OnItemTouchMoveListener {
    private ItemTouchMoveHelper mItemTouchMoveHelper;

    public SimpleItemTouchMoveListener() {
        mItemTouchMoveHelper = new ItemTouchMoveHelper();
        mItemTouchMoveHelper.setOnItemTouchMoveListener(this);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        mItemTouchMoveHelper.setInterceptEnable(onInterceptEnable());
        if (mItemTouchMoveHelper.onTouchEvent(rv, e)) {
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        mItemTouchMoveHelper.setInterceptEnable(onInterceptEnable());
        mItemTouchMoveHelper.onTouchEvent(rv, e);
    }

    @Override
    public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {

    }

    public abstract boolean onInterceptEnable();
}
