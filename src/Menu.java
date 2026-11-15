import java.util.Scanner;

public class Menu {
    public void menu(Audio audio) {
        Scanner sc = new Scanner(System.in);
        String menuinfo = """
        ----------------SETTINGS MENU--------------------"
            1. Play 
            2. Pause 
            3. Increase volume
            4. Decrease volume
            5. Mute volume
            6. Exit
        -------------------------------------------------
            """;
            int option;
        do{
            System.out.println(menuinfo);
            System.out.print("Enter your option: ");
            option = sc.nextInt();
        switch(option){
            case 1:
                audio.play();
                audio.displayInfo();
                break;
            case 2:
                audio.pause();
                audio.displayInfo();
                break;
            case 3:
                audio.alterVolume(1);
                audio.displayInfo();
                break;
            case 4:
                audio.alterVolume(2);
                audio.displayInfo();
                break;
            case 5:
                audio.alterVolume(3);
                audio.displayInfo();
                break;
            case 6:
                System.out.println("Thank you for using the audio player.");
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }}while(option != 6);{

        }
    }
}
