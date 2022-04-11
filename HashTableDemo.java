package Bridgelabz;
import java.util.ArrayList;
import java.util.Scanner;

public class HashTableDemo {


        public static void main(String[] args) {

            System.out.println("Hello Hash Table");

            int[] input = {13,32,8,6,8,4,2,8,69,9,66,5,4,73,5,59,3,545,2,36,67,5,2,54};

            System.out.println("Input Data");
            for(byte i =0; i<input.length;i++) {
                System.out.print(input[i]+", ");
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("How many keys you want...Enter the number");
            int numberOfKey = scanner.nextInt();

            System.out.println("numberOfKey = "+numberOfKey);


            Object[] objects = new Object[numberOfKey];

            for(byte i =0; i<numberOfKey;i++) {
                objects[i] = new ArrayList<Integer>();
            }

            for(byte i =0; i<input.length;i++) {
                int key = input[i] % numberOfKey;
                ArrayList<Integer> list = (ArrayList<Integer>) objects[key];
                list.add(input[i]);
            }


            for(byte i =0; i<numberOfKey;i++) {
                ArrayList<Integer> list = (ArrayList<Integer>) objects[i];
                System.out.println("Key = "+ i+ " Values = "+list);
            }


        }
}
