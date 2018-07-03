package com.xinlan.jdktest;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        //assertEquals(4, 2 + 2);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("test1", new Object());
        map.get("test1");
    }


    @Test
    public void myHashMapTest() {
        MyHashMap<String, String> map = new MyHashMap<String, String>();
        map.put("test1", "haha");
        assertEquals(map.get("test1"), "haha");
        assertEquals(map.get("test2"), null);
    }
}