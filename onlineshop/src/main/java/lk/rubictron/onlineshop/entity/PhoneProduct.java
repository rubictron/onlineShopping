package lk.rubictron.onlineshop.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 2/3/2020
 -----------------------------------------------------------------------*/
@Entity
public class PhoneProduct {

    @Id
    private int id;

    @ManyToOne
    private PhoneType phoneType;

    private String imageUrl;

    private String spec;

    @OneToMany(mappedBy =  "phoneProduct")
    @JsonIgnore
    private List<PhoneProductShop> phoneProductShopList;

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<PhoneProductShop> getPhoneProductShopList() {
        return phoneProductShopList;
    }

    public void setPhoneProductShopList(List<PhoneProductShop> phoneProductShopList) {
        this.phoneProductShopList = phoneProductShopList;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneTypeId() {
        return phoneType.getId();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }
}
