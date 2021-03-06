package ch18.ex23.codeb;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 11-Apr-17.
 */
public class TransferTo {
    public static void check(String fileSrc, String fileDst) {
        final int BSIZE = 10;
        try {
            FileChannel fcIn = new FileInputStream(fileSrc).getChannel();
            FileChannel fcOut = new FileOutputStream(fileDst).getChannel();

            fcIn.transferTo(0,fcIn.size(), fcOut);  // первое копирование // position  в src, 0 в src
            fcOut.transferFrom(fcIn, 10, fcIn.size()); // второе копирование // position  в dest, 0 в src

            fcIn.close();
            fcOut.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
