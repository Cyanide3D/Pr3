package com.company;

import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        set();
        map();
    }

    private static void set() {
        Set<String> syncSet = new SyncHashSet<>();
        syncSet.add("set");

        for (String s : syncSet) {
            System.out.println(s);
        }
    }

    private static void map() {
        Map<String, String> syncMap = new SyncHashMap<>();
        syncMap.put("key", "value");

        syncMap.forEach((k, v) -> System.out.println("Map: " + k + " " + v));
    }
}
