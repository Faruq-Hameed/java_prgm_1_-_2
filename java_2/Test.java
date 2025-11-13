import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter("file.txt");
        writer.println("Hello file!"); // writes the string "Hello file!" and line change to the file
        writer.println("More text");
        writer.print("And a little extra"); // writes the string "And a little extra" to the file without a line change
        writer.close(); // closes the
    }
}
