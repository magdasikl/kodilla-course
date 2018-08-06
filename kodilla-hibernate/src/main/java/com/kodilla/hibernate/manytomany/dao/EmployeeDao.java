package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
//    List<Employee> findByLastname(String lastname);

    @Query
    List<Employee> searchWorkerByName(@Param("LASTNAME") String lastname);
}
