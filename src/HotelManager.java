import java.util.ArrayList;
import java.util.Scanner;

class HotelManager {
    private ArrayList<Room> rooms;

    HotelManager(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }
    ArrayList<Room> getHotelState() {
        return rooms;
    }
    void operateHotel() {
        Scanner sc = new Scanner(System.in);
        char wish;

        do {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Display room details");
            System.out.println("2. Display room availability");
            System.out.println("3. Book a room");
            System.out.println("4. Order food");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            System.out.println("\nChoose room type:");
            System.out.println("1. Deluxe Double Room");
            System.out.println("2. Deluxe Single Room");
            System.out.println("3. Luxury Double Room");
            System.out.println("4. Luxury Single Room");
            int roomType;

            switch (choice) {
                case 1:
                    roomType = sc.nextInt();
                    rooms.get(roomType - 1).displayFeatures();
                    break;

                case 2:
                    roomType = sc.nextInt();
                    rooms.get(roomType - 1).displayAvailability();
                    break;

                case 3:
                    roomType = sc.nextInt();
                    rooms.get(roomType - 1).bookRoom();
                    break;

                case 4:
                    System.out.println("\nEnter room number:");
                    int roomNumber = sc.nextInt();
                    rooms.get(roomNumber - 1).orderFood(roomNumber);
                    break;

                case 5:
                    System.out.println("\nEnter room number:");
                    roomNumber = sc.nextInt();
                    rooms.get(roomNumber - 1).checkout(roomNumber);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("\nInvalid option. Please choose again.");
            }

            System.out.println("\nContinue? (y/n)");
            wish = sc.next().charAt(0);
        } while (wish == 'y' || wish == 'Y');

        System.out.println("Exiting....");
    }
}

