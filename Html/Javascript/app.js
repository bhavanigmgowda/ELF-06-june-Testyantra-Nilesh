var a=10;

console.log(a);

var b=a;

console.log(b);

b=20;

console.log(a);
console.log(b);

console.log('=============================');

var person={

            name:'Ramesh',
            age:20
          };

          console.log('name'+person.name);
        var person1=person;
        console.log('p1 name'+person1.name);

        person1.name='Ronak';
        console.log("p name"+person.name);
        console.log("p1 name"+person1.name);

        var n=10;
        console.log('====================')


        var person={
               firstname:'harsh',
               lastname:'gupta',
               eyecolor:'blue',
               getfullName:function()
               {
                   return this.firstname+" " +this.lastname;
               },

        
        address:{
             city:'banglore',
             state:'karnataka'
        },
        hobbies:['playing','travel']
    };

        console.log(person.firstname);
        console.log(person.getfullName());
        console.log(person.address.city)
        console.log(person.address.state)
        console.log(person.hobbies)
 
        console.log('====================')

        var library=[
                {
                    id:1,
                    author:'chetan'
                    
                },
                {
                    id:2,
                    author:'bill'
                },
                {
                    id:3,
                    author:'naryan'
                }

            ];

            console.log(library[0]);
            console.log(library[0].id);

            console.log('===============');

            var date =new Date();

            console.log(date);

            var dateone=new Date(2019,11,24,33);
           
            console.log('date is '+dateone);


             console.log('===================');

               
             

           