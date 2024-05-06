package itmoTasks.Task9_1;

class ArithmeticCalculator {
    public static double evaluateExpression(String expression) {
        String[] tokens = expression.split(" ");

        if (tokens.length != 3) {
            throw new IllegalArgumentException("Некорректное выражение. Пожалуйста, " +
                    "следуйте формату: число оператор число.");
        }

        double number1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double number2 = Double.parseDouble(tokens[2]);

        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно.");
                }
                return number1 / number2;
            default:
                throw new IllegalArgumentException("Неподдерживаемый оператор: " + operator +
                        ". Поддерживаются операторы: +, -, *, /.");
        }
    }
}

