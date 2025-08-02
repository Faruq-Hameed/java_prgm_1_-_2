public class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object compare) {
        // check if they reference same location in memory
        if (this == compare) {
            return true;
        }

        // compare if they are from different instances i.e from diff class
        if (!(compare instanceof Bird)) {
            return false;
        }

        // type cast and check for variables equality
        Bird bird = (Bird) compare;
        return this.name.equals(bird.name);
    }
}