import java.util.*;

public class StudentCouncil
{

    private Dance dance;
    private Scanner scan;


    public StudentCouncil()
    {
        dance = new Dance();
        scan = new Scanner(System.in);
    }


    public void mainMenu()
    {
        int ans = 0;

        do
        {
            System.out.println("======================");
            System.out.println("        Main Menu");
            System.out.println("======================");
            System.out.println("1. Buy a Ticket");
            System.out.println("2. Print Summary Report");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Selection --> ");
            ans = scan.nextInt();
            System.out.println();

            if(ans == 1)
            {
                buyTicket();
            }
            else if (ans == 2)
            {
                printSummary();
            }

        }
        while(ans != 3);

    }


    public void buyTicket()
    {
        System.out.println("===================");
        System.out.println("     Buy Ticket");
        System.out.println("===================");
        System.out.println("1. Gold Pass");
        System.out.println("2. Silver Pass");
        System.out.println("3. Bronze Pass");
        System.out.println("4. No Pass");
        System.out.println();
        System.out.print("Selection --> ");
        int ticketType = scan.nextInt();
        System.out.println();

        dance.buyTicket(ticketType);
    }


    public void printSummary()
    {
        System.out.println("===========================");
        System.out.println("      Summary Report");
        System.out.println("===========================");
        System.out.println("Total Attendance =   " + dance.getAttendance());
        System.out.printf("Ticket Sales     = $ %.2f%n", dance.getTicketSales());
        System.out.println();
    }

    public static void main(String[] args)
    {
        StudentCouncil app = new StudentCouncil();
        app.mainMenu();
    }
}


