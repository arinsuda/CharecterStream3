package charecterstream3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB5 {

    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        System.out.print("Enter text : ");
        try {
            String s = input.readLine();
            System.out.println(s);
        } catch (IOException ex) {
            Logger.getLogger(LAB5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
