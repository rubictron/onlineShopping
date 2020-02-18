package lk.rubictron.onlineshop.services.impl;

import lk.rubictron.onlineshop.repository.PhoneTypeRepository;
import lk.rubictron.onlineshop.services.PhoneTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

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
@Service
public class PhoneTypeServiceImpl extends PhoneTypeService  {

    @Autowired
    private PhoneTypeRepository repository;


    @Override
    protected CrudRepository getRepository() {
        return repository;
    }
}
