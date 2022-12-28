package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;

    private int toppingPrice;

    private int takeWayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakewayAdded;

    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isTakewayAdded = false;
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeWayPrice = 20;
        if(isVeg == true){
            this.price = 300;
            this.toppingPrice = 70;

        }
        else {
            this.price = 400;
            this.toppingPrice = 120;
        }


        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            this.price = this.price + this.toppingPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakewayAdded == false){
            this.price = this.price + this.takeWayPrice;
            isTakewayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            isBillGenerated = true;
            if(isCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese Added: "+ this.cheesePrice + "\n";
            }
            if(isToppingsAdded == true){
                this.bill = this.bill + "Extra Toppings Added: "+ this.toppingPrice + "\n";
            }
            if(isTakewayAdded == true){
                this.bill = this.bill + "Paperbag Added: "+ this.takeWayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price + "\n";

        }
        return this.bill;
    }
}
