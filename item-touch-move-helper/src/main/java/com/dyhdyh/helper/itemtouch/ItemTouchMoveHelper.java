package com.dyhdyh.helper.itemtouch;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * 滑动触摸辅助
 * @author dengyuhan
 *         created 2018/4/8 14:24
 */
public class ItemTouchMoveHelper {
    private boolean mItemTouchMoveEnable;

    private GestureDetector mGestureDetector;
    private OnItemTouchMoveListener mOnItemTouchMoveListener;

    private int mLastPosition = -1;

    public ItemTouchMoveHelper(Context context) {
        mGestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(MotionEvent e) {
                //长按触发开启
                mItemTouchMoveEnable = true;
            }
        });
    }

    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        return mItemTouchMoveEnable;
    }

    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
        View childView = rv.findChildViewUnder(e.getX(), e.getY());
        if (childView == null) {
            return;
        }

        int childPosition = rv.getChildLayoutPosition(childView);
        if (childPosition < 0) {
            return;
        }

        if (e.getAction() == MotionEvent.ACTION_DOWN || e.getAction() == MotionEvent.ACTION_MOVE) {
            //判断位置 防止多次回调
            if (mOnItemTouchMoveListener != null && mLastPosition != childPosition) {
                mOnItemTouchMoveListener.onItemTouchMove(childView, childPosition, e);
            }
            this.mLastPosition = childPosition;
        } else if (e.getAction() == MotionEvent.ACTION_UP) {
            mItemTouchMoveEnable = false;
            //抬起时还原
            if (mOnItemTouchMoveListener != null) {
                mOnItemTouchMoveListener.onItemTouchMove(childView, childPosition, e);
            }
            this.mLastPosition = -1;
        }
    }

    public void setOnItemTouchMoveListener(OnItemTouchMoveListener listener) {
        this.mOnItemTouchMoveListener = listener;
    }

    /**
     * 是否在触摸
     *
     * @param event
     * @return
     */
    public static boolean isActionTouch(MotionEvent event) {
        return event.getAction() == MotionEvent.ACTION_DOWN || event.getAction() == MotionEvent.ACTION_MOVE;
    }

    /**
     * 是否触摸结束
     *
     * @param event
     * @return
     */
    public static boolean isActionEnd(MotionEvent event) {
        return event.getAction() == MotionEvent.ACTION_UP;
    }

}
