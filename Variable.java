public class Variable {
    static public void main (String [] args){
        int  age = 10;
        Boolean isStudent = true;
        String school = "Unibadan";

        String userProfile =  String.valueOf(age) + isStudent + school + age + String.valueOf(isStudent) +  age + String.valueOf(isStudent);

        System.out.println(userProfile);
    }
}
