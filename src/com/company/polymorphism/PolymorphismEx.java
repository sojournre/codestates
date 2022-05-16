package com.company.polymorphism;

public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano(4000));
        customer.buyCoffee(new CaffeLatte(5500));

        System.out.println("현재 잔액은 customer.money = " + customer.money);
    }
}

class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}

class  Americano extends Coffee {

    public Americano(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "Americano{" +
                "price=" + price +
                '}';
    }
}

class CaffeLatte extends Coffee {

    public CaffeLatte(int price) {
        super(price);
    }

    @Override
    public String toString() {
        return "CaffeLatte{}";
    }
}

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}