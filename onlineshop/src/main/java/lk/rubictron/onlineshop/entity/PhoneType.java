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
public class PhoneType {

     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
     private int id;

     private String model;

     @ManyToOne
     private Brand brand;

     @OneToMany(mappedBy = "phoneType")
     @JsonIgnore
     private List<PhoneProduct> phoneProductList;

     public List<PhoneProduct> getPhoneProductList() {
          return phoneProductList;
     }

     public void setPhoneProductList(List<PhoneProduct> phoneProductList) {
          this.phoneProductList = phoneProductList;
     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getModel() {
          return model;
     }

     public void setModel(String model) {
          this.model = model;
     }

     public Brand getBrand() {
          return brand;
     }

     public void setBrand(Brand brand) {
          this.brand = brand;
     }


}
