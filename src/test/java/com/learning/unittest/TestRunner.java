package com.learning.unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

class TestRunner {
    public static void main(String[] argv) {
        Result ret = JUnitCore.runClasses(TestSuite.class);

        for(Failure f : ret.getFailures()) {
            System.out.println(f.toString());
        }

        System.out.println(ret.wasSuccessful());
    }
}
