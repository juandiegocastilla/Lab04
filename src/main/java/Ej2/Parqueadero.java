/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ej2;
import java.util.ArrayList;
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

 ArrayList<Double> tarifas= new ArrayList<>();
public void Datos(){

   listavehi.add(new Parqueadero("123-ABC",10,"moto",1,12));
   listavehi.add(new Parqueadero("222-BBC",16,"carro",2,20));
   listavehi.add(new Parqueadero("324-GBD",12,"bicicleta",3,16));
   listavehi.add(new Parqueadero("444-ACD",20,"moto",4,22));
   listavehi.add(new Parqueadero("456-ATC",11,"carro",5,17));
 
 StringBuilder vehicleData = new StringBuilder();
 double totalDosRuedas = 0;
        
 StringBuilder vehiclePago = new StringBuilder();
    for (Parqueadero vehicle : listavehi) {
        vehicleData.append("Placa: ").append(vehicle.placa)
                    .append(" | Entrada: ").append("Las ").append(vehicle.horaentra).append(" Horas")
                    .append(" | Tipo: ").append(vehicle.tipo)
                    .append(" | Número: ").append(vehicle.numero)
                    .append(" | Salida: ").append("Las ").append(vehicle.horasalida).append(" Horas")
                    .append("\n")
                .append("\n")
                ; 
       
      double pago=(Pago(vehicle.horaentra,vehicle.tipo,vehicle.horasalida)) ;
      tarifas.add(pago);
      
      vehiclePago.append("Placa: ").append(vehicle.placa)
                        .append(" | Tarifa: ").append(pago).append(" COP")
                        .append("\n").append("\n");
      
       if (vehicle.tipo.equals("bicicleta") || vehicle.tipo.equals("moto")) {
                totalDosRuedas += pago;
            }
    }

    
    jTextArea1.setText(vehicleData.toString());
     jTextArea2.setText(vehiclePago.toString());
       jTextArea2.append("\nTotal tarifas de vehículos de dos ruedas: " + totalDosRuedas + " COP");
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
        jLabel4 = new javax.swing.JLabel();

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

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(26, 26, 26))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parqueadero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
