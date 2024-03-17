package HostelManagement.Service;

import HostelManagement.Models.Room;
import HostelManagement.Models.Student;
import HostelManagement.utils.Exceptions.NoRoomAvailableException;
import HostelManagement.utils.Exceptions.RoomNotFoundException;

interface HostelService {
    public void initializeHostel(String name);
    public void assignRoom(Student s) throws NoRoomAvailableException;
    public void emptyRoom(Student s) throws RoomNotFoundException;
    public void addRoom(Room r);
}
