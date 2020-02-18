package lk.rubictron.onlineshop.controller.impl;

import lk.rubictron.onlineshop.controller.PhoneTypeController;
import lk.rubictron.onlineshop.entity.PhoneType;
import lk.rubictron.onlineshop.services.Service;
import lk.rubictron.onlineshop.services.impl.PhoneTypeServiceImpl;
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
@RequestMapping("/PhoneTypes")
public class PhoneTypeControllerImpl extends PhoneTypeController {

    @Autowired
    private PhoneTypeServiceImpl service;


    @Override
    protected Service getService() {
        return service;
    }


    @Override
    @GetMapping("/getAll")
    public List<PhoneType> getAll() {
        return super.getAll();
    }

    @Override
    @GetMapping("/getAllById/{ids}")
    public List<PhoneType> getAllById(@PathVariable List<Integer> ids) {
        return super.getAllById(ids);
    }

    @Override
    @GetMapping("/getById/{id}")
    public PhoneType getById(@PathVariable Integer id) {
        return super.getById(id);

    }

    @Override
    @PostMapping("/save")
    public PhoneType save(PhoneType entity) {
        return super.save(entity);
    }

    @Override
    @DeleteMapping("/delete")
    public void delete(PhoneType entity) {
        super.delete(entity);
    }
}
