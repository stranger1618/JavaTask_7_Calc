import java.util.Scanner;
import java.util.*;




/**
 * Калькулятор. Выполнение операций над двумя дробными числами.
 * Выбор операции осуществляется из консоли
 *
 * @see Calc
 */


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static void main(String[] args) {
        //Объявление переменных
        Scanner myValue = new Scanner(System.in);
        int choice;
        while (true) {
            //Начало обработки исключения по вводу некорректного символа
            try {
                //Ввод пользователем двух дробных чисел
                System.out.println("\nВведите " + ANSI_GREEN + "первое " + ANSI_RESET + "число:");
                double firstNumber = myValue.nextDouble();
                System.out.println("Введите " + ANSI_PURPLE + "второе " + ANSI_RESET + "число:");
                double secondNumber = myValue.nextDouble();


                //Создание объекта калькулятора
                Calc myCalculator = new Calc(firstNumber, secondNumber);


                System.out.println();


                //Цикл выбора операции повторяется, пока пользователь не введет команду выхода из модуля
                while (true) {
                    //Вывод меню выбора операции
                    System.out.println("\nВыберите операцию ");
                    System.out.println("1. +");
                    System.out.println("2. -");
                    System.out.println("3. *");
                    System.out.println("4. /");
                    System.out.println("5. Выход из программы.");


                    //Считывание выбора операции
                    choice = myValue.nextInt();
                    //Выбор операции
                    switch (choice) {
                        case 1:
                            //При выборе "1" вызывается метод сложения чисел Calculator.plus() и выводится результат
                            System.out.printf("\n%.4f + %.4f = %.4f\n\n",
                                    myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.plus());
                            break;
                        case 2:
                            //При выборе "2" вызывается метод вычитания чисел Calculator.minus() и выводится результат
                            System.out.printf("\n%.4f - %.4f = %.4f\n\n",
                                    myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.minus());
                            break;
                        case 3:
                            //При выборе "3" вызывается метод умножения чисел Calculator.umn() и выводится результат
                            System.out.printf("\n%.4f * %.4f = %.4f\n\n",
                                    myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.umn());
                            break;
                        case 4:
                            try {
                                //При выполнение деления на 0 появляется предупреждение
                                if (secondNumber == 0) {
                                    throw new ArithmeticException(ANSI_RED + "На ноль делить нельзя!!" + ANSI_RESET);
                                } else
                                    //При выборе "4" вызывается метод деления чисел Calculator.del() и выводится результат
                                    System.out.printf("\n%.4f / %.4f = %.4f\n\n",
                                            myCalculator.getFirstNumber(), myCalculator.getSecondNumber(), myCalculator.del());
                            } catch (ArithmeticException ex) {
                                System.out.println(ex.getMessage());
                            }
                            break;
                        case 5:
                            //При выборе "5" происходит выход из модуля
                            System.out.println("\nВыход из программы...\n");
                            return;
                        default:
                            //Вывод ошибки при вводе некорректной команды
                            System.out.println(ANSI_RED + "\nТакой операции нет, выберите другую операцию!\n"+ ANSI_RESET);
                    }
                }
            }
            catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Введен некорректный символ!" + ANSI_RESET);
                myValue.next();
                continue;
            }
        }
    }
}

