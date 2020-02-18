package lk.rubictron.onlineshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.media.sound.MidiUtils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                    .--.......--.                  |
 |			  \_)                      .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 2/3/2020
 -----------------------------------------------------------------------*/
@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy =  "shop")
    @JsonIgnore
    private List<PhoneProductShop> phoneProductShopList;

    public List<PhoneProductShop> getPhoneProductShops(){
        ArrayList<PhoneProductShop> list = new ArrayList<>();

        List<PhoneProductShop> list2 = getPhoneProductShopList();

        list2.forEach(pps ->{
            pps.setShop(null);
            list.add(pps);
        } );

        return list;
    }

    private String shopName;

    private String Address;

    private String contactNo;

    private String imageUrl ="assets/images/team.png";

    public int getId() { return id; }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public List<PhoneProductShop> getPhoneProductShopList() {
        return phoneProductShopList;
    }

    public void setPhoneProductShopList(List<PhoneProductShop> phoneProductShopList) {
        this.phoneProductShopList = phoneProductShopList;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
