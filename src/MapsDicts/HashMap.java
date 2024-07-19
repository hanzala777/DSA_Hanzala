package MapsDicts;

import java.util.Arrays;

class MyHashMap {
    private int[] map;

    public MyHashMap() {
        map = new int[1000001]; // Initialize a large array
//        for (int i = 0; i < map.length; i++) {
//            map[i] = -1; // Use -1 to indicate an empty spot
//        }
        //OR
        // Use -1 to indicate an empty spot
        Arrays.fill(map, -1);
    }

    public void put(int key, int value) {
        map[key] = value; // Store the value at the key index
    }

    public int get(int key) {
        return map[key]; // Return the value at the key index
    }

    public void remove(int key) {
        map[key] = -1; // Set the value at the key index to -1
    }
}

public class HashMap {
    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(1, 2);
        System.out.println(obj.get(1)); // Output: 2
        obj.remove(1);
        System.out.println(obj.get(1)); // Output: -1
    }
}
