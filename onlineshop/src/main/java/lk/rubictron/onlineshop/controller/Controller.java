package lk.rubictron.onlineshop.controller;

import java.util.List;

/************************************************************************
 |       ======================RUBICTRON=====================           |
 |                   Oooo                                               |
 +============oooO--(   )===============================================+
 |			(   )   ) /                                                 |
 |			 \ (   (_/                   .--.......--.                  |
 |			  \_)                     .-(   |||| ||   )-.               |
 |____________________________________/   '--'''''''--'   \_____________|

 Created by Asitha Sandakalum on 2/7/2020
 -----------------------------------------------------------------------*/
public interface Controller<T,G> {

    List<T> getAll();
    List<T> getAllById(List<G> ids);
    T getById(G id);
    T save(T entity);
    void delete(T entity);
}
