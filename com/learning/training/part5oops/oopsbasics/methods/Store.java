package com.learning.training.part5oops.oopsbasics.methods;

public class Store {
    int storeId;
    String storeLocation;
    int staffCount;

    public void getTotalSalePriceForAllItemsInTheSTore() {
        StoreInventory rice = new StoreInventory(1, 10.5, 8, 123);

        System.out.println(rice.itemPrice);

        System.out.println(rice.getTotalSalePricePerItem());

        StoreInventory wheat = new StoreInventory(2, 5.5, 4, 223);
        StoreInventory corn = new StoreInventory(3, 8.5, 3, 45);


        double totalItemPriceForAllItems = rice.getTotalSalePricePerItem() + wheat.getTotalSalePricePerItem() + corn.getTotalSalePricePerItem();


        System.out.println("Total Item Price For All Items :" + totalItemPriceForAllItems);
    }

}
