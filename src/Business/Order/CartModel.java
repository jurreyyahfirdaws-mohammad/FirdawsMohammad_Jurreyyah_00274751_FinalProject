/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author akuls
 */
public class CartModel {
    String restaurant;
    String rest_item;

    
    public CartModel(String resto, String item)
    {
        this.restaurant = resto;
        this.rest_item = item;
    }
    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getRest_item() {
        return rest_item;
    }

    public void setRest_item(String rest_item) {
        this.rest_item = rest_item;
    }
    
}
