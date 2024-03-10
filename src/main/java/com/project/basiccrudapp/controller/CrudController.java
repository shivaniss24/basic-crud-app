package com.project.basiccrudapp.controller;

import com.project.basiccrudapp.model.CrudObj;
import com.project.basiccrudapp.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {
    @Autowired
    CrudService crudService;

    @GetMapping("crud-api/data")
    public List<CrudObj> getData(){
        List<CrudObj> strings=crudService.getData();
        return strings;
    }
    @PostMapping("crud-api/data")
    public void postData(@RequestBody CrudObj crudObj){
        crudService.insertData(crudObj);
    }
    @PutMapping("crud-api/data")
    public void putData(@RequestBody CrudObj crudObj){
       crudService.updateData(crudObj);
    }
    @DeleteMapping("crud-api/data/{id}")
    public void deleteData(@PathVariable("id") long id){
        crudService.deleteData(id);
    }
}
