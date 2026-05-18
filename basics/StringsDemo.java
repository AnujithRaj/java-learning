package basics;

public class StringsDemo {
    public static void main(String[] args) {
        {

        // String is NOT a primitive data type.
        String a = "Apple";

        int x = a.length();
        System.out.println(x);
    }

    {
        // numbering starts from 0 in programming
        // a string will have characters from 0 to str.length() -1
        String str = "This is a string";

        char ch = str.charAt(0);

         System.out.println(ch);
    
        // return us a part of the string str which starts at the first index and ends at the second index.
        String f = str.substring(1,13);

        System.out.println(f);
    }

    {
        // find the position of "Everyone" in this string
        String str = "Hello Everyone, Welcome to Java World!";

        int ind = str.indexOf("Everyone",0);

        System.out.println(ind);
    }

    
    }
    
}
