package basics;

public class VariablesContinued {
    public static void main(String[] args) {

        int x = 1000000000;
        // 32 bits = -2^31 to 2^31
        System.out.println(x);

        long y = 100000000000000L;
        // 64 bits = -2^63 to 2^63
        // long also take up more memory as compared 
        System.out.println(y);

        short num = 100;
        // 16 bits = -2^15 to 2^15
        // takes up less space
        System.out.println(num);

        byte num1 = 100;
        // 8 bits =-2^7 to 2^7
        System.out.println(num1);

        double num2 = 32.27483;
        // store decimal value
        System.out.println(num2);

        boolean bool = true;
        // store only true or false
        System.out.println(bool);

        char character = 'L';
        // store character type data
        System.out.println(character);






    }
}