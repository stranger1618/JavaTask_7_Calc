/**
 * Класс Калькулятор
 * Объект хранит значения двух дробных чисел и осуществляет операции над ними
 */


public class Calc {
    /**
     * * Атрибуты класса:
     * Дробное число firstNumber - первое число для операции
     * Дробное число secondNumber - второе число для операции
     */


    private double firstNumber;
    private double secondNumber;


    /**
     * Конструктор с заданными параметрами
     *
     * @param firstNumber Первое дробное число
     * @param secondNumber Второе дробное число
     */


    public Calc(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    /**
     * Геттер для первого числа
     *
     * @return Возвращает значение первого числа данного объекта
     */


    public double getFirstNumber() {
        return firstNumber;
    }


    /**
     * Сеттер для первого числа
     *
     * @param firstNumber Дробное число
     */


    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }


    /**
     * Геттер для второго числа
     *
     * @return Возвращает значение второго числа данного объекта
     */


    public double getSecondNumber() {
        return secondNumber;
    }


    /**
     * Сеттер для второго числа
     *
     * @param secondNumber Дробное число
     */


    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


    /**
     * Метод для сложения двух чисел, хранящихся в текущем объекте
     *
     * @return Результат сложения двух чисел
     */


    public double plus() {
        return getFirstNumber() + getSecondNumber();
    }


    /**
     * Метод для вычитания двух чисел, хранящихся в текущем объекте
     *
     * @return Результат вычитания двух чисел
     */


    public double minus() {
        return getFirstNumber() - getSecondNumber();
    }


    /**
     * Метод для умножения двух чисел, хранящихся в текущем объекте
     *
     * @return Результат умножения двух чисел
     */


    public double umn() {
        return getFirstNumber() * getSecondNumber();
    }


    /**
     * Метод для деления двух чисел, хранящихся в текущем объекте
     *
     * @return Результат деления двух чисел
     */


    public double del() {
        return getFirstNumber() / getSecondNumber();
    }
}

