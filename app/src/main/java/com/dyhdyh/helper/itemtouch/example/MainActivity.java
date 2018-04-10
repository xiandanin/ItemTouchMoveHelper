package com.dyhdyh.helper.itemtouch.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.dyhdyh.helper.itemtouch.example.adapter.ExampleAdapter;
import com.dyhdyh.helper.itemtouch.example.exampledata.ExampleData;
import com.dyhdyh.helper.itemtouch.simple.OnMovePreviewListener;
import com.dyhdyh.helper.itemtouch.simple.SimpleMovePreviewListener;

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

        /*
        //普通的Item滑动触摸监听
        rv.addOnItemTouchListener(new SimpleItemTouchMoveListener() {
            @Override
            public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {
                //isTouchChild = 是否触摸在itemView上
                //childView = 当isTouchChild为true时指触摸的itemView,false时为null
                //childPosition = 当isTouchChild为true时指触摸的item位置,false时为-1
                Log.d("onItemTouchMove----->", isTouchChild + "," + childPosition + "," + event.getX() + "," + event.getY() + "," + event.getAction());
            }

            @Override
            public boolean onInterceptEnable() {
                //当需要拦截事件回调onItemTouchMove的时候返回true,否则false,一般需要动态控制
                return true;
            }
        });
        */

        //微信表情商店预览效果
        rv.addOnItemTouchListener(new SimpleMovePreviewListener(rv, new OnMovePreviewListener() {
            @Override
            public void onPreview(View childView, int childPosition) {
                Log.d("SimpleMovePreview----->", "onPreview---->" + childPosition + "," + childView);

                final ExampleData item = adapter.getItem(childPosition);
                mPreviewWindow.setFileUrl(item.getFile());

                if (mPreviewWindow.isShowing()) {
                    mPreviewWindow.dismiss();
                }
                //居中
                int offsetX = (mPreviewWindow.getWidth() - childView.getWidth()) / 2;
                int height = childView.getHeight() + mPreviewWindow.getHeight();
                mPreviewWindow.showAsDropDown(childView, -offsetX, -height);
            }

            @Override
            public void onCancelPreview() {
                Log.d("SimpleMovePreview----->", "onCancelPreview---->");
                mPreviewWindow.dismiss();
            }
        }));
    }

}
