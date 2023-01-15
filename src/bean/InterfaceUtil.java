package bean;

import services.MenuLoginService;
import services.MenuLogoutService;
import services.MenuRegisterService;
import services.MenuStartService;

public class InterfaceUtil  {
    public static void chooseOne(Menu option){

        option.process();
//        if (option == Menu.REGISTER){
//            MenuRegisterService.registerParticipants();
//            chooseOne(Menu.START);
//        }
//        else if (option == Menu.START){
//            MenuStartService.startGame();
//        }
//        else if (option == Menu.LOGOUT){
//            MenuLogoutService.logoutProcess();
//        }
//        else if (option == Menu.EXIT){
//            System.out.println("Application stopped");
//        }

    }
}
