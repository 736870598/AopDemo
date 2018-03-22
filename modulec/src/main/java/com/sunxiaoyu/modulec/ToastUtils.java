package com.sunxiaoyu.modulec;

import android.content.Context;
import android.widget.Toast;

import com.sunxiaoyu.aopmodule.annotation.BehaviorTraceBefer;

/**
 * Created by Administrator on 2018/3/9 0009.
 */

public class ToastUtils {

    @BehaviorTraceBefer("显示Toast")
    public static void showToast(Context context, String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();

    }
}
