package seminars.seminar3;

public class Item {
    private String name;
    private String country;
    private Integer volume;

    public Item(String name, String country, Integer volume) {
        this.name = name;
        this.country = country;
        this.volume = volume;
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

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", volume=" + volume +
                '}';
    }
}
