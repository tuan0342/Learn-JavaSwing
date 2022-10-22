package keoTha;

import java.util.Date;

public class Student {

    private String name, address, email, phone, ID;
    private float mark;
    private Date dob; // dd/mm/yyyy

    public Student() {
    }

    public Student(String name, String address, String email, String phone, String ID, float mark, Date dob) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.ID = ID;
        this.mark = mark;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", ID='" + ID + '\'' +
                ", mark=" + mark +
                ", dob=" + dob +
                '}';
    }
}
