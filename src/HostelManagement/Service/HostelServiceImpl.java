package HostelManagement.Service;

import HostelManagement.Models.Hostel;
import HostelManagement.Models.Room;
import HostelManagement.Models.Student;
import HostelManagement.utils.Exceptions.NoRoomAvailableException;
import HostelManagement.utils.Exceptions.RoomNotFoundException;

public class HostelServiceImpl implements HostelService {

    Hostel hostel;

    @Override
    public void initializeHostel(String name) {
        hostel = Hostel.getInstance(name);
    }

    public Hostel getHostel(){
        return this.hostel;
    }

    public void addRoom(Room room){
        hostel.addRoom(room);
    }

    @Override
    public void assignRoom(Student s) throws NoRoomAvailableException {
        Room m = hostel.getFirstEmptyRoom();
        if(m==null ) throw new NoRoomAvailableException("All rooms are full");
        else{
           m.addStudent(s);
           System.out.println("Student "+ s.getName() + " assigned to room: " + m.getRoomNumber() + ".");
           s.setRoomAssigned(m.getRoomNumber());
        }
      
    }

    @Override
    public void emptyRoom(Student s) throws RoomNotFoundException {
        int assignedRoomNo = s.getRoomAssigned();
        Room r = hostel.getRoomWithNumber(assignedRoomNo);
        if(r==null) throw new RoomNotFoundException("this room is not there in the hostel");
        else{
            boolean removed = r.removeStudent(s);
            if(removed) System.out.println("Student " + s.getName()+ " with aadhaar number "+ s.getAadhaarNo() + " has been removed from this hostel from room"+ assignedRoomNo + ".");
        } 
    }

}
