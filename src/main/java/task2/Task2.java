package task2;

//Разработайте алгоритм для считывания (через Scanner) из командной строки целочисленного числа,
//трансформации его в троичную систему (по аналогии как мы делали с другими системами)
//и вывода в командную строку результата

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        boolean isValidInput = false;

        while(!isValidInput){
            System.out.print("Please enter value: ");
            String val = scanner.next();
            try{
                value = Integer.parseInt(val);
                isValidInput = true;
            }catch (NumberFormatException ex){
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        if(value != 0) {
            DecimalToThird(value);
        }
        else{
            System.out.println("The value is " + value);
        }
        scanner.close();
    }

    static void DecimalToThird(int val){
        StringBuilder sb = new StringBuilder();
        int remainder;
        while(val > 0)
        {
            remainder = val % 3;
            val = val / 3;
            sb.append(remainder);
        }

        System.out.println(sb.reverse());
    }
}
