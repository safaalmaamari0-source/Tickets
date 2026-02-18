import java.util.Scanner;

public class ticket {
    public static void main(String [] args) {

        int maxNumOfTickts = 5;


        boolean keeprunning = true;

        String[] tickets = new String[maxNumOfTickts ];

        Scanner inputBuffObj = new Scanner(System.in);

//create
        for (int currentTicket = 0; currentTicket < maxNumOfTickts ; currentTicket++) {
            //System.out.printf("[%d] place enter your feedback: ", currentNoOfTickets);

            System.out.println("Enter ticket ID: ");
            String id = inputBuffObj.nextLine();

            System.out.println("Enter ticket title: ");
            String title = inputBuffObj.nextLine();

            System.out.println("Enter ticket description: ");
            String description = inputBuffObj.nextLine();

            System.out.println("Enter ticket status: ");
            String status = inputBuffObj.nextLine();

            tickets[currentTicket] =" ID: " + id + " | Title: " +title + " | Desc: " + description + " | Status: " + status;

        }

        //list
        for (int currentTicket = 0; currentTicket < maxNumOfTickts ; currentTicket++) {

            System.out.println("the list of Tickets: " + tickets[currentTicket]);
        }
        
        //update Ticket

        System.out.print("Enter Ticket ID to update: ");
        String updateId = inputBuffObj.nextLine();

        for (int ticketId = 0; ticketId < maxNumOfTickts ; ticketId++) {
            if(tickets[ticketId] != null && tickets[ticketId].contains(updateId)) {
                System.out.println(" Enter new title: ");
                String newTitle = inputBuffObj.nextLine();

                System.out.println(" Enter new Description: ");
                String newDesc = inputBuffObj.nextLine();

                System.out.println(" Enter new Status: ");
                String newStatus = inputBuffObj.nextLine();

                tickets[ticketId] = " ID: " + updateId + " | Title: " + newTitle + " | Desc: " + newDesc + " | Status: " + newStatus;

                System.out.println("Ticket updated successfully!");

                break;


            }



            }

        }
        }
        
        












//            System.out.println("ID:" + id);
//            System.out.println("Title:" + title);
//            System.out.println("Description:" + description);
//            System.out.println("Status:" + status);







//        for(int currentNoOfTickets = 0; currentNoOfTickets < maxOnOfTickts; currentNoOfTickets++){
//            System.out.printf("ticket number %d, The Feedback: %s", currentNoOfTickets, tickets[currentNoOfTickets]);
//
//        }





//        for(int numOfTicket = 0; numOfTicket < maxNumOfTickets; numOfTicket++);{
//            System.out.println("please enter you Id: ");
//            tickets[n]
//





