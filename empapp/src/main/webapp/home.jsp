

<!DOCTYPE html>
<%@page import="com.tyss.emp.dto.EmployeeInfoBean"%>
<html lang="en">
<head>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=\, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="Home.css">
</head>
<body>
        <% EmployeeInfoBean result=(EmployeeInfoBean)session.getAttribute("data"); %>
        
        
        <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark" >
                <div>
  <span class="badge badge-pill badge-danger">HomePage</span>&nbsp;&nbsp;&nbsp;&nbsp;
           
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                  <span class="navbar-toggler-icon"></span>
                </button>
             </div>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                 
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Dropdown
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>
                      </div>
                    </li>
                  
                  </ul>
                 
                </div>
                <div>
                <form method="get" action="./searchEmployee"   class="form-inline my-2 my-lg-0">
                        <input  class="form-control mr-sm-2 " name="search" type="search" placeholder="Search" aria-label="Search" >
                        <button type="submit" >Search</button>
                        
                      </form>
                    </div>
              </nav>
 





        <div class="container emp-profile">
                <form method="post">
                    <div class="row">
                        <div class="col-md-4">
                            <div class="profile-img">
                                <a href="./profile"><img src="profile.jpg" alt=""/></a>
                                <div class="file btn btn-lg btn-primary">
                                    Change Photo
                                    <input type="file" name="file"/>
                                </div>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="profile-head">
                                        <h5>
                                         
                                         <%=result.getName()%>
                                        </h5>
                                        <h6>
                                        <%=result.getDesignation()%>
                                        </h6>
                                        <!-- <p class="proile-rating">RANKINGS : <span>8/10</span></p> -->
                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                    <li class="nav-item">
                                        <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
                                    </li>
                                    
                                </ul>
                            </div>
                            <div>
                           <label for=" ">Age :</label>
                           <%=result.getAge()%><br>
                            <label for=" ">Email :</label>
                           <%=result.getEmail()%><br>
                           <label for="">DOB : </label>
                           <%=result.getDob()%><br>
                           <label for="">Gender : </label>
                           <%=result.getGender()%><br>
                           <label for="">Contanct-No : </label>
                           <%=result.getCcnt_no()%><br>
                           <label for="">Phone : </label>
                           <%=result.getPhone()%><br>      
                             <label for="">Salary : </label>
                           <%=result.getSalary()%><br> 
                        
                        </div>
                        </div>
                        <div>
                          <a href="./logout" >logout</a>
                        </div>
                    </div>
                               
                            </div>
                        </div>
                    </div>
                </form>           
            </div>
    
</body>
</html>