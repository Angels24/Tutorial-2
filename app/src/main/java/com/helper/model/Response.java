package com.helper.model;

import java.util.List;

/**
 * Created by T420 on 12/11/2016.
 * @author Mike
 * @date 20161112
 * @version 1.0
 */

public class Response {

    public boolean success;
    public List<Book> data;

    public boolean isSuccess() {
        return success;
    }

    public List<Book> getData() {
        return data;
    }
}
