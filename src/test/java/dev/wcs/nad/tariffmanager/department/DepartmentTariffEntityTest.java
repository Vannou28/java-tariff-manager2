package dev.wcs.nad.tariffmanager.department;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.wcs.nad.tariffmanager.persistence.repository.DepartmentRepository;

@SpringBootTest
public class DepartmentTariffEntityTest {
    
    @Autowired
    DepartmentRepository departmentRepository;

    @Test
    public void showAllDepartmentsInBDD() {
        departmentRepository.findAll().forEach(it -> {
            System.out.println(it.getName());
        });
    }

}
