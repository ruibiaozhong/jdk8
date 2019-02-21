package com.ruibiaozhong.jdk8.staram.ex;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

public class MyStreamTest10 {


    @Test
    public void test1() {
        Optional<String> s = Optional.of("test");
        Assert.assertEquals(Optional.of("TEST"), s.map(String::toUpperCase));
    }

    @Test
    public void test2() {
        Assert.assertEquals(Optional.of(Optional.of("SPRING")), Optional.of("string").map(s -> Optional.of("SPRING")));
    }

    @Test
    public void test3() {
        Assert.assertEquals(Optional.of("STRING"), Optional.of("string").flatMap(s -> Optional.of("STRING")));
    }






}
