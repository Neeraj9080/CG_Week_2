// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class PalindromeChecker to check whether a string is  palindrome or not
class PalindromeChecker
{
    // Creating attribute of the PalindromeChecker class
    private String text;
    
    // Constructor of the PalindromeChecker class
    PalindromeChecker(String text)
    {
        this.text = text;
    }
    
    // Method to check if the text is a palindrome
    public boolean isPalindrome()
    {
	    String reverse = "";
		for(int i=text.length()-1; i>=0 ;i--)
		{
		  reverse = reverse + text.charAt(i);
		}
        return text.equals(reverse);
    }

    // Method to display the result
    public void displayResult()
    {
        if (isPalindrome())
        {
            System.out.println("The text \"" + text + "\" is a palindrome");
        }
        else
        {
            System.out.println("The text \"" + text + "\" is not a palindrome");
        }
    }
}

// Creating Main class
class PalindromeStringCheck
{
    // Main method of the class
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.println("Enter the string to check for palindrome ");
        String text = input.nextLine();
        
        // Creating object of PalindromeChecker class
        PalindromeChecker checker = new PalindromeChecker(text);
        
        // Displaying palindrome result
        checker.displayResult();
    }
}
