package lk.rubictron.onlineshop.controller.impl;

import lk.rubictron.onlineshop.controller.BrandController;
import lk.rubictron.onlineshop.entity.Brand;
import lk.rubictron.onlineshop.services.BrandService;
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

 Created by Asitha Sandakalum on 2/8/2020
 -----------------------------------------------------------------------*/
@RestController
@RequestMapping("/brands")
public class BrandControllerImpl extends BrandController {

    @Autowired
    private BrandService service;

    @Override
    protected Service getService() {
        return service;
    }

    @Override
    @GetMapping("/getAll")
    public List<Brand> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/getAllById/{ids}")
    public List<Brand> getAllById(List<Integer> ids) {
        return super.getAllById(ids);
    }

    @Override
    @GetMapping("/getById/{id}")
    public Brand getById(Integer id) {
        return super.getById(id);
    }

    @Override
    @PostMapping(value = "/save")
    public Brand save(Brand entity) {
        return super.save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(Brand entity) {
        super.delete(entity);
    }
}
