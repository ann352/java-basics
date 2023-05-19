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

        if (age >= 18) {
            System.out.println("You are adult. You can buy alkohol!");
        } else if (age < 18) {
            System.out.println("You can't buy alkohol! You are too young!");
        }

        // 2. PRIMITIVE TYPES - SPECIFIES VALUE AND TYPE OF VARIABLE VALUES AND IT HAS NO ADDITIONAL METHODS Like reference type String (e.g. endsWith())
        // java it is static typed language. so when we create specific variable with given type -> e.g. string we can't put to this variable other type
        // from java10 -> we have type 'var'  - this type guess what is the value type of variable
        // additionally in java we have about 50 reserved words and we cannot use those words to name variables

        // 3. BOOLEAN - we use this type to check if expression evaluate to true or false -> value of those expression can be type boolean ->
        // == -> equal ; > ; < ; !=

        boolean isSkyBlue = true;

        if (isSkyBlue) {
            System.out.println("Sky is blue today");
        } else {
            System.out.println("Sky isn't blue today!");
        }

        // 4. LOOPS in Java  ->  a) FOR  ,  b) WHILE -> the main action that loop should do is to repeat given action specified number of times

        // FOR

        // when we create for loop we should specified (we specified initial codition ; ending condition ; and what should be done every time -> incremetation or decrementation)
        // in curly brackets we write what loop should do in every step

        for (int i = 1, j = 10; i <= 9; i += 2, j++) {
            System.out.println(i);
            System.out.println(j);
            System.out.println();
        }


        // WHILE

        // until condition is true -> loop is supposed to run

        int k = 1;

        while (k < 10) {
            System.out.println("k is smaller then 10");
            k++;
        }
        // variation of while loop is DO-WHILE -> at first loop is executed and later we check condition -> so loop will be executed last once

        do {
            System.out.println("First execution of the do-while loop");
        }
        while (1 > 2);


        // BREAK & CONTINUE

        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                continue; // we come to 2. break actual executing of the loop and do next circle
            }
            if (i == 7) {
                break; // we come only to 7 and break all the loop
            }
            System.out.println(i);
        }


        // THE GAME FIZZ-BUZZ

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {  //this condition is first cause when we check if 'i' is divisible by 3, we wouldn't check later if it is divisible by 5, too
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


    }
}
