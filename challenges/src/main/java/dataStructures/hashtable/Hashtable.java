package dataStructures.hashtable;


import java.util.ArrayList;


public class Hashtable {


    ArrayList<HashNode<String>>[] buckets = new ArrayList[1];

    public Hashtable(ArrayList[] buckets) {
        this.buckets = buckets;
    }


    public Hashtable createHashtable(int size) throws Exception {
        if (size < 2) {
            throw new Exception("Please select a larger size");
        }
        ArrayList[] buckets = new ArrayList[size];
        Hashtable hashtable = new Hashtable(buckets);
        return hashtable;
    }


    public void add(String key, String value) throws Exception {

        if (contains(key)) {
            throw new Exception("Key has been used, need to pick a new one");
        } else {
            int hash = hash(key);
            HashNode<String> newNode = new HashNode<>(key, value);
            ArrayList<HashNode<String>> list = buckets[hash];

            if (list == null) {
                list = new ArrayList<HashNode<String>>();
                list.add(newNode);
                buckets[hash] = list;
            } else {
                list.add(newNode);
            }
        }
    }

    public String getValue (String key) {
        if (this.contains(key)) {
            int hash = hash(key);
            ArrayList<HashNode<String>> list = buckets[hash];

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getKey() == key) {
                    return list.get(i).getValue();
                }
            }
        }
        return "Key not fount";
    }

    public boolean contains(String key) {
        int hashIndex = hash(key);
        ArrayList<HashNode<String>> list = buckets[hashIndex];

        if (list == null) {
            return false;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getKey() == key) {
                    return true;
                }
            }
            return false;
        }
    }

    public int hash(String key) {

        int bucket = 0;

        for (int i = 0; i < key.length(); i++) {
            bucket = bucket * 100 + key.charAt(i);
        }
        bucket = bucket % buckets.length;
        return bucket;
    }



    public String toString() {
        String theString = "[\n";

        for (int i = 0; i < buckets.length; i++) {
            theString += i + ": [";
            if (buckets[i] == null) {
                theString += "null";
            } else {
                ArrayList<HashNode<String>> list = buckets[i];
                for (int j = 0; j < list.size(); j++) {
                    if (j > 0) {
                        theString += ", ";
                    }
                    theString += list.get(j).getKey() + " : " + list.get(j).getValue();
                }
            }
            theString += "]\n";
        }
        theString += "]";
        return theString;
    }

}

