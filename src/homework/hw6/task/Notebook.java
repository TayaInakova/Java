package homework.hw6.task;

import java.util.Objects;

public class Notebook {
    private Integer id;
    private String name;
    private Integer ram;
    private String cp;
    private Integer cost;
    private Integer hardDrive;
    private String color;
    private String os;
    private Integer quantity;

    public Notebook(Integer id, String name, Integer ram, String cp, Integer cost, Integer hardDrive, String color,
                    String os, Integer quantity) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.cp = cp;
        this.cost = cost;
        this.hardDrive = hardDrive;
        this.color = color;
        this.os = os;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(Integer hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(id, notebook.id) && Objects.equals(name, notebook.name) && Objects.equals(ram, notebook.ram) && Objects.equals(cp, notebook.cp) && Objects.equals(cost, notebook.cost) && Objects.equals(hardDrive, notebook.hardDrive) && Objects.equals(color, notebook.color) && Objects.equals(os, notebook.os) && Objects.equals(quantity, notebook.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ram, cp, cost, hardDrive, color, os, quantity);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", cp='" + cp + '\'' +
                ", cost=" + cost +
                ", hardDrive=" + hardDrive +
                ", color='" + color + '\'' +
                ", os='" + os + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
