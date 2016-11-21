package com.aprendamosandroid.tutorial2;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.helper.model.Book;
import com.helper.utils.FileUtils;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.util.List;

/**
 * @author Mike
 * @date 20161120
 * @version 1.0
 */
@RunWith(AndroidJUnit4.class)
public class FileUtilsInstrumentedTest {

    @Test
    public void loadItems()throws Exception{
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        FileUtils fileUtils = FileUtils.getsInstance(appContext);
        List<Book> items = fileUtils.getItemsFromJson();

        assertEquals(items.size(), 10);
    }
}
