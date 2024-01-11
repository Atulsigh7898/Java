import java.util.*;

public class Switch_St {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
//        int button = sc.nextInt();
//        if(button == 1){
//            System.out.println("Ram Ram Sariyne");
//        }else if(button == 2){
//            System.out.println("Moye Moye");
//        }else if(button == 3){
//            System.out.println("Elvish Bhai....");
//        }else{
//            System.out.println("Hum pe to hai hi no");
//        }
        switch(button){
            case 1: System.out.println("Rom Rom bhaiyon");
            break;
            case 2: System.out.println("Thek you");
            break;
            case 3: System.out.println("Ok Bhai");
            break;
            default: System.out.println("Mere pass nahi hai");

        }
    }
}
