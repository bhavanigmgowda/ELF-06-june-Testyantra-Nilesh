var hobbies=['cricket','volleyball','football','reading'];

console.log(typeof hobbies)

var inc=hobbies.includes('cric');
 console.log(inc);


 hobbies.push("kabaddi")
 console.log(hobbies);

 hobbies.pop("kabaddi")
 console.log(hobbies);

 hobbies.shift(); //remove element at first index
 console.log(hobbies);

 hobbies.unshift("new value");  // add value at first index
 console.log(hobbies);

  hobbies.splice(0,0,'add element'); // modify original array
  console.log(hobbies);

  var hobbies=['cricket','volleyball','football','reading'];

   var hobbies1=  hobbies.slice(1); // not modify original array store it another array
  console.log(hobbies1);
   
     // convert Array in to String

    ;
   
     console.log( hobbies.join('--'));


     console.log( hobbies.indexOf('cricket'));
    
     console.log('CAll Back');
     // CAll Back

     function first(sec)
     {
          setTimeout(()=>{
            console.log('this is first');
            sec();
          },200);



       
     }

     function second()
     {
        console.log('this is SECOND'); 
     }

     function third()
     {
          setTimeout(()=>{
            console.log('this is third');
          },800);



       
     }
 
     first(second)
   //  third()
    
   console.log('map and filter');

   const items=[
       {
           id:1,
           name:'book',
           price:100
       },
       {
           id:2,
           name:'shirt',
           price:800
       },
       {
           id:3,
           name:'pen',
           price:50
       },
       {
           id:4,
           name:'jeans',
           price:12000

       }

   ]

   console.log(items);

   let mappedId=items.map((values)=>
   {
       return values.price;
       
    }
   );
   console.log(mappedId);


      
   let FilterValue=items.filter((values)=>
   values.name==='shirt'
   );
   console.log(FilterValue);
 

   //
       



