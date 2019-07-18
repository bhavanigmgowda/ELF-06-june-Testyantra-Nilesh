
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
     
</head>

<body>
     <% String msg=(String)request.getAttribute("msg");%>
     
      <% if(msg!=null){ %>
         <h1><%= msg %></h1>
       <% }%>  
       
         
    
    <form action="./login" method="Post"> 
    <div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-heading">
				<h2 class="text-center">Employee Login</h2>
			</div>
			<hr />
			<div class="modal-body">
				
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon">
							<span class="glyphicon glyphicon-user"></span>
							</span>
							<input type="text" name="id" class="form-control" placeholder="Emp Id" />
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon">
							<span class="glyphicon glyphicon-lock"></span>
							</span>
							<input type="password" name="password" class="form-control" placeholder="Password" />

						</div>

					</div>

					<div class="form-group text-center">
                        <button type="submit" class="btn btn-success btn-lg">  Login   </button>
                       
                    </div>
                    <div class="form-group text-center">
                       <a class="btn btn-success btn-lg" href="EmployeeRegistration.jsp" >Create Account</a>&nbsp;&nbsp;
                        <button type="submit" class="btn btn-success btn-lg">Forgot Password</button>
                    </div>
                    <div class="form-group text-center">
						
					</div>

				
			</div>
		</div>
	</div>
   

</form>
   
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
    
</body>
</html>