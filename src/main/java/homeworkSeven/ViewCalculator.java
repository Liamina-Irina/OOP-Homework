package homeworkSeven;

import homeworkSeven.calculator.Calculable;
import homeworkSeven.calculator.ComplexNumber;
import homeworkSeven.calculator.ICalculableFactory;

import java.util.Scanner;

public class ViewCalculator {

    private Scanner scanner = new Scanner(System.in);
    private final ICalculableFactory iCalculableFactory;

    public ViewCalculator(ICalculableFactory iCalculableFactory) {
        this.iCalculableFactory = iCalculableFactory;
    }

    public void run() {

        Calculable calculator = iCalculableFactory.create(promptComplexNumber());

        while (true) {
            System.out.print("Введите операцию (+, -, *, /, =): ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    calculator.sum(promptComplexNumber());
                    break;
                case "-":
                    calculator.subtraction(promptComplexNumber());
                    break;
                case "*":
                    calculator.multiplication(promptComplexNumber());
                    break;
                case "/":
                    calculator.division(promptComplexNumber());
                    break;
                case "=":
                    System.out.println("Результат: " + calculator.getResult());
                    System.out.print("Продолжить? Y/N: ");
                    String nextCircle = scanner.nextLine().toUpperCase();
                    if (nextCircle.equals("N")) {
                        return;
                    } else {
                        calculator = iCalculableFactory.create(promptComplexNumber());
                    }
                    break;
                default:
                    System.out.println(input + " - данная операция не поддерживается");
            }
        }
    }

    private ComplexNumber promptComplexNumber() {
        System.out.print("Введите комплексное число: ");
        String input = scanner.nextLine();
        while ((!input.matches("^\\d+\\+\\d+i$"))) {
            System.out.print(input + " - не комплексное число, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }
}