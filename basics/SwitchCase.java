package basics;

public class SwitchCase {
    public static void main(String[] args) {

        // Switch cases are just like if-else, just a simpler way of writing if-else
        int num = 3;
        if(num == 1) {
            System.out.println("One");
        }
        else if (num == 2) {
            System.out.println("Two");
        }
        else if (num == 3) {
            System.out.println("Three");
        }

        switch(num) {
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            default:
                System.out.println("Unknown");

        }
    }
}
