package com.dyhdyh.helper.itemtouch.example;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author dengyuhan
 * created 2018/11/26 17:27
 */
public class SlideViewPager extends ViewPager {
    private boolean isSlideEnabled;

    public SlideViewPager(Context context) {
        super(context);
    }

    public SlideViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setSlideEnabled(boolean slideEnabled) {
        isSlideEnabled = slideEnabled;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return isSlideEnabled;
    }
}
