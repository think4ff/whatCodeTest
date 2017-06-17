package test.code;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Random;

public class ByteArrayInputStreamSimpleExample1 {

    public static void main(String[] args) throws IOException {

        byte[] buffer = new byte[5];
        Random rnd = new Random();

        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = (byte) rnd.nextInt();
            System.out.println("buffer[i]:" + buffer[i]);
        }

        ByteArrayInputStream b = new ByteArrayInputStream(buffer);

        System.out.println("All the elements in the buffer:");

        int num;
        byte[] newByte = new byte[50];
//        while ((num = b.read()) != -1) {
//            System.out.print(num + " ");
//        }

        while ((num = b.read(newByte,1,4)) != -1) {
            System.out.print(num + "/");
            System.out.println(newByte[num]);
        }
    }

}
