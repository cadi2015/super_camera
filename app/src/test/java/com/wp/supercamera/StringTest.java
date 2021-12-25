package com.wp.supercamera;

import org.junit.Assert;
import org.junit.Test;

public class StringTest {


    @Test
    public void test_sub_string() {
        String baseString = "Hello";
        System.out.println(baseString.substring(1, 3));
        Assert.assertTrue(false);
    }

}
