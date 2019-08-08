package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.emp.dao.EmployeeDAO;
import com.tyss.emp.dto.EmployeeInfoBean;
@WebServlet("/searchEmployee")
public class SearchEmployeeServlet extends HttpServlet {

	  @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  EmployeeDAO d=new EmployeeDAO();
			 resp.setContentType("text/html");
		  String id=req.getParameter("search");
	      List<EmployeeInfoBean> eid=d.searchEmployee(id);
	      PrintWriter out=resp.getWriter();    
	      
	      HttpSession session=req.getSession(false);
	           
	      
	    
	        
	         if(session!=null)
	         {
	        	 out.print("             <!DOCTYPE html>                                                                                                                       ");
	 	        out.print("               <html lang='en'>                                                                                                                    ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("               <head>                                                                                                                              ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                   <!------ Include the above in your HEAD tag ---------->                                                                         ");
	 	        out.print("                   <meta charset='UTF-8'>                                                                                                          ");
	 	        out.print("                   <meta http-equiv='X-UA-Compatible' content='ie=edge'>                                                                           ");
	 	        out.print("                   <title>Document</title>                                                                                                         ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("				<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">	                                                                                                                                   ");
	 	        out.print("				                                                                                                                                   ");
	 	        out.print("                   <link rel='stylesheet' href='Home.css'>                                                                                         ");
	 	        out.print("               </head>                                                                                                                             ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("               <body>                                                                                                                              ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                   <nav class='navbar navbar-expand-lg navbar navbar-dark bg-dark'>                                                                ");
	 	        out.print("                       <div>                                                                                                                       ");
	 	        out.print("                           <span class='badge badge-pill badge-danger'>HomePage</span>&nbsp;&nbsp;&nbsp;&nbsp;                                     ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           <button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent'               ");
	 	        out.print("                               aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>                        ");
	 	        out.print("                               <span class='navbar-toggler-icon'></span>                                                                           ");
	 	        out.print("                           </button>                                                                                                               ");
	 	        out.print("                       </div>                                                                                                                      ");
	 	        out.print("                       <div class='collapse navbar-collapse' id='navbarSupportedContent'>                                                          ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           <li class='nav-item dropdown'>                                                                                          ");
	 	        out.print("                               <a class='nav-link dropdown-toggle' href='#' id='navbarDropdown' role='button' data-toggle='dropdown'               ");
	 	        out.print("                                   aria-haspopup='true' aria-expanded='false'>                                                                     ");
	 	        out.print("                                   Dropdown                                                                                                        ");
	 	        out.print("                               </a>                                                                                                                ");
	 	        out.print("                               <div class='dropdown-menu' aria-labelledby='navbarDropdown'>                                                        ");
	 	        out.print("                                   <a class='dropdown-item' href='#'>Action</a>                                                                    ");
	 	        out.print("                                   <a class='dropdown-item' href='#'>Another action</a>                                                            ");
	 	        out.print("                                   <div class='dropdown-divider'></div>                                                                            ");
	 	        out.print("                                   <a class='dropdown-item' href='#'>Something else here</a>                                                       ");
	 	        out.print("                               </div>                                                                                                              ");
	 	        out.print("                           </li>                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           </ul>                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                       </div>                                                                                                                      ");
	 	        out.print("                       <div>                                                                                                                       ");
	 	        out.print("                           <form action='./searchEmployee' method='get' class='form-inline my-2 my-lg-0'>                                                                                 ");
	 	        out.print("                               <input class='form-control mr-sm-2 'name='search' type='search' placeholder='Search' aria-label='Search'>                        ");
	 	        out.print("                               <button type='submit'>Search</button>                                                                               ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           </form>                                                                                                                 ");
	 	        out.print("                       </div>                                                                                                                      ");
	 	        out.print("                   </nav>                                                                                                                          ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                   <div class='container emp-profile'>                                                                                             ");
	 	        out.print("                       <form method='post'>                                                                                                        ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           <div class='col-md-6'>                                                                                                  ");
	 	        out.print("                               <div class='profile-head'>                                                                                          ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                   <ul class='nav nav-tabs' id='myTab' role='tablist'>                                                             ");
	 	        out.print("                                       <li class='nav-item'>                                                                                       ");
	 	        out.print("                                           <a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab'                      ");
	 	        out.print("                                               aria-controls='home' aria-selected='true'>Search Employee</a>                                       ");
	 	        out.print("                                       </li>                                                                                                       ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                                   </ul>                                                                                                           ");
	 	        out.print("                               </div><br><br><br><br>                                                                                                              ");
	 	        out.print("                               <div>                                                                                                               ");
	 	        for (EmployeeInfoBean lst : eid) {
	 	        out.print("                                <a href=\"./home?id="+lst.getId()+"\">   <label for=''>EmpID : "+lst.getId()+"</label></a>&nbsp;<br>                                                                              ");
	 	             
	 	        }
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                               </div> <br><br><br>                                                                                                             ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                           </div>                                                                                                                  ");
	 	        out.print("                           <div class='col-md-2'>                                                                                                  ");
	 	        out.print("                             <a href='./logout'>  <input type='submit' class='profile-edit-btn' name='btnAddMore' value='Logout' /></a>                                  ");
	 	        out.print("                           </div>                                                                                                                  ");
	 	        out.print("                   </div>                                                                                                                          ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("                   </div>                                                                                                                          ");
	 	        out.print("                   </div>                                                                                                                          ");
	 	        out.print("                   </div>                                                                                                                          ");
	 	        out.print("                   </form>                                                                                                                         ");
	 	        out.print("                   </div>                                                                                                                          ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("               </body>                                                                                                                             ");
	 	        out.print("                                                                                                                                                   ");
	 	        out.print("               </html>                                                                                                                             ");
	     
	 		   
	         }
	         else {
	        	 out.print("<H3><span style=text-align: center;\"color:red\">Invalid Username OR password!!!</span></H3>");
	        	 out.print("<br><br>");
	        	 RequestDispatcher dispatcher =req.getRequestDispatcher("index.jsp");
	        			 dispatcher.include(req, resp);
	        	 
	         }
	        
	        
	       
	}
}
