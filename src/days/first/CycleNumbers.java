package days.first;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class CycleNumbers {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number");
            try {
                int numb = scanner.nextInt();
                if (numb != 0) {
                    String numbToStr = Integer.toString(numb);
                    char numbArr[] = numbToStr.toCharArray();
                    int numbX2 = numb * 2;
                    String numbToStrX2 = Integer.toString(numbX2);
                    char numbArrX2[] = numbToStrX2.toCharArray();
                    Arrays.sort(numbArr);
                    Arrays.sort(numbArrX2);
                    if (Arrays.equals(numbArr, numbArrX2)) {
                        System.out.println("Magic");
                    } else {
                        System.out.printf("Not magic");
                    }
                    break;
                }
                else {
                    System.out.println("Enter correct number.");
                    scanner.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter correct number.");
                scanner.nextLine();
            }
        }
    }


}

