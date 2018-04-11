package com.gpdata.java;

import com.gpdata.bean.Person;
import org.junit.Test;

import java.util.logging.Logger;


public class ModuleTest {

    private static final Logger LOGGER = Logger.getLogger("gpdata");

    public static void main(String[] args) {
        Person p = new Person("Tom", 12);

        System.out.println(p);

//        User user = new User();

        LOGGER.info("aaaaaaaaa");
    }

    @Test
    public void test1() {

    }
}
