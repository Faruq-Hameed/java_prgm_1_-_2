public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int nextFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.nextFreeIndex = 0;
    }

    public V get(K key) {
        int hashValue = Math.abs(key.hashCode() % this.values.length);
        if (this.values[hashValue] == null) {
            return null;
        }
        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.value(i).getKey().equals(key)) {
                return valuesAtIndex.value(i).getValue();
            }
        }
        return null;
    }

    // get the list pf pairs at this index
    public List<Pair<K, V>> getList(int hashValue) {
        return this.values[hashValue];

    }

    public int getHashValue(K key) {
        return Math.abs(key.hashCode() % this.values.length);

    }

    public void add(K key, V value) {
        int hashValue = getHashValue(key);// get the hashvalue for the key
        List<Pair<K, V>> list = getList(hashValue); // get the list in the hashvalue idex

        if (list == null) { // if nothing is there
            List<Pair<K, V>> newList = new List<>(); // then create a new List
            this.values[hashValue] = newList;// set the value to this new list
            return;
        }

        List<Pair<K, V>> valuesAtIndex = values[hashValue];
        int index = -1;


        Pair newPair = new Pair(key, value);// new Pair to be added or updated
        if (list == null) { // if nothing is there
            List<Pair<K, V>> newList = new List<>(); // then create a new List
            newList.add(newPair); // create a new Pair obj and add it to the new list
            this.values[hashValue] = newList;// set the value to this new list
            return;
        }
        // if a list already exist in the hashvalue index,
        // then find the item with key in the list and update it value
        int index = list.indexOfValue(newPair); //find it index in this list(i.e sub list)
        list[index] = newPair; 
    }
}
