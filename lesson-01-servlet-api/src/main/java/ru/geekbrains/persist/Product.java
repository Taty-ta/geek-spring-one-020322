package ru.geekbrains.persist;

import java.util.Objects;

public class Product {

    private Long id;

    private String title;
    private double cost;

    public Product(String title) {
        this.title = title;
    }

    public Product(Long id, String title) {
        this.id = id;
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

    public void setName(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;

        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String
    toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + title + '\'' +
                '}';
    }

}
