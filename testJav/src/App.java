import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 3;
        String stringVal = "string Example";
        String testInputValue;

        System.out.println(" This is test int value" + temp);
        System.out.println(stringVal);
        System.out.println("Starting here today");


        System.out.println("Enter a test value string");
        testInputValue = in.next();
        System.out.println(" The test value = " + testInputValue);
        in.close();

        if(stringVal != testInputValue)
        {
            System.out.println(" Input value is not equal to string value");
        }
        else
        {
            System.out.println(" Input value is equal to string value");
            
        }

    }
}
