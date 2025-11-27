public class MyHashTable {

    private final int m = 37;
    private final double c1 = 0.5;
    private final double c2 = 0.5;
    private int collisions = 0;
    private MyHashEntry[] data;

    public MyHashTable() {
        this.data = new MyHashEntry[m];
    }


    int h(String key) {
        return key.hashCode() & 0xfffffff % m;
    }
    int hash(String key, int p) {
        return (int) ((h(key) + c1*p + Math.pow(c2*p,2)) % m);
    }

    void put(String key, int value) {
        int p = 0;
        int hash;
        while (p < m) {
            hash = hash(key, p);
            if(data[hash] == null) {
                data[hash] = new MyHashEntry(key, value);
                System.out.println(String.format("Put %s with value %s with %s collisions total", key, value, collisions));
                return;
            }
            p++;
            collisions++;
        }
        System.out.println(String.format("Can't put %s with value %s because the table is full", key, value));
    }

    int get(String key) {
        int getCollisions = 0;
        int p = 0;
        int hash;
        while (p < m) {
            hash = hash(key, p);
            MyHashEntry entry = data[hash];
            if(entry == null) {
                System.out.println(String.format("Couldn't find key %s with %s collisions total, because null cell was founded", key, getCollisions));
                return -1;
            }
            if(entry.getKey().equals(key)) {
                System.out.println(String.format("Found %s with value %s with %s collisions total", key, entry.getValue(), getCollisions));
                return entry.getValue();
            }
            getCollisions++;
            p++;
        }
        System.out.println(String.format("Couldn't find key %s with %s collisions total", key, getCollisions));
        return -1;
    }
}
