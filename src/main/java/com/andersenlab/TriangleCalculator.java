package com.andersenlab;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TriangleCalculator {
    private static boolean isTrianglePossible(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (c + b) > a;
    }

    public static double getTriangleSquare(double x, double y, double z) {
        if (!isTrianglePossible(x, y, z)) {
            if (log.isDebugEnabled())
                log.debug("It's not possible to create triangle with sides: x={}, y={}, z={}", x, y, z);
            return -1.0;
        }
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }
}
