import HostelManagement.Models.Student;
import HostelManagement.Service.HostelServiceImpl;
import HostelManagement.utils.Constants;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HostelServiceImpl hostelService = new HostelServiceImpl();
        hostelService.initializeHostel("Visvesaraya");
        Constants.initialize();
        
        hostelService.getHostel().setRooms(Constants.getRooms().subList(0, 3));

        hostelService.assignRoom(Constants.getStudents().get(0));
        hostelService.assignRoom(Constants.getStudents().get(1));
        hostelService.assignRoom(Constants.getStudents().get(2));
        hostelService.assignRoom(Constants.getStudents().get(3));
        hostelService.assignRoom(Constants.getStudents().get(4));
        
        hostelService.assignRoom(Constants.getStudents().get(5));
        hostelService.assignRoom(Constants.getStudents().get(6));
        hostelService.emptyRoom(Constants.getStudents().get(0));
        hostelService.assignRoom(Constants.getStudents().get(7));
        Student s = Constants.getStudents().get(7);
        System.out.println(s.getName() + " now lives in room:"+ s.getRoomAssigned());
        

    


    }
}
