import java.io.*;
//https://www.javatpoint.com/java-sequenceinputstream-class
public class Test {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("C:\\Users\\Sanchit\\Documents\\source1.txt");
        FileInputStream fis2 = new FileInputStream("C:\\Users\\Sanchit\\Documents\\source2.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Sanchit\\Documents\\destination.txt");

        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }

        sis.close();
        fos.close();
        fis1.close();
        fis2.close();
    }
}
