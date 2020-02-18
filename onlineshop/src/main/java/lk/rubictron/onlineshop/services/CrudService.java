package lk.rubictron.onlineshop.services;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
public abstract class CrudService<T,G> implements Service<T,G>{

    protected abstract CrudRepository getRepository();

    @Override
    public List<T> getAll() {
        ArrayList<T> list = new ArrayList<T>();

        Iterable<T> data = getRepository().findAll();

        data.forEach(list::add);

        return list;
    }

    @Override
    public List<T> getAllById(List<G> id) {
        ArrayList<T> list = new ArrayList<T>();

        Iterable<T> data = getRepository().findAllById(id);

        data.forEach(list::add);

        return list;

    }

    @Override
    public T getById(G id) throws EntityNotFoundException {
        Optional<T> list = getRepository().findById(id);

        if(list.isPresent()){
            return list.get();
        }
         throw  new EntityNotFoundException();
    }

    @Override
    public T save(T entity) {
        return (T) getRepository().save(entity);
    }

    @Override
    public void delete(T entity) {
        getRepository().delete(entity);
    }
}
