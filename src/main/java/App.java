import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите выражение");
    String input = scanner.nextLine();
    String[] parts = input.split(" ");
    if (parts.length != 3) {
        System.out.println("Неверный формат ввода!");
        return;            }
    double num1, num2, result;
    try {
        num1 = Double.parseDouble(parts[0]);
        num2 = Double.parseDouble(parts[2]);
    } catch (NumberFormatException e) {
        System.out.println("Ошибка: введите числа!");
        return;
    }
    char operator = parts[1].charAt(0);
    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
            case '/':
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Ошибка: деление на 0!");
                return;
            }
            break;
            default:System.out.println("Ошибка: некорректная операция!");
            return;
    }
    System.out.println("Результат: " + result);
    scanner.close();


}    }