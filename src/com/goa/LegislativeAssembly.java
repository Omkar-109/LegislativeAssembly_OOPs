package com.goa;

import java.util.ArrayList;
import java.util.List;
/*
 * Goa Legislative Assembly implementation using OOPs concepts
 * @author Omkar Mhamal
 * 
 */

public class LegislativeAssembly {
    private String stateName;
    private List<Member> members;
    private Speaker speaker;
    private DeputySpeaker deputySpeaker;
    private ChiefMinister chiefMinister;
    private List<Session> sessions;
    private List<Committee> committees;
    private List<Bill> bills;

    public LegislativeAssembly(String stateName) {
        this.stateName = stateName;
        this.members = new ArrayList<>();
        this.sessions = new ArrayList<>();
        this.committees = new ArrayList<>();
        this.bills = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void electSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void electDeputySpeaker(DeputySpeaker deputySpeaker) {
        this.deputySpeaker = deputySpeaker;
    }

    public void appointChiefMinister(ChiefMinister chiefMinister) {
        this.chiefMinister = chiefMinister;
    }

    public void callSession(Session session) {
        sessions.add(session);
    }

    public void formCommittee(Committee committee) {
        committees.add(committee);
    }

    public void introduceBill(Bill bill) {
        bills.add(bill);
        System.out.println("Bill " + bill.getTitle() + " introduced in " + stateName + " Legislative Assembly.");
    }

    public void passBill(Bill bill) {
        if (bills.contains(bill)) {
            System.out.println("Bill " + bill.getTitle() + " passed in " + stateName + " Legislative Assembly.");
        } else {
            System.out.println("Bill " + bill.getTitle() + " has not been introduced yet.");
        }
    }

    @Override
    public String toString() {
        return "State: " + stateName + "\n" +
               "Members: " + members + "\n" +
               "Speaker: " + speaker + "\n" +
               "Deputy Speaker: " + deputySpeaker + "\n" +
               "Chief Minister: " + chiefMinister + "\n" +
               "Sessions: " + sessions + "\n" +
               "Committees: " + committees + "\n" +
               "Bills: " + bills;
    }
}
