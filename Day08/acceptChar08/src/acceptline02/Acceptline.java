package acceptline02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acceptline {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter lines ('quit' to stop)");

            String line;
            String longest = "";

            while (!(line = br.readLine()).equals("quit")) {

                System.out.println(line);

                if (line.length() > longest.length())
                    longest = line;
            }

            System.out.println("Longest line: " + longest);
            System.out.println("Number of characters: " + longest.length());
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (br != null)
                    br.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}