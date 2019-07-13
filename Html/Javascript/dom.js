/* 
let name=document.getElementById("name");
console.log(name);
console.log(name.textContent);

name.style.color='pink';

var classcollection= document.getElementsByClassName('demo');
   console.log(classcollection);

   classcollection[0].style.fontSize='50px';
   classcollection[1].style.fontSize='50px';


   document.getElementById('mybutton').className='button'
   document.getElementById('mybutton').classList='button button1';




   var querySelector= document.querySelector('p');
   console.log(querySelector);


   var all= document.querySelectorAll('.demo');
   console.log(all);

   // let input= document.createElement('input');
   // document.body.appendChild(input);
////

    var demoClass= document.getElementsByClassName('demo');
    console.log(demoClass.length);

    var demoClass1= document.querySelectorAll('demo');
    console.log(demoClass1.length);

    //

     console.log("number of elemnets query"+demoClass1.length);
     console.log("number of elemnets class by name "+demoClass.length);

     //

     document.getElementById("pele").className="blue";

     //

     console.log("number of elemnets query"+demoClass1.length);
     console.log("number of elemnets class by name "+demoClass.length);


     //  document.write('<h1>hellooooooooooooooo!!!!!!!!</h1>');


       document.getElementById('div1').textContent('<h1>hellooooooooooooooo!!!!!!!!</h1>');
    

 */

window.onload=function()
{
    document.getElementById('myButton1').textContent='Dont click';
};


   let button=document.getElementById('myButton');    
  

 

    button.onclick=function createNewElement()
   {        document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag</a>';
    }
  
  
    //  button.addEventListener('click',()=>({
    //     document.getElementById('div1').innerHTML='<a href="https://www.google.com">Anchor Tag</a>';
    //  }));
                          