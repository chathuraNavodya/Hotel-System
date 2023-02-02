import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class DetailsFormController extends RoomBookingFromController {
    public ListView PrintList;

    RoomBookingFromController room = new RoomBookingFromController();

    public void initialize(){
        ObservableList obb = FXCollections.observableArrayList();
        //obb.addAll(room.Name,room.Id,room.Address,room.Contact,room.Email,room.CheckInDate,room.CheckInTime,room.CheckOutDate,room.CheckOutTime,room.RoomNo,room.NoOfGust);

        obb.add(Id);
        PrintList.setItems(obb);
    }

}
