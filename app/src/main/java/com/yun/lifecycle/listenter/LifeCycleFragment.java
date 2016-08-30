package com.yun.lifecycle.listenter;

import android.app.Fragment;
import android.os.Bundle;

/**
 * Created by dell on 2016/8/30.
 */
public class LifeCycleFragment extends Fragment {
    private ActivityLifeCycle activityLifeCycle;

    public void setActivityLifeCycle(ActivityLifeCycle activityLifeCycle) {
        this.activityLifeCycle = activityLifeCycle;
    }

    @Override
    public void onStart() {
        activityLifeCycle.onStart();
        super.onStart();

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        activityLifeCycle.onCreate(savedInstanceState);
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        activityLifeCycle.onSaveInstanceState(outState);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onStop() {
        activityLifeCycle.onStop();
        super.onStop();

    }


    @Override
    public void onDestroy() {
        activityLifeCycle.onDestroy();
        super.onDestroy();

    }
}
