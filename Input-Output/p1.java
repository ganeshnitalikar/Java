


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleBufferedReaderExample {
    public static void main(String[] args) throws IOException {
        	BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        	BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in)); 
            System.out.println("Enter your name:");
            String name = reader1.readLine();
            System.out.println("Hello, " + name + "!");
            reader1.close();
            System.out.println("Enter your age:");
            int age = Integer.parseInt(reader2.readLine());
            System.out.println("You are " + age + " years old.");
       
    }
}

