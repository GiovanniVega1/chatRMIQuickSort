package rmi;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GraficoChatRMI extends javax.swing.JFrame {
    ComunicacionServidor chatServer;
    ComunicacionCliente chatClient;
    String username;
    int idClient=0;
    private int[] arreglo;
    
    public GraficoChatRMI() throws RemoteException {
        this.chatServer = new ComunicacionServidor();
        this.chatClient = new ComunicacionCliente();
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnCLiente = new javax.swing.JButton();
        btnServidor = new javax.swing.JButton();
        nombreChat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNumeros = new javax.swing.JTextField();
        btnOrdenar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPreorden = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSecuencial = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaConcurrente = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextAreaParalelo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnCLiente.setText("Cliente");
        btnCLiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCLienteActionPerformed(evt);
            }
        });

        btnServidor.setText("Servidor");
        btnServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServidorActionPerformed(evt);
            }
        });

        nombreChat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        nombreChat.setText("CHAT RMI");

        jLabel2.setText("Cantidad de numeros a ordenar:");

        jTextFieldNumeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumerosActionPerformed(evt);
            }
        });

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jTextAreaPreorden.setColumns(20);
        jTextAreaPreorden.setRows(5);
        jScrollPane2.setViewportView(jTextAreaPreorden);

        jTextAreaSecuencial.setColumns(20);
        jTextAreaSecuencial.setRows(5);
        jScrollPane3.setViewportView(jTextAreaSecuencial);

        jLabel3.setText("Ordenacion secuencial");

        jTextAreaConcurrente.setColumns(20);
        jTextAreaConcurrente.setRows(5);
        jScrollPane4.setViewportView(jTextAreaConcurrente);

        jLabel4.setText("Ordenación Concurrente");

        jLabel5.setText("Ordenación Paralela");

        jTextAreaParalelo.setColumns(20);
        jTextAreaParalelo.setRows(5);
        jScrollPane5.setViewportView(jTextAreaParalelo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(nombreChat))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btnOrdenar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 262, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreChat, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCLiente)
                    .addComponent(btnServidor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOrdenar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServidorActionPerformed

        String Ip=JOptionPane.showInputDialog(rootPane, "Ingresa tu ip", "Servidor", HEIGHT);
        System.out.println(Ip);
        chatServer.connection(Ip);
        
        jTextArea1.append("Conexion al servidor exitosa!");
        
        nombreChat.setText("Servidor");
        
        btnServidor.setEnabled(false);
        btnCLiente.setEnabled(false);
    }//GEN-LAST:event_btnServidorActionPerformed

    private void btnCLienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCLienteActionPerformed
        
        if(idClient<5){
            String Ip=JOptionPane.showInputDialog(rootPane, "Ingresa la ip del servidor", "Cliente", HEIGHT);
            username=JOptionPane.showInputDialog(rootPane, "Ingresa tu username", "Cliente", HEIGHT);

            System.out.println(Ip);
            
            chatClient=new ComunicacionCliente();
            chatClient.startClient(username, jTextArea1,Ip);
            
            idClient++;
            jTextArea1.append("Conexion al servidor exitosa!");
            System.out.println(idClient);
            
            nombreChat.setText("Usuario cli: " + username);
            
           
            
            btnServidor.setEnabled(false);
            btnCLiente.setEnabled(false);
        }
        
                
    }//GEN-LAST:event_btnCLienteActionPerformed

    private void jTextFieldNumerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumerosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumerosActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        int arraySize = Integer.parseInt(jTextFieldNumeros.getText());

        arreglo = generateRandomArray(arraySize);

        jTextAreaPreorden.setText("");
        jTextAreaSecuencial.setText("");
        jTextAreaConcurrente.setText("");

        QuickSort quickSort = new QuickSort();
        QuickSortForkJoin quickSortForkJoin = new QuickSortForkJoin();
        QuickSortParallel quickSortParallel = new QuickSortParallel(arreglo, 100000000);
        
        jTextAreaPreorden.setText("Resultados:\n");
        jTextAreaPreorden.append("Pre ordenamiento: " + Arrays.toString(arreglo) + "\n");
        final long startTimeSequential = System.nanoTime();
        quickSort.ordenamineto(arreglo);
        final long endTimeSequential = System.nanoTime();
        jTextAreaSecuencial.append("Secuencial pos ordenamiento: " + Arrays.toString(arreglo) + "\n");
        jTextAreaSecuencial.append("Tiempo de ejecución secuencial: " + ((endTimeSequential - startTimeSequential) / 1e+9) + " segundos\n");
        
        
        final long startTimeConcurrent = System.nanoTime();
        quickSortForkJoin.sort(arreglo);
        final long endTimeConcurrent = System.nanoTime();
        jTextAreaConcurrente.append("Concurrente pos ordenamineto: " + Arrays.toString(arreglo) + "\n");
        jTextAreaConcurrente.append("Tiempo de ejecución concurrente: " + ((endTimeConcurrent - startTimeConcurrent) / 1e+9) + " segundos\n");

        final long startTimeParallel = System.nanoTime();
        quickSortParallel.run();
        final long endTimeParallel = System.nanoTime();
        jTextAreaParalelo.append("Paralelo pos ordenamineto: " + Arrays.toString(arreglo) + "\n");
        jTextAreaParalelo.append("Tiempo de ejecución paralelo: " + ((endTimeParallel - startTimeParallel) / 1e+9) + " segundos\n");
        
        StringBuilder results = new StringBuilder();
    results.append("Resultados de ordenación:\n")
            .append("Secuencial pos ordenamiento: ").append(Arrays.toString(arreglo)).append("\n")
            .append("Tiempo de ejecución secuencial: ").append((endTimeSequential - startTimeSequential) / 1e+9).append(" segundos\n")
            .append("Concurrente pos ordenamineto: ").append(Arrays.toString(arreglo)).append("\n")
            .append("Tiempo de ejecución concurrente: ").append((endTimeConcurrent - startTimeConcurrent) / 1e+9).append(" segundos\n")
            .append("Paralelo pos ordenamineto: ").append(Arrays.toString(arreglo)).append("\n")
            .append("Tiempo de ejecución paralelo: ").append((endTimeParallel - startTimeParallel) / 1e+9).append(" segundos\n");

    try {
        chatClient.sendResults(results.toString(), username);
        chatServer.sendResultsToServer(results.toString(), username); // Enviar resultados al servidor
    } catch (RemoteException ex) {
        Logger.getLogger(GraficoChatRMI.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_btnOrdenarActionPerformed
    
    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(GraficoChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficoChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficoChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficoChatRMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GraficoChatRMI().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(GraficoChatRMI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCLiente;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JButton btnServidor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaConcurrente;
    private javax.swing.JTextArea jTextAreaParalelo;
    private javax.swing.JTextArea jTextAreaPreorden;
    private javax.swing.JTextArea jTextAreaSecuencial;
    private javax.swing.JTextField jTextFieldNumeros;
    private javax.swing.JLabel nombreChat;
    // End of variables declaration//GEN-END:variables
}
