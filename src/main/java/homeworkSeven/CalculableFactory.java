package homeworkSeven;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg) {
        return new Calculator(primaryArg);
    }
}