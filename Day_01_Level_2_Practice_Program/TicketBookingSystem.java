// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class MovieTicket to store and display ticket details
class MovieTicket
{
    // Creating attributes of the MovieTicket class
    private String movieName;
    private String seatNumber;
    private double price;
    
    // Constructor of the MovieTicket class
    MovieTicket(String movieName, String seatNumber, double price)
    {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    
    // Method to book a ticket
    public void bookTicket(String seatNumber, double price)
    {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for movie \"" + movieName + "\"");
    }

    // Method to display ticket details
    public void displayTicketDetails()
    {
        System.out.println("Movie Name is " + movieName);
        System.out.println("Seat Number is " + seatNumber);
        System.out.println("Ticket Price is " + price);
    }
}

// Creating Main class
class TicketBookingSystem
{
    // Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter the movie name ");
        String movieName = input.nextLine();
        System.out.println("Enter the seat number ");
        String seatNumber = input.nextLine();
        System.out.println("Enter the ticket price ");
        double price = input.nextDouble();
        
        // Creating object of MovieTicket class
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        
        // Displaying ticket details
        System.out.println("Ticket Details are ");
        ticket.bookTicket(seatNumber, price);
        ticket.displayTicketDetails();
    }
}
