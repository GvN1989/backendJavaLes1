public class Main {
    public static void main(String[] args) {

        int number = -5;
        String name = "Henk";
        int input1 = 8;
        int input2 = 20;

        hello();

        positiveOrNegative(number);

        postiveOrZeroOrNegative(number);

        bartender(name);

        sum(input1, input2);




    }

    public static void hello() {

        System.out.println("Hello world!");
    }

    public static void positiveOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }

    }

    public static void postiveOrZeroOrNegative(int number) {
        if (number == 0)
        {
            System.out.println("This number is zero!");
        } else if (number > 0 ) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }

    }

    public static void bartender (String name) {
        switch (name) {
            case "Henk":
                System.out.println(name + " likes Dark & Stormy");
                break;
            case "Steven":
                System.out.println(name + " likes Manhatten");
                break;
            case "Richard":
                System.out.println(name + " likes Gin en Tonic");
                break;
            default:
                System.out.println("It is unknown what this person likes");

        }
    }

    private static void  sum( int input1, int input2) {
        int sumInput1Input2 = input1 + input2 ;
        System.out.println("input1 summed by input2 = " + sumInput1Input2);
    }

}
   /*




} */

