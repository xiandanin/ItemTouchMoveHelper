package com.dyhdyh.helper.itemtouch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/**
 * @author dengyuhan
 *         created 2018/4/8 14:22
 */
public class SimpleOnItemTouchMoveListener extends RecyclerView.SimpleOnItemTouchListener {
    private ItemTouchMoveHelper mItemTouchMoveHelper;

    public SimpleOnItemTouchMoveListener(Context context,OnItemTouchMoveListener listener) {
        mItemTouchMoveHelper = new ItemTouchMoveHelper(context);
        mItemTouchMoveHelper.setOnItemTouchMoveListener(listener);
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        return mItemTouchMoveHelper.onInterceptTouchEvent(rv, e);
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        mItemTouchMoveHelper.onTouchEvent(rv, e);
    }

}
