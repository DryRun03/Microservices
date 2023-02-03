package io.departmentservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.departmentservices.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Department findByDepartmentId(Long departemntId);
}
