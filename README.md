# ItemTouchMoveHelper
RecyclerView的Item滑动触摸辅助类

![](screenshot.gif)


### Gradle引入
```
implementation 'com.dyhdyh:item-touch-move-helper:1.0.4'
```

### 普通的滑动触摸监听
```
recyclerView.addOnItemTouchListener(new SimpleItemTouchMoveListener() {
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
```

### *微信表情预览
内置了预览效果的监听，在对应的回调控制预览框即可  

```
recyclerView.addOnItemTouchListener(new SimpleMovePreviewListener(recyclerView, new OnMovePreviewListener() {
    @Override
    public void onPreview(View childView, int childPosition) {
		//弹出预览框
		//popupWindow.showAsDropDown(childView,offsetX,offsetY);
    }

    @Override
    public void onCancelPreview() {
        //取消预览框
		//popupWindow.dismiss();
    }
}));
```

##### 具体使用可以参考[MainActivity](https://github.com/dengyuhan/ItemTouchMoveHelper/blob/master/app/src/main/java/com/dyhdyh/helper/itemtouch/example/MainActivity.java)
