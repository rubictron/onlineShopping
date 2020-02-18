package lk.rubictron.onlineshop.controller.impl;

import lk.rubictron.onlineshop.controller.ShopController;
import lk.rubictron.onlineshop.entity.Shop;
import lk.rubictron.onlineshop.services.Service;
import lk.rubictron.onlineshop.services.impl.ShopServiceImpl;
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

 Created by Asitha Sandakalum on 2/4/2020
 -----------------------------------------------------------------------*/

@RequestMapping("/shops")
@RestController
public class ShopControllerImpl extends ShopController {

    @Autowired
    private ShopServiceImpl service;


    @Override
    protected Service getService() {
        return service;
    }

    @Override
    @GetMapping("/getAll")
    public List<Shop> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/getAllById/{ids}")
    public List<Shop> getAllById(@PathVariable List<Integer> ids) {
        return super.getAllById(ids);
    }

    @Override
    @GetMapping("/getById/{id}")
    public Shop getById(@PathVariable Integer id) {
        return super.getById(id);
    }

    @Override
    @PostMapping("/save")
    public Shop save(Shop entity) {
        return super.save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(Shop entity) {
        super.delete(entity);
    }
}
