package lk.rubictron.onlineshop.controller.impl;

import lk.rubictron.onlineshop.controller.PhoneProductController;
import lk.rubictron.onlineshop.entity.PhoneProduct;
import lk.rubictron.onlineshop.services.PhoneProductService;
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

 Created by Asitha Sandakalum on 1/29/2020
 -----------------------------------------------------------------------*/
@RestController
@RequestMapping("/PhoneProducts")
public class PhoneProductControllerImpl extends PhoneProductController {

    @Autowired
    private PhoneProductService service;

    @Override
    protected Service getService() {
        return service;
    }

    @Override
    @GetMapping("/getAll")
    public List<PhoneProduct> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/getAllById/{ids}")
    public List<PhoneProduct> getAllById(@PathVariable List<Integer> ids) {
        return super.getAllById(ids);
    }

    @Override
    @GetMapping("/getById/{id}")
    public PhoneProduct getById(@PathVariable Integer id) {
        return super.getById(id);
    }

    @Override
    @PostMapping(value = "/save")
    public PhoneProduct save(PhoneProduct entity) {
        return super.save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(PhoneProduct entity) {
        super.delete(entity);
    }


}
