public class App {
    public static void main(String[] args) throws Exception {
        //Printing the name of the app 
     String name = "Printer App";
     System.out.println(name);

     //Printing the creator´s name
     String name2 = ("This app is made by ");
     String creator = ("Katarina");
     System.out.println (name2 + creator);
     //Declaring and assinging values to two numbers 

    double number1 =27;
    double number2 =13;

    //Printing the values of number1 and number2


    String value1 = ("The value of number 1 is "); 
    System.out.println(value1 + number1);

    String value2 = ("The value of number 2 is ");
    System.out.println(value2 + number2);

    //Performing operations

    double multiplication = (number1 * number2);
    String result1 = String.format("%.2f ", multiplication);
    double sum = number1 + number2;
    String result2 = String.format("%.2f ", sum);
    double division = number1 / number2;
    String result3 = String.format("%.2f ", division);
    double subtraction = number1 - number2;
    String result4 = String.format("%.2f ", subtraction);

    //Prinitng results of all operations
    
    System.out.println (number1 + " * " + number2 + " = " + result1);
    System.out.println (number1 + " + " + number2 + " = " + result2);
    System.out.println (number1 + " / " + number2 + " = " + result3);
    System.out.println (number1 + " - " + number2 + " = " + result4);

    // End of main method


    }
    }
