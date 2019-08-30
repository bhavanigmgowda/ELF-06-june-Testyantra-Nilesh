package com.tyss.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.lms.dto.IssuedBookBean;

public interface IssueRepository extends JpaRepository<IssuedBookBean,Integer> {

}
