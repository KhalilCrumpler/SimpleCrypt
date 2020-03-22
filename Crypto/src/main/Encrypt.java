import java.io.*;
import java.util.Scanner;

public class Encrypt{
    public Encrpyt(){

    }
     public static void main(String[] args) throws IOException {
        File file = new File("/Users/kcrumpler/Dev/SimpleCrypt/Crypto/src/resources/sonnet18.txt")
        Scanner scan = new Scanner(file);
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/kcrumpler/Dev/SimpleCrypt/Crypto/src/resources/sonnet18.enc"))
        ROT13 encryptTool = new ROT13();

        String encryptedFile = "";

        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String encryptedLine = encryptTool.encrypt(line);
            encryptedFile += encryptedLine = "/n";
            System.out.println(encryptedLine);
        }
        writer.write(encryptedFile);
        writer.close();
     }
}