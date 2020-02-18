package lk.rubictron.onlineshop.services.impl;

import lk.rubictron.onlineshop.repository.PhoneProductRepository;
import lk.rubictron.onlineshop.services.PhoneProductService;
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
class PhoneProductServiceImpl extends PhoneProductService {



    @Autowired
    private PhoneProductRepository repository;


    @Override
    protected CrudRepository getRepository() {
        return repository;
    }


}
