package lk.rubictron.onlineshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import java.io.Serializable;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 2/7/2020
 -----------------------------------------------------------------------*/
@Entity
public class PhoneProductShop implements Serializable {

    @Id
    private int id;

    @ManyToOne
    private PhoneProduct phoneProduct;


    @ManyToOne
    private Shop shop;

    private double price;

    private double discountRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public PhoneProduct getPhoneProduct() {
        return phoneProduct;
    }

    public void setPhoneProduct(PhoneProduct phoneProduct) {
        this.phoneProduct = phoneProduct;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
