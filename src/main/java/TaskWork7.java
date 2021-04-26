import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class TaskWork7 {

    public static class Zero extends Exception{
        public Zero(String message){
            super(message);
        }
    }

    static class Calc {
        double one;
        double two;
        String operation;

        Calc(double one , double two , String operation){
            this.one = one;
            this.two = two;
            this.operation = operation;
        }

        double sum(){
            return one + two;
        }
        double minus(){
            return one - two;
        }
        double proizv(){
            return one * two;
        }
        double delenie(){
            return one / two;
        }
    }
    public static void main(String[] args) throws IOException, Zero {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // считываем числа с клавиатуры
        System.out.print("Введите первое число ");
        double one = 0;
        try {
            one = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            System.out.println("Не введено первое число");
        }catch (NumberFormatException  e) {
            System.out.println("Не правильный формат числа");
        }

        System.out.print("Введите второе число ");
        double two = 0;
        try {
            two = Double.parseDouble(reader.readLine());
        } catch (NumberFormatException  e) {
            System.out.println("Не правильный формат числа");
        }catch (IOException e) {
            System.out.println("Не введено второе число");
        }
        // Запрашивем название операции
        System.out.print("Какую операцию вы хотите выполнить:сложение, вычитание, деление, умножение  ");
        String operation =  reader.readLine();

        Calc calc = new Calc(one , two , operation);

        switch (operation){
            case ("сложение"):
                System.out.printf("Сумма чисел  = %.4f", calc.sum());
                break;
            case ("вычитание"):System.out.printf("Вычитание чисел  = %.4f", calc.minus());
                break;
            case ("деление"):
                if (calc.delenie() == Infinity){
                   throw new Zero("Деление на ноль");
                } else {
                System.out.printf("Деление чисел  = %.4f", calc.delenie());
                }
                break;
            case ("умножение"):System.out.printf("Произведение чисел  = %.4f", calc.proizv());
                break;
            default:System.out.print("Не правильно введено название операции");
               break;
        }
    }
}

