import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Member implements Comparable<Member> {
    private String name;
    private double height;

    public Member(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Member other) {
        if (this.height == other.height) {
            return 0;
        } else if (this.height < other.height) {
            return -1;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return this.getName() + ", " + this.getHeight() + " cm";
    }

    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("mikael", 182));
        member.add(new Member("matti", 187));
        member.add(new Member("ada", 184));
        System.out.println("Original list: ");
        member.stream()
                .forEach(m -> System.out.println(m));

        System.out.println("\n Members sorted by height: ");
        member.stream()
                .sorted()
                .forEach(m -> System.out.println(m));

        Collections.sort(member);

        System.out.println("\n Original when sorted");

        member.stream()
                .forEach(m -> System.out.println(m));
    }

}