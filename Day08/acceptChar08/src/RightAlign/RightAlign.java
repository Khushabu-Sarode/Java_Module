package RightAlign;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class RightAlign {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {

            BufferedReader br =
                    new BufferedReader(new FileReader(fileName));

            ArrayList<String> lines = new ArrayList<>();

            String line;
            int max = 0;

            while ((line = br.readLine()) != null) {

                lines.add(line);

                if (line.length() > max) {
                    max = line.length();
                }
            }

            br.close();

            for (String s : lines) {

                int spaces = max - s.length();

                for (int i = 0; i < spaces; i++) {
                    System.out.print("*");
                }

                System.out.println(s);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}