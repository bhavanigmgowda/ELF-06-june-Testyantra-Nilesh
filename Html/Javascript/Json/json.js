// var library=[
//     {
//         id:1,
//         author:'chetan'
        
//     },
//     {
//         id:2,
//         author:'bill'
//     },
//     {
//         id:3,
//         author:'naryan'
//     }

// ];

//   var json=JSON.stringify(library);
//    console.log(json);

//    var obj=JSON.parse(json);
//    console.log(obj);

  // factorial recursion
//    var number=prompt("enter number"); 
//     console.log(fact(number))


//    function fact(f)
//   {
//         if(f==1)
//         {
//             return 1;
//         }
//         else{
//             return  f*(fact(f-1));
//         }
//   }


     
    //  function counter()
    //  {
    //       var count=0;
         
    //       function getCount()
    //       {
    //           return count++;
    //       }
    //        return getCount;

    //  }


    //  let count=counter();
    //     var val=count();
    //     console.log(val);

    //     var val1=counter();

    //     console.log(val1);


            // var dwightSalary=(function(){
            //     var salary=6000;
            //     function changeBy(amount){
            //          salary+=amount;
            //     }
            //     return {
            //           raise:function(){
            //               changeBy(5000);
            //           },
            //           lower:function(){
            //                changeBy(-5000);
            //           },
            //           currentAmount:function(){
            //               return salary;
            //           }
            //     }
            // })();


            // alert(dwightSalary.currentAmount());
            // dwightSalary.raise();

            // alert(dwightSalary.currentAmount());
            // dwightSalary.lower();

            // alert(dwightSalary.currentAmount());





            let promise=new Promise((res,rej)=>{
                            const items=[{id:1,name:'Nilesh'},{id:2,name:'Ronak'}]
                                if(items.length>0)
                                {
                                    res(items);
                                }                          
                                  else{
                                      rej("rejected");
                                  }

            });

               promise.then((data)=>{
               
                 console.log(data);
               }).catch((reason)=>{

                console.log(reason);
               })