/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ej2;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Parqueadero extends javax.swing.JFrame {
  String placa;
  int horaentra;
  String tipo;
  double numero;
  int horasalida;
   
    public Parqueadero() {
        initComponents();
        Datos1();
        Datos();
    }
public Parqueadero(String placa, int horaentra,String tipo,double numero,int horasalida){

    this.placa=placa;
    this.horaentra=horaentra;
    this.tipo=tipo;
    this.numero=numero;
    this.horasalida= horasalida; 
    
}
 LinkedList<Parqueadero> listavehi = new LinkedList<>();

 Stack<String> pila = new Stack<>();
Stack<String> pila2 = new Stack<>();
 ArrayList<Double> tarifas= new ArrayList<>();
 
 public void Datos1(){
 listavehi.add(new Parqueadero("123-ABC",10,"moto",1,12));
   listavehi.add(new Parqueadero("222-BBC",16,"carro",2,20));
   listavehi.add(new Parqueadero("324-GBD",12,"bicicleta",3,16));
   listavehi.add(new Parqueadero("444-ACD",20,"moto",4,22));
   listavehi.add(new Parqueadero("456-ATC",11,"carro",5,17));
  
 
 }
public void Datos(){
    
       
    pila.clear();
   pila2.clear();

   
 
 StringBuilder vehicleData = new StringBuilder();
 
 
 double totaldosruedas = 0;
 double totalcuatroruedas = 0;
       double totalNumeroVehiculos=0;
       double totalGeneral=0;
 StringBuilder vehiclePago = new StringBuilder();
 StringBuilder vehicleDosruedas = new StringBuilder();
 StringBuilder vehiclecuatroruedas = new StringBuilder();
  StringBuilder vehicleTotal = new StringBuilder();
 
    for (Parqueadero vehicle : listavehi) {
        vehicleData.append("Placa: ").append(vehicle.placa)
                    .append(" | Entrada: ").append("Las ").append(vehicle.horaentra).append(" Horas")
                    .append(" | Tipo: ").append(vehicle.tipo)
                    .append(" | Número: ").append(vehicle.numero)
                    .append(" | Salida: ").append("Las ").append(vehicle.horasalida).append(" Horas")
                    .append("\n")
                .append("\n");
        
                 totalNumeroVehiculos++; 
                
                
       
      double pago=(Pago(vehicle.horaentra,vehicle.tipo,vehicle.horasalida)) ;
      tarifas.add(pago);
       totalGeneral += pago;
      vehiclePago.append("Placa: ").append(vehicle.placa)
                        .append(" | Tarifa: ").append(pago).append(" COP")
                        .append("\n").append("\n");
      
       if (vehicle.tipo.equals("bicicleta") || vehicle.tipo.equals("moto")) {
                pila.push(vehicle.placa + " - " + vehicle.tipo);
                 totaldosruedas += pago;
               
            }
        if (vehicle.tipo.equals("carro") || vehicle.tipo.equals("coche")|| vehicle.tipo.equals("Carro")) {
                pila2.push(vehicle.placa + " - " + vehicle.tipo);
                 totalcuatroruedas += pago;
               
            }
    }

     vehicleDosruedas.append("[PLACAS Y TIPO DE VEHÍCULO]:\n");
   for (String vehiculo : pila) {
       vehicleDosruedas.append(vehiculo).append("\n");
   }
   vehicleDosruedas.append("\nTotal tarifas de vehículos de dos ruedas: ").append(totaldosruedas).append(" COP");
   
   vehiclecuatroruedas.append("[PLACAS Y TIPO DE VEHÍCULO]:\n");
   for (String vehiculo : pila2) {
       vehiclecuatroruedas.append(vehiculo).append("\n");
   }
   vehiclecuatroruedas.append("\nTotal tarifas de vehículos de cuatro ruedas: ").append(totalcuatroruedas).append(" COP");
   
   vehicleTotal.append("Total de vehículos: ").append(totalNumeroVehiculos).append("\n");
    vehicleTotal.append("Total a pagar por todos los vehículos: ").append(totalGeneral).append(" COP");
    
    jTextArea1.setText(vehicleData.toString());
     jTextArea2.setText(vehiclePago.toString());
       jTextArea3.append(vehicleDosruedas.toString());
       jTextArea4.append(vehiclecuatroruedas.toString());
       jTextArea5.append(vehicleTotal.toString());
}

public double Pago( int horaentra,
  String tipo,int horasalida){
   int tiempo= (horasalida-horaentra)*60;
    double Tarifa=0;
    
    switch(tipo){
     case "bicicleta":
        case "ciclomotor":
            Tarifa = 20;
            break;
        case "moto":
        case "motocicleta":
            Tarifa = 30;
            break;
        case "carro":
        case "auto":
            Tarifa = 60;
            break;
        default:
            System.out.println("Tipo de vehículo no reconocido.");
            return 0;  
    }
 return tiempo*Tarifa;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("                   Bienvenido al parqueadero del Sur. ");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setText("LISTA DE VEHICULOS");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel3.setText("TARIFAS A PAGAR ");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel4.setText("Lista de Vehiculos 2 Ruedas");

        jLabel5.setText("Lista de Vehiculos 4 Ruedas");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel6.setText("Total Vehiculos y Pago");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Numero de vehiculo a eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel7)))
                                .addGap(0, 18, Short.MAX_VALUE)))))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel5)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double numeroauto=Double.parseDouble(jTextField1.getText());
        
       ArrayList<Parqueadero> tempList = new ArrayList<>(listavehi);

for (Parqueadero vehicle : tempList) {
    if (vehicle.numero == numeroauto) {
        listavehi.remove(vehicle); 
        break;
    }
}

Datos();
jTextField1.setText(""); 
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
