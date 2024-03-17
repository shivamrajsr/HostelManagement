package HostelManagement.Models;


public class Student{
    private String name;
    private long aadhaarNo;
    private long contactNo;
    private int roomAssigned;

    public Student(String name, int aadhaarNo, int contactNo) {
        this.name = name;
        this.aadhaarNo = aadhaarNo;
        this.contactNo = contactNo;
        // 0 if not assigned
        this.roomAssigned = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAadhaarNo() {
        return aadhaarNo;
    }

    public void setAadhaarNo(int aadhaarNo) {
        this.aadhaarNo = aadhaarNo;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public int getRoomAssigned() {
        return roomAssigned;
    }

    public void setRoomAssigned(int roomAssigned) {
        this.roomAssigned = roomAssigned;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", aadhaarNo=" + aadhaarNo + ", contactNo=" + contactNo + ", roomAssigned="
                + roomAssigned + "]";
    }

}