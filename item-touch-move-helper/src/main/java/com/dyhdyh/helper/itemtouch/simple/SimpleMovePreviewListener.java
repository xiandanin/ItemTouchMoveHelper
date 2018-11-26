package com.dyhdyh.helper.itemtouch.simple;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.dyhdyh.helper.itemtouch.ItemTouchMoveHelper;
import com.dyhdyh.helper.itemtouch.SimpleItemTouchMoveListener;

/**
 * 简单的滑动预览监听
 *
 * @author dengyuhan
 *         created 2018/4/9 09:20
 */
public class SimpleMovePreviewListener extends SimpleItemTouchMoveListener {
    private int mLastPosition = -1;
    private boolean mPreviewEnable;//开启预览
    private GestureDetectorCompat mGestureDetector;
    private OnMovePreviewListener mOnMovePreviewListener;

    public SimpleMovePreviewListener(RecyclerView rv, OnMovePreviewListener listener) {
        this.mOnMovePreviewListener = listener;
        this.mGestureDetector = new GestureDetectorCompat(rv.getContext(), new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(MotionEvent e) {
                //长按开启预览
                mPreviewEnable = true;
                onTouchEvent(rv, e);
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        mGestureDetector.onTouchEvent(e);
        return super.onInterceptTouchEvent(rv, e);
    }

    @Override
    public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {
        if (ItemTouchMoveHelper.isActionTouch(event)) {
            //如果在触摸点在View上
            if (isTouchChild) {
                //判断位置 防止多次回调
                if (mLastPosition != childPosition) {
                    mLastPosition = childPosition;
                    if (mOnMovePreviewListener != null) {
                        mOnMovePreviewListener.onPreview(childView, childPosition);
                    }
                }
            }
        } else {
            //手指抬起时取消
            mLastPosition = -1;
            mPreviewEnable = false;
            if (mOnMovePreviewListener != null) {
                mOnMovePreviewListener.onCancelPreview();
            }
        }
    }

    @Override
    public boolean onInterceptEnable() {
        return mPreviewEnable;
    }
}
