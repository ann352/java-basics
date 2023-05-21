import java.util.Random;
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

        // GAME - GUESS THE DRAWING NUMBER

        //we use here random value, and for that we use method nextInt() -> that draw value from '0' (inclusive), to given value exclusive (that means given value -1)
        // when we want to have numbers from 1 to 100, we should to the result of nextInt() method add 1

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;

        //we also should now if the number was guessed - so we have to define variable that tell us if we should ask about the number further

        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed) { // we execute loop to time when condition is true, when in loop we transform false to true '!' -> negation -> will end the loop
            System.out.println("Insert the number");
            Scanner scanner3 = new Scanner(System.in);
            int userNumber = scanner3.nextInt();

            if (userNumber > numberToGuess) {
                System.out.println("Your number is too big! Try again");
            } else if (userNumber < numberToGuess) {
                System.out.println("Your number is too small! Try again");
            } else {
                System.out.println("Congratulations! You guess the number! Hurra! ");
                wasNumberGuessed = true;
            }

        }

        // DATA STRUCTURES - we have those structures for easy finding and operating similar values

        // the first important structure in Java are tables -> e.g.  we have similar data on every site in binder
        // the size of table we specified when table is created and to extend old table we have to crate new table, and copied values from the old

        // the number of persons at the party
        String [] names = new String [4];

        // we put values to the table in this way -> we are starting from '0' or in that way -> String[]names = {"Tomek","Romek","Asia","Stasia" }
        names [0] = "Tomek";
        names [1] = "Romek";
        names [2] = "Asia";
        names [3] = "Basia";

        //when we add new value e.g. here names[3]="Stasia" then in table we will have only the new value
        //when we try to add to table value for table index that not exist we get -> ArrayIndexOutOfBoundsException -> names [4] = "Jasia";

        //we can show what values we have in the table by for loop , by using method that returns the size of table
        for(int i = 0; i < names.length ; i++){
            System.out.println(names[i]);
        }

        //here is another way to show values of the table - by using 'for' loop
        // we define the type and name of single element and after ':' we indicate in which table we iterate -> later we only show every single element

        for(String tableName : names){
            System.out.println(tableName);
        }


    }
}
