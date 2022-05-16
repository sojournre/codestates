package com.company.abstraction;

interface CafeCustomer {
    public String cafeCustomerName = null;
    public abstract String getOrder();

    default void setCafeCustomerName(String cafeCustomerName) {
//        this.cafeCustomerName = cafeCustomerName;
    }
}

class CafeCustomerA implements CafeCustomer {

    @Override
    public String getOrder() {
        return "a glass of iced americano";
    }
}

class CafeCustomerB implements CafeCustomer {

    @Override
    public String getOrder() {
        return "a glass of strawberry latte";
    }
}

class CafeOwner {
    public void giveItem(CafeCustomer cafeCustomer) {
        System.out.println("Item : " + cafeCustomer.getOrder());
    }
//    public void giveItem(CafeCustomerB cafeCustomerB) {
//        System.out.println("give a glass of strawberry latte to CafeCustomer B");
//    }
//
//    public void giveItem(CafeCustomerA cafeCustomerA) {
//        System.out.println("give a glass of iced americano to CafeCustomer A");
//    }
}

public class OrderExample {
    public static void main(String[] args) {
        CafeOwner cafeOwner = new CafeOwner();
        CafeCustomerA a = new CafeCustomerA();
        CafeCustomerB b = new CafeCustomerB();

        cafeOwner.giveItem(a);
        cafeOwner.giveItem(b);
    }
}
