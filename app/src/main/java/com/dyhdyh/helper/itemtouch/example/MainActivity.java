package com.dyhdyh.helper.itemtouch.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;

import com.dyhdyh.helper.itemtouch.ItemTouchMoveHelper;
import com.dyhdyh.helper.itemtouch.OnItemTouchMoveListener;
import com.dyhdyh.helper.itemtouch.SimpleOnItemTouchMoveListener;
import com.dyhdyh.helper.itemtouch.example.adapter.ExampleAdapter;
import com.dyhdyh.helper.itemtouch.example.exampledata.ExampleData;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    private PreviewPopupWindow mPreviewWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPreviewWindow = new PreviewPopupWindow(this);

        rv = findViewById(R.id.rv);
        final ExampleAdapter adapter = new ExampleAdapter(ExampleData.create());
        rv.setLayoutManager(new GridLayoutManager(this, 4));
        rv.setAdapter(adapter);

        rv.addOnItemTouchListener(new SimpleOnItemTouchMoveListener(this, new OnItemTouchMoveListener() {
            @Override
            public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {
                if (isTouchChild && ItemTouchMoveHelper.isActionTouch(event)) {
                    //MotionEvent.ACTION_DOWN MotionEvent.ACTION_MOVE会进入
                    final ExampleData item = adapter.getItem(childPosition);
                    mPreviewWindow.setFileUrl(item.getFile());
                    showAsItemViewAbove(childView);
                } else {
                    //MotionEvent.ACTION_UP
                    mPreviewWindow.dismiss();
                }
            }
        }));
    }

    protected void showAsItemViewAbove(View itemView) {
        if (mPreviewWindow.isShowing()) {
            mPreviewWindow.dismiss();
        }
        //居中
        int offsetX = (mPreviewWindow.getWidth() - itemView.getWidth()) / 2;
        int height = itemView.getHeight() + mPreviewWindow.getHeight();
        mPreviewWindow.showAsDropDown(itemView, -offsetX, -height);
    }
}
