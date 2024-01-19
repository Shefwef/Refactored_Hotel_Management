import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create rooms
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new DeluxeDoubleRoom());
        rooms.add(new DeluxeSingleRoom());
        rooms.add(new LuxuryDoubleRoom());
        rooms.add(new LuxurySingleRoom());

        // Create HotelManager
        HotelManager hotelManager = new HotelManager(rooms);


        // Operate Hotel
        hotelManager.operateHotel();

    }
}

