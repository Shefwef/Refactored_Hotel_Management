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

    @Override
    public void checkout(int roomNumber) {
        if (isBooked) {
            System.out.println("Checking out from Deluxe Double Room #" + roomNumber);
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
