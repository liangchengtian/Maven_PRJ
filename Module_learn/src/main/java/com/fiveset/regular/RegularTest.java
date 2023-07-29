package com.fiveset.regular;

import com.sun.jdi.PathSearchingVirtualMachine;

public class RegularTest {
    public static void main(String[] args) {
        String rex = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:11:11".matches(rex));
    }
}
