package dataStructures.hashtable;

import java.util.ArrayList;
import java.util.List;

public class Hashtable {

        List<List<HashTableNode>> buckets = new ArrayList<>();
        int size = 3;


        public Hashtable() {
        }

        public void add (String key,int value){
            int hashIndex = hash(key);
            buckets.get(hashIndex).add(new HashTableNode(key, value));

        }

        public void get (String key) throws Exception {
            int hashIndex = hash(key);
            for(HashTableNode bucketItem : buckets.get(hashIndex)){
                if (bucketItem.key.equals(key)){
                    return bucketItem.value;
                }
            }
            throw new Exception("Hashtable does not contain key");
        }

        public void contains (String key){
            int hashIndex = hash(key);
            for(HashTableNode bucketItem : buckets.get(hashIndex)){
                if (bucketItem.key.equals(key)){
                    return bucketItem.value;
            return false;
        }

        public void hash (String key){

            int hashValue = 0;

            for (int i = 0; i < key.length(); i++) {
                char letter = key.charAt(i);
                hashValue. (letter);
            }

            return hashValue % size;
        }

        public class HashTableNode(){
            String key;
            int value;

            public HashTableNode(String key, int value){
                this.key = key;
                this.value = value;
            }
        }

    }

