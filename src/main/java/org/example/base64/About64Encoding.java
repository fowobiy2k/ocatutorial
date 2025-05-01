package org.example.base64;

import java.util.Base64;

public class About64Encoding {
    public static void main(String[] args) {
        String a = "leaf";
        String b = Base64.getEncoder().encodeToString(a.getBytes());
        System.out.println("b: " + b);

        byte[] d = Base64.getDecoder().decode(b);
        String e = new String(d);
        System.out.println("e: " + e);
    }
}
