package MapsDicts;

class MyHashSet {
    private boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}

public class HashSet {
    public static void main(String[] args) {
        MyHashSet obj = new MyHashSet();
        int key = 5; // Example key
        obj.add(key);
        obj.remove(key);
        boolean param_3 = obj.contains(key);
        System.out.println("Contains key: " + param_3);
    }
}

