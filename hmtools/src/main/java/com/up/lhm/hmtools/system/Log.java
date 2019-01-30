package com.up.lhm.hmtools.system;

/**
 * @author lianghaimiao
 * @date 2019/1/30
 * @function log日志
 */

public class Log {
    public static final String DEFAULT_TAG = "hm_log";

    public Log() {
    }

    public static void i(String tag, String msg) {
        if (Debug.isDebug) {
            android.util.Log.i(tag, msg);
        }

    }

    public static void i(String msg) {
        i(DEFAULT_TAG, msg);
    }

    public static void v(String tag, String msg) {
        if (Debug.isDebug) {
            android.util.Log.v(tag, msg);
        }

    }

    public static void v(String msg) {
        v(DEFAULT_TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (Debug.isDebug) {
            android.util.Log.d(tag, msg);
        }

    }

    public static void d(String msg) {
        d(DEFAULT_TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (Debug.isDebug) {
            android.util.Log.w(tag, msg);
        }

    }

    public static void w(String msg) {
        w(DEFAULT_TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (Debug.isDebug) {
            android.util.Log.e(tag, msg);
        }

    }

    public static void e(String tag, String msg, Throwable e) {
        if (Debug.isDebug) {
            android.util.Log.e(tag, msg, e);
        }

    }

    public static void e(String msg) {
        e(DEFAULT_TAG, msg);
    }
}
