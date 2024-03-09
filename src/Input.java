import java.util.Scanner;
public class Input {
    public static int getData(String inputName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number for "+inputName+":");
        System.out.println(" ");
        return scanner.nextInt();
    }
}
