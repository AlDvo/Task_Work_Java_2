import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class taskWork4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Sladost[] korzina = new Sladost[5];
        double sum_weight = 0;
        double sum_price = 0;

        for (int i = 0; i < korzina.length; i++) {
            System.out.print("Введите название продукта ");
            String name = reader.readLine();
            System.out.print("Введите страну производства продукта ");
            String country = reader.readLine();
            System.out.print("Введите цену продукта ");
            double price = Double.parseDouble(reader.readLine());
            System.out.print("Введите вес продукта ");
            double weight = Double.parseDouble(reader.readLine());
            korzina[i] = new Sladost(name, weight, price, country);
            sum_weight = sum_weight + weight;
            sum_price = sum_price + price;
        }
        System.out.println(" ");
        System.out.println("Общая стоимость подарка " + sum_price);
        System.out.println("Общий вес подарка " + sum_weight);

        for (Sladost sladost : korzina) {
            System.out.println(sladost.toString());
        }
    }

    static class Sladost {
        String name;
        double weight;
        double price;
        String country;

        Sladost(String name, double weight, double price, String country) {
            this.name = name;
            this.weight = weight;
            this.price = price;
            this.country = country;
        }
        public String toString(){
          return "название " + name + ", вес " + weight + ", цен " + price + ", стран " + country ;
        }
    }
}
