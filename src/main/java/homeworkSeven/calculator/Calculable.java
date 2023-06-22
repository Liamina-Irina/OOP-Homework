package homeworkSeven.calculator;

public interface Calculable {
    void sum(ComplexNumber arg);

    void subtraction(ComplexNumber arg);

    void multiplication(ComplexNumber arg);

    void division(ComplexNumber arg);

    ComplexNumber getResult();

}
