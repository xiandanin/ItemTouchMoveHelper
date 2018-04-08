package com.dyhdyh.helper.itemtouch;

import android.view.MotionEvent;
import android.view.View;

/**
 * @author dengyuhan
 *         created 2018/4/8 14:29
 */
public interface OnItemTouchMoveListener {

    void onItemTouchMove(View childView, int childPosition, MotionEvent event);
}
