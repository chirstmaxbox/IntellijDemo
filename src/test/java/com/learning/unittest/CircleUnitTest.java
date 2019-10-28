package com.learning.unittest;

import com.learning.Circle;
import org.junit.Assert;
import org.junit.Test;

public class CircleUnitTest {
    @Test
    public void testArea() {
        Circle c = new Circle(2);
        double a = c.area();
        Assert.assertEquals((int)a, 12);
    }

    @Test
    public void testDraw() {
        Circle c = new Circle(2);
        Assert.assertEquals("Drawing Circle", c.draw());
    }
}
