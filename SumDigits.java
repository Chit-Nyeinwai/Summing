import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int num, temp, temp1, temp2, sum;

        //Create a scanner class object
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000: ");
        num = scanner.nextInt();

        sum = 0;
        temp = num / 10;
        if (temp != 0 || temp == 0) {
            sum += num % 10;
            temp1 = temp / 10;

            if (temp1 != 0 || temp1 == 0) {
                sum += temp % 10;
                temp2 = temp1 / 10;

                if (temp2 == 0) {
                    sum += temp1 % 10;
                    System.out.println("The sum of the digits is " + sum);
                } else {
                    System.out.println("The number you have entered is invalid");
                }

            }
        }

    }
}


