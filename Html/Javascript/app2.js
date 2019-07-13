 
 var hobbies=['cricket','volleyball','football','reading'];
   hobbies["test"]='travel';
  document.getElementById('Demo').innerHTML=hobbies;


   var arr=[1,2,3,4];

   arr.forEach((val,ind) => {
       console.log(val);
  
   });


   var person={
    name :'nilesh',
    age :22,
   };
    // for object can not use
   for(var i=0;i<person.length;i++)
   {
       console.log("values"+person[i]);
   }


   // use in array
   for(var i=0;i<hobbies.length;i++)
   {
       console.log("values"+hobbies[i]);
   }

   console.log("for each   ====================");
   // for each
   hobbies.forEach((values,index)=> {
       console.log("value"+values);
       console.log("value"+index);


   });
   console.log(" for of====================");
  // for of

  for(var val of hobbies)
  {
      console.log('values ='+val);
  }

  // for in
  console.log( "   for in ====================");
  for(var ind in hobbies)
  {
      console.log('index ='+ind);
  }

  console.log( " performance ====================");
  console.time("forof");
    for(var i of hobbies)
    {
        var a=[];
    }
    console.timeEnd("forof");
    console.log("for of ended")
    
    console.log( " ====================");
   
    console.time("forin");
    for(var i in hobbies)
    {
        var a=[];
    }
    console.timeEnd("forin");
    console.log("for of ended")


    console.log(num);
    var num=400;

  
  

    console.log("===========Function var let const==================");

    function varKey()
    {
        a=20;
        console.log(a);
    }

    console.log(a);

    function letKey()
    {
        let b=20;
        console.log(b);
    }
   // console.log(b);



    function contKey()
    {
        const c=20;
        console.log(c);
    }
  //  console.log(c);

     varKey();






       console.log("===========Function==================");

       function alertMessage(val,number)
       {
           alert(`this is normal function value = ${val} number= ${number}` );
       }

      (function()
      {
          alert("this is IIFE");
      }());

    alertMessage('aa',12)
      

   
    console.log("===========Function==================");

    fname();
    function fname(){
        console.log('aaa');
    }
  //  faname();
    var faname =function()
    {
        console.log('bbbbbb');
    }


    console.log(typeof hobbies)