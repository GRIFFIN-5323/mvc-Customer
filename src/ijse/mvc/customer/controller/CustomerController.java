/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.mvc.customer.controller;

import ijse.mvc.customer.dto.CustomerDto;
import ijse.mvc.customer.model.CustomerModel;
import java.util.ArrayList;
import java.sql.SQLException;

/**
 *
 * @author gihan5323
 */
public class CustomerController {
    
    CustomerModel model=new CustomerModel();
    
    public ArrayList<CustomerDto> getAll()throws ClassNotFoundException,SQLException{
    
    ArrayList<CustomerDto> customers=model.getAll();
    
    return customers;
    
    
}
    
    
}