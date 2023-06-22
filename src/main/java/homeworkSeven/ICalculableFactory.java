package homeworkSeven;
import homeworkSeven.Calculable;
import homeworkSeven.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primaryArg);
}