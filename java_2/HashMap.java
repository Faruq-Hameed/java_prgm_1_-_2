public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int nextFreeIndex;
    

    public HashMap() {
       this.values = new List[32];
       this.nextFreeIndex = 0;
    }

    public Pair get(K key){
    }
}
