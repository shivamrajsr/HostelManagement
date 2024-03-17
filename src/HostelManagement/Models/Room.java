package HostelManagement.Models;

import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private int number;
    private int noOfBeds;
    private List<Student> studentsList;
    private boolean isFilled;
    private int emptyBeds;

    public Room(int number, int noOfBeds) {
        this.number = number;
        this.noOfBeds = noOfBeds;
        this.studentsList = new ArrayList<>();
        this.isFilled = false;
        emptyBeds = noOfBeds;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }
    public int getRoomNumber(){
        return this.number;
    }


    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
    }

    public boolean isFilled() {
        if(getEmptyBeds()>=1){
            return false;
        }
        else return true;
    }
    public boolean removeStudent(Student student){
        return this.studentsList.remove(student);

    }


    public int getEmptyBeds() {
        return this.noOfBeds - this.studentsList.size();
    }

    public void setEmptyBeds(int emptyBeds) {
        this.emptyBeds = emptyBeds;
    }

    @Override
    public String toString() {
        return "Room [number=" + number + ", noOfBeds=" + noOfBeds + ", studentsList=" + studentsList + ", isFilled="
                + isFilled + ", emptyBeds=" + emptyBeds + "]";
    }
    

    
}
