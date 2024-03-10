package com.project.basiccrudapp.repository;

import com.project.basiccrudapp.model.CrudObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CrudRepository extends JpaRepository<CrudObj,Long> {
}
