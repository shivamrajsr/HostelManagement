package HostelManagement.Models;

import java.util.ArrayList;
import java.util.List;

public class Hostel {
    
    public Hostel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }
    private String name;
    private List<Room> rooms;

    private static volatile Hostel instance;

    public static Hostel getInstance(String name){
        Hostel result  = instance;
        if(result==null){
            synchronized (Hostel.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Hostel(name);
                }
            }
        }
        else{
            System.out.println("hostel is already initialized");
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Room getFirstEmptyRoom() {
        Room room = null;

        for(Room room2: this.rooms){
            if(!room2.isFilled()){
                room = room2;
                break; 
            }
        }

        return room;
    }

   public void assignRoom(Student s){


   }

   /**  return room if there is else return null
 * @param roomNumber
 * @return
 */
public Room getRoomWithNumber(int roomNumber){
    Room room = null ;
    for(Room r: rooms){
        if(r.getRoomNumber()==roomNumber) {
            room = r;
            break;
            }
    }
    return room;
   }
    
}
