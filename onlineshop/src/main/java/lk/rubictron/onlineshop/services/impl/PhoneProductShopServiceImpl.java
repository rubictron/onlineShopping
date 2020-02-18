package lk.rubictron.onlineshop.services.impl;

import lk.rubictron.onlineshop.repository.PhoneProductShopRepository;
import lk.rubictron.onlineshop.services.PhoneProductShopService;
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

 Created by Asitha Sandakalum on 2/16/2020
 -----------------------------------------------------------------------*/
@Service
public class PhoneProductShopServiceImpl extends PhoneProductShopService {

    @Autowired
    private PhoneProductShopRepository phoneProductShopRepository;

    @Override
    protected CrudRepository getRepository() {
        return phoneProductShopRepository;
    }
}
