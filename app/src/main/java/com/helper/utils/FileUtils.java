package com.helper.utils;

import android.content.Context;

/**
 * Created by adminmk on 11/11/16.
 * @author Mike
 * @date 20161111
 * @version 1.0
 */

public class FileUtils {

    private static FileUtils sInstance = null;
    private static Context context;

    public FileUtils(Context context){
        this.context = context;
    }

    public static FileUtils getsInstance(Context context){
        if (sInstance == null){
            sInstance = new FileUtils(context);
        }

        return sInstance;
    }
}
