package genericcollectionimpl;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMapImpl map = new MyHashMapImpl();
        map.put("KA", 200);
        map.put("AP", 100);
        map.put("TS", 167);
        map.put("MN", 12);
        map.put("TN", 389);
        map.put("KL", 87);
        System.out.println(map);
        boolean status = map.contains("DL");
        System.out.println(status);
        System.out.println(map.get("TS"));
        System.out.println(map.size());
    }
}
