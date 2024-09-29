package com.goa;

import java.util.Scanner;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

 /*Main Driver Class */
public class Main {
    /*Creating Object of LegislativeAssembly Class */
    private static LegislativeAssembly assembly = new LegislativeAssembly("Goa");
    private static Scanner scanner = new Scanner(System.in);

    /*main method */
    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Member");
            System.out.println("2. Elect Speaker");
            System.out.println("3. Elect Deputy Speaker");
            System.out.println("4. Appoint Chief Minister");
            System.out.println("5. Call Session");
            System.out.println("6. Form Committee");
            System.out.println("7. Introduce Bill");
            System.out.println("8. Pass Bill");
            System.out.println("9. Display Assembly Info");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addMember();
                    break;
                case 2:
                    electSpeaker();
                    break;
                case 3:
                    electDeputySpeaker();
                    break;
                case 4:
                    appointChiefMinister();
                    break;
                case 5:
                    callSession();
                    break;
                case 6:
                    formCommittee();
                    break;
                case 7:
                    introduceBill();
                    break;
                case 8:
                    passBill();
                    break;
                case 9:
                    displayAssemblyInfo();
                    break;
                case 10:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /*Method to add member */
    private static void addMember() {
        System.out.print("Enter Member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Constituency: ");
        String constituency = scanner.nextLine();
        System.out.print("Enter Party: ");
        String party = scanner.nextLine();
        System.out.print("Is this a reserved seat? (true/false): ");
        boolean isReserved = scanner.nextBoolean();

        Member member = new LegislativeMember(name, constituency, party, isReserved);
        assembly.addMember(member);
        System.out.println("Member added.");
    }

    /*Method to class speaker */
    private static void electSpeaker() {
        System.out.print("Enter Speaker's name: ");
        String name = scanner.nextLine();

        Speaker speaker = new Speaker(name);
        assembly.electSpeaker(speaker);
        System.out.println("Speaker elected.");
    }

    /* Method to class Deputy speaker */
    private static void electDeputySpeaker() {
        System.out.print("Enter Deputy Speaker's name: ");
        String name = scanner.nextLine();

        DeputySpeaker deputySpeaker = new DeputySpeaker(name);
        assembly.electDeputySpeaker(deputySpeaker);
        System.out.println("Deputy Speaker elected.");
    }

    /* Method to class for appointing Chief Minister */
    private static void appointChiefMinister() {
        System.out.print("Enter Chief Minister's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Chief Minister's Party: ");
        String party = scanner.nextLine();

        ChiefMinister chiefMinister = new ChiefMinister(name, party);
        assembly.appointChiefMinister(chiefMinister);
        System.out.println("Chief Minister appointed.");
    }

    /* Method for class Call session */
    private static void callSession() {
        System.out.print("Enter Session Name: ");
        String sessionName = scanner.nextLine();
        System.out.print("Enter Start Date: ");
        String startDate = scanner.nextLine();
        System.out.print("Enter End Date: ");
        String endDate = scanner.nextLine();

        Session session = new Session(sessionName, startDate, endDate);
        assembly.callSession(session);
        System.out.println("Session called.");
    }

    /* Method for class Form Committee */
    private static void formCommittee() {
        System.out.print("Enter Committee Name: ");
        String committeeName = scanner.nextLine();
        System.out.print("Enter Committee Type (STANDING/AD_HOC): ");
        String type = scanner.nextLine();

        Committee.CommitteeType committeeType = Committee.CommitteeType.valueOf(type);
        Committee committee = new Committee(committeeName, committeeType);
        assembly.formCommittee(committee);
        System.out.println("Committee formed.");
    }

    /*Method for class Introduce Bill */
    private static void introduceBill() {
        System.out.print("Enter Bill Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Bill Description: ");
        String description = scanner.nextLine();

        Bill bill = new Bill(title, description);
        assembly.introduceBill(bill);
    }


    private static void passBill() {
        System.out.print("Enter Bill Title to Pass: ");
        String title = scanner.nextLine();

        Bill bill = new Bill(title, "");
        assembly.passBill(bill);
    }

    private static void displayAssemblyInfo() {
        System.out.println("\nAssembly Info:\n" + assembly.toString());
    }
}
