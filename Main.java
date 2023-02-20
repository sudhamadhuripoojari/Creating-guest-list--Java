import java.util.Scanner;
 
public class Main {
   static String[] guests = new String[10];
   static Scanner scanner = new Scanner(System.in);
 
    public static void main(String[] args) {
       {
            guests[0] = "Sudha Madhuri";
            guests[1] = "Sonu";
            guests[2] = "Rose Josef";
            guests[3] = "Molly";
            guests[4] = "Christopher";
 
            do {
                displayGuests();
                displayMenu();
                int option = getOption();

                if (option == 1) {
                    for (int i = 0; i < guests.length; i++) {
                        if (guests[i] == null) {
                            System.out.print("Name:  ");
                            guests[i] = scanner.nextLine();
                            break;
                    }
                }
            }
            else if (option == 2){
                renameGuest();
            }
                else if (option == 3) {
                    System.out.print("Name: ");
                    String name = scanner.next();
                    for (int i = 0; i < guests.length; i++) {
                        if (guests[i] != null && guests[i].equals(name)) {
                            guests[i] = null;
                            break;
                        }
                    }
                String[] temp  = new String[guests.length];
                int j = 0;
                for (int i = 0; i < guests.length; i++){
                    if (guests[i] != null){
                        temp[j] = guests[i];
                        j++;
                    }
                }
                guests = temp; 
            }
                else if (option == 4) {
                    System.out.println("Exiting...");
                    break;
                }
            } while (true);
        }
    }

        static void displayGuests(){
            System.out.println("-----------------------\n - Guests - \n");
            boolean isEmpty = true; 
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    System.out.println((i+1) +". " + (guests[i] == null ? "---" : guests[i]));
                    isEmpty = false;
                }      
        }
        if (isEmpty){
            System.out.println("The Guest list is empty.");
        }
    }

    static void displayMenu(){
        System.out.println("-----------------------\n - Menu - \n");
        System.out.println("1 - Add Guest");
        System.out.println("2 - Rename Guest");
        System.out.println("3 - Remove Guest");
        System.out.println("4 - Exit");
    }

static int getOption(){
    System.out.print("Option: ");
    int option = scanner.nextInt();
    scanner.nextLine();
    System.out.println();
    return option;
}
 
static void renameGuest(){
System.out.println("Number: ");
int num = scanner.nextInt();
scanner.nextLine();
System.out.println("Name: ");
String name = scanner.nextLine();
guests[num-1] = name;


}

}