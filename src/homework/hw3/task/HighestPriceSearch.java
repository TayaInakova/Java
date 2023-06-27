package homework.hw3.task;

import java.util.List;

// Найти наибольшую цену товаров 1го или 2-го сорта среди товаров, название которых содержит «высший».
public class HighestPriceSearch {
    public static int find(List<Product> productList) {
        int maxPrice = 0;
        for (Product item : productList) {
            if ((item.getGrade().equals(1) || item.getGrade().equals(2)) &&
                    item.getName().toLowerCase().contains("высший") && (item.getPrice() > maxPrice)) {
                maxPrice = item.getPrice();
            }
        }
        return maxPrice;
    }
}
