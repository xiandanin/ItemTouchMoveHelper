# ItemTouchMoveHelper
RecyclerView的Item滑动触摸辅助类

![](screenshot.gif)


### Gradle引入
```
implementation 'com.dyhdyh:item-touch-move-helper:1.0.0'
```

### 给RecyclerView添加预设的触摸监听
```
recyclerView.addOnItemTouchListener(new SimpleOnItemTouchMoveListener(this,
	new OnItemTouchMoveListener() {
            @Override
            public void onItemTouchMove(View childView, int childPosition, MotionEvent event) {
                if (ItemTouchMoveHelper.isActionTouch(event)) {
					//MotionEvent.ACTION_DOWN MotionEvent.ACTION_MOVE会进入
                } else {
                    //MotionEvent.ACTION_UP
                }
            }
        }));
```

##### 具体使用可以参考[MainActivity](https://github.com/dengyuhan/ItemTouchMoveHelper/blob/master/app/src/main/java/com/dyhdyh/helper/itemtouch/example/MainActivity.java)
