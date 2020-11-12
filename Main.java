import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  // First array(integer) for number of seats
  int [] numberOfSeats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  // Second array(string) for names of students
  String [] names = {"Zachery", "Jeff", "Sally", "Sophia", "Xavier", "Joseph", "Katelyn", "Zoey", "Jhon", "Bob", "Donna", "Elizabth", "Frank", "Kevin", "Jasmine"};
  // For loop being used to print names
  for (int i = 0; i < names.length; i++)
    {
       System.out.println("What is your name?");
         Scanner studentsNames = new Scanner(System.in);
         System.out.println( "My Name is " + names );
    }
  // Scanner for getting names
 // Scanner studentsNames = new Scanner(System.in);

  }
}