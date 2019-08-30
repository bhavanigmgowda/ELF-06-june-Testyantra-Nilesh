package com.tyss.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.lms.dto.BookBean;
import com.tyss.lms.dto.UserBean;

public interface BookRepository extends JpaRepository<BookBean,Integer> {

	
	 public BookBean findByBookname(String bookname);
	  
	  public boolean existsByBookname(String bookname);
	  
	  @Query("Select e from BookBean e where e.categeory=:categeory")
       public BookBean findByBookCategeory(@Param("categeory") String categeory);
	  
	    public boolean existsByCategeory(String categeory);
	  
	  @Query("Select e from BookBean e where e.author=:author")
	  public BookBean findByBookAuthor( String author);
	  
	  public boolean existsByAuthor(@Param("author")String author);
}
