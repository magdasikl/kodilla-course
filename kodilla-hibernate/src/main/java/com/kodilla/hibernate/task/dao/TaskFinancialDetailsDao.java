package com.kodilla.hibernate.task.dao;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;

public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails,Integer> {
    java.util.List<TaskFinancialDetails> findByPaid(boolean paid);
}
