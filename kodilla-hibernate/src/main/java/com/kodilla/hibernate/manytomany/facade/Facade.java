package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public void processFacade(final String company, final String employee) throws FacadeProcessingException {

        try {

            if (company != null) {
                List<Company> listCompany = companyDao.threeCharactersNameCompany("%" + company + "%");
               String t = listCompany.stream()
                        .map(company1 -> company1.getName().toString())
                        .collect(Collectors.joining(", "));
                LOGGER.info("Lista wyszukiwanych firm: " + t );
            }
            if (employee != null) {
                List<Employee> listEmployee = employeeDao.searchWorkerByName("%" + employee + "%");
                String k = listEmployee.stream()
                        .map(employee1 -> employee1.getLastname().toString())
                        .collect(Collectors.joining(", "));
                LOGGER.info("Lista wyszukiwanych pracowników: " + k );
            }
        } finally {
            if (company == null) {
                LOGGER.error(FacadeProcessingException.ERR_NOT_COMPANY_NAME);
            }
            if (employee == null) {
                LOGGER.error(FacadeProcessingException.ERR_NOT_EMPLOYEE_NAME);
            }
        }
    }



}
