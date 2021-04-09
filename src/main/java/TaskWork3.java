import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *@author Dvorenenko
 */

public class TaskWork3 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Выбираем одно из заданий на выбор
        System.out.print("Введите значение: 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве ");
        int task = Integer.parseInt(reader.readLine());

        if (task == 2 ){
            reader = new BufferedReader(new InputStreamReader(System.in));
            // Задаем размер массива слова
            System.out.print("Введите размер массива ");
            int mass = Integer.parseInt(reader.readLine());
            int max = 0;
            int index = 0;
            String[] list = new String[mass];

            // Запускаем цикл заполнения массива словами
            for (int i = 0; i < list.length; i++) {
                System.out.print("Введите слово ");
                String s = reader.readLine();
                list[i] = s;
                // Определяем самое длинное слово и его номер в массиве
                if (max < list[i].length()) {
                    max = list[i].length();
                    index = i;
                }
            }
            System.out.println("Самое длинное слово " + list[index]);
            System.out.println("Длина слова " + max);

        } else {

            reader = new BufferedReader(new InputStreamReader(System.in));
            // считываем числа с клавиатуры
            System.out.print("Введите первое число ");
            double one = Double.parseDouble(reader.readLine());
            System.out.print("Введите второе число ");
            double two = Double.parseDouble(reader.readLine());

            // считываем название операции с клавиатуры
            System.out.print("Какую операцию вы хотите выполнить:сложение, вычитание, деление, умножение  ");
            String s = reader.readLine();

            // сравниваем введенное значение операции с списком операций
            if (s.equalsIgnoreCase("сложение")) {
                double suma = one + two;
                System.out.printf("Сумма чисел  = %.4f", suma);
            } else if (s.equalsIgnoreCase("вычитание")) {
                double minus = one - two;
                System.out.printf("Вычитание чисел  = %.4f", minus);
            } else if (s.equalsIgnoreCase("деление")) {

                if (two == 0) {
                    System.out.print("Введите значение второго числа , отличное от нуля");
                } else {
                    double delenie = one / two;
                    System.out.printf("Деление чисел  = %.4f", delenie);
                }

            } else if (s.equalsIgnoreCase("умножение")) {
                double umnozhenie = one * two;
                System.out.printf("Произведение чисел  = %.4f", umnozhenie);
            } else {
                System.out.print("Не правильно введено название операции");
            }

        }




    }
}
