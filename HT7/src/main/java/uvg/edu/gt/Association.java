package uvg.edu.gt;

import java.util.*;

class Association<K extends Comparable<K>, V> implements Comparable<Association<K, V>> {
    K key;
    V value;

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Association<K, V> other) {
        return this.key.compareTo(other.key);
    }
}


