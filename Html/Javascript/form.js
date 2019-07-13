window.onload=function(){
     
};


function validateForm()
{
  let myEmail=  document.forms[0].email.value;

  let password= document.forms[0].password.value;
   
  let confirmpassword= document.forms[0].confirmPassword.value;
   

   if(myEmail.length>0 && password.length>0 && confirmpassword>0 && password===confirmpassword && 
    /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myEmail) )
   {
        document.getElementById("Button").disabled = false;
   }
    else{
        document.getElementById("Button").disabled = true;
    }
    console.log(myEmail);
   }
   
  
 



 
