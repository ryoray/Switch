package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("The value was 1");
//        } else if (value == 2) {
//            System.out.println("The value was 2");
//        } else {
//            System.out.println("The value was not 1 0r 2");
//        }

        int switchValue = 6;
        switch (switchValue) {
            case 1:
                System.out.println("The value was 1");
                break;

            case 2:
                System.out.println("The value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4, 5");
                break;
        }

        char switchChar = 'h';
        switch (switchChar) {
            case 'a':
                System.out.println("It was A");
                break;

            case 'b':
                System.out.println("It was B");
                break;

            case 'c':
                System.out.println("It was C");
                break;

            case 'd':
                System.out.println("It was D");
                break;

            case 'e':
                System.out.println("It was E");
                break;

            default:
                System.out.println("It was not A, B, C, D, or E");
                break;
        }

        String myStringValue = "JANUaaarY";
        switch (myStringValue.toLowerCase()) {
            case "january":
                System.out.println("The month of January");
                break;

            case "february":
                System.out.println("The month of February");
                break;

            default:
                System.out.println("Not know");
                break;
        }
    }
}
