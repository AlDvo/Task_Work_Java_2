import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskWork5 {

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
            double sum = one + two;
            return sum;
        }
        double minus(){
            double minus = one - two;
            return minus;
        }
        double proizv(){
            double proizv = one * two;
            return proizv;
        }
        double delenie(){
            double delenie = one / two;
            return delenie;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // считываем числа с клавиатуры
        System.out.print("Введите первое число ");
        double one = Double.parseDouble(reader.readLine());
        System.out.print("Введите второе число ");
        double two = Double.parseDouble(reader.readLine());
        System.out.print("Какую операцию вы хотите выполнить:сложение, вычитание, деление, умножение  ");
        String operation = reader.readLine();
        Calc calc = new Calc(one , two , operation);

        switch (operation){
            case ("сложение"):
                System.out.printf("Сумма чисел  = %.4f", calc.sum());
                break;
            case ("вычитание"):System.out.printf("Вычитание чисел  = %.4f", calc.minus());
                break;
            case ("деление"):System.out.printf("Деление чисел  = %.4f", calc.delenie());
                break;
            case ("умножение"):System.out.printf("Произведение чисел  = %.4f", calc.proizv());
                break;
            default:System.out.print("Не правильно введено название операции");
                break;
        }
    }
}

