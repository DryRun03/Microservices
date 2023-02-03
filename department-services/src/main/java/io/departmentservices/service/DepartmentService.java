package io.departmentservices.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.departmentservices.entity.Department;
import io.departmentservices.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	@Autowired private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}

	public Optional<Department> findDepartmentById(Long departmentId) {
		log.info("Inside findDepartment method of DepartmentService");
		return departmentRepository.findById(departmentId);
	}
}
