package com.up.lhm.hmtools.number;

import android.text.TextUtils;

public class ConvertUtils {
    private ConvertUtils() {
    }

    public static double convert2Double( String d) {
        if (TextUtils.isEmpty(d)) {
            return 0;
        }
        try {
            return Double.parseDouble(d);
        } catch (Exception p) {
            p.printStackTrace();
        }
        return 0;
    }

    public static long convert2Long( String d) {
        if (TextUtils.isEmpty(d)) {
            return -1;
        }
        try {
            return Long.parseLong(d);
        } catch (Exception p) {
            p.printStackTrace();
        }
        return -1;
    }


    public static int convert2Int( String d) {
        if (TextUtils.isEmpty(d)) {
            return -1;
        }
        try {
            return Integer.parseInt(d);
        } catch (Exception p) {
            p.printStackTrace();
        }
        return -1;
    }

    public static boolean compare2String(String var1, String var2) {
        return convert2Int(var1) > convert2Int(var2);
    }
}
