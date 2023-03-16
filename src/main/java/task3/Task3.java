package task3;

//Задайте строковую переменную с таким значением как "Hello, Java! It's a Java Basic course" (её лучше скопировать).
//Напишите код (используя уже известные методы), который будет выводить в командную строку следующее:
//- длину этой строки
//- символ '!' (без одинарных кавычек)
//- "It's a Java" (без двойных кавычек)
//- "Java Basic course" (без двойных кавычек)

public class Task3 {
    public static void main(String[] args) {
        String str = "Hello, Java! It's a Java Basic course";
        //-
        System.out.println("The length of string: " + str.length());
        //-
        System.out.println(str.charAt(str.indexOf('!')));
        //-
        String targetT3 = "It's a Java";
        int indexT3 = str.indexOf(targetT3);
        System.out.println(str.substring(indexT3, indexT3 + targetT3.length()));
        //-
        String targetT4 = "Java Basic course";
        int indexT4 = str.indexOf(targetT4);
        System.out.println(str.substring(indexT4, indexT4 + targetT4.length()));
    }
}
