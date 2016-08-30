package com.yun.lifecycle.listenter;

import android.os.Bundle;

/**
 * Created by dell on 2016/8/30.
 */
public interface ActivityLifeCycle {
    public void onStart();

    public void onStop();

    public void onDestroy();

    public void onSaveInstanceState(Bundle outState);

    public void onCreate(Bundle savedInstanceState);
}
