package by.itstep.gulik.model.entity;

import java.util.Objects;

public class Bread1 extends Product {

    private String color;
    private String flour;

    public Bread1() {
        color = "";
    }

    public Bread1(String color, String flour, double price) {
        super(price);
        setColor(color);
        this.flour = flour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null) {
            this.color = color;
        } else {
            color = "";
        }
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Bread bread = (Bread) o;
//        return color.equals(bread.color) && flour.equals(bread.flour);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(color, flour, price);
//    }
//
//    @Override
//    public String toString() {
//        return "Bread{" +
//                "color='" + color + '\'' +
//                ", flour='" + flour + '\'' +
//                ", price=" + price +
//                '}';
//    }



}

