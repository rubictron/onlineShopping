package lk.rubictron.onlineshop.entity;

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
public class Brand {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<PhoneType> phoneTypeList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


}
