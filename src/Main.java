public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator=new myCalculatorImpl();
        System.out.println("Sum:"+myCalculator.getSum(Input.getData("Sum"),Input.getData("Sum")));
        System.out.println("Subtraction:"+myCalculator.getSubtraction(Input.getData("Subtraction"),Input.getData("Subtraction")));
        System.out.println("Multiplication:"+myCalculator.getMultiplication(Input.getData("Multiplication"),Input.getData("Multiplication")));
    }
}
