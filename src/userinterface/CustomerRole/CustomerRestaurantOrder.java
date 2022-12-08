/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Order.CartModel;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.createNewUser.createLogin;

/**
 *
 * @author akuls
 */
public class CustomerRestaurantOrder extends javax.swing.JPanel {

    /**
     * Creates new form CustomerRestaurantOrder
     */
        private JPanel userProcessContainer;

     UserAccount userAccount;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    public CustomerRestaurantOrder(JPanel userProcessContainer, UserAccount account,EcoSystem ecosystem) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        if(ecosystem.getCustomerDirectory() == null)
            ecosystem.setCustomerDirectory(new CustomerDirectory());
        initComponents();
        populateTable();
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
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        restaurantItems = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnViewProfile = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        proceedToCart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(203, 233, 246));

        restaurantItems.setBackground(new java.awt.Color(221, 243, 242));
        restaurantItems.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 153, 255), new java.awt.Color(204, 204, 255)));
        restaurantItems.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        restaurantItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item"
            }
        ));
        jScrollPane1.setViewportView(restaurantItems);

        jToolBar1.setRollover(true);

        btnViewProfile.setBackground(new java.awt.Color(204, 204, 255));
        btnViewProfile.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        btnViewProfile.setForeground(new java.awt.Color(227, 245, 245));
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });
        jToolBar1.add(btnViewProfile);

        addToCart.setBackground(new java.awt.Color(244, 228, 228));
        addToCart.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        addToCart.setForeground(new java.awt.Color(216, 253, 253));
        addToCart.setText("Add to cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });
        jToolBar1.add(addToCart);
        addToCart.getAccessibleContext().setAccessibleName("Add item to cart");

        proceedToCart.setBackground(new java.awt.Color(204, 255, 204));
        proceedToCart.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        proceedToCart.setForeground(new java.awt.Color(234, 252, 252));
        proceedToCart.setText("Proceed to cart");
        proceedToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedToCartActionPerformed(evt);
            }
        });
        jToolBar1.add(proceedToCart);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(137, 209, 240));
        jLabel2.setText("Items Available");

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) restaurantItems.getModel();

            
          int selectedRow = restaurantItems.getSelectedRow();
          //if(selectedRow == null)
           //  JOptionPane.showMessageDialog(this, "No Item Selected"); 
          String resto = df.getValueAt(selectedRow,0).toString();
          String item = df.getValueAt(selectedRow, 1).toString();
          CartModel cm = new CartModel(resto, item);
          
       //   if(ecosystem.getCustomerDirectory() == null)
       //       ecosystem.setCustomerDirectory(new ());
       
       
          cd = ecosystem.getCustomerDirectory();
          
          Customer c = cd.getCustoo(userAccount);
          c.addToCart(cm);
          JOptionPane.showMessageDialog(this, "Added to cart");
          
    }//GEN-LAST:event_addToCartActionPerformed

    private void proceedToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedToCartActionPerformed
        // TODO add your handling code here:
           cd = ecosystem.getCustomerDirectory();
          Customer c = cd.getCustoo(userAccount); 
          Cart cart = new Cart(userProcessContainer,c, ecosystem);
        userProcessContainer.add("cart",cart);
            CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"cart");
    }//GEN-LAST:event_proceedToCartActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        cd = ecosystem.getCustomerDirectory();
        Customer c = cd.getCustoo(userAccount);
        CustomerProfile cp = new CustomerProfile(userProcessContainer,c,ecosystem);
        userProcessContainer.add("profile",cp);
            CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
            crdLyt.show(userProcessContainer,"profile");
        
    }//GEN-LAST:event_btnViewProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton proceedToCart;
    private javax.swing.JTable restaurantItems;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        rd = ecosystem.getRestaurantDirectory();
        ArrayList<Restaurant> restoList = rd.getRestaurantList();
        
        DefaultTableModel dt = (DefaultTableModel) restaurantItems.getModel();
        dt.setRowCount(0);
        for(Restaurant r: restoList)
        {
            if(r.getMenu() == null)
                r.setMenu(new ArrayList<String>());
            ArrayList<String> items = r.getMenu();
            for(String s: items)
            {
                String[] row = {r.getName(),s};
                dt.addRow(row);
            }
        }
        
        restaurantItems.setModel(dt);
        
    }
}