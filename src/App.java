import java.util.Scanner;

public class App {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    String mainMenu = """
        ----------------MAIN MENU--------------------"
            1. Play music  
            2. Play podcast
            3. Exit
        -------------------------------------------------
            """;

    System.out.println(mainMenu);
    System.out.print("Enter your option: ");
    int op = sc.nextInt();

    if(op == 1){
        Music positions = new Music(50, 3.5, false, 1000, "Artist Name", "Album Name", "Genre Name");

        Menu configmenu = new Menu();
        configmenu.menu(positions);

    } else if(op == 2){
        Podcast vergecast = new Podcast(50, 3.5, false, 1000, " Nilay Patel and David Pierce", "tecnology");
       
        Menu configmenu = new Menu();
        configmenu.menu(vergecast);

    } else if(op == 3){
        System.out.println("Exiting the program.");
    } else{
        System.out.println("Invalid option. Please try again.");
    }
}
}
