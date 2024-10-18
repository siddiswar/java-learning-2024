package com.learning.siri.part5oops.methods;

public class StoreInventory {

    //Member Variables
    public int itemId = 1;
    public double itemPrice = 50.3;
    int itemAge;
    int itemQuantity;

    //Member Methods
    public double getFinalItemPrice() {
        double price;
        if (itemAge > 6) {
            price = itemPrice / 2;
        } else {
            price = itemPrice;
        }
        return price;
    }

    public StoreInventory(int itemId, double itemPrice, int itemAge, int itemQuantity) {
        this.itemId = itemId;
        this.itemPrice = itemPrice;
        this.itemAge = itemAge;
        this.itemQuantity = itemQuantity;
    }

    public double getTotalSalePricePerItem() {
        double finalPrice = getFinalItemPrice();
        double totalSalePrice = itemQuantity * finalPrice;
        System.out.println("Total Sale Price is :" + totalSalePrice);
        return totalSalePrice;
    }

    public static void main(String[] args) {
        StoreInventory rice = new StoreInventory(1, 10.5, 8, 123);
        rice.getTotalSalePricePerItem();
    }

}
