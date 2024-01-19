import java.util.Scanner;

class DeluxeDoubleRoom implements Room, FoodOrder {
    private int roomNumber;
    private boolean isBooked;
    private boolean isFoodOrdered;

    DeluxeDoubleRoom() {
        this.roomNumber = 1;
        this.isBooked = false;
        this.isFoodOrdered = false;
    }

    @Override
    public void displayFeatures() {
        System.out.println("Deluxe Double Room Features:");
        System.out.println("   - Spacious room with double bed");
        System.out.println("   - Air conditioning available");
        System.out.println("   - Free Wi-Fi");
        System.out.println("   - breakfast fee - 200");
        System.out.println("Room fee - 4000 per day");
    }

    @Override
    public void displayAvailability() {
        System.out.println("Deluxe Double Room Availability:");
        if (isBooked) {
            System.out.println("   - Not Available");
        } else {
            System.out.println("   - Available for booking");
        }
    }

    @Override
    public void bookRoom() {
        if (!isBooked) {
            System.out.println("Booking Deluxe Double Room #" + roomNumber);
        } else {
            int newRoom = roomNumber + 1;
            System.out.println("Deluxe Double Room #" + roomNumber + " is already booked.");
            System.out.println("Booking room " + newRoom + " now..");
            roomNumber = newRoom;
        }
        isBooked = true;
    }


    @Override
    public void orderFood(int roomNumber) {
        if (isBooked && !isFoodOrdered) {
            System.out.println("Ordering food for Deluxe Double Room #" + roomNumber);
            isFoodOrdered = true;
        } else {
            System.out.println("Food already ordered or room not booked.");
        }
    }

    public void paybill(int roomNumber, int days)
    {
        Scanner sc = new Scanner(System.in);
        double billPerDay = 4000;
        double totalBill = billPerDay * days;

        System.out.println("Breakfast included: y/n");
        char wish = sc.next().charAt(0);

        if(wish == 'y'){
            totalBill += 200;
        } else if (wish == 'n') {
            // no addition
        }

        System.out.println("Total Bill: " + totalBill);
    }

    @Override
    public void checkout(int roomNumber) {
        if (isBooked) {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many days did you stay? :");
            int days = sc.nextInt();

            System.out.println("Checking out from Deluxe Double Room #" + roomNumber);
            paybill(roomNumber, days);
            isBooked = false;
            isFoodOrdered = false;
        } else {
            System.out.println("No booking found for Deluxe Double Room #" + roomNumber);
        }
    }

    @Override
    public void placeOrder(int roomNumber) {
        if (isBooked && !isFoodOrdered) {
            System.out.println("Placing food order for Deluxe Double Room #" + roomNumber);
            isFoodOrdered = true;
        } else {
            System.out.println("Food already ordered or room not booked.");
        }
    }
}
