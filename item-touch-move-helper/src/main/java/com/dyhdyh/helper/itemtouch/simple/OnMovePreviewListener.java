package com.dyhdyh.helper.itemtouch.simple;

import android.view.View;

/**
 * @author dengyuhan
 *         created 2018/4/9 09:23
 */
public interface OnMovePreviewListener {

    void onPreview(View childView, int childPosition);

    void onCancelPreview();
}
