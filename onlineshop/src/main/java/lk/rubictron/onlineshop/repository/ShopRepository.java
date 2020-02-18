package lk.rubictron.onlineshop.repository;

import lk.rubictron.onlineshop.entity.Shop;
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

 Created by Asitha Sandakalum on 2/4/2020
 -----------------------------------------------------------------------*/
@Repository
public interface ShopRepository extends CrudRepository<Shop,Integer> {
}
