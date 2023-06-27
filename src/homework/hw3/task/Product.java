package homework.hw3.task;

public class Product {
    private String name;
    private Integer price;
    private Integer grade;

    public Product(String name, Integer price, Integer grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Товар: {" +
                "Наименование: '" + name + '\'' +
                ", Цена: " + price +
                ", Сорт: " + grade +
                "}\n";
    }
}
