package aula12.Ex4;

import java.util.HashMap;

public class Teste {
    static void main(String[] args) {
        System.out.println(getMes(1));
    }

    public static String getMes (int mes) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"jan");
        map.put(2,"fev");
        map.put(3,"mar");
        map.put(4,"abr");
        map.put(5,"mai");
        map.put(6,"jun");
        map.put(7,"jul");
        map.put(8,"aug");
        map.put(9,"set");
        map.put(10,"oct");
        map.put(11,"nov");
        map.put(12,"dez");
        return map.get(mes);
    }
}

