import React, { Component } from 'react'
import Info from './Info';
import Otherinfo from './OtherInfo'


export default class AllForms extends Component {
    render() {
        return (
            <div>
               <Info/>
               <OtherInfo/>
            </div>
        )
    }
}
