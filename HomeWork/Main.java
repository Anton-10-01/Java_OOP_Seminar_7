package Java_OOP_Seminar_7.HomeWork;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        consoleHandler.setFormatter(new SimpleFormatter());
        logger.addHandler(consoleHandler);


        // Создание калькулятора
        ComplexCalculator calculator = new ComplexCalculator(logger);

        // Выполнение операций
        Complex a = new Complex(1, 5);
        Complex b = new Complex(5, -10);

        Complex sum = calculator.sum(a, b);
        Complex product = calculator.multiply(a, b);
        Complex quotient = calculator.divide(a, b);
    }
}
