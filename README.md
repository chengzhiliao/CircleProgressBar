<p align="center"><img src="./preview/circleprogressbar.jpg"></p>

## CircleProgressBar

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-CircleProgressBar-lightgrey.svg?style=flat)](http://circleprogress.osslab.online/)
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![API](https://img.shields.io/badge/API-11%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=11)
[![OSSLab](https://img.shields.io/badge/OSSLab-开源软件实验室-blue.svg?style=flat)](http://osslab.online/)

最简单的圆形进度条控件，支持自定义颜色、边框、背景等属性。

<img src="./preview/preview.gif" alt="CircleProgressBar" title="CircleProgressBar" width="300" height="448" align="right" vspace="24" />


## 使用方法

首先，你需要导入模块项目或者添加依赖类库：

```groovy
compile 'online.osslab:CircleProgress:1.0.0'
```

#### 样式文件

```xml
<online.osslab.CircleProgressBar
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    circle:background_color="#FFCDD2"
    circle:background_width="5dp"
    circle:progress_color="#F44336"
    circle:progress_width="10dp" />
```

当然，你还可以通过以下属性个性化圆形图像样式。

###### 图形属性:

* `circle:progress_value`                      (integer)   -> 0
* `circle:progressbar_color`             (color)     -> BLACK
* `circle:background_color`  (color)     -> GRAY
* `circle:progress_width`             (dimension) -> 7dp
* `circle:background_width`  (dimension) -> 3dp


#### 代码构建

```java
CircleProgressBar circleProgressBar = (CircleProgressBar )findViewById(R.id.myCircleProgressBar );
circleProgressBar.setColor(ContextCompat.getColor(this, R.color.progressBarColor));
circleProgressBar.setBackgroundColor(ContextCompat.getColor(this, R.color.backgroundProgressBarColor));
circleProgressBar.setProgressBarWidth(getResources().getDimension(R.dimen.progressBarWidth));
circleProgressBar.setBackgroundProgressBarWidth(getResources().getDimension(R.dimen.backgroundProgressBarWidth));
int animationDuration = 2500; // 2500ms = 2,5s
circleProgressBar.setProgressWithAnimation(65, animationDuration); // Default duration = 1500ms
```

## 关于作者

- [wall-e@live.cn](mailto:wall-e@live.cn)
- [开源软件实验室](http://osslab.online/)


## 许可协议

    Copyright 2016 Lopez Mikhae

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

