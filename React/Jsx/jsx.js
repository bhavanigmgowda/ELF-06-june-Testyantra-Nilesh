
    const name="Akshay"
    const element =<h1>{name}</h1>

      //component function 
      //props are immutable cannot modified
    //  function Welcome(props){
    //       return(
    //           <div>
    //           <h1 style={{color:'red'}} >{props.name}</h1>    
    //           <button onClick={alert.bind(this,'this is Button')} >Click</button>
    //           </div>
    //       )
    //  }

        // class in react

        class Message extends React.Component{
               constructor(props){
                      super(props)

                     this.state={
                         name:'Harsh'
                     } 
                 //  this.changeMessage=this.changeMessage.bind(this);
                   this.clickLink=this.clickLink.bind(this);
               }
               render(){
                   return (
                       <div>
                   <h1>{this.state.name}</h1>    
                  <button onClick={this.changeMessage} >Change message</button>
                  <a href="https://www.google.com" onClick={this.clickLink}>Link</a>

                       </div>
                   )

               }
               // if we use arrow no need of bind inside 
               changeMessage=()=>{
                   this.setState({
                       name:'kriti'
                   })
               }

               clickLink(event){
                 event.preventDefault();
               }


        }

    ReactDOM.render(<Message />,document.getElementById('app'))
   
