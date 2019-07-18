package com.tyss.emp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.ProcessBuilder.Redirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tyss.emp.dto.EmployeeInfoBean;
@WebServlet("/profile")
public class ProfilePicServlet extends HttpServlet {

	
	    @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    	
	         HttpSession session=req.getSession();
	         PrintWriter out=resp.getWriter(); 
	         if(session!=null) {
	        	 
	        	   EmployeeInfoBean result =(EmployeeInfoBean)session.getAttribute("data");
	        	   
	        	    //
	        		out.print(
	    					"                        <!DOCTYPE html>                                                                                                                                                                                                                                                                                                           ");
	    			out.print(
	    					"               <html lang='en'>                                                                                                                                                                                                                                                                                                                   ");
	    			out.print(
	    					"               <head>                                                                                                                                                                                                                                                                                                                             ");
	    			out.print("                       <LINK rel='stylesheet' href ='Home.css'>	");
	    			out.print(
	    					"                       <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n"
	    							+ "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>                                                                                                                                                                                                                                      ");
	    			out.print(
	    					"                       <script src='//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>                                                                                                                                                                                                                                        ");
	    			out.print(
	    					"                       <!------ Include the above in your HEAD tag ---------->                                                                                                                                                                                                                                                                    ");
	    			out.print(
	    					"                   <meta charset='UTF-8'>                                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                   <meta http-equiv='X-UA-Compatible' content='ie=edge'>                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                   <title>Document</title>                                                                                                                                                                                                                                                                                                        ");
	    			out.print(
	    					"               </head>                                                                                                                                                                                                                                                                                                                            ");
	    			out.print(
	    					"               <body>                                                                                                                                                                                                                                                                                                                             ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                       <nav class='navbar navbar-expand-lg navbar navbar-dark bg-dark' >                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                               <div>                                                                                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                 <span class='badge badge-pill badge-danger'>HomePage</span>&nbsp;&nbsp;&nbsp;&nbsp;                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                               <button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent' aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>                                                                                                             ");
	    			out.print(
	    					"                                 <span class='navbar-toggler-icon'></span>                                                                                                                                                                                                                                                                        ");
	    			out.print(
	    					"                               </button>                                                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                            </div>                                                                                                                                                                                                                                                                                                                ");
	    			out.print(
	    					"                               <div class='collapse navbar-collapse' id='navbarSupportedContent'>                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                   <li class='nav-item dropdown'>                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                     <a class='nav-link dropdown-toggle' href='#' id='navbarDropdown' role='button' data-toggle='dropdown' aria-haspopup='true' aria-expanded='false'>                                                                                                                                                            ");
	    			out.print(
	    					"                                       Dropdown                                                                                                                                                                                                                                                                                                   ");
	    			out.print(
	    					"                                     </a>                                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                     <div class='dropdown-menu' aria-labelledby='navbarDropdown'>                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                       <a class='dropdown-item' href='#'>Action</a>                                                                                                                                                                                                                                                               ");
	    			out.print(
	    					"                                       <a class='dropdown-item' href='#'>Another action</a>                                                                                                                                                                                                                                                       ");
	    			out.print(
	    					"                                       <div class='dropdown-divider'></div>                                                                                                                                                                                                                                                                       ");
	    			out.print(
	    					"                                       <a class='dropdown-item' href='#'>Something else here</a>                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                     </div>                                                                                                                                                                                                                                                                                                       ");
	    			out.print(
	    					"                                   </li>                                                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                 </ul>                                                                                                                                                                                                                                                                                                            ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                               </div>                                                                                                                                                                                                                                                                                                             ");
	    			out.print(
	    					"                               <div>                                                                                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                               <form method='get' action='./searchEmployee'  class='form-inline my-2 my-lg-0'>                                                                                                                                                                                                                                                                            ");
	    			out.print(                                 
	    					"                                       <input  class='form-control mr-sm-2 'name='search'  type='search' placeholder='Search' aria-label='Search' >                                                                                                                                                                                                             ");
	    			out.print(                                      
	    					"                                        <button type='submit'>Search</button>                                                                                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                                     </form>                                                                                                                                                                                                                                                                                                      ");
	    			out.print(
	    					"                                   </div>                                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                             </nav>                                                                                                                                                                                                                                                                                                               ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                       <div class='container emp-profile'>                                                                                                                                                                                                                                                                                        ");
	    			out.print(
	    					"                               <form method='post'>                                                                                                                                                                                                                                                                                               ");
	    			out.print(
	    					"                                   <div class='row'>                                                                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                                       <div class='col-md-4'>                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                           <div class='profile-img'>                                                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                                               <a href=\"./home   \"><img src='img.jpg' alt=''/></a>                                                                                                                                                                                                                                                                               ");
	    			out.print(
	    					"                                               <div class='file btn btn-lg btn-primary'>                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                                                   Change Photo                                                                                                                                                                                                                                                                                   ");
	    			out.print(
	    					"                                                   <input type='file' name='file'/>                                                                                                                                                                                                                                                               ");
	    			out.print(
	    					"                                               </div>                                                                                                                                                                                                                                                                                             ");
	    			out.print(
	    					"                                           </div>                                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                       </div>                                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                       <div class='col-md-6'>                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                           <div class='profile-head'>                                                                                                                                                                                                                                                                             ");
	    			out.print(
	    					"                                                       <h5>                                                                                                                                                                                                                                                                                       ");
	    			out.print("                                                         " + result.getName()
	    					+ "                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                                       </h5>                                                                                                                                                                                                                                                                                      ");
	    			out.print(
	    					"                                                       <h6>                                                                                                                                                                                                                                                                                       ");
	    			out.print("                                                         " + result.getDesignation()
	    					+ "                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                                       </h6>                                                                                                                                                                                                                                                                                      ");
	    			out.print(
	    					"                                                       <!-- <p class='proile-rating'>RANKINGS : <span>8/10</span></p> -->                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                               <ul class='nav nav-tabs' id='myTab' role='tablist'>                                                                                                                                                                                                                                                ");
	    			out.print(
	    					"                                                   <li class='nav-item'>                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                                                       <a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab' aria-controls='home' aria-selected='true'>About</a>                                                                                                                                                     ");
	    			out.print(
	    					"                                                   </li>                                                                                                                                                                                                                                                                                          ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                               </ul>                                                                                                                                                                                                                                                                                              ");
	    			out.print(
	    					"                                            </div>                                                                                                                                                                                                                                                                                                ");
	    			out.print(
	    					"                                            <div>                                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                             <label for=''>Age  :</label>&nbsp;                                                                                                                                                                                                                                                                  ");
	    			out.print("                                             <label for=''>" + result.getAge()
	    					+ "</label><br>                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                             <label for=''>Salary  :</label>&nbsp;                                                                                                                                                                                                                                                                  ");
	    			out.print("                                             <label for=''>" + result.getAge()
	    					+ "  </label><br>                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                             <label for=''>DOB  :</label>&nbsp;                                                                                                                                                                                                                                                                  ");
	    			out.print("                                             <label for=''>" + result.getDob()
	    					+ "  </label><br>                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                             <label for=''>Email  :</label>&nbsp;                                                                                                                                                                                                                                                                  ");
	    			out.print("                                             <label for=''>" + result.getEmail()
	    					+ "  </label><br>                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                             <label for=''>Phone  :</label>&nbsp;                                                                                                                                                                                                                                                                  ");
	    			out.print("                                             <label for=''>" + result.getPhone()
	    					+ "  </label><br>                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                           </div>                                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                       </div>                                                                                                                                                                                                                                                                                                     ");
	    			out.print(                                    
	    					"                                       <div class='col-md-2'>                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                          <a href=\"./logout\"> Logout</a>                                                                                                                                                                                                                      ");
	    			out.print(
	    					"                                       </div>                                                                                                                                                                                                                                                                                                     ");
	    			out.print(                                  
	    					"                                   </div>                                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"                                           </div>                                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                       </div>                                                                                                                                                                                                                                                                                                     ");
	    			out.print(
	    					"                                   </div>                                                                                                                                                                                                                                                                                                         ");
	    			out.print(
	    					"                               </form>                                                                                                                                                                                                                                                                                                            ");
	    			out.print(
	    					"                           </div>                                                                                                                                                                                                                                                                                                                 ");
	    			out.print(
	    					"                                                                                                                                                                                                                                                                                                                                                  ");
	    			out.print(
	    					"               </body>                                                                                                                                                                                                                                                                                                                            ");
	    			out.print("               </html> ");

	        	    
	        	    
	        	 
	         }
	         else {
	        	 
	         }
	    	
	    }
}
