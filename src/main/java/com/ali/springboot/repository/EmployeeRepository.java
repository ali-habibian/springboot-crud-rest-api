package com.ali.springboot.repository;

import com.ali.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
/*Spring data jpa internally provides @Repository annotation, so we do not need to add
@Repository annotation to <EntityName>Repository interface.*/
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
