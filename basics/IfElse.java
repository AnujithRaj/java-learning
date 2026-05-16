package basics;

public class IfElse {
    public static void main(String[] args) {

        boolean tired = true;
        
        if(tired) {
            System.out.println("Im feeling Sleepy");
        }
        else {
            System.out.println("In feeling Energetic!");
        }

        int marks = 86;
        if (marks > 90) {
            System.out.println("A+");
        }
        else if (marks > 75) {
            System.out.println("B+");
        }
        else if (marks > 60) {
            System.out.println("B");
        }
        else if (marks > 40) {
            System.out.println("c");
        }
        else {
            System.out.println("Fail");
        }


    }
}
