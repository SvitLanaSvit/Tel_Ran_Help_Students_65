package task1;

//переведите такие числа как 1144, 978, 12 из 10й в 8ю системы счисления и обратно
public class Task1 {
    public static void main(String[] args) {
        int value1 = 1144, value2 = 978, value3 = 12;
        String str1 = DecimalToOctal(value1);
        String str2 = DecimalToOctal(value2);
        String str3 = DecimalToOctal(value3);
        System.out.println("-----Decimal to Octal-----");
        System.out.println(str1 + "\n" + str2 + "\n" + str3 + "\n");

        System.out.println("-----Octal to Decimal-----");
        OctalToDecimal(Integer.parseInt(str1));
        OctalToDecimal(Integer.parseInt(str2));
        OctalToDecimal(Integer.parseInt(str3));
    }

    static String DecimalToOctal(int val) {
        StringBuilder sb = new StringBuilder();
        int remainder;
        while (val > 0) {
            remainder = val % 8;
            //System.out.println("val" + val);
            //System.out.println("val % 8" + val % 8);
            val = val / 8;
            sb.append(remainder);
        }
        return sb.reverse().toString();
    }

    static void OctalToDecimal(int val) {
        int decimal = 0;
        int power = 0;
        while (val > 0) {
            int digit = val % 10;
            decimal += digit * Math.pow(8, power);
            val /= 10;
            power++;
        }
        System.out.println(decimal);
    }
}
