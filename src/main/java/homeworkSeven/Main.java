package homeworkSeven;

import homeworkSeven.logger.Log;
import homeworkSeven.logger.LogCalculableFactory;
import homeworkSeven.logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Log();
        LogCalculableFactory logCanCalculateFactory = new LogCalculableFactory(logger);
        ViewCalculator consoleView = new ViewCalculator(logCanCalculateFactory);
        consoleView.run();
    }
}