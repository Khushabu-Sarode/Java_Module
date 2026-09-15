package CheckFileDirectory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class CheckFileDirectory {

	  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file or directory name: ");
        String name = sc.nextLine();

        File f = new File(name);

        if (f.isDirectory()) {

            System.out.println("It is a directory.");

            String files[] = f.list();

            for (String file : files) {
                System.out.println(file);
            }

        } else if (f.isFile()) {

            System.out.println("It is a file.");
            System.out.println("File size = " + f.length() + " bytes");

            try {

                if (f.length() > 25) {

                    System.out.println("Using buffering:");

                    BufferedReader br =
                            new BufferedReader(new FileReader(f));

                    String line;

                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }

                    br.close();

                } else {

                    System.out.println("Using FileInputStream:");

                    FileInputStream fis =
                            new FileInputStream(f);

                    int ch;

                    while ((ch = fis.read()) != -1) {
                        System.out.print((char) ch);
                    }

                    fis.close();
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } else {
            System.out.println("File or directory does not exist.");
        }

        sc.close();
    }

}
