package acceptChar08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptChar {

    public static void main(String[] args) {

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter characters ('q' to quit)");

            int i;
            int alphabets = 0;
            int digits = 0;

            while ((i = br.read()) != 'q') {

                char ch = (char) i;

                System.out.println(ch);

                if (Character.isAlphabetic(ch))
                    alphabets++;

                if (Character.isDigit(ch))
                    digits++;
            }

            System.out.println("Number of alphabets: " + alphabets);
            System.out.println("Number of digits: " + digits);
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