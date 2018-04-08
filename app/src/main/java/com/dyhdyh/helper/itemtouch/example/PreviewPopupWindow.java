package com.dyhdyh.helper.itemtouch.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.bumptech.glide.Glide;

/**
 * @author dengyuhan
 *         created 2018/4/8 15:33
 */
public class PreviewPopupWindow extends PopupWindow {
    private String mFileUrl;
    private int mItemPosition;

    private ImageView iv;

    public PreviewPopupWindow(Context context) {
        super(LayoutInflater.from(context).inflate(R.layout.popup_preview, null), context.getResources().getDimensionPixelSize(R.dimen.size_preview), context.getResources().getDimensionPixelSize(R.dimen.size_preview));
        iv = getContentView().findViewById(R.id.iv_preview);
    }

    public void setFileUrl(String fileUrl) {
        this.mFileUrl = fileUrl;
    }

    public void setItemPosition(int itemPosition) {
        this.mItemPosition = itemPosition;
    }

    @Override
    public void showAsDropDown(View anchor, int xoff, int yoff) {
        super.showAsDropDown(anchor, xoff, yoff);
        Glide.with(anchor.getContext())
                .load(mFileUrl)
                .into(iv);
    }


    public String getFileUrl() {
        return mFileUrl;
    }

    public int getItemPosition() {
        return mItemPosition;
    }
}
