import java.util.Scanner;

public class Calc {

    private double a;
    private double b;
    private String operation;
    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Введите два числа и операцию");
                String input = scanner.nextLine();
                String[] parts = input.split(" ");
                if (parts.length != 3) {
                    throw new IllegalArgumentException("Некорректный ввод. Попробуйте снова.");
                }
                
                a = Double.parseDouble(parts[0]);
                b = Double.parseDouble(parts[2]);
                operation = parts[1];

                switch (operation) {
                    case "+":
                        sum();
                        break;
                    case "-":
                        subtract();
                        break;
                    case "*":
                        multiply();
                        break;
                    case "/":
                        divide();
                        break;
                    default:
                        System.out.println("Некорректная операция");
                }
                
                break; 
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Введите числа в правильном формате.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        
        scanner.close();
    }

    public void sum() {
        double sum = a + b;
        System.out.println("Сумма чисел: " + sum);
    }

    public void subtract() {
        double sub = a - b;
        System.out.println("Разность чисел: " + sub);
    }

    public void multiply() {
        double mul = a * b;
        System.out.println("Произведение чисел: " + mul);
    }

    public void divide() {
        if (b != 0) {
            double del = a / b;
            System.out.println("Частное чисел: " + del);
        } else {
            System.out.println("Деление на ноль невозможно");
        }
    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.readNumbers();
    }
}