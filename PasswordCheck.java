import java.util.Scanner;

public class PasswordCheck {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      boolean keepTrying = true;
      do {
         System.out.println("Hello this is a program which will check the strength of your password.");  
         
         char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
         char[] upperAlpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
         char[] lowerAlpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
         char[] specialChar = {'@', '#', '$', '%', '*', '+'};
         
         boolean underEight = true;
         boolean matchPW = false;
         String enteredPW = "", newEnteredPW = "";
         boolean longEnough = false;
         // make a loop so that a PW that is too short will return back here
         while (matchPW == false) {
            while (underEight == true) {
               System.out.println("\n\nPlease enter your password: ");
               enteredPW = input.nextLine();
               int enteredPWLength = enteredPW.length();
               longEnough = (enteredPWLength >= 11)? true : false;
               underEight = ((longEnough == false) && (enteredPWLength <= 8))? true : false;   
                  if (underEight == true) System.out.println("\nYour password is too short! \nPlease enter a new one that is at least 12 characters long.");
            }
         
            System.out.println("This password is long enough\n\nPlease re-enter the password to make sure that they match: ");
            newEnteredPW = input.nextLine();
            matchPW = (newEnteredPW.equals(enteredPW))? true : false;
         }
         char[] enteredPWChar = enteredPW.toCharArray();
         //Asking if all conditions have been met
         boolean qualifiedPW = ((longEnough == true) && 
                                (digitCheck(enteredPWChar, digits) == true) &&
                                (lowAlphaCheck(enteredPWChar, lowerAlpha) == true) &&
                                (upperAlphaCheck(enteredPWChar, upperAlpha) == true) &&
                                (specialCharCheck(enteredPWChar, specialChar) == true)) ? true : false;
         String needsDig = (digitCheck(enteredPWChar, digits) == false) ? "Your password needs to contain at least one digit\n" : "";
         String needsLow = (lowAlphaCheck(enteredPWChar, lowerAlpha) == false) ? "Your password needs to contain at least one lowercase letter \n" : "";
         String needsUpp = (upperAlphaCheck(enteredPWChar, upperAlpha) == false) ? "Your password needs to contain at least one upper case letter \n" : "";
         String needsSpC = (specialCharCheck(enteredPWChar, specialChar) == false) ? "Your password needs to contain at least one special character (@, #, $, %, *, +)" : "";
         
         
         if (qualifiedPW == true) {
            System.out.print("Your password is great!");
         }
         else {
            System.out.print("Your password suffers from the following ailment(s): \n" + needsDig + needsLow + needsUpp + needsSpC);
         }
         System.out.print("\nType: Exit! to end or hit enter to try a new password.");
         String exit = input.nextLine();
         if (exit == "Exit!") {
            keepTrying = false;
         }
      }
      while (keepTrying == true);
   }

public static boolean digitCheck(char[] passwordEntered, char[] key) {
      // nested loop
      for (int ii = 0; ii < passwordEntered.length; ii++) {
         for (int jj = 0; jj < key.length; jj++) {
            while (passwordEntered[ii] == key[jj]) {
               return true;
            }
         }
      }
      return false;
}
public static boolean lowAlphaCheck(char[] passwordEntered, char[] key) {
      // nested loop
      for (int ii = 0; ii < passwordEntered.length; ii++) {
         for (int jj = 0; jj < key.length; jj++) {
            while (passwordEntered[ii] == key[jj]) {
               return true;
            }
         }
      }
      return false;
}
public static boolean upperAlphaCheck(char[] passwordEntered, char[] key) {
      // nested loop
      for (int ii = 0; ii < passwordEntered.length; ii++) {
         for (int jj = 0; jj < key.length; jj++) {
            while (passwordEntered[ii] == key[jj]) {
               return true;
            }
         }
      }
      return false;
}
public static boolean specialCharCheck(char[] passwordEntered, char[] key) {
      // nested loop
      for (int ii = 0; ii < passwordEntered.length; ii++) {
         for (int jj = 0; jj < key.length; jj++) {
            while (passwordEntered[ii] == key[jj]) {
               return true;
            }
         }
      }
      return false;
}
}