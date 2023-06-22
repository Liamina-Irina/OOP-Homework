package homeworkSeven.logger;

import homeworkSeven.calculator.Calculable;
import homeworkSeven.calculator.Calculator;
import homeworkSeven.calculator.ComplexNumber;
import homeworkSeven.calculator.ICalculableFactory;

public class LogCalculableFactory implements ICalculableFactory {
    Logger logger;

    public LogCalculableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}