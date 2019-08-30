package com.taskmanagement.repo;

import org.jboss.logging.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.taskmanagement.dto.CreateTaskBean;

public interface TaskRepository extends JpaRepository<CreateTaskBean, Integer> {

	/*
	 * @Query("Select e " + "from CreateTaskBean t " +
	 * "where t.priority LIKE '%:name'") CreateTaskBean get(String name);
	 */
}
