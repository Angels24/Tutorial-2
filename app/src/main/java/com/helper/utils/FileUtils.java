package com.helper.utils;

import android.content.Context;

import com.aprendamosandroid.tutorial2.R;
import com.google.gson.Gson;
import com.helper.model.Book;
import com.helper.model.Response;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
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

    public List<Book> getItemsFromJson(){
        Response response = null;
        List<Book> items = new ArrayList<Book>();
        Gson gson = new Gson();
        String json = readJson();

        try{
            response = gson.fromJson(json, Response.class);

            if (response.isSuccess()){
                items = response.getData();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return items;
    }

    private String readJson(){
        StringBuffer sb = new StringBuffer();
        BufferedReader br = null;

        try{
            br = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(R.raw.items)));
            String line;

            while((line = br.readLine()) != null){
                sb.append(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
}
