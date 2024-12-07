/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author haaki
 */
public class BookingDataStoring {
    private static List<Object[]> bookings = new ArrayList<>();
    public static void addBooking(Object[] booking){
        bookings.add(booking);
    }
    public static List<Object[]> getBookings(){
        return bookings;
    }
    
}
