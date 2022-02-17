import java.util.Scanner;
import java.util.Arrays;
public class AddNumbers {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("insert your numbers:");
        Scanner input = new Scanner(System.in);
//        check if user insert another number
        if (input.hasNextLine()){
            String line = input.nextLine();
//            define array variable to hold inputs and remove any white space
            String [] array = line.split("\\s+");
//            define array of integers
            int [] numbers = new int[array.length];
            for(int i=0; i < array.length; i++){
//                change number from string to integer
                numbers[i] = Integer.parseInt(array[i]);
                sum = sum + numbers[i];
            }

            System.out.println("sum of your input = " + sum);

        }
    }
}



