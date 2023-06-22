package com.airfranceklm.fasttrack.assignment.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airfranceklm.fasttrack.assignment.resources.Holiday;

public interface HolidayRepository extends JpaRepository<Holiday, UUID> {
	List<Holiday> findByEmployeeId(String employeeId);
}
