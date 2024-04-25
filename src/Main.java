import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("data/drinks.csv"));
        scanner.useDelimiter("\n");
        ArrayList<Item> items = new ArrayList<Item>();
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] data = scanner.nextLine().split(",");
            items.add(new Item(data[0], Integer.parseInt(data[3])));
        }
        Sort.merge(items, 0, items.size() - 1);
        System.out.println("Países que mais consomem vinhos, ordenados por quantidade consumida em ordem crescente.");
        for (Item i : items)
            System.out.printf("País: %s\nQuantidade: %d.1\n\n", i.getCountry(), i.getWineServings());
        scanner.close();
    }
}