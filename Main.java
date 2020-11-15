import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  // First array(integer) for number of seats
  int [] numberOfSeats = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
  // Second array(string) for names of students
  String [] studentsNames = {"Zachery", "Jeff", "Sally", "Sophia", "Xavier", "Joseph", "Katelyn", "Zoey", "Jhon", "Bob", "Donna", "Elizabth", "Frank", "Kevin", "Jasmine"};
  // Scanner for reciving names
  Scanner input = new Scanner(System.in);
  String[] studentNames = new String[15];
  
  for (int i = 0; i < studentNames.length; i++)
  {
    System.out.println("What is your name?");
    studentNames[i] = input.next();

  }
  }
}
