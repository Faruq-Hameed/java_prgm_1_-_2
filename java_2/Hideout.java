public class Hideout<T> {
    private T toHide;

    public Hideout() {
        this.toHide = null;
    }

    public void putIntoHideout(T toHide) {
        this.toHide = toHide;
    }

    public T takeFromHideout() {
        T current = this.toHide;
        if (current == null) {
            this.toHide = null;
        }
        return current;
    }

    public boolean isInHideout() {
        return this.toHide != null;
    }
}
