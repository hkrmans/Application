package com.company;

public class Customer {

    String ssn;
    String Name;
    String address;
    String telephoneNumber;

    public Customer() {
        this.telephoneNumber = getTelephoneNumber();
        this.address = getAddress();
        this.ssn = getSsn();
        this.Name = getName();

    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getTelephoneNumber()
    {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber)
    {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ssn='" + ssn + '\'' +
                ", Name='" + Name + '\'' +
                ", address='" + address + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                '}';
    }
}

