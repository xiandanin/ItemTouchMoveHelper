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
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.setAdapter(adapter);

        /*
        rv.addOnItemTouchListener(new SimpleItemTouchMoveListener(this){
            @Override
            public void onItemTouchMove(boolean isTouchChild, View childView, int childPosition, MotionEvent event) {
                Log.d("onItemTouchMove----->", isTouchChild + "," + childPosition + "," + event.getX() + "," + event.getY()+","+event.getAction());
            }
        });
        */

        rv.addOnItemTouchListener(new SimpleMovePreviewListener(this, new OnMovePreviewListener() {
            @Override
            public void onPreview(View childView, int childPosition) {
                Log.d("onPreview----->", childPosition + "," + childView);

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
                Log.d("onCancelPreview----->", "");
                mPreviewWindow.dismiss();
            }
        }));
    }

}
