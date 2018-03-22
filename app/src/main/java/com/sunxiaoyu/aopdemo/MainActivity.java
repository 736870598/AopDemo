package com.sunxiaoyu.aopdemo;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.sunxiaoyu.aopmodule.annotation.BehaviorTrace;
import com.sunxiaoyu.aopmodule.annotation.BehaviorTraceBefer;
import com.sunxiaoyu.modulec.ToastUtils;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @BehaviorTrace("方法一")
    public void methodOne(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
        add(44);
    }

    @BehaviorTrace("方法二")
    public void methodTwo(View view) {
        LogUtils.v("methodTwo start");
        SystemClock.sleep(new Random().nextInt(2000));
        LogUtils.v("methodTwo end");
    }


    @BehaviorTrace("方法三")
    public void methodThree(View view) {
        SystemClock.sleep(new Random().nextInt(2000));
    }



    @BehaviorTrace("方法四")
    public void methodFour(View view) {
        ToastUtils.showToast(this, "methodFour");
//        LogUtils.v("add: " + add(123));

    }

    @BehaviorTraceBefer("add")
    public int add(int x){
        LogUtils.v("add 方法里 x = " + x);
        return 10000 + x;
    }
}
