package com.dyhdyh.helper.itemtouch.simple;

import android.content.Context;
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
    private OnMovePreviewListener mOnMovePreviewListener;

    public SimpleMovePreviewListener(Context context, OnMovePreviewListener listener) {
        super(context);
        this.mOnMovePreviewListener = listener;
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
            if (mOnMovePreviewListener != null) {
                mOnMovePreviewListener.onCancelPreview();
            }
        }
    }
}
