package org.github.dkovaleva.animals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");

        System.out.println(map.values());

        Map<String, List<String>> map2 = new HashMap<>();
        List<String> v1 = new ArrayList<>();
        v1.add("v1-1");
        v1.add("v1-2");
        map2.put("k1", v1);

        List<String> v2 = new ArrayList<>();
        v2.add("v2-1");
        v2.add("v2-2");
        map2.put("k2", v2);

        System.out.println(map2.values());
        for (List<String> value : map2.values()) {
            value.remove("v2-1");
        }
        System.out.println(map2.values());
    }
}
