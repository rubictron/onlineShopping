package lk.rubictron.onlineshop.services.impl;

import lk.rubictron.onlineshop.repository.ShopRepository;
import lk.rubictron.onlineshop.services.ShopService;
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

 Created by Asitha Sandakalum on 2/4/2020
 -----------------------------------------------------------------------*/
@Service
public class ShopServiceImpl extends ShopService {

    @Autowired
    private ShopRepository shopRepository;


    @Override
    protected CrudRepository getRepository() {
        return shopRepository;
    }
}
