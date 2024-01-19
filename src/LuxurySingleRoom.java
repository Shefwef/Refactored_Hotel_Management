class LuxurySingleRoom implements Room, FoodOrder {
    private int roomNumber;
    private boolean isBooked;
    private boolean isFoodOrdered;

    LuxurySingleRoom() {
        this.roomNumber = 1;
        this.isBooked = false;
        this.isFoodOrdered = false;
    }

    @Override
    public void displayFeatures() {
        System.out.println("Luxury Single Room Features:");
        System.out.println("   - Spacious room with a comfortable single bed");
        System.out.println("   - Air conditioning and heating available");
        System.out.println("   - Free breakfast and complimentary snacks");
        // Add more features as needed
    }

    @Override
    public void displayAvailability() {
        System.out.println("Luxury Single Room Availability:");
        if (isBooked) {
            System.out.println("   - Not Available");
        } else {
            System.out.println("   - Available for booking");
        }
    }

    @Override
    public void bookRoom() {
        if (!isBooked) {
            System.out.println("Booking Luxury Single Room #" + roomNumber);
            isBooked = true;
        } else {
            System.out.println("Luxury Single Room #" + roomNumber + " is already booked.");
        }
    }

    @Override
    public void orderFood(int roomNumber) {
        if (isBooked && !isFoodOrdered) {
            System.out.println("Ordering food for Luxury Single Room #" + roomNumber);
            isFoodOrdered = true;
        } else {
            System.out.println("Food already ordered or room not booked.");
        }
    }

    @Override
    public void checkout(int roomNumber) {
        if (isBooked) {
            System.out.println("Checking out from Luxury Single Room #" + roomNumber);
            isBooked = false;
            isFoodOrdered = false;
        } else {
            System.out.println("No booking found for Luxury Single Room #" + roomNumber);
        }
    }

    @Override
    public void placeOrder(int roomNumber) {
        if (isBooked && !isFoodOrdered) {
            System.out.println("Placing food order for Luxury Single Room #" + roomNumber);
            isFoodOrdered = true;
        } else {
            System.out.println("Food already ordered or room not booked.");
        }
    }
}
