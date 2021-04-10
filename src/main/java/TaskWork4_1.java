import java.util.Random;

public class TaskWork4_1 {
    public static void main(String[] args){
        // Создаем массив чисел
        int [] mass = new int[20];
        int minus = 0 ;
        int iMinus = 20;
        int plus = 11 ;
        int iPlus= -1;
        // Создаем цикл для заполнения массива
        for (int i = 0 ; i < mass.length ; i++){
            Random random = new Random();
            mass[i] = (random.nextInt(20) - 10 );
            // Определяем максимальное отрицательное число
            if (mass[i] < 0 && Math.abs(minus) < Math.abs(mass[i])){
                minus = mass[i];
                iMinus = i;
            }
            // Определяем минимальное положительное число
            else if (mass[i] > 0 && Math.abs(plus) > Math.abs(mass[i])){
                plus = mass[i];
                iPlus = i;
            }
            // Выводим массив чисел на экран
            //System.out.println(mass[i]);
        }

        /*System.out.println("Максимальное отрицательное число" + minus);
        System.out.println("Минимальное положительное число" + plus);
        System.out.println("index minus " + iMinus);
        System.out.println("index plus " + iPlus);*/

        //Меняем числа места
        mass[iMinus] = plus;
        mass[iPlus] = minus;

       // for (int i = 0 ; i < mass.length ; i++){System.out.println(mass[i]);}

    }
}
