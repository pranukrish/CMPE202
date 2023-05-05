package edu.sjsu.cmpe202.before;

import java.util.Date;

public class MovieRental {
   private String movieTitle;
   private int classification;
   private Date rentDate;
   private Date dueDate;
   private double rentalFee;
   private boolean isOverdue() {
       Date now = new Date();
       return dueDate.before(now); 
   }
   public double lateFee() {
       if (isOverdue()) { return rentalFee * 0.5;}
       else return 0;
   } 
}