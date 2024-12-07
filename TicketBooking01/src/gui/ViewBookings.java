/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author haaki
 */
public class ViewBookings extends javax.swing.JFrame {
private static final Map<String, Map <String, Double>> ticketPrices = new HashMap<>();
    static {
       //Initiolize the ticket prices for defferent destination with different class
        Map<String, Double> firstClassPrices = new HashMap<>();
        firstClassPrices.put("Kandy", 1000.0);
        firstClassPrices.put("Colomobo", 1000.0);
        firstClassPrices.put("Jaffna", 1500.0);
        firstClassPrices.put("Badulla", 800.0);
        firstClassPrices.put("Haputale", 700.0);
        ticketPrices.put("First Class", firstClassPrices); // Add to the main map
        
        Map<String, Double> secondClassPrices = new HashMap<>();
        secondClassPrices.put("Kandy", 800.0);
        secondClassPrices.put("Colomobo", 800.0);
        secondClassPrices.put("Jaffna", 1000.0);
        secondClassPrices.put("Badulla", 600.0);
        secondClassPrices.put("Haputale", 500.0);
                ticketPrices.put("Second Class", secondClassPrices); // Add to the main map
                
        Map<String, Double> thirdClassPrices = new HashMap<>();
        thirdClassPrices.put("Kandy", 600.0);
        thirdClassPrices.put("Colomobo", 600.0);
        thirdClassPrices.put("Jaffna", 800.0);
        thirdClassPrices.put("Badulla", 400.0);
        thirdClassPrices.put("Haputale", 300.0);
        ticketPrices.put("Third Class", thirdClassPrices); // Add to the main map
        
        
    }
    /**
     * Creates new form ViewBookings
     */
    public ViewBookings() {
        initComponents();
         // Retrieve the bookings from the shared class
    // Retrieve the bookings from the shared class
        List<Object[]> bookings = BookingDataStoring.getBookings();

        // Check if there are any bookings
        if (!bookings.isEmpty()) {
            // Assuming you want to display the first booking for now
            Object[] booking = bookings.get(0); // Get the first booking

            // Update labels with booking data
            lblUserName.setText("User  Name: " + booking[0]);
            lblContectNo.setText("Contact No: " + booking[1]);
            String ticketType = (String) booking[2]; // Extract ticket type
            lblTicketType.setText("Ticket Type: " + ticketType);
            int numberOfTickets = (int) booking[3]; // Extract number of tickets
            lblNoFoTicket.setText("No of Tickets: " + numberOfTickets);
            lblDate.setText("Date: " + booking[4]);
            String destination = (String) booking[5]; // Extract destination
            lblDestination.setText("Destination: " + destination);

            // Retrieve the price based on ticket type and destination
            Double ticketPrice = ticketPrices.getOrDefault(ticketType, new HashMap<>()).get(destination);
            double totalAmount = (ticketPrice != null ? ticketPrice : 0) * numberOfTickets;
            lblTotal.setText("Total Amount: " + totalAmount);
        }else {
        // If there are no bookings, you can set default text or handle it accordingly
        lblUserName.setText("No bookings available.");
        lblContectNo.setText("");
        lblTicketType.setText("");
        lblNoFoTicket.setText("");
        lblDate.setText("");
        lblDestination.setText("");
        lblTotal.setText("");
    }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        lblHeading1 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblContectNo = new javax.swing.JLabel();
        lblTicketType = new javax.swing.JLabel();
        lblNoFoTicket = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblDestination = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setText("View Booking");

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        lblHeading1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lblHeading1.setText("Railway Ticket Booking ");

        btnBook.setText("Book Ticket");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnView.setText("View Bookings");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel Tickets");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblContectNo.setText("Contect No - ");

        lblTicketType.setText("Ticket Type - ");

        lblNoFoTicket.setText("No of Tickets - ");

        lblDate.setText("Date - ");

        lblUserName.setText("User Name - ");

        lblDestination.setText("Destination - ");

        lblTotal.setText("Total Amount - ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHeading1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBook, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnView)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContectNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTicketType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNoFoTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDestination, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblHeading1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBook)
                    .addComponent(btnView)
                    .addComponent(btnCancel))
                .addGap(28, 28, 28)
                .addComponent(lblUserName)
                .addGap(18, 18, 18)
                .addComponent(lblContectNo)
                .addGap(18, 18, 18)
                .addComponent(lblTicketType)
                .addGap(11, 11, 11)
                .addComponent(lblNoFoTicket)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDestination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btncancel))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btncancelActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        new BookTicket().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        new ViewBookings().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        new CancelBooking().setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBookings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btncancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblContectNo;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDestination;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblNoFoTicket;
    private javax.swing.JLabel lblTicketType;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables
}