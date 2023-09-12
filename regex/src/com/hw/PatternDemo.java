package com.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
    public static void main(String[] args) {

        String str = "/oauth/authorize?client_id=test-pc&response_type=code";
        boolean matches = str.matches("/oauth/.*");
        System.out.println(matches);


    }
}
