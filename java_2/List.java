public class List<T> {
    private T[] list;
    private int nextIndex;

    public List() {
        this.list = (T[]) new Object[10];
        this.nextIndex = 0;
    }

    // public void add(int value){
    // if(this)
    // this.
    // }

    public void grow() {
        int newLength = this.list.length + this.list.length/ 2; //getting new length
        T[] newList = (T[]) new Object[newLength];//create new list with an higher length
        for(int i =0; i < list.length; i++){
            newList[i] = this.list[i];//copying the value
        }
        list = newList; //the old list has been replaced
    }
}
