class LifeCycle extends React.Component{
       constructor(props){
         super(props);
         console.log("constructor lifecycle");
         this.state={
              name:'Sundari',
              checked:true

         }
       }

        static getDerivedStateFromProps(){
            console.log('GetDerivedStateFromProps Lifeycle');
            return null;
        }
        render(){
             console.log("render LifeCycle")
                if(this.state.checked){
             return(
                 <div>
                    
                 <h1>{this.state.name}</h1>
                 <button onClick={this.changeName.bind(this)}>Change</button>
                 <Child/>
                 </div>
             );

        }
         return <h1>Checked is false</h1>
    }
       
        changeName(){
            this.setState({
                 name:'Dinga'
            })
        }

         componentDidMount(){
             console.log("componentDidMount LifeCycle");
         }

         // Updating Phase


          // check component is update or not
         shouldComponentUpdate(){
             console.log('Should component Update lifecycle');
             //return false;  not update the state
             return true; 
         }

          // store value before update
         getSnapshotBeforeUpdate(){
             console.log('SnapShot Before Update LifeCycle');
             return "Snapshot Data"
         }
  
        componentDidUpdate(props,state,snapshot){
            console.log('component updated lifecycle ');
            console.log(snapshot);
        }
    }
 
    class Child extends React.Component{
        constructor(props){
          super(props);
          console.log("constructor Child");
          this.state={
               name:'Sundari',
               checked:true
 
          }
        }
 
         static getDerivedStateFromProps(){
             console.log('GetDerivedStateFromProps Child');
             return null;
         }
         render(){
              console.log("render Child")
                 if(this.state.checked){
              return(
                  <div>
                  <h1>Child Component</h1>
                  <button onClick={this.changeName.bind(this)}>Change</button>
                  </div>
              );
 
         }
          return <h1>Checked is false</h1>
     }
        
         changeName(){
             this.setState({
                  name:'Dinga'
             })
         }
 
          componentDidMount(){
              console.log("componentDidMount Child");
          }
 
          // Updating Phase
 
 
           // check component is update or not
          shouldComponentUpdate(){
              console.log('Should component Update Child');
              //return false;  not update the state
              return true; 
          }
 
           // store value before update
          getSnapshotBeforeUpdate(){
              console.log('SnapShot Before Update Child');
              return "Snapshot Data"
          }
   
         componentDidUpdate(props,state,snapshot){
             console.log('component updated Child ');
             console.log(snapshot);


} 
     
}
   ReactDOM.render(<div><LifeCycle/></div>,document.getElementById('app'));