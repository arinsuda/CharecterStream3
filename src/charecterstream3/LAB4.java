package charecterstream3;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB4 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            Scanner input = new Scanner(file);
            
            String name = input.nextLine();
            System.out.println(name);
            int age = input.nextInt();
            System.out.println(age);
            float weight = input.nextFloat();
            System.out.println(weight);
            double height = input.nextDouble();
            System.out.println(height);
            
//            System.out.println(input.nextLine());
//            System.out.println(input.nextInt());
//            System.out.println(input.nextFloat());
//            System.out.println(input.nextDouble());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
