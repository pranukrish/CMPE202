package edu.sjsu.cmpe202.after;

import java.util.Date;

public class Rental {

    private String title;
    private Date rentDate;
    private Date dueDate;
    private double rentalFee;
    private double lateFeeFactor;

    Rental(double lateFeeFactor) {
        this.lateFeeFactor = lateFeeFactor;
    }

    private boolean isOverdue() {
        Date now = new Date();
        return dueDate.before(now);
    }

    public double lateFee() {
        if (isOverdue()) { return rentalFee * lateFeeFactor;}
        else return 0;
    }

}
