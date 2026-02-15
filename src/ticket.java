import java.util.Scanner;

public class ticket {
    public static void main(String [] args) {

        int maxOnOfTickts = 5;

        String[] tickets = new String[maxOnOfTickts];

        Scanner inputBuffObj = new Scanner(System.in);

        System.out.println("Enter ticket ID: ");
        String id = inputBuffObj.nextLine();

        System.out.println("Enter ticket title: ");
        String title = inputBuffObj.nextLine();

        System.out.println("Enter ticket description: ");
        String description = inputBuffObj.nextLine();

        System.out.println("Enter ticket status: ");
        String status = inputBuffObj.nextLine();

        System.out.println("ID:" + id);
        System.out.println("Title:" + title);
        System.out.println("Description:" + description);
        System.out.println("Status:" + status);


        for (int currentNoOfTickets = 0; currentNoOfTickets <= maxOnOfTickts; currentNoOfTickets++) {
            //System.out.printf("[%d] place enter your feedback: ", currentNoOfTickets);
            tickets[currentNoOfTickets] = inputBuffObj.nextLine();
        }


//        for(int currentNoOfTickets = 0; currentNoOfTickets < maxOnOfTickts; currentNoOfTickets++){
//            System.out.printf("ticket number %d, The Feedback: %s", currentNoOfTickets, tickets[currentNoOfTickets]);
//
//        }





//        for(int numOfTicket = 0; numOfTicket < maxNumOfTickets; numOfTicket++);{
//            System.out.println("please enter you Id: ");
//            tickets[n]
//

        }
    }


