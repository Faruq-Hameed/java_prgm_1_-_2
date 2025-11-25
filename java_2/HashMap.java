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
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.nextFreeIndex++;
        } else {
            valuesAtIndex.value(index).setValue(value);
        }

        if (1.0 * this.nextFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    private void grow() {
        // create a new array
        List<Pair<K, V>>[] newArray = new List[this.values.length * 2];

        for (int i = 0; i < this.values.length; i++) {
            // copy the values of the old array into the new one
            copy(newArray, i);
        }

        // replace the old array with the new
        this.values = newArray;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].value(i);

            int hashValue = Math.abs(value.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new List<>();
            }

            newArray[hashValue].add(value);
        }
    }

    private List<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        if (values[hashValue] == null) {
            values[hashValue] = new List<>();
            this.nextFreeIndex++;

        }

        return values[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.value(i).getKey().equals(key)) {
                return i;
            }
        }

        return -1;
    }

    // public void add(K key, V value) {
    // int hashValue = getHashValue(key);// get the hashvalue for the key
    // List<Pair<K, V>> list = getList(hashValue); // get the list in the hashvalue
    // idex

    // if (list == null) { // if nothing is there
    // List<Pair<K, V>> newList = new List<>(); // then create a new List
    // this.values[hashValue] = newList;// set the value to this new list
    // return;
    // }

    // List<Pair<K, V>> valuesAtIndex = values[hashValue];
    // int index = -1;

    // Pair newPair = new Pair(key, value);// new Pair to be added or updated
    // if (list == null) { // if nothing is there
    // List<Pair<K, V>> newList = new List<>(); // then create a new List
    // newList.add(newPair); // create a new Pair obj and add it to the new list
    // this.values[hashValue] = newList;// set the value to this new list
    // return;
    // }
    // // if a list already exist in the hashvalue index,
    // // then find the item with key in the list and update it value
    // int index = list.indexOfValue(newPair); //find it index in this list(i.e sub
    // list)
    // list[index] = newPair;
    // }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.value(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
}
