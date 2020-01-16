package com.company;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class logic {

    Scanner input = new Scanner(System.in);

    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Booking> bookingList = new ArrayList<Booking>();
    Room ne = new Room();
    Customer object = new Customer();
    private int BookingId;


    public void runProgram() {
        int choice;

        Room room1 = new Room(1, 2, true, 699, false);
        Room room2 = new Room(2, 4, false, 999, false);
        Room room3 = new Room(3, 6, false, 1299, false);
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        Customer customer1 = new Customer("850430-1944", "Erik Hansson", "Kråkstigen 45", "0777390430");
        Customer customer2 = new Customer("660320-1344", "Hassan Svensson", "Kanotvägen 34", "0722567744");
        Customer customer3 = new Customer("750430-6644", "Helene Lund", "Skogstigen 1", "0755334013");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        printLogInMenu();
    }

    private void CustomerLogIn() {
        String Username;
        String Password;

        Password = "321";
        Username = "Customer";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
            LogForCustomer();
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }

    private void EmployerLogIn() {
        String Username;
        String Password;

        Password = "123";
        Username = "Admin";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
            editMenu();
        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }


    private void printLogInMenu() {
        int choice;
        do {
            System.out.println("Login Menu");
            System.out.println("-------------------------");
            System.out.println("| 1. Login as employee  |");
            System.out.println("| 2. Login as customer  |");
            System.out.println("| 3. Exit               |");
            System.out.println("-------------------------");
            System.out.println("Enter choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    EmployerLogIn();
                case 2:
                    CustomerLogIn();
                case 3:
                    System.out.println("Loggin out, Have a Nice day Champ!");
                    BookingFileToText();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option, choose between 1-3");
                    break;
            }
        } while (choice != 3);
    }

    private void LogForCustomer() {
        int choice;
        do {
            System.out.println("------Make your choice--------- ");
            System.out.println("| 1. View available rooms      |");
            System.out.println("| 2. Book room                 |");
            System.out.println("| 3. Cancel Booking            |");
            System.out.println("| 4. Exit                      |");
            System.out.println("--------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    AvailableRooms();
                    break;
                case 2:
                    SaveBooking();
                    break;
                case 3:
                    CancelBooking();
                    break;
                case 4:
                    printLogInMenu();
                    break;
                default:
                    System.out.println("Invalid option, choose between 1-4");
                    break;
            }

        } while (choice != 4);

    }


    private void editMenu() {
        int choice;
        do {
            printMenu();

            System.out.println("--Make your choice--");
            System.out.println(">>");


            choice = input.nextInt();


            switch (choice) {
                case 1:
                    CustomerLogg();
                    break;
                case 2:
                    RoomLogg();
                    break;
                case 3:
                    BookLog();
                    break;
                case 4:
                    printLogInMenu();
                    break;
                default:
                    System.out.println("Invalid option, choose between 1-3");
                    break;

            }
        } while (choice != 5);
    }


    private void printMenu() {
        System.out.println("<<Login succesfull>>   ");
        System.out.println("-----------------------");
        System.out.println("| 1. CustomerLogg     |");
        System.out.println("| 2: RoomLogg         |");
        System.out.println("| 3. BookingLogg      |");
        System.out.println("| 4. Exit             |");
        System.out.println("-----------------------");
    }

    private void CustomerLogg() {
        int choice;
        do {
            System.out.println("------Make your choice--------- ");
            System.out.println("| 1. View All Customers        |");
            System.out.println("| 2. Add a Customer            |");
            System.out.println("| 3. Remove a Customer         |");
            System.out.println("| 4. Edit Customer information |");
            System.out.println("| 5. Exit this Menu            |");
            System.out.println("--------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    ViewCustomerInfo();
                    break;
                case 2:
                    AddCustomer();
                    break;
                case 3:
                    RemoveCustomer();
                    break;
                case 4:
                    EditCustomerInfo();
                    break;
                case 5:
                    editMenu();
                    break;
                default:
                    System.out.println("Wrong input, Enter your choice 1-5");
                    break;
            }
        } while (choice != 5);
    }

    private void RoomLogg() {
        int choice;
        do {


            System.out.println("----------Make your choice-----------");
            System.out.println("| 1. Add a Room                     |");
            System.out.println("| 2. Edit Room information          |");
            System.out.println("| 3. View Available Rooms           |");
            System.out.println("| 4. View Rooms with Specifications |");
            System.out.println("| 5. Remove a Room                  |");
            System.out.println("| 6. Exit this menu                 |");
            System.out.println("-------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    AddRoom();
                    break;
                case 2:
                    EditRoom();
                    break;
                case 3:
                    AvailableRooms();
                    break;
                case 4:
                    RoomWithSpecifications();
                    break;
                case 5:
                    removeRoom();
                    break;
                case 6:
                    editMenu();
                default:
                    System.out.println("Invalid option, try again 1-6");
            }
        } while (choice != 7);
    }

    private void BookLog() {
        int choice;
        do {
            System.out.println("---------Enter your choice-----------");
            System.out.println("-------------------------------------");
            System.out.println("-------------------------------------");
            System.out.println("| 1. Check in a Customer            |");
            System.out.println("| 2. Check out a Customer           |");
            System.out.println("| 3. View all Bookings              |");
            System.out.println("| 4. Search for a specific Booking  |");
            System.out.println("| 5. Save a Booking                 |");
            System.out.println("| 6. Cancel a Booking               |");
            System.out.println("| 7. View BookingHistory            |");
            System.out.println("| 8. Exit this menu                 |");
            System.out.println("-------------------------------------");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    CheckIn();
                    break;
                case 2:
                    CheckOut();
                    break;
                case 3:
                    BookingInfo();
                    break;
                case 4:
                    SearchForBooking();
                    break;
                case 5:
                    SaveBooking();
                    break;
                case 6:
                    CancelBooking();
                    break;
                case 7:
                    ViewBookingHistory();
                    break;
                case 8:
                    editMenu();
                    break;
                default:
                    System.out.println("Invalid option. Try again 1-8");
                    break;
            }
        } while (choice != 8);
    }


    private void RoomWithSpecifications() {

        for (Room p : roomList) {
            System.out.println(p);

        }
    }

    private void AvailableRooms() {
        System.out.println("List of available rooms");

        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    private void AddCustomer() {

        System.out.println("Enter customers full name: ");
        input.nextLine();
        String name = object.setName(input.nextLine());
        while (name.isEmpty()) {
            System.out.println("thats not correct, enter customers full name: ");
            name = object.setName(input.nextLine());
        }

        System.out.println("Enter customers address: ");
        String address = object.setAddress(input.nextLine());
        while (address.isEmpty()) {
            System.out.println("thats not correct, enter customers address: ");
            address = object.setAddress(input.nextLine());
        }
        System.out.println("Enter customers SSN: ");
        String ssn = object.setSsn(input.nextLine());
        while (ssn.isEmpty()) {
            System.out.println("thats not correct, enter customers SSN: ");
            ssn = object.setSsn(input.nextLine());

        }
        System.out.println("Enter customers telephone number: ");
        String telephoneNumber = object.setTelephoneNumber(input.nextLine());
        while (telephoneNumber.isEmpty()) {
            System.out.println("thats not correct, enter customers telephoneNumber: ");
            telephoneNumber = object.setTelephoneNumber(input.nextLine());
        }
        System.out.println("");
        customerList.add(object);

    }

    private void RemoveCustomer() {
        int index = 0;
        for (Customer s : customerList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which customer do you want to remove?: ");
        customerList.remove(input.nextInt());

    }


    private void ViewBookingHistory() {

        for (Customer customer : customerList) {
            for (Booking booking : bookingList) {
                if (customer.getSsn().equals(booking.getSsn())) {
                    System.out.println("Bookings made by \n" + booking + customer);
                }
            }
        }
    }


    private void SearchForBooking() {
        System.out.println("Search for a booking ID: ");
        int bookingId = input.nextInt();

        for (Booking b : bookingList) {
            if (bookingId == b.getBookingId()) {
                System.out.println(b);
                break;
            }
        }

    }


    private void CheckIn() {
        Booking thebooking = null;
        BookingInfo();
        System.out.println("Enter booking id here: ");
        int bookingId = input.nextInt();
        for (Booking booking : bookingList) {
            if (bookingId == booking.getBookingId()) {
                thebooking = booking;
                break;
            }
        }

        thebooking.getRoom().setChecked(true);

        System.out.println("Checked in \n");
    }

    private void CheckOut() {
        Room checkedRoom = null;
        System.out.println("Room number: ");
        int roomNumber = input.nextInt();

        for (Room room : roomList) {
            if (roomNumber == room.getRoomNumber(0)) {
                checkedRoom = room;
                break;
            }
        }

        checkedRoom.setChecked(false);
        System.out.println("Checked out");

    }

    private void SaveBooking() {
        String ssn;
        Room bookedRoom = null;
        boolean pleaseWork = false;
        System.out.println("Which room do you want to book?");
        for (Room room : roomList) {
            System.out.println(room);
        }
        System.out.println("Enter a room number: ");
        int roomNumber = input.nextInt();
        for (Room room : roomList) {
            if (roomNumber == room.getRoomNumber(0)) {
                bookedRoom = room;
                break;
            }
        }

        System.out.println("What day would you like to check in? YYYY-MM-DD");
        input.next();
        String date = input.nextLine();

        System.out.println("Please enter SSN for customer to book: YYYYMMDD-XXXX");
        ssn = input.nextLine();
        for (Customer customer : customerList) {
            if (customer.getSsn().equals(ssn)) {
                pleaseWork = true;
                break;
            }
        }
        if (pleaseWork) {
            System.out.println("Booked succcesfully to Ssn " + ssn);

        } else {
            System.out.println("No customer with entered SSN could be found.");
        }


        System.out.println(bookedRoom);


        int randomNum = ThreadLocalRandom.current().nextInt(1000000, 10000000);
        Booking booking = new Booking(randomNum, object.setSsn(ssn), bookedRoom.getPricePerNight());
        booking.setRoom(bookedRoom);
        bookedRoom.setBooked(true);
        object.setBooking(booking);
        System.out.println(booking);
        bookingList.add(booking);
    }


    public void CancelBooking() {
        boolean ask = true;
        Booking bookedRoom = null;
        do {
            System.out.print("Do you want to cancel your booking? (y/n): ");
            String answer = input.nextLine();
            if ((answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"))) {
                System.out.println("Enter your BookingId ");
                int bookingId = input.nextInt();
                for (Booking booking : bookingList) {
                    if (bookingId == booking.getBookingId()) {
                        bookedRoom = booking;
                        bookedRoom.getRoom().setBooked(false);
                        ask = false;
                        System.out.println("Booking canceld");
                    }
                    if ((answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))) {
                        System.out.println("Enjoy your visit ");
                        ask = false;
                    }
                }
            }
        } while (ask);
    }


    private void AddRoom() {


        System.out.println(" What is the room number?");
        int roomNumber = input.nextInt();
        System.out.println("How many beds are there in the room?");
        int numberOfBeds = input.nextInt();
        System.out.println("Does the room have a balcony? 1: yes, 2: no");
        int balcony = input.nextInt();
        boolean hasBalcony = false;
        if (balcony == 1) {
            hasBalcony = true;
        } else {
            hasBalcony = false;
        }
        System.out.println("What is the price per night?");
        double price = input.nextDouble();
        boolean booked = false;

        Room room = new Room(roomNumber, numberOfBeds, hasBalcony, price, booked);
        roomList.add(room);

    }

    private void removeRoom() {

        int index = 0;
        for (Room s : roomList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which room do you want to remove?: ");
        roomList.remove(input.nextInt());

    }

    private void EditRoom() {
        int select;

        int index = 0;
        for (Room d : roomList) {
            System.out.println((index++) + ": " + d);

        }

        System.out.println("Which room do you want to edit?: ");
        int elementNumber = input.nextInt();
        input.nextLine();

        do {

            System.out.println("What do you want to edit?: ");

            System.out.println("1. Room number");
            System.out.println("2. Beds");
            System.out.println("3. Balcony");
            System.out.println("4. Price per night");
            System.out.println("5. Exit");

            select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 1: {
                    System.out.println("This room current number: " + "[" + roomList.get(elementNumber).getRoomNumber(BookingId) + "] | " + "Whats is the new room number?: ");
                    int newRoomNumber = Integer.parseInt(input.nextLine());
                    roomList.get(elementNumber).setRoomNumber(newRoomNumber);
                    break;
                }
                case 2: {
                    System.out.println("This room has current beds: " + "[" + roomList.get(elementNumber).getNumberOfBeds() + "] | " + "How many beds?: ");
                    int newNumberOfBeds = Integer.parseInt(input.nextLine());
                    roomList.get(elementNumber).setNumberOfBeds(newNumberOfBeds);
                    break;
                }
                case 3: {
                    System.out.println("This room has current balcony: " + "[" + roomList.get(elementNumber).isHasBalcony() + "] | " + "Does the room have a balcony? 1. Yes 2. No");
                    int newBalcony = Integer.parseInt(input.nextLine());
                    boolean hasBalcony = false;
                    if (newBalcony == 1) {
                        hasBalcony = true;
                    } else {
                        hasBalcony = false;
                    }
                    roomList.get(elementNumber).setHasBalcony(hasBalcony);
                    break;
                }
                case 4: {
                    System.out.println("This room current price per night: " + "[" + roomList.get(elementNumber).getPricePerNight() + "] |" + "What is the price per night?: ");
                    int newPricePerNight = input.nextInt();
                    roomList.get(elementNumber).setPricePerNight(newPricePerNight);
                    break;
                }
                default:
                    System.out.println("Enter a valid number!");
            }

        } while (select != 5);

    }

    private void ViewCustomerInfo() {
        for (Customer cust : customerList) {
            System.out.println(cust);
        }
    }


    private void BookingInfo() {

        for (Booking book : bookingList) {
            System.out.println(book);

        }

    }

    private void EditCustomerInfo() {

        int select;

        int index = 0;
        for (Customer s : customerList) {
            System.out.println((index++) + 1 + ": " + s);
        }

        System.out.println("Which customer do you want to edit?");
        int customerNumber = Integer.parseInt(String.valueOf(input.nextInt()));


        do {
            System.out.println("What do you want to edit?: ");

            System.out.println("1. Name");
            System.out.println("2. Address");
            System.out.println("3. SSN");
            System.out.println("4. Phone Number");
            System.out.println("5. Exit");

            select = Integer.parseInt(String.valueOf(input.nextInt()));
            input.nextLine();
            switch (select) {
                case 1: {
                    System.out.println("This customers current name: " + "[" + customerList.get(customerNumber).getName() + "] | " + "What is the new Name?: ");
                    String newName = input.nextLine();
                    customerList.get(customerNumber).setName(newName);
                    break;
                }
                case 2: {
                    System.out.println("This customers current address: " + "[" + customerList.get(customerNumber).getAddress() + "] | " + "What is the new address?: ");
                    String newAddress = input.nextLine();
                    customerList.get(customerNumber).setAddress(newAddress);
                    break;
                }
                case 3: {
                    System.out.println("This customers current SSN: " + "[" + customerList.get(customerNumber).getSsn() + "] | " + "What is the new SSN?: ");
                    String newSsn = input.nextLine();
                    customerList.get(customerNumber).setSsn(newSsn);
                    break;
                }
                case 4: {
                    System.out.println("This customers current telephone number: " + "[" + customerList.get(customerNumber).getTelephoneNumber() + "] | " + "What is the new telephone number?: ");
                    String newTelephoneNumber = input.nextLine();
                    customerList.get(customerNumber).setTelephoneNumber(newTelephoneNumber);
                    break;
                }
                default:
                    System.out.println("Enter a valid number!");
                    break;
            }

        } while (select != 5);
    }

    public void BookingFileToText() {
        String BookingFile = "Booking.txt";
        for (Booking booking : bookingList) {
            try {

                FileWriter fileWriter = new FileWriter(BookingFile);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write("Booking id: " + booking.getBookingId());
                Room roomNr;
                for (int i = 0; i < bookingList.size(); i++) {
                    roomNr = bookingList.get(i).getRoom();
                    bufferedWriter.write(roomNr + ", ");
                }
                bufferedWriter.newLine();
                bufferedWriter.write("----------Saved Succesfully----------");
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("Error in file writing: " + BookingFile);
                return;

            }
        }
    }
}


