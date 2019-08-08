<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
              <!DOCTYPE html>                                                                                                                      
	 	                       <html lang='en'>                                                                                                                   
	 	                                                                                                                                                          
	 	                       <head>                                                                                                                             
	 	                                                                                                                                                          
	 	                           <!------ Include the above in your HEAD tag ---------->                                                                        
	 	                           <meta charset='UTF-8'>                                                                                                         
	 	                           <meta http-equiv='X-UA-Compatible' content='ie=edge'>                                                                          
	 	                           <title>Document</title>                                                                                                        
	 	                                                                                                                                                          
	 	                <link rel='stylesheet' href='Home.css'>                                                                                        
	 	                       </head>                                                                                                                            
	 	                                                                                                                                                          
	 	                       <body>                                                                                                                             
	 	                                                                                                                                                          
	 	                           <nav class='navbar navbar-expand-lg navbar navbar-dark bg-dark'>                                                               
	 	                               <div>                                                                                                                      
	 	                                   <span class='badge badge-pill badge-danger'>HomePage</span>&nbsp;&nbsp;&nbsp;&nbsp;                                    
	 	                                                                                                                                                          
	 	                                   <button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarSupportedContent'              
	 	                                       aria-controls='navbarSupportedContent' aria-expanded='false' aria-label='Toggle navigation'>                       
	 	                                       <span class='navbar-toggler-icon'></span>                                                                          
	 	                                   </button>                                                                                                              
	 	                               </div>                                                                                                                     
	 	                               <div class='collapse navbar-collapse' id='navbarSupportedContent'>                                                         
	 	                                                                                                                                                          
	 	                                   <li class='nav-item dropdown'>                                                                                         
	 	                                       <a class='nav-link dropdown-toggle' href='#' id='navbarDropdown' role='button' data-toggle='dropdown'              
	 	                                           aria-haspopup='true' aria-expanded='false'>                                                                    
	 	                                           Dropdown                                                                                                       
	 	                                       </a>                                                                                                               
	 	                                       <div class='dropdown-menu' aria-labelledby='navbarDropdown'>                                                       
	 	                                           <a class='dropdown-item' href='#'>Action</a>                                                                   
	 	                                           <a class='dropdown-item' href='#'>Another action</a>                                                           
	 	                                           <div class='dropdown-divider'></div>                                                                           
	 	                                           <a class='dropdown-item' href='#'>Something else here</a>                                                      
	 	                                       </div>                                                                                                             
	 	                                   </li>                                                                                                                  
	 	                                                                                                                                                          
	 	                                   </ul>                                                                                                                  
	 	                                                                                                                                                          
	 	                               </div>                                                                                                                     
	 	                               <div>                                                                                                                      
	 	                                   <form action='./searchEmployee' method='get' class='form-inline my-2 my-lg-0'>                                                                                
	 	                                       <input class='form-control mr-sm-2 'name='search' type='search' placeholder='Search' aria-label='Search'>                       
	 	                                       <button type='submit'>Search</button>                                                                              
	 	                                                                                                                                                          
	 	                                   </form>                                                                                                                
	 	                               </div>                                                                                                                     
	 	                           </nav>                                                                                                                         
	 	                                                                                                                                                          
	 	                                                                                                                                                          
	 	                                                                                                                                                          
	 	                                                                                                                                                          
	 	                                                                                                                                                          
	 	                                                                                                                                                          
	 	                           <div class='container emp-profile'>                                                                                            
	 	                               <form method='post'>                                                                                                       
	 	                                                                                                                                                          
	 	                                   <div class='col-md-6'>                                                                                                 
	 	                                       <div class='profile-head'>                                                                                         
	 	                                                                                                                                                          
	 	                                           <ul class='nav nav-tabs' id='myTab' role='tablist'>                                                            
	 	                                               <li class='nav-item'>                                                                                      
	 	                                                   <a class='nav-link active' id='home-tab' data-toggle='tab' href='#home' role='tab'                     
	 	                                                       aria-controls='home' aria-selected='true'>Search Employee</a>                                      
	 	                                               </li>                                                                                                      
	 	                                                                                                                                                          
	 	                                           </ul>                                                                                                          
	 	                                       </div><br><br><br><br>                                                                                                             