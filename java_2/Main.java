public class Main {

    public static void main(String[] args) {
        Engine newEngine = new Engine("V8", "1234", "BMW", "A very good engine");
        Person faruq = new Student("Faruq", "ibadan , oyo state");
        System.out.println(faruq);
        System.out.println(faruq + " is of type " + faruq.getClass().getName());

        System.out.println(faruq.getName());
        Student studentFaruq = (Student) faruq; // downcasting is possible here because faruq was created from a student reference originally         System.out.println(studentFaruq.getName());
        studentFaruq.study();
        Person per = new Person("Mr. Smith", "123 Main St");
        // Student stu = (Student) per; // This will throw a ClassCastException at runtime because per is not a Student or it reference and Student is a subclass of Person
        System.out.println(studentFaruq);
        Object obj = (Object) studentFaruq; // upcasting is always possible
        System.out.println(obj + " is of type " + obj.getClass().getName());
    }
}
