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
        <form method="post" action="./registration"   class="col-md-10 offset-1" style="background-color : rgb(236, 236, 114)">
                <h3 style="text-align: center;padding: 20px;">Employee Information</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input required name="id" type="text" class="form-control"  placeholder="Please Enter ID">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input name="account_no" type="text" class="form-control"  placeholder="Please EnterAccount Numberr ">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input name="name" type="text" class="form-control"  placeholder="Please Enter Name">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input name="email" type="email" class="form-control"  placeholder="Please Enter Email Id ">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br>
                            <input name="age" type="text" class="form-control"  placeholder="Please Enter Age">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input name="designation" type="text" class="form-control"  placeholder="Please EnterDesignation">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br>
                                  <select  name="gender" style="        width: 640.75px;height: 39.99px;" >
                                      <option value="" disabled="disabled" selected="selected">Please select</option>
                                    <option value="Male">Male</option>
                                      <option value="Female">Female</option>
                                     
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input name="dob" type="date" class="form-control"  placeholder="dd-mm-yyyy">
                                </div>
                                
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input name="salary" type="text" class="form-control"  placeholder="Please EnterDesignation">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input name="departmentInfoBean.deptID" type="text" class="form-control"  placeholder="Please Enter Department ID ">

                                     
                                    </div>
                              </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input name="phone" type="text" class="form-control"  placeholder="Please Enter Phone Number">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input name=mgrId  type="text" class="form-control"  placeholder="Please Enter Manager ID ">
    
                                        
                                        </div>
                                      </div>
                                      
                                      <div class="form-row">
                                          <div class="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input name="joining_date" type="date" class="form-control"  placeholder="dd-mm-yyyy">
                                            </div>

                                            <div>
                                                <label type="password" for="inputEmail4">Password</label>
                                                <input name="password" type="text" class="form-control"  placeholder="Please your Password">

                                            </div>
                                           
                                        </div>

                                    </div>

                                    <h3 style="text-align: center;padding: 20px;">Employee Other Information</h3>
                                    <hr>   
                                <div class="form-row">
                
                                      <div class="form-group col-md-4">
                                        <label for="inputPassword4">Emergency Contact Name</label>
                                        <input name="otherInfo.emergency_contact_name" type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number ">
                                      </div>
                                      <div class="form-group col-md-4">
                                            <label for="inputAddress">Mother Name</label>
                                            <input name="otherInfo.mother_name" type="text" class="form-control" id="inputAddress" placeholder="Please Enter Mother Name">
                                          </div>
                                    </div>
                    
                                    <div class="form-row">
                                            <div class="form-group col-md-4">
                                              <label for="inputEmail4">Pan Number</label>
                                              <input name="otherInfo.pan" type="text" class="form-control"  placeholder="Please Enter Pan Number">
                                            </div>
                                            <div class="form-group col-md-4">
                                              <label for="inputPassword4">Emergency Contact Number</label>
                                              <input name="otherInfo.emergency_contact_number" type="text" class="form-control"  placeholder="Please Enter Emergency Contact Number ">
                                            </div>
                                            <div class="form-group col-md-4">
                                                  <label for="inputAddress">Spouse Name</label>
                                                  <input name="otherInfo.spouse_NM" type="text" class="form-control" id="inputAddress" placeholder="Please Enter Spouse Name">
                                                </div>
                                          </div>
                                  
                                          <div class="form-row">
                                            <div  class="form-group col-md-4">
                                                <label for="inputEmail4">Married Status</label><br>
                                                <select name="otherInfo.ismarried" style="    width: 408.75px;height: 37.99px;">
                                                    <option value="true">Married</option>
                                                    <option value="false">Single</option>
                                                  </select>
                                           
                                            </div>
                                             
                                                <div class="form-group col-md-4">
                                                  
                                                  <label for="inputPassword4">Nationality</label>
                                              
                                                <select name="otherInfo.nationality" style="    width: 408.75px;height: 37.99px;" >
                                                    <option value="" disabled="disabled" selected="selected">Please select</option>
                                                  <option value="Indian">Indian</option>
                                                    <option value="Other">Other</option>
                                                  </select>
                                                </div>
                    
                                                <div class="form-group col-md-4">
                                                      <label for="inputAddress">Passport Number</label>
                                                      <input name="otherInfo.passport" type="text" class="form-control" id="inputAddress" placeholder="please enter Passport Number">
                                                    </div>
                                             
                                              </div>
                                              <div class="form-row">
                                                    <div class="form-group col-md-4">
                                                      <label for="inputEmail4">Blood Group</label>
                                                      <select name="otherInfo.blood_grp" style="    width: 408.75px;height: 37.99px;" >
                                                          <option value="" disabled="disabled" selected="selected">Please select</option>
                                                        <option value="A+">A+</option>
                                                          <option value="B+">B+</option>
                                                          <option value="O+">O+</option>
                                                          <option value="AB+">AB+</option>
                                                          <option value="A-">A-</option>
                                                          <option value="B-">B-</option>
                                                          <option value="O-">O-</option>
                                                          <option value="AB-">AB-</option>
                                                        </select>
                                                    </div>
                                                    <div class="form-group col-md-4">
                                                      <label for="inputPassword4">Religion</label>
                                                      <select name="otherInfo.religion" style="    width: 408.75px;height: 37.99px;" >
                                                        <option value="" disabled="disabled" selected="selected">Please select</option>
                                                      <option value="Hinduism">Hinduism</option>
                                                        <option value="Islam">Islam</option>
                                                        <option value="Sikhism">Sikhism </option>
                                                        <option value="Buddhism">Buddhism</option>
                                                        <option value="Jainism">Jainism</option>
                                                        <option value="Other religions ">Other religions </option>
                    
                                                        </option>
                                                      
                                                      </select>
                                                    </div>
                                                    <div class="form-group col-md-4">
                                                          <label for="inputAddress">Aadhar Number</label>
                                                          <input name="otherInfo.adhar" type="text" class="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number">
                                                        </div>
                                                  </div>
                    
                                    
                                                  <div class="form-row">
                                                        <div class="form-group col-md-4">
                                                          <label for="inputEmail4">Physically Challenged?</label>
                                                          <select name="otherInfo.isChallenged" style="    width: 408.75px;height: 37.99px;" >
                                                            <option value="" disabled="disabled" selected="selected">Please select</option>
                                                          <option value="YES">YES</option>
                                                            <option value="NO">NO</option>
                                                          </select>
                                                        </div>
                                                        <div class="form-group col-md-4">
                                                          <label for="inputPassword4">Father Name</label>
                                                          <input name="otherInfo.father_name" style="width: 408.75px;height: 37.99px;" type="text" class="form-control"  placeholder="Please Enter Father Name ">
                    
                                                         
                                                        </div>
                                                        
                                                        </div>
                                                       <!--Employee Address --> 

                                <h3 style="text-align: center;padding: 20px;">Employee Address Info</h3>
                <hr>   
            <div class="form-row">
                  
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">City</label>
                    <input name="addressInfoBean[0].city" type="text" class="form-control"  placeholder="Please Enter City ">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Address type</label>
                          <select required   name="addressInfoBean[0].addressPkBean.addressType" required style=" width: 640.75px;height: 39.99px;" >
                            <option value="" disabled="disabled" selected="selected">Select-one</option>
                          <option value="Permanent">Permanent</option>
                            <option value="Female">Tempory</option>
                           </select>
                         </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">State</label>
                          <input name="addressInfoBean[0].state" type="text" class="form-control"  placeholder=" Enter State ">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Address1</label><br>
                            <input name="addressInfoBean[0].address1" type="text" class="form-control"  placeholder=" Enter Address1">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Country</label>
                          
                              <input name="addressInfoBean[0].country" type="text" class="form-control"  placeholder="Enter Country">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Address2</label><br>
                                  <input name="addressInfoBean[0].address2" type="text" class="form-control"  placeholder=" Enter Address2">
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="Pincode">Pincode</label>
                                  <input name="addressInfoBean[0].pincode" type="text" class="form-control"  placeholder="enter  Pincode">
                                 </div>
                                
 
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Landmark</label>
                                      <input name="addressInfoBean[0].landmark" type="text" class="form-control"  placeholder="Please Enter Landmark">
                                    </div>


                                   
                                  
                              </div>

                                    </div>
                          
                                    <h3 style="text-align: center;padding: 20px;">Employee Address INFO</h3>
                                    <hr>   
                                <div class="form-row">
                        
                                      <div class="form-group col-md-6">
                                        <label for="inputPassword4">City</label>
                                        <input name="addressInfoBean[1].city" type="text" class="form-control"  placeholder="Please Enter City ">
                                      </div>
                                  
                                    </div>
                                    <div class="form-row">
                                            <div class="form-group col-md-6">
                                              <label for="inputEmail4">Address type</label>
                                              <select required  name="addressInfoBean[1].addressPkBean.addressType" style=" width: 640.75px;height: 39.99px;" >
                                                <option value="" disabled="disabled" selected="selected">Select-one</option>
                                              <option value="Permanent">Permanent</option>
                                                <option value="Female">Tempory</option>
                                               </select>
                                             </div>
                                            <div class="form-group col-md-6">
                                              <label for="inputPassword4">State</label>
                                              <input name="addressInfoBean[1].state" type="text" class="form-control"  placeholder=" Enter State ">
                                            </div>
                                          
                                          </div>
                                  
                                          <div class="form-row">
                                            <div  class="form-group col-md-6">
                                                <label for="inputEmail4">Address1</label><br>
                                                <input  name="addressInfoBean[1].address1" type="text" class="form-control"  placeholder=" Enter Address1">
                                           
                                            </div>
                                             
                                                <div class="form-group col-md-6">
                                                  
                                                  <label for="inputPassword4">Country</label>
                                              
                                                  <input name="addressInfoBean[1].country" type="text" class="form-control"  placeholder="Enter Country">
                                                </div>
                    
                                               
                                             
                                              </div>
                                              <div class="form-row">
                                                    <div class="form-group col-md-6">
                                                      <label for="inputEmail4">Address2</label><br>
                                                      <input name="addressInfoBean[1].address2" type="text" class="form-control"  placeholder=" Enter Address2">
                                                    </div>
                                                    <div class="form-group col-md-6">
                                                      <label for="Pincode">Pincode</label>
                                                      <input name="addressInfoBean[1].pincode" type="text" class="form-control"  placeholder="enter  Pincode">
                                                     </div>
                                                    
                     
                                                  </div>
                    
                                    
                                                  <div class="form-row">
                                                        <div class="form-group col-md-6">
                                                          <label for="inputEmail4">Landmark</label>
                                                          <input  name="addressInfoBean[1].landmark" type="text" class="form-control"  placeholder="Please Enter Landmark">
                                                        </div>
                    
                    
                                                       
                                                      
                                                  </div>
                    
                                                        </div> 
                                                      
                                                        
                                      <!----Education -->                  
                                
                                      <h3  style="text-align: center ;padding: 20px;">Educational Details</h3>
                                      <hr>
                                
                                     <div class="input-group flex-nowrap">
                                       <div class="input-group-prepend">
                                         <span class="input-group-text" id="addon-wrapping">Education Type</span>
                                       </div>
                                       <input  required  name="educationalInfoBeans[0].educationInfoPKBean.educationType" requried type="text" class="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping">
                                     </div>
                                     <br>
                                     <div class="input-group flex-nowrap">
                                       <div class="input-group-prepend">
                                         <span class="input-group-text" id="addon-wrapping">Degree Type</span>
                                       </div>
                                       <input name="educationalInfoBeans[0].degreeType" type="text" class="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping">
                                     </div>
                                     <br>
                                     <div class="input-group flex-nowrap">
                                         <div class="input-group-prepend">
                                           <span class="input-group-text" id="addon-wrapping">Branch</span>
                                         </div>
                                         <input  name="educationalInfoBeans[0].branch" type="text" class="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping">
                                       </div>
                                       <br>
                                       <div class="input-group flex-nowrap">
                                         <div class="input-group-prepend">
                                           <span class="input-group-text" id="addon-wrapping">Collage Name</span>
                                         </div>
                                         <input  name="educationalInfoBeans[0].collageName" type="text" class="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping">
                                       </div>
                                       <br>
                                       <div class="input-group flex-nowrap">
                                         <div class="input-group-prepend">
                                           <span class="input-group-text" id="addon-wrapping">University</span>
                                         </div>
                                         <input  name="educationalInfoBeans[0].university" type="text" class="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping">
                                       </div>
                                       <br>
                                     <div class="input-group flex-nowrap">
                                       <div class="input-group-prepend">
                                         <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
                                       </div>
                                       <input  name="educationalInfoBeans[0].yop" type="text" class="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping">
                                     </div>
                                     <br>
                             
                                     <div class="input-group flex-nowrap">
                                         <div class="input-group-prepend">
                                           <span class="input-group-text" id="addon-wrapping">Percentage</span>
                                         </div>
                                         <input  name="educationalInfoBeans[0].percentage" type="text" class="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping">
                                       </div>
                                       <br>
                                       <div class="input-group flex-nowrap">
                                         <div class="input-group-prepend">
                                           <span class="input-group-text" id="addon-wrapping">Location</span>
                                         </div>
                                         <input  name="educationalInfoBeans[0].location" type="text" class="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping">
                                       </div>
                             
                                     <br>
                             
                                     
                                    </div>
                                   
                                   
                                  </div>
                                 
                                
                                </div>
                               
                               
                             
                             
                              </div>
                              <!------>
                              <h3  style="text-align: center ;padding: 20px;">Educational Details</h3>
                              <hr>
                
                             
                             <div class="input-group flex-nowrap">
                               <div class="input-group-prepend">
                                 <span class="input-group-text" id="addon-wrapping">Education Type</span>
                               </div>
                               <input required   name="educationalInfoBeans[1].educationInfoPKBean.educationType" requried type="text" class="form-control" placeholder="Enter Education Type" aria-label="Username" aria-describedby="addon-wrapping">
                             </div>
                             <br>
                             <div class="input-group flex-nowrap">
                               <div class="input-group-prepend">
                                 <span class="input-group-text" id="addon-wrapping">Degree Type</span>
                               </div>
                               <input name="educationalInfoBeans[1].degreeType" type="text" class="form-control" placeholder="Enter Degree Type" aria-label="Username" aria-describedby="addon-wrapping">
                             </div>
                             <br>
                             <div class="input-group flex-nowrap">
                                 <div class="input-group-prepend">
                                   <span class="input-group-text" id="addon-wrapping">Branch</span>
                                 </div>
                                 <input  name="educationalInfoBeans[1].branch" type="text" class="form-control" placeholder="Enter Branch" aria-label="Username" aria-describedby="addon-wrapping">
                               </div>
                               <br>
                               <div class="input-group flex-nowrap">
                                 <div class="input-group-prepend">
                                   <span class="input-group-text" id="addon-wrapping">Collage Name</span>
                                 </div>
                                 <input name="educationalInfoBeans[1].collageName" type="text" class="form-control" placeholder="Enter Collage Name" aria-label="Username" aria-describedby="addon-wrapping">
                               </div>
                               <br>
                               <div class="input-group flex-nowrap">
                                 <div class="input-group-prepend">
                                   <span class="input-group-text" id="addon-wrapping">University</span>
                                 </div>
                                 <input name="educationalInfoBeans[1].university" type="text" class="form-control" placeholder="Enter University" aria-label="Username" aria-describedby="addon-wrapping">
                               </div>
                               <br>
                             <div class="input-group flex-nowrap">
                               <div class="input-group-prepend">
                                 <span class="input-group-text" id="addon-wrapping">Year Of Passing</span>
                               </div>
                               <input name="educationalInfoBeans[1].yop" type="text" class="form-control" placeholder="dd-mm-yyyy " aria-label="Username" aria-describedby="addon-wrapping">
                             </div>
                             <br>
                     
                             <div class="input-group flex-nowrap">
                                 <div class="input-group-prepend">
                                   <span class="input-group-text" id="addon-wrapping">Percentage</span>
                                 </div>
                                 <input  name="educationalInfoBeans[1].percentage" type="text" class="form-control" placeholder="Enter Percentage" aria-label="Username" aria-describedby="addon-wrapping">
                               </div>
                               <br>
                               <div class="input-group flex-nowrap">
                                 <div class="input-group-prepend">
                                   <span class="input-group-text" id="addon-wrapping">Location</span>
                                 </div>
                                 <input name="educationalInfoBeans[1].location" type="text" class="form-control" placeholder="Enter Location" aria-label="Username" aria-describedby="addon-wrapping">
                               </div>
                     
                             <br>
                     
                            
                            </div>
                           
                           
                          </div>
                         
                        
                        </div>
                       
                       
                     
                     
                      </div>
                     <!------Experience Info1-------->
                     <h3  style="text-align: center ;padding: 20px;">Employee Experience Details</h3>
                     <hr>
                
                    <div class="input-group flex-nowrap">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="addon-wrapping">Company Name</span>
                      </div>
                      <input  required  name="expInfoBean[0].employeeExperiencePKBean.comapnyName" required type="text" class="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping">
                    </div>
                    <br>
                    <div class="input-group flex-nowrap">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="addon-wrapping">Designation</span>
                      </div>
                      <input name="expInfoBean[0].Designation" type="text" class="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping">
                    </div>
                    <br>
                    <div class="input-group flex-nowrap">
                      <div class="input-group-prepend">
                        <span class="input-group-text" id="addon-wrapping">Joining Date</span>
                      </div>
                      <input name="expInfoBean[0].joiningDate" type="Date" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
                    </div>
                    <br>
                    <br>
                    <div class="input-group flex-nowrap">
                        <div class="input-group-prepend">
                          <span class="input-group-text" id="addon-wrapping">leaving Date</span>
                        </div>
                        <input name="expInfoBean[0].leavingDate" type="Date" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
                      </div>
            
                    <br>
                    <br>
                   
                   </div>
                  
                  
                 </div>
                
               
               </div>
              
              
            
            
             </div>


               <!--Experience 2-->


               <h3  style="text-align: center ;padding: 20px;">Employee Experience Details</h3>
               <hr>
              
              <br>
              <div class="input-group flex-nowrap">
                <div class="input-group-prepend">
                  <span class="input-group-text" id="addon-wrapping">Company Name</span>
                </div>
                <input  required  name="expInfoBean[1].employeeExperiencePKBean.comapnyName" requried type="text" class="form-control" placeholder="Enter Company Name" aria-label="Username" aria-describedby="addon-wrapping">
              </div>
              <br>
              <div class="input-group flex-nowrap">
                <div class="input-group-prepend">
                  <span class="input-group-text" id="addon-wrapping">Designation</span>
                </div>
                <input name="expInfoBean[1].Designation" type="text" class="form-control" placeholder="Enter Designation" aria-label="Username" aria-describedby="addon-wrapping">
              </div>
              <br>
              <div class="input-group flex-nowrap">
                <div class="input-group-prepend">
                  <span class="input-group-text" id="addon-wrapping">Joining Date</span>
                </div>
                <input name="expInfoBean[1].joiningDate" type="Date" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
              </div>
              <br>
              <br>
              <div class="input-group flex-nowrap">
                  <div class="input-group-prepend">
                    <span class="input-group-text" id="addon-wrapping">leaving Date</span>
                  </div>
                  <input name="expInfoBean[1].leavingDate" type="Date" class="form-control" placeholder="dd-mm-yyyy" aria-label="Username" aria-describedby="addon-wrapping">
                </div>
      
              <br>
              <br>
              
             </div>
            
            
           </div>
          
         
         </div>
        
        
      
      
       </div>
       <div style="text-align: center;padding: 0px 102px 20px;"  class="btn-group" role="group" >  
        <button style="width: 150px" type="reset"  class="btn btn-outline-secondary">Reset</button>
       
          <button style="width: 150px" type="submit"  class="btn btn-outline-secondary">Submit</button>
        <br>
        <br>
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