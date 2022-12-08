/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.FinalOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author akuls
 */
public class DeliveryMan {
    String d_name;
    String d_status;
    UserAccount ua;

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public DeliveryMan(UserAccount ua)
    {
        this.ua = ua;
        this.d_name = ua.getUsername();
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_status() {
        return d_status;
    }

    public void setD_status(String d_status) {
        this.d_status = d_status;
    }

    public ArrayList<FinalOrder> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(ArrayList<FinalOrder> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }
    ArrayList<FinalOrder> deliveredOrders = new ArrayList<FinalOrder>();
    public void addDeliveredOrder(FinalOrder f)
    {
        deliveredOrders.add(f);
    }
}
