/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ej2;
import java.util.LinkedList;

public class Parqueadero extends javax.swing.JFrame {
  String placa;
  int horaentra;
  String tipo;
  int numero;
  int horasalida;
    public Parqueadero() {
        initComponents();
        Datos();
    }
public Parqueadero(String placa, int horaentra,String tipo,int numero,int horasalida){

    this.placa=placa;
    this.horaentra=horaentra;
    this.tipo=tipo;
    this.numero=numero;
    this.horasalida= horasalida; 
}
 LinkedList<Parqueadero> listavehi = new LinkedList<>();

public void Datos(){

   listavehi.add(new Parqueadero("123-ABC",10,"moto",1,12));
   listavehi.add(new Parqueadero("222-BBC",16,"moto",2,20));
   listavehi.add(new Parqueadero("324-GBD",12,"moto",3,16));
   listavehi.add(new Parqueadero("444-ACD",20,"moto",4,22));
   listavehi.add(new Parqueadero("456-ATC",11,"moto",5,17));

String vehicleData = "";
        for (Parqueadero vehicle : listavehi) {
            vehicleData = "Placa: " + vehicle.placa +"\n"+
                           "Entrada: " + vehicle.horaentra +"\n"+
                           "Tipo: " + vehicle.tipo +"\n"+
                           "Número: " + vehicle.numero +"\n"+
                           "Salida:" + vehicle.horasalida +
                           "\n";
        }
        jTextField5.setText(vehicleData);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Bienvenido al parqueadero del Sur. Ingrese los datos solicitados.");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
