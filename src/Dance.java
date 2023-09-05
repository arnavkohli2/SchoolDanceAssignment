public class Dance
{

    public final int GoldPass = 1;
    public final int SilverPass = 2;
    public final int BronzePass = 3;
    public final int NoPass = 4;


    private int attendance;
    private double ticketSales;


    public Dance()
    {
        attendance = 0;
        ticketSales = 0.0;
    }


    public void buyTicket(int code)
    {
        double price = 0.0;
        switch (code) {
            case GoldPass:
                price = 0.0;
                break;
            case SilverPass:
                price = 2.00;
                break;
            case BronzePass:
                price = 4.00;
                break;
            case NoPass:
                price = 6.00;
                break;
            default:
                System.out.println("Invalid ticket code.");
                return;
        }
        ticketSales += price;
        attendance++;
    }


    public int getAttendance()
    {
        return attendance;
    }


    public double getTicketSales()
    {
        return ticketSales;
    }
}

