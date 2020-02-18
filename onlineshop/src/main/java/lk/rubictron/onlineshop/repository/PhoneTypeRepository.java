package lk.rubictron.onlineshop.repository;

import lk.rubictron.onlineshop.entity.PhoneType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface PhoneTypeRepository extends CrudRepository<PhoneType,Integer> {
    
}
