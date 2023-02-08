package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HashMap<String, Integer> s = new HashMap<>();
        s.put("tran", s.getOrDefault("tran",0)+1);
        s.put("minh", s.getOrDefault("minh",0)+1);
        s.put("hoa",s.getOrDefault("hoa",0)+1);
        s.put("tran", s.getOrDefault("tran", 0)+1);

        HashMap<String, Integer> a = new HashMap<>();
        a.put("tran", s.getOrDefault("tran",0)+1);
        a.put("minh", a.getOrDefault("minh", 0)+1);
        a.put("hoa", a.getOrDefault("hoa",0)+1);

        System.out.println(s.get("tran"));
        System.out.println(s.get("tran"));
    }
}