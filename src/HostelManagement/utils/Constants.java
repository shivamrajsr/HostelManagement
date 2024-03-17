package HostelManagement.utils;

import java.util.ArrayList;
import java.util.List;

import HostelManagement.Models.Room;
import HostelManagement.Models.Student;

public class Constants {
    private static List<Room> listOfRooms = new ArrayList<>();
    private static List<Student> students = new ArrayList<>();

    public static void initialize(){
        listOfRooms.add(new Room(1,2));
        listOfRooms.add(new Room(2,3));
        listOfRooms.add(new Room(3,2));
        listOfRooms.add(new Room(4,4));
        listOfRooms.add(new Room(5,2));
        listOfRooms.add(new Room(6,2));
        listOfRooms.add(new Room(7,1));
        listOfRooms.add(new Room(8,2));
        listOfRooms.add(new Room(9,1));
        listOfRooms.add(new Room(10,2));
        listOfRooms.add(new Room(11,5));



        students.add(new Student("Ram",12345,998877));
        students.add(new Student("Sam",12346,998877));
        students.add(new Student("Tam",12347,998877));
        students.add(new Student("Uam",12348,998877));
        students.add(new Student("Vam",12349,998877));
        students.add(new Student("Wam",12340,998877));
        students.add(new Student("Xam",12311,998877));
        students.add(new Student("Yam",12322,998877));
        students.add(new Student("Zam",12333,998877));
        students.add(new Student("aam",12344,998877));
        students.add(new Student("bam",12355,998877));
        students.add(new Student("cam",12366,998877));
        students.add(new Student("dam",12377,998877));
        students.add(new Student("eam",12388,998877));
        students.add(new Student("fam",12399,998877));
        students.add(new Student("gam",12300,998877));
        students.add(new Student("ham",12313,998877));
        students.add(new Student("iam",12314,998877));
        students.add(new Student("jam",12315,998877));
        students.add(new Student("kam",12316,998877));
        students.add(new Student("lam",12318,998877));
        students.add(new Student("mam",12326,998877));
        students.add(new Student("nam",12367,998877));

    }

    public static List<Room> getRooms(){
        return listOfRooms;
    }
    public static List<Student> getStudents(){
        return students;
    }
}
