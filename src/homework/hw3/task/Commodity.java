package homework.hw3.task;

public class Commodity {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer grade;

    public Commodity(String name, String country, Integer weight, Integer price, Integer grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    public Commodity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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
        return "Товар народного потребления {" +
                "Наименование: '" + name + '\'' +
                ", Страна-производитель: '" + country + '\'' +
                ", Вес: " + weight +
                ", Цена: " + price +
                ", Сорт: " + grade +
                "}\n";
    }
}
