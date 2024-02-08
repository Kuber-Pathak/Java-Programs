// Here we use ZipInputStream and ZipOutputStream to create streams for input and output in zip file.
// Then for input we opened a ZipEntry and we used putNextEntry() to start writin in zip file.
//after writing using write().We have to open new streams for reading from zip file.
//The getNextEntry() points the start of the zip file and read() reads data from zip file.

import java.io.*;
import java.util.zip.*;

public class copy_into_zip {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("student.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);
        ZipEntry ze = new ZipEntry("abc.txt");
        zos.putNextEntry(ze);
        int data;
        while ((data = fis.read()) != -1) {
            zos.write(data);
        }
        System.out.println("Copy Complete");
        zos.closeEntry();

        FileInputStream zis = new FileInputStream("student.zip");
        ZipInputStream is = new ZipInputStream(zis);

        is.getNextEntry();
        while ((data = is.read()) != -1) {
            System.out.print((char) data);
        }

        zis.close();
        fis.close();
        fos.close();

    }
}