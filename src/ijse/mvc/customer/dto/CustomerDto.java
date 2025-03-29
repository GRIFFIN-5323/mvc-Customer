/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ijse.mvc.customer.dto;

/**
 *
 * @author gihan5323
 */
public class CustomerDto {
    
    private String custId;
    private String cusTitle;
    private String custName;
    private String dob;
    private double salary;
    private String custAddress;
    private String city;
    private String province;
    private String postelCode;

    public CustomerDto() {
    }

    public CustomerDto(String custId, String cusTitle, String custName, String dob, double salary, String custAddress, String city, String province, String postelCode) {
        this.custId = custId;
        this.cusTitle = cusTitle;
        this.custName = custName;
        this.dob = dob;
        this.salary = salary;
        this.custAddress = custAddress;
        this.city = city;
        this.province = province;
        this.postelCode = postelCode;
    }

    /**
     * @return the custId
     */
    public String getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(String custId) {
        this.custId = custId;
    }

    /**
     * @return the cusTitle
     */
    public String getCusTitle() {
        return cusTitle;
    }

    /**
     * @param cusTitle the cusTitle to set
     */
    public void setCusTitle(String cusTitle) {
        this.cusTitle = cusTitle;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the custAddress
     */
    public String getCustAddress() {
        return custAddress;
    }

    /**
     * @param custAddress the custAddress to set
     */
    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province the province to set
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return the postelCode
     */
    public String getPostelCode() {
        return postelCode;
    }

    /**
     * @param postelCode the postelCode to set
     */
    public void setPostelCode(String postelCode) {
        this.postelCode = postelCode;
    }
    
    
    
    
}
