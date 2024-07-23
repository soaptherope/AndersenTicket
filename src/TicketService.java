import model.Ticket;

import java.math.BigDecimal;
import java.util.Scanner;

public class TicketService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Concert Hall:");
        String concertHall = scanner.nextLine();

        System.out.println("Enter Event Code:");
        short eventCode = scanner.nextShort();
        scanner.nextLine();

        System.out.println("Enter time of event:");
        long timeOfEvent = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Do you want to enter additional information? (y/n):");
        String additionalDetails = scanner.nextLine();

        if ("y".equalsIgnoreCase(additionalDetails)) {
            System.out.println("Enter Ticket ID:");
            String id = scanner.nextLine();

            System.out.println("Is Promo:");
            boolean isPromo = scanner.nextBoolean();
            scanner.nextLine();

            System.out.println("Enter Stadium Sector:");
            char stadiumSector = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("Enter Max Backpack Weight:");
            float maxBackpackWeight = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Enter Price:");
            BigDecimal price = new BigDecimal(scanner.nextLine());

            Ticket ticket = new Ticket(id, concertHall, eventCode, timeOfEvent, isPromo, stadiumSector, maxBackpackWeight, price);
        } else {
            Ticket ticket =  new Ticket(concertHall, eventCode, timeOfEvent);
        }
    }
}

