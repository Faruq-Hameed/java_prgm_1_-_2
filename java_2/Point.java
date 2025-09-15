public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int manhattanDistanceFromOrigin() {
        return Math.abs(this.x) + Math.abs(this.y);
    }

    protected String getLocation() {
        return this.x + ", " + this.y;
    }

    @Override
    public String toString() {
        return "Point at (" + getLocation() + ") distance " + this.manhattanDistanceFromOrigin();
    }
}
