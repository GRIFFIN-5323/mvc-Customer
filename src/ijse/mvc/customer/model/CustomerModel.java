/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.mvc.customer.model;

import ijse.mvc.customer.DBConnection.DBConnection;
import ijse.mvc.customer.dto.CustomerDto;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gihan5323
 */
public class CustomerModel {
    
public String saveCustomer(CustomerDto customerDto)throws ClassNotFoundException,SQLException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     
     String sql="INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?,?) ";
     
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setString(1, customerDto.getCustId());
     statement.setString(2, customerDto.getCusTitle());
      statement.setString(3, customerDto.getCustName());
       statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
         statement.setString(6, customerDto.getCustAddress());
          statement.setString(0, customerDto.getCity());
           statement.setString(0, customerDto.getProvince());
            statement.setString(0, customerDto.getPostelCode());
            
            return statement.executeUpdate() >0 ? "Succesfully Saved " : "Fail";
            
            
            

     
    
    
}


public String updateCustomer(CustomerDto customerDto)throws ClassNotFoundException,SQLException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     
     String sql="UPDATE Customer SET CustTitle=?, CustName=?,DOB=?, salary=?,CustAddress=?,City=?,Province=?,PostalCode=? WHERE CustID=? ";
     
    PreparedStatement statement = connection.prepareStatement(sql);
    
   
     statement.setString(1, customerDto.getCusTitle());
      statement.setString(2, customerDto.getCustName());
       statement.setString(3, customerDto.getDob());
        statement.setDouble(4, customerDto.getSalary());
         statement.setString(5, customerDto.getCustAddress());
          statement.setString(6, customerDto.getCity());
           statement.setString(7, customerDto.getProvince());
            statement.setString(8, customerDto.getPostelCode());
             statement.setString(9, customerDto.getCustId());
            
            return statement.executeUpdate() >0 ? "Succesfully Update " : "Fail";
            
    
    
}


public String deleteCustomer(String id)throws ClassNotFoundException,SQLException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     
     String sql="DELETE FROM Customer WHERE CustID=?";
     
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setString(1, id);
    
            
            return statement.executeUpdate() >0 ? "Succesfully Delete " : "Fail";
            

}

public CustomerDto searchCustomer(String id)throws ClassNotFoundException,SQLException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     
     String sql="SELECT ALL * FROM  Customer WHERE CustID=?";
     
    PreparedStatement statement = connection.prepareStatement(sql);
    
    statement.setString(1, id);
    
    ResultSet rst=statement.executeQuery();
    
    if(rst.next()){
        CustomerDto customerDto=new CustomerDto(rst.getString("CustID"),rst.getString("CustTitle"),rst.getString("CustName"),rst.getString("DOB"),rst.getDouble("salary"),rst.getString("CustAddress"),rst.getString("City"),rst.getString("Province"),rst.getString("PostalCode"));
          return customerDto;
    }
    
    return null;
    
            
          
            

}


public ArrayList<CustomerDto> getAll()throws ClassNotFoundException,SQLException{
    
     Connection connection=DBConnection.getInstance().getConnection();
     
     String sql="SELECT ALL * FROM  Customer ";
     
    PreparedStatement statement = connection.prepareStatement(sql);
    
   
    
    
    ResultSet rst=statement.executeQuery();
    ArrayList<CustomerDto> customers=new ArrayList<>();
    
    while(rst.next()){
        CustomerDto customerDto=new CustomerDto(rst.getString("CustID"),rst.getString("CustTitle"),rst.getString("CustName"),rst.getString("DOB"),rst.getDouble("salary"),rst.getString("CustAddress"),rst.getString("City"),rst.getString("Province"),rst.getString("PostalCode"));
        customers.add(customerDto);
    }
    
    return customers;
    
            
            
            

}


}