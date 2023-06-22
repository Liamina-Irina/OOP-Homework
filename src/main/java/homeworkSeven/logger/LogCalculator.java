package homeworkSeven.logger;

import homeworkSeven.calculator.Calculable;
import homeworkSeven.calculator.ComplexNumber;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    private Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Комплексное число: " + calculable.getResult());
    }

    @Override
    public void sum(ComplexNumber arg) {
        logger.writeLog("Операция: сумма с комплексным числом: " + arg);
        calculable.sum(arg);
    }

    @Override
    public void multiplication(ComplexNumber arg) {
        logger.writeLog("Операция: произведение с комплексным числом: " + arg);
        calculable.multiplication(arg);
    }

    @Override
    public void subtraction(ComplexNumber arg) {
        logger.writeLog("Операция: вычитание комплексного числа: " + arg + '\n');
        calculable.subtraction(arg);
    }

    public void division(ComplexNumber arg) {
        logger.writeLog("Операция: деление на комплексное число: " + arg + '\n');
        calculable.division(arg);
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculable.getResult();
        logger.writeLog("Результат: " + result);
        return result;
    }
}