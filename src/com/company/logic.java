package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class logic {


    Scanner input = new Scanner(System.in);
    ArrayList<String> customerList = new ArrayList<String>();
    Customer object = new Customer();

    int roomNumber = 0;
    int choice;
    boolean booked=false;
    String Name;
    ArrayList<Room> roomList = new ArrayList<Room>();


    public void runProgram() {
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
                default:
                    System.out.println("Enter a valid number!");
            }
        } while (choice != 17);


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
    }

    private void ListOfCustomers() {
        int index = 0;
        for (String s : customerList)
            System.out.println((index++) + 1 + ": " + s);

    }

    private void RoomWithSpecifications() {

        for(Room p : roomList) {
            System.out.println(p);

        }
    }

    private void AvailableRooms() {
        System.out.println("List of available rooms");

        for(Room room : roomList) {

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
        Name = "";
        System.out.println("Enter customers full name: ");
        Name = object.setName(input.nextLine());

        while (Name.isEmpty()) {
            System.out.println("thats not correct, enter customers full name: ");
            Name = object.setName(input.nextLine());
        }
        String address = "";
        System.out.println("Enter customers address: ");
        address = object.setAddress(input.nextLine());
        while (address.isEmpty()) {
            System.out.println("thats not correct, enter customers address: ");
            address = object.setAddress(input.nextLine());
        }
        String ssn = "";
        System.out.println("Enter customers ssn: ");
        ssn = object.setSsn(input.nextLine());
        while (ssn.isEmpty()) {
            System.out.println("thats not correct, enter customers ssn: ");
            ssn = object.setSsn(input.nextLine());

        }
        String telephoneNumber = "";
        System.out.println("Enter customers telephone number: ");
        telephoneNumber = object.setTelephoneNumber(input.nextLine());
        while (telephoneNumber.isEmpty()) {
            System.out.println("thats not correct, enter customers telephoneNumber: ");
            telephoneNumber = object.setTelephoneNumber(input.nextLine());
        }
            System.out.println("");
        customerList.add(String.valueOf(object));
    }

    private void RemoveCustomer(){
        int index = 0;
        for (String s : customerList)
            System.out.println((index++)  +": " + s);
        System.out.println("Which customer do you want to remove?: ");
        customerList.remove(input.nextInt());
    }

    private void ViewBooking() {
        if (booked==true) {
            System.out.println("Room number "+roomNumber+" is booked for mr/mrs "+ object.getName());
        }

    }

    private void SearchForBooking() {
        System.out.println("Search for a booking by customers name: ");
        Name=input.nextLine();
        if (booked==true) {
            System.out.println("Customer checked in room number " + roomNumber);
        }else{
            System.out.println("No Booking made for customer");
        }

    }



    private void CheckIn() {
        System.out.println("Which room would you like to book?");

        for (Room room : roomList) {
            System.out.println(room);
            System.out.println("Enter room number here: ");
        }
        roomNumber = input.nextInt();
        booked = true;
        roomList.get(roomNumber).setBooked(true);

        int index = 0;
        for (String s : customerList)
            System.out.println((index++) + 1 + ": " + s);
        System.out.println("Who would you like to book the room for? Please enter name: ");
        Name = input.nextLine();
        System.out.println("Room number: " + roomNumber + " has been booked for mrs/mr " + object.getName());

    }

    private void CheckOut() {
        if (booked == true) {
            System.out.println("Busy rooms "+roomNumber);
            System.out.println("Check out from room number: ");
            roomNumber = input.nextInt();
            roomList.get(roomNumber).setBooked(false);
            System.out.println("Room "+roomNumber+" is now empty");
            System.out.println("Checkout completed, Thank you for your stay, Welcome back!");
        } else {
            System.out.println("No customer checked IN");

        }
    }

    private void SaveBooking() {

    }

    private void AddRoom() {


        System.out.println(" What is the room number?");
         roomNumber = input.nextInt();
        System.out.println("How many beds are there in the room?");
        int numberOfBeds = input.nextInt();
        System.out.println("Does the room have a balcony? 1: yes, 2: no");
        int balcony = input.nextInt();
        boolean hasBalcony = false;
        if( balcony == 1) {
            hasBalcony = true;
        } else {
            hasBalcony = false;
        }
        System.out.println("What is the price per night?");
        double price = input.nextDouble();
        booked = false;

        Room room = new Room(roomNumber, numberOfBeds, hasBalcony, price, booked);
        roomList.add(room);

    }
    private  void removeRoom(){
        int index = 0;
        for (Room s : roomList)
            System.out.println((index++) + ": " + s);
        System.out.println("Which room do you want to remove?: ");
        roomList.remove(input.nextInt());

    }

    private void EditRoom() {

        int index=0;
        for(Room d : roomList) {
            System.out.println((index++) + ": " + d);

        }

        System.out.println("Which room do you want to edit?: ");
        int elementNumber = Integer.parseInt(input.nextLine());

        System.out.println("Whats is the room number?: ");
        int newRoomNumber = Integer.parseInt(input.nextLine());
        roomList.get(elementNumber).setRoomNumber(newRoomNumber);
        System.out.println("How many beds?: ");
        int newNumberOfBeds = Integer.parseInt(input.nextLine());
        roomList.get(elementNumber).setNumberOfBeds(newNumberOfBeds);
        System.out.println("Does the room have a balcony? 1. Yes 2. No");
        int newBalcony = Integer.parseInt(input.nextLine());
        boolean hasBalcony = false;
        if( newBalcony == 1) {
            hasBalcony = true;
        } else {
            hasBalcony = false;
        }
        roomList.get(elementNumber).setHasBalcony(hasBalcony);

        System.out.println("What is the price per night?: ");
        int newPricePerNight = input.nextInt();
        roomList.get(elementNumber).setPricePerNight(newPricePerNight);

    }

    private void ViewCustomerInfo() {

    }

    private void BookingInfo() {

    }

    private void EditCustomerInfo() {

    }
}

