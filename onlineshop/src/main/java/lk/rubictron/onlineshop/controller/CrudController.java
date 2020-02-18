package lk.rubictron.onlineshop.controller;

import lk.rubictron.onlineshop.services.Service;

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
public abstract class CrudController<T,G> implements Controller<T,G>  {

    protected abstract Service getService();

    @Override
    public List<T> getAll() {
        return getService().getAll();
    }

    @Override
    public List<T> getAllById(List<G> ids) {
        return getService().getAllById(ids);
    }

    @Override
    public T getById(G id) {
        return (T) getService().getById(id);
    }

    @Override
    public T save(T entity) {
        return (T) getService().save(entity);
    }

    @Override
    public void delete(T entity) {
        getService().delete(entity);
    }
}
