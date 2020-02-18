package lk.rubictron.onlineshop.services.impl;

import lk.rubictron.onlineshop.repository.BrandRepository;
import lk.rubictron.onlineshop.services.BrandService;
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

 Created by Asitha Sandakalum on 2/8/2020
 -----------------------------------------------------------------------*/
@Service
public class BrandServiceImpl extends BrandService {

    @Autowired
    private BrandRepository repository;

    @Override
    protected CrudRepository getRepository() {

        return repository;
    }
}
