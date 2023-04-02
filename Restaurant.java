import java.util.Scanner;


public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome to RD Restortant:");
     

        System.out.println("press 1 for breakfast");
        System.out.println("press 2 for lunch");
        System.out.println("press 3 for Dinner");


        System.out.print("Enter your Choice: ");
        int choice=scanner.nextInt();

        switch(choice){
        case 1:
            System.out.println("1..TEA..........₹20");
            System.out.println("2..coffee.......₹40");
            System.out.println("3..samosha......₹10");
            System.out.println("4..bickit.......₹20");

            System.out.println("please choose");
            int ch=scanner.nextInt();

            switch(ch){
              case 1:
               
                    System.out.print("How Much TEA..");
                    int num=scanner.nextInt();
                    System.out.println("Amount="+ (num)*20);
                break;

              case 2:  
                    System.out.print("How Much Coffee..");
                    int numb=scanner.nextInt();
                    System.out.println("Amount="+ (numb)*40);
                break;

              case 3:
                    System.out.print("No.of samosha..");
                    int no =scanner.nextInt();
                    System.out.println("Amount="+ (no)*10);
                break;

              case 4:   
                    System.out.print("Packet of Bickit..");
                    int number=scanner.nextInt();
                    System.out.println("Amount="+ (number)*10);
                break;

            }
                break;
                
        
        case 2:
            System.out.println("1..roti.........₹20");
            System.out.println("2..dal..........₹40");
            System.out.println("3..rice.........₹50");
            System.out.println("4..paneer.......₹100");
            
           
            System.out.println("please choose");
            int choo=scanner.nextInt();

            switch(choo){
              case 1:
                    System.out.print("How Much roti..");
                    int num=scanner.nextInt();
                    System.out.println("Amount="+ (num)*20);
                break;

              case 2:  
                    System.out.print("Quantity dal..");
                    int numb=scanner.nextInt();
                    System.out.println("Amount="+ (numb)*40);
                break;

              case 3:
                    System.out.print("Quantity of rice..");
                    int no =scanner.nextInt();
                    System.out.println("Amount="+ (no)*50);
                break;

              case 4:
                    System.out.print("quantity of paneer..");
                    int number=scanner.nextInt();
                    System.out.println("Amount="+ (number)*100);
                break;

            
           
            }
           break;
        case 3:
            System.out.println("1..dal...........₹20");
            System.out.println("2..roti..........₹40");
            System.out.println("3..sweet.........₹10");
            System.out.println("4..tea...........₹20");
        
            
            System.out.println("please choose");
            int cho=scanner.nextInt();

            switch(cho){
              case 1:
                    System.out.print("quantity of dal..");
                    int num=scanner.nextInt();
                    System.out.println("Amount="+ (num)*20);
                 break;

              case 2:  
                    System.out.print("No.of roti..");
                    int numb=scanner.nextInt();
                    System.out.println("Amount="+ (numb)*40);
                break;

              case 3:
                    System.out.print("quantity of sweet..");
                    int no =scanner.nextInt();
                    System.out.println("Amount="+ (no)*10);
                break;

              case 4:
                    System.out.print("No. of tea..");
                    int number=scanner.nextInt();
                    System.out.println("Amount="+ (number)*20);
                break;
            }

        
        
       break; 

            
        }
    System.out.println("lucky coupon");   
    System.out.println("password");
    int password=scanner.nextInt();
    if (password==1234){
    System.out.println("Winner....................");
    System.out.println("-->Discount Available");
    }

else{
    System.out.println("looser");
}
   scanner.close();
    }
    
    
}
