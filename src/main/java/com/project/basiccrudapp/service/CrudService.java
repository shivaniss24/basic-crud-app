package com.project.basiccrudapp.service;

import com.project.basiccrudapp.model.CrudObj;
import com.project.basiccrudapp.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    CrudRepository crudRepository;

    public List<CrudObj> getData() {
        List<CrudObj> strings= (List<CrudObj>) crudRepository.findAll();
        return strings;
    }

    public void insertData(CrudObj crudObj) {
        crudRepository.save(crudObj);
    }

    public void updateData(CrudObj crudObj) {
        CrudObj crudObjFromDb = crudRepository.findById(crudObj.getId()).get();
        crudObjFromDb.setData(crudObj.getData());
        crudRepository.save(crudObjFromDb);
    }

    public void deleteData(long id) {
        CrudObj crudObjFromDb = crudRepository.findById(id).get();
        crudRepository.delete(crudObjFromDb);
    }
}
