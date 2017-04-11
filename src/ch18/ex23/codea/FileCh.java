package ch18.ex23.codea;

import lib.utils.TextFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by V1 on 10-Apr-17.
 */
public class FileCh {
    private static final int BSIZE = 1024;

    public static void check() {
        String fileRead = "./src/ch18/ex23/codea/CodeA.java";
        String fileRead2 = "./src/ch18/ex23/Ex23.java";
        String fileWrite = "./src/ch18/ex23/codea/CodeA.txt";

        try {
            FileChannel fc = new FileOutputStream(fileWrite).getChannel();
            fc.write((ByteBuffer.wrap(TextFile.read(fileRead).getBytes())));  // закачали целый файл
            fc.close();
            fc = new RandomAccessFile(fileWrite,"rw").getChannel(); // доступ чтение запись
            fc.position(fc.size());
            fc.write((ByteBuffer.wrap(TextFile.read(fileRead2).getBytes())));  // закачали еще раз целый файл
            fc.close();
            fc = new FileInputStream(fileWrite).getChannel(); // на чтение и только
            ByteBuffer bf =  ByteBuffer.allocate(BSIZE);
            fc.read(bf); // прочитать в буфер 1К данных
            bf.flip(); // подготовка к чтению

            System.out.println("\nRead written twice data:");
            while (bf.hasRemaining()) {  // есть данные
                System.out.print((char)bf.get());
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}