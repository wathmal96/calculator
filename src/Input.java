import java.util.Scanner;
public class Input {
    public static int getData(String inputName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number for "+inputName+":");
        return scanner.nextInt();
    }
}
