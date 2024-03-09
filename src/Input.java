import java.util.Scanner;
public class Input {
    public static int getData(String inputName){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number for "+inputName+":");
        return scanner.nextInt();
    }
}
