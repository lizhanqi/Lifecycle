package com.yun.lifecycle.listenter;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by dell on 2016/8/30.
 */
public class ActivityLifeCycleListener {
    private static final String FRAGMENT_TAG = "com.yun.lifecycle.listenter.LifeCycleFragment";
    private ActivityLifeCycle activityLifeCycle;
    private static ActivityLifeCycleListener _this;

    public static ActivityLifeCycleListener getInstance() {
        if (_this == null) {
            _this = new ActivityLifeCycleListener();
        }
        return _this;
    }

    private ActivityLifeCycleListener() {
        activityLifeCycle = new ActivityLifeCycle() {
            @Override
            public void onStart() {
                Log.v("lifeCycle", "onStart");
            }

            @Override
            public void onStop() {
                Log.v("lifeCycle", "onStop");
            }

            @Override
            public void onDestroy() {
                Log.v("lifeCycle", "onDestroy");
            }

            @Override
            public void onSaveInstanceState(Bundle outState) {
                Log.v("lifeCycle", "onSaveInstanceState");
            }

            @Override
            public void onCreate(Bundle savedInstanceState) {
                Log.v("lifeCycle", "onCreate");
            }
        };
    }


    public void attachActivity(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        LifeCycleFragment lifeCycleFragment = (LifeCycleFragment) fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (lifeCycleFragment == null) {
            lifeCycleFragment = new LifeCycleFragment();
            fragmentManager.beginTransaction().add(lifeCycleFragment, FRAGMENT_TAG).commitAllowingStateLoss();
        }
        lifeCycleFragment.setActivityLifeCycle(activityLifeCycle);
    }
}
