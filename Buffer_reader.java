import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_reader {
    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String n=reader.readLine();
        System.out.println("Hello! "+n);
    }
}
