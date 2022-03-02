package ru.geekbrains.persist;

public class Product {

    private Long id;

    private String title;
    private double cost;

    public Product(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitlename() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void getTitlename(String title) {
        this.title = title;
    }

}
