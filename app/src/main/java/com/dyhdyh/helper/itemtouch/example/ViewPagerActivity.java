package com.dyhdyh.helper.itemtouch.example;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.dyhdyh.helper.itemtouch.example.adapter.ExampleAdapter;
import com.dyhdyh.helper.itemtouch.example.exampledata.ExampleData;
import com.dyhdyh.helper.itemtouch.simple.OnMovePreviewListener;
import com.dyhdyh.helper.itemtouch.simple.SimpleMovePreviewListener;

/**
 * @author dengyuhan
 * created 2018/11/26 15:11
 */
public class ViewPagerActivity extends AppCompatActivity {
    private PreviewPopupWindow mPreviewWindow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        mPreviewWindow = new PreviewPopupWindow(this);

        final SlideViewPager viewpager = findViewById(R.id.viewpager);

        viewpager.setAdapter(new PagerAdapter() {

            @Override
            public int getCount() {
                return 3;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                RecyclerView rv = new RecyclerView(container.getContext());
                final ExampleAdapter adapter = new ExampleAdapter(ExampleData.create());
                rv.setLayoutManager(new GridLayoutManager(container.getContext(), 4));
                rv.setAdapter(adapter);
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

                        viewpager.setSlideEnabled(false);
                    }

                    @Override
                    public void onCancelPreview() {
                        Log.d("SimpleMovePreview----->", "onCancelPreview---->");
                        mPreviewWindow.dismiss();

                        viewpager.setSlideEnabled(true);
                    }
                }));
                container.addView(rv);
                return rv;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                container.removeView((View) object);
            }


        });
    }
}
