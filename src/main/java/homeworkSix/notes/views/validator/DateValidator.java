package homeworkSix.notes.views.validator;

public class DateValidator {
    String userInput;
    public DateValidator(String userInput) {
        this.userInput = userInput;
    }

    public void validate() throws Exception{
        if (!userInput.matches("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d")){
            throw new Exception("Валидация не прошла");
        }

    }
}