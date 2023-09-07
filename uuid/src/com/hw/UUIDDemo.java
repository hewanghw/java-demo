package com.hw;

import java.util.UUID;

public class UUIDDemo {
    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().replace("-", "");
        System.out.println(s);
    }
}
