package lk.rubictron.onlineshop.controller.impl;

import lk.rubictron.onlineshop.controller.PhoneProductShopController;
import lk.rubictron.onlineshop.controller.PhoneTypeController;
import lk.rubictron.onlineshop.entity.PhoneProductShop;
import lk.rubictron.onlineshop.services.PhoneProductShopService;
import lk.rubictron.onlineshop.services.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 2/16/2020
 -----------------------------------------------------------------------*/
@RestController
@RequestMapping("/phoneProductShops")
public class PhoneProductShopControllerImpl extends PhoneProductShopController {

    @Autowired
    private PhoneProductShopService phoneProductShopService;

    @Override
    protected Service getService() {
        return phoneProductShopService;
    }


    @Override
    @GetMapping("/getAll")
    public List<PhoneProductShop> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/getAllById/{ids}")
    public List<PhoneProductShop> getAllById(List<Integer> ids) {
        return super.getAllById(ids);
    }

    @Override
    @GetMapping("/getById/{id}")
    public PhoneProductShop getById(Integer id) {
        return super.getById(id);
    }

    @Override
    @PostMapping("/save")
    public PhoneProductShop save(PhoneProductShop entity) {
        return super.save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(PhoneProductShop entity) {
        super.delete(entity);
    }
}
