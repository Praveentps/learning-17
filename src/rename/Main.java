package rename;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        String oldName="content-aggregator",newName="consumer";
        BufferedReader bf = null;
        try {
            bf = new BufferedReader(new FileReader("/Users/praveentalawar/Documents/personal/learning-17/src/rename/files.txt"));
            String line;
            while ((line = bf.readLine()) != null) {
                String oldFile = line;
                System.out.println(oldFile);

                String newFile = line.replaceFirst(oldFile, newName);
                System.out.println(newFile);
                File oldfile = new File(oldFile);
                File newfile = new File(newFile);

                System.out.println(oldfile.exists());
                if (oldfile.exists() && oldfile.renameTo(newfile)) {
                    System.out.println("Rename succesful");
                } else {
                    System.out.println("Rename failed");
                }
            }
        } finally {
            bf.close();
        }

    }


}
