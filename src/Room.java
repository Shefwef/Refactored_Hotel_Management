public interface Room
{
    void displayFeatures();

    void displayAvailability();

    void bookRoom();

    void orderFood(int roomNumber);

    void checkout(int roomNumber);

    void paybill(int roomNumber, int days);
}
