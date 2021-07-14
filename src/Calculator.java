import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


//
//●      commit, create pull request and merge your work to Github

//      Create two numerical variables with initial values.

        int var1, var2;
//        var1 = 69;
//        var2 = 88;

//      Create an char type variable which represents the user option (please use the switch control):
//a.      ‘+’ sum both elements;
//b.     ’-’: do subtraction;
//c.      ’/’: do dividing;
//d.     ‘*’: do multiplication;
//e.      ‘%’: get remainder when the first element is divided by the second element;
//
//f.      ‘p’: print out both elements;
//
//g.     ‘b’: verify which element is bigger;
//
//h.     ‘s’: verify which element is smaller;

        char userOption = 'a';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        var1 = scanner.nextInt();
        System.out.println("Choose your options: +, -, *, /, %, s, b, p");
        userOption =scanner.next().charAt(0) ;
        System.out.println("Enter a number");
        var2 = scanner.nextInt();

        char plus = '+';
        char minus = '-';
        char divide = '/';
        char multiply = '*';
        char remainder = '%';
        char print = 'p';
        char bigger = 'b';
        char smaller = 's';


//      Please add the possibility to write both variable values and the option in the console.
//      Read, verify and do an algorithm

        System.out.println("There is a number " + var1 + " and there is a number " + var2);

        switch (userOption) {
            case '+' :
                System.out.println("The sum of both digits is " + (var1 + var2));
                break;
            case '-' :
                System.out.println("If you substract one from the other the result is " + (var1 - var2));
                break;
            case '/' :
                System.out.println("If you do the division " + (var1 / var2));
                break;
            case '*' :
                System.out.println("And you can also multiply and get" + (var1 * var2));
                break;
            case '%' :
                System.out.println("After you divide the two all that's left is " + (var1 % var2));
                break;
            case 'p' :
                System.out.println("The number you have selected are " + var1 + " and " + var2);
                break;
            case 'b' :
                System.out.println("The biggest number of the two is " + (Math.max(var1,var2)));
                break;
            case 's' :
                System.out.println("The smallest number of the two is " + (Math.min(var1,var2)));
                break;
            default:
                System.out.println("Oooops, something went wrong");


        }

    }
}
