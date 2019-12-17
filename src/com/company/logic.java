package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class logic {


    Scanner input = new Scanner(System.in);

    ArrayList<Customer> customerList = new ArrayList<Customer>();
    ArrayList<Room> roomList = new ArrayList<Room>();
    ArrayList<Booking> bookingList = new ArrayList<>();

    Customer object = new Customer();


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

        do {
            printLogInMenu();
            System.out.println("Make your choice: ");
            System.out.println(">>");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    editMenu();
                case 2:
                    customerEditMenu();
                default:
                    System.out.println("Enter a valid number!");
            }
        } while (choice != 3);

    }

    private void printLogInMenu() {

        System.out.println("Login Menu");
        System.out.println("-------------------------");
        System.out.println("| 1. Login as employee  |");
        System.out.println("| 2. Login as customer  |");
        System.out.println("| 2.Exit                |");
        System.out.println("-------------------------");
    }


    private void editMenu() {

        int choice = 0;
        do {
            printMenu();
            System.out.println("Enter your choice: ");
            System.out.print(">> ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    ListOfCustomers();
                    break;
                case 2:
                    RoomWithSpecifications();
                    break;
                case 3:
                    AvailableRooms();
                    break;
                case 4:
                    AddCustomer();
                    break;
                case 5:
                    RemoveCustomer();
                    break;
                case 6:
                    ViewBooking();
                    break;
                case 7:
                    SearchForBooking();
                    break;
                case 8:
                    CheckIn();
                    break;
                case 9:
                    CheckOut();
                    break;
                case 10:
                    SaveBooking();
                    break;
                case 11:
                    AddRoom();
                    break;
                case 12:
                    removeRoom();
                    break;
                case 13:
                    EditRoom();
                    break;
                case 14:
                    ViewCustomerInfo();
                    break;
                case 15:
                    BookingInfo();
                    break;
                case 16:
                    EditCustomerInfo();
                    break;
                case 17:
                    MakeBooking();
                    break;
                default:
                    System.out.println("Enter a valid number!");
                    break;
            }

        } while (choice != 18);

    }

    private void printCustomerMenu() {
        System.out.println("---- Hello and Welcome to our Hotel Application ----");
        System.out.println("------------------------------------------------");
        System.out.println("1: View available rooms");
        System.out.println("------------------------------------------------");
        System.out.println("2: View booking history");
        System.out.println("------------------------------------------------");
        System.out.println("3: Make a new booking");
        System.out.println("------------------------------------------------");
        System.out.println("4: Edit your info");
        System.out.println("------------------------------------------------");
        System.out.println("5: Exit to log in menu");
        System.out.println("------------------------------------------------");
    }

    private void customerEditMenu() {
        int choice = 0;
        do {
            printCustomerMenu();
            System.out.println("Enter your choice: ");
            System.out.print(">> ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    AvailableRooms();
                    break;
                case 2:
                    ViewBookingHistory();
                    break;
                case 3:
                    MakeBooking();
                    break;
                case 4:
                    EditCustomerInfo();
                    break;
                default:
                    System.out.println("Enter a valid number!");
                    break;

            }
        } while (choice != 5);

    }

    private void printMenu() {
        System.out.println("---- Hello and Welcome to our Hotel Application ----");
        System.out.println("----------------------------------------------------");
        System.out.println("Please select one of the options.");
        System.out.println("------------------------------------------------");
        System.out.println("1: View list of all customers");
        System.out.println("------------------------------------------------");
        System.out.println("2: View all rooms and their specifications");
        System.out.println("------------------------------------------------");
        System.out.println("3: View available rooms");
        System.out.println("------------------------------------------------");
        System.out.println("4: Add new customer");
        System.out.println("------------------------------------------------");
        System.out.println("5: Remove customer");
        System.out.println("------------------------------------------------");
        System.out.println("6: View bookings");
        System.out.println("------------------------------------------------");
        System.out.println("7: Search for a particular booking");
        System.out.println("------------------------------------------------");
        System.out.println("8: Check in customer");
        System.out.println("------------------------------------------------");
        System.out.println("9: Check out customer");
        System.out.println("------------------------------------------------");
        System.out.println("10: Save bookings into a text file");
        System.out.println("------------------------------------------------");
        System.out.println("11: Add rooms and their information");
        System.out.println("------------------------------------------------");
        System.out.println("12: Remove room");
        System.out.println("------------------------------------------------");
        System.out.println("13: Edit the information of a existing room");
        System.out.println("------------------------------------------------");
        System.out.println("14: View information about a specific customer");
        System.out.println("------------------------------------------------");
        System.out.println("15: Edit information of a particular booking");
        System.out.println("------------------------------------------------");
        System.out.println("16: Edit information for a specific customer");
        System.out.println("------------------------------------------------");
        System.out.println("17: Make a booking");
        System.out.println("------------------------------------------------");
    }

    private void MakeBooking() {

    }

    private void ListOfCustomers() {
        int index = 0;
        for (Customer s : customerList)
            System.out.println((index++) + 1 + ": " + s);

    }

    private void RoomWithSpecifications() {

        for (Room p : roomList) {
            System.out.println(p);

        }
    }

    private void AvailableRooms() {
        System.out.println("List of available rooms");

        for (Room room : roomList) {

            // if(!room.isBooked()) {

               /* System.out.println("Room number: " + room.getRoomNumber());
                System.out.println("Balcony: " + room.isHasBalcony());
                System.out.println("Price per night: " + room.getPricePerNight());
                System.out.println("Available: " + room.isBooked());
                int index = 0;
                for (Room s : roomList);
s
                */
            System.out.println(room);
        }
    }

    private void AddCustomer() {

        System.out.println("Enter customers full name: ");
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
        int index = 1;
        for (Customer s : customerList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which customer do you want to remove?: ");
        customerList.remove(input.nextInt());

    }

    private void ViewBooking() {
        /*

        if (booked == true) {
            System.out.println("Room number " + roomNumber + " is booked for mr/mrs " + object.getName());
        }

         */

    }

    private void ViewBookingHistory() {
        ArrayList<Booking> yourBookings = new ArrayList<>();
        for (int i = 0; i <bookingList.size(); i++) {


        }
    }

    private void SearchForBooking() {
        /*System.out.println("Search for a booking by customers name: ");
        String name = input.nextLine();

        if (booked == true) {
            System.out.println("Customer checked in room number " + roomNumber);
        } else {
            System.out.println("No Booking made for customer");
        }

         */

    }


    private void CheckIn() {
        System.out.println("Which room would you like to book?");

        for (Room room : roomList) {
            System.out.println(room);
            System.out.println("Enter room number here: ");
        }
        int roomNumber = input.nextInt();
        boolean booked = true;
        roomList.get(roomNumber).setBooked(true);

        int index = 0;
        for (Customer s : customerList)
            System.out.println((index++) + 1 + ": " + s);
        System.out.println("Who would you like to book the room for? Please enter name: ");
        String name = input.nextLine();
        System.out.println("Room number: " + roomNumber + " has been booked for mrs/mr " + object.getName());

    }

    private void CheckOut() {
        /*if (booked == true) {
            System.out.println("Busy rooms "+roomNumber);
            System.out.println("Check out from room number: ");
            roomNumber = input.nextInt();
            roomList.get(roomNumber).setBooked(false);
            System.out.println("Room "+roomNumber+" is now empty");
            System.out.println("Checkout completed, Thank you for your stay, Welcome back!");
        } else {
            System.out.println("No customer checked IN");

        }

         */
    }

    private void SaveBooking() {



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

        int index = 1;
        for (Room s : roomList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which room do you want to remove?: ");
        roomList.remove(input.nextInt());

    }

    private void EditRoom() {
        int select;

        int index = 1;
        for (Room d : roomList) {
            System.out.println((index++) + ": " + d);

        }

        System.out.println("Which room do you want to edit?: ");
        int elementNumber = Integer.parseInt(input.nextLine());

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
                    System.out.println("This room current number: " + "[" + roomList.get(elementNumber).getRoomNumber() + "] | " + "Whats is the new room number?: ");
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


    }

    private void BookingInfo() {

    }

    private void EditCustomerInfo() {

        int select;

        int index = 0;
        for (Customer s : customerList) {
            System.out.println((index++) + 1 + ": " + s);
        }

        System.out.println("Which customer do you want to edit?");
        int customerNumber = Integer.parseInt(input.nextLine());

        do {
            System.out.println("What do you want to edit?: ");

            System.out.println("1. Name");
            System.out.println("2. Address");
            System.out.println("3. SSN");
            System.out.println("4. Phone Number");
            System.out.println("5. Exit");

            select = Integer.parseInt(input.nextLine());
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
}

