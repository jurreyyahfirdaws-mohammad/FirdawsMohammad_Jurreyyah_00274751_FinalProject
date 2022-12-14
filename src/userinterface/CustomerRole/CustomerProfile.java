/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Order.FinalOrder;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akuls
 */
public class CustomerProfile extends javax.swing.JPanel {

    /**
     * Creates new form CustomerProfile
     */
    JPanel userProcessContainer;
    Customer c;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    public CustomerProfile(JPanel userProcessContainer,Customer c,EcoSystem ecosystem) {
        this.c = c;
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
               
        initComponents();
        populateTable();
        nameLabel.setText(c.getCustomerName());
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        listOrdersReview = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textReview = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        btnUpdateReview = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        reviewItem = new javax.swing.JTextField();
        reviewResto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        ordersList = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 240, 248));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel2.setText("Orders:");

        nameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        nameLabel.setText("userName");

        backButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel6.setText("Review");

        jLabel4.setText("Select OrderId:");

        listOrdersReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listOrdersReviewActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(textReview);

        jLabel5.setText("Review:");

        btnUpdateReview.setText("update review");
        btnUpdateReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateReviewActionPerformed(evt);
            }
        });

        jLabel7.setText("Item:");

        jLabel8.setText("Restaurant:");

        reviewItem.setEditable(false);

        reviewResto.setEditable(false);

        ordersList.setBackground(new java.awt.Color(233, 250, 253));
        ordersList.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        ordersList.setForeground(new java.awt.Color(251, 229, 229));
        ordersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item", "Order date", "OrderId", "Status", "Delivery", "Review"
            }
        ));
        ordersList.setGridColor(new java.awt.Color(229, 246, 240));
        ordersList.setSelectionBackground(new java.awt.Color(209, 229, 245));
        ordersList.setShowGrid(true);
        jScrollPane3.setViewportView(ordersList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reviewItem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listOrdersReview, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reviewResto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdateReview)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backButton))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(nameLabel)
                    .addComponent(backButton))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(listOrdersReview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(reviewItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(reviewResto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnUpdateReview)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"Customer");
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnUpdateReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        f.setCust_review(textReview.getText());
        populateTable();
        textReview.setText("");
        reviewItem.setText("");
        reviewResto.setText("");
    }//GEN-LAST:event_btnUpdateReviewActionPerformed

    private void listOrdersReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listOrdersReviewActionPerformed
        // TODO add your handling code here:
        String orderId =(String) listOrdersReview.getSelectedItem();
        rd = ecosystem.getRestaurantDirectory();
        FinalOrder f = rd.getOrder(orderId);
        reviewItem.setText(f.getOrder_item());
        reviewResto.setText(f.getRestaurant());
        
    }//GEN-LAST:event_listOrdersReviewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnUpdateReview;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> listOrdersReview;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTable ordersList;
    private javax.swing.JTextField reviewItem;
    private javax.swing.JTextField reviewResto;
    private javax.swing.JTextPane textReview;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        nameLabel.setText(c.getCustomerName());
        ArrayList<Order> orders = c.getPreviousOrders();
        rd = ecosystem.getRestaurantDirectory();
        ArrayList<Restaurant> restos = rd.getRestaurantList();
        ArrayList<FinalOrder> finalOrders;
        DefaultTableModel df = (DefaultTableModel) ordersList.getModel();
        DefaultComboBoxModel dl = new DefaultComboBoxModel();
        df.setRowCount(0);
        for(Restaurant r: restos)
        {
            finalOrders = r.getAcceptedOrders();
            for(FinalOrder f: finalOrders)
            {
                if(f.getCustomer().equals(c.getCustomerName()))
                {
                    String[] row = {f.getRestaurant(),f.getOrder_item(),f.getDate(),f.getOrderId(),f.getOrder_status(),f.getDeliveryMan(),f.getCust_review()};
                    df.addRow(row);
                    dl.addElement(f.getOrderId());
                }
            }
        }
        ordersList.setModel(df);
        listOrdersReview.setModel(dl);
        
        
        
    }
}
