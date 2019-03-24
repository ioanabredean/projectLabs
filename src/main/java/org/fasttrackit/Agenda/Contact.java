package org.fasttrackit.Agenda;

public class Contact {

    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    //override
    public Contact (){
        super();
        phone="";
    }
    //overload
    public Contact(String firstNameParam, String lastNameParam){

        this();
        this.firstName=firstNameParam;
        this.lastName= lastNameParam;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public void setFirstName(String firstNameParam) throws IllegalAccessException {
        // optional cod pt validare e.g. no number, not empty
        if (firstNameParam.equals("")){
            throw new IllegalAccessException("First name" + " cannot be empty");
        }
        this.firstName=firstNameParam;
    }

    public String getFirstName (){
        return this.firstName;
    }
    public String toString (){
        return "First Name is  " +firstName + "  and last name is " + lastName;
    }
    public boolean equals (Object o){
        Contact second = (Contact)o;
        if (second.getFirstName().equals(this.firstName)&&second.getLastName().equals(this.getFirstName()))
        {
            return true;}
        else {
           return false;
            }

    }
}
