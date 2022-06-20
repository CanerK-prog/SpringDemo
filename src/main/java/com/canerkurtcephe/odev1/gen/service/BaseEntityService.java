package com.canerkurtcephe.odev1.gen.service;

import com.canerkurtcephe.odev1.Usr.entity.UsrUser;
import com.canerkurtcephe.odev1.gen.entity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public abstract class BaseEntityService<E extends BaseEntity, D extends JpaRepository<E,Long>> {

    private final D dao;

    public D getDao(){
        return dao;
    }

    public List<E> findAll(){
        return dao.findAll();
    }

    public E findById(Long id){
        return dao.findById(id).orElseThrow();
    }

    public E save(E entity){
        return dao.save(entity);
    }

    public void delete(Long id){
        dao.deleteById(id);
    }

    public void delete(E entity){
        dao.delete(entity);
    }

    public boolean isExist(Long id){
        return dao.existsById(id);
    }
}
