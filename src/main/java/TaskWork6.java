import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskWork6 {
    public static void main(String[] args) throws IOException{
        // Ситываем данные с фаила
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream("text.txt")));
        String s = input.readLine();

        // Заносим слова в массив
        String[] list = s.split(" ");

        // Сортируем слова в алфиватном порядке
        Arrays.sort(list);

        Map<String , Integer > map = new HashMap<>();
        int max = 0;
        int item = 0;
        int x = 0;

        // Определяем сколько раз каждое слово повторяется в фаиле
        for (int b = 0 ; b < list.length; b++ ){

            for(int i = 0 ; i < list.length; i++){

                if (list[b].equalsIgnoreCase(list[i])){
                x ++;
            }
        }
        map.put(list[b] , x);

            //Опереляем слово с максимальным количеством повторений
            if (max < x){
            max = x ;
            item = b;
        }
        x = 0;
        }

        map.forEach((a,b) -> System.out.println("слово - " + a + " встречается в файле " + b));
        System.out.println("слово с максимальным количеством повторений - " + list[item] + " встречается в файле " + max);

    }

}
