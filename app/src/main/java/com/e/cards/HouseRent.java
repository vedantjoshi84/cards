package com.e.cards;

public class HouseRent {

    private String itemName;
    private String itemDescription;
    private String itemPrice;
    private int itemImage;

    public HouseRent(String itemName, String itemDescription, String itemPrice, int itemImage)
    {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public int getItemImage() {
        return itemImage;
    }


}
