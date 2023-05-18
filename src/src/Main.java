import java.util.Scanner;

public class Main {

    // to run program in Java we must have main method in program
    // signature of method - is its name of method, arguments and type that is returning
    // the name of the class should be the same as the name of the file where it is
    // we use camelCase convention in java

    // to greet person that run our program we have to crate variable that takes the name

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //here goes what user writes
        System.out.println("What's your name?");
        String name = scanner.nextLine(); // from what user writes we take the next line

        System.out.println("Hello " + name);

        // 1. INSTRUCTION - IF-ELSE IF - ELSE
        // in programming, we conduct certain instructions depends on what will happen, e.g. depending on given name we can show info if person is female or male
        // if first condition is true, then we don't check the rest of conditions

        if (name.endsWith("a")) {
            System.out.println("You are a woman!");
        } else if (name.endsWith("l")) {
            System.out.println("Your name ends with 'l'");

        } else {
            System.out.println("You are a man!");
        }

        //we can concat different conditions together

        if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("You are a woman!");
        } else if (!name.isEmpty() && !name.endsWith("a")) {
            System.out.println("You are a man!");
        } else {
            System.out.println("You didn't specified a name. Insert the name");
        }

        //here to have appropriate answer at first we check male name
        if (!name.isEmpty() && (!name.endsWith("a") || name.equals("Barnaba") || name.equals("Kuba"))) {
            System.out.println("You are a man!");
        } else if (!name.isEmpty() && name.endsWith("a")) {
            System.out.println("You are a woman!");
        } else {
            System.out.println("You didn't specified a name. Insert the name");
        }

        System.out.println("How old are you?");
        Scanner scanner2 = new Scanner(System.in);
        int age = scanner2.nextInt();

        if ( age >= 18) {
            System.out.println("You are adult. You can buy alkohol!");
        }
        else if (age < 18) {
            System.out.println("You can't buy alkohol! You are too young!");
        }
    }}