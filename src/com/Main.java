package com;

public class Main {
    public static void main(String[] args) {
        String s = new String ("abc");
        String s2=s.concat("def");
        System.out.println(s);
        System.out.println(s2);
        StringBuilder stringBuilder=new StringBuilder("abc");
        stringBuilder.append("def");
        stringBuilder.insert(0,"-");
        System.out.println(stringBuilder);
    }
}
