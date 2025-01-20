
// creating a class HotelBooking to store and display hotel booking details
class HotelBooking
{
    // creating attribute of the HotelBooking class
    String guestName;
    String roomType;
    int nights;
	
    // Default constructor of the class
    HotelBooking()
    {
        guestName = "Guest";
        roomType = "Deluxe";
        nights = 2;
    }

    // Parameterized constructor of the class
    HotelBooking(String guestName, String roomType, int nights)
    {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
	
    // creating Copy Constructor of the class
    HotelBooking(HotelBooking booking)
    {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
    }
	
    // Method to display details of the booking
    void display()
    {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
// creating Main class	
class HotelBookingSystem
{	
    // Main Method
    public static void main(String[] args)
    {
	    // calling default constructor
        HotelBooking booking1 = new HotelBooking();
		System.out.println("Booking Details using default Constructor are ");
		booking1.display();
		
		// calling parameterized constructor
        HotelBooking booking2 = new HotelBooking("Rajan", "Premium", 3);
		System.out.println("Booking Details using Parameterized Constructor are ");
		booking2.display();
		
		// calling copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
		System.out.println("Booking Details using Copy Constructor are ");
        booking3.display();
    }
}
