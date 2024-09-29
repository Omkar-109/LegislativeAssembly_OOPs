package com.goa;

public class Session {
    private String sessionName;
    private String startDate;
    private String endDate;

    public Session(String sessionName, String startDate, String endDate) {
        this.sessionName = sessionName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSessionName() {
        return sessionName;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    @Override
    public String toString() {
        return sessionName + " (" + startDate + " to " + endDate + ")";
    }
}
