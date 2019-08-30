package com.tyss.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.lms.dto.RequestBean;

public interface RequestBookRespository extends JpaRepository<RequestBean,Integer> {
	
	 

}
