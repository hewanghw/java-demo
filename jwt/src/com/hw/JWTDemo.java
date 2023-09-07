package com.hw;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JWTDemo {
    public static void main(String[] args) {

        String jwt = "eyJhbGciOiJIUzUxMiIsInR5cCI6ICJKV1QifQ==.eyJleHAiOjE2OTQwOTk5NzgsInN1YiI6InN1YmplY3QiLCJpYXQiOjE2OTQwOTgxNzg4MzMsInVzZXJuYW1lIjoiemhhbmdzYW4ifQ==.oJ6FFUgYOC6ca5Nrx7XR4xxuQrFRsVq9ctOqyW7E0ru-yXkgyuVkixCEdpt_Sb1ONLYgr9sC98m_IlkR-CDvbg";
        Base64.Decoder decoder = Base64.getUrlDecoder();
        String[] split = jwt.split("\\.");
        String head = new String(decoder.decode(split[0]));
        System.out.println("头部: " + head);
        String payload = new String(decoder.decode(split[1]));
        System.out.println("载荷： " + payload);
//        String sign = new String(decoder.decode(split[2]));
//        System.out.println("签名： " + sign);

        String myHead = new String(Base64.getUrlEncoder().encode("{\"alg\":\"HS512\",\"typ\": \"JWT\"}".getBytes(StandardCharsets.UTF_8)));
        System.out.println(myHead);
        String myPayLoad = new String(Base64.getUrlEncoder().encode("{\"exp\":1694099978,\"sub\":\"subject\",\"iat\":1694098178833,\"username\":\"zhangsan\"}".getBytes()));
        System.out.println(myPayLoad);

    }
}
