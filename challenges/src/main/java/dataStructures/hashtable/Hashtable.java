package dataStructures.hashtable;


import java.util.ArrayList;
import java.util.List;


public class Hashtable {


    List<List<HashNode>> buckets = new ArrayList<>();

    public Hashtable() {
        for (int i = 0; i < 47; i++) {
            buckets.add(new ArrayList<HashNode>());
        }
    }

    Hashtable(int size) {
        for (int i = 0; i < size; i++) {
            buckets.add(new ArrayList<HashNode>());
        }
    }

    public void add(String key, int value) throws Exception {
        int hashIndex = hash(key);
        List<HashNode> bucket = buckets.get(hashIndex);
        for (HashNode bucketItem : bucket) {
            if (bucketItem.key.equals(key)) throw new Exception("Hastable already contains key");
        }
        bucket.add(new HashNode(key, value));
    }

    public int get(String key) throws Exception {

        int hashIndex = hash(key);
        for (HashNode bucketItem : buckets.get(hashIndex)) {
            if (bucketItem.key.equals(key)) {
                return bucketItem.value;
            }
        }
        throw new Exception("Hashtable does not contain key");
    }

    public boolean contains(String key) {
        int hashIndex = hash(key);
        for (HashNode bucketItem : buckets.get(hashIndex)) {
            if (bucketItem.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    int hash(String key) {

        int hashValue = 0;

        for (int i = 0; i < key.length(); i++) {
            char letter = key.charAt(i);
            hashValue += Character.getNumericValue(letter);
        }
        return hashValue % buckets.size();
    }

}

