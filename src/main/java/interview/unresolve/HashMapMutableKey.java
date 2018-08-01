package interview.unresolve;

import java.util.HashMap;
import java.util.Map;

/**
 * hashcode可变在hashmap中是非常危险的
 */
public class HashMapMutableKey {

    public static class MutableKey {
        public int key;
        public String value;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MutableKey that = (MutableKey) o;

            if (key != that.key) return false;
            return value != null ? value.equals(that.value) : that.value == null;
        }

        @Override
        public int hashCode() {
            int result = key;
            result = 31 * result;
            return result;
        }

        @Override
        public String toString() {
            return "MutableKey{" +
                    "key=" + key +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Map<MutableKey, String> mutableMap = new HashMap<>();
        MutableKey key1 = new MutableKey();
        key1.key = 5;
        mutableMap.put(key1, "aaa");
        key1.key = 10;
        System.out.println(mutableMap.get(key1));
        MutableKey key2= new MutableKey();
        key2.key = 5;
        key2.value = "aaa";
        mutableMap.put(key2,"a1111");
        System.out.println(mutableMap.get(key2));
        key1.key  = 5;
        System.out.println(mutableMap.get(key1));
    }
}
