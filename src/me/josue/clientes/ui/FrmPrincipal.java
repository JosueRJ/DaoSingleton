package me.josue.clientes.ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import me.josue.clientes.dao.clases.Clientes;
import me.josue.clientes.dao.implement.ClienteImplement;
import me.josue.clientes.dao.interfaces.ClienteDAO;

/**
 *
 * @author Virus
 */

public class FrmPrincipal extends javax.swing.JFrame {

    public static final int CREAR = 0;
    public static final int MODIFICAR = 1;
    private int operacion;
    
    //creamos una variable para listar
    private final ClienteDAO clienteDAO;
   
    public FrmPrincipal() {
        initComponents();
        
        clienteDAO = new ClienteImplement();
        cargarClientes();
        
        ////
        this.operacion = operacion;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtapPaterno = new javax.swing.JTextField();
        txtapMaterno = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnGestionarCuentas = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMovimientos = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("dni");

        jLabel2.setText("nombres");

        jLabel3.setText("apPaterno");

        jLabel4.setText("apMaterno");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnGestionarCuentas.setText("Gestionar Cuentas");
        btnGestionarCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarCuentasActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMovimientos.setText("Movimientos");
        btnMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientosActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Nombres", "apPaterno", "apMaterno"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtapPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(txtNombres)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapMaterno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMovimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGestionarCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtapPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(txtapMaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnMovimientos)
                    .addComponent(btnBorrar)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnGestionarCuentas)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (operacion == CREAR) {
            Clientes clientes = new Clientes(txtDni.getText(), txtNombres.getText(), txtapPaterno.getText(), txtapMaterno.getText());
            ClienteDAO clienteDao = new ClienteImplement();
            clienteDao.guardar(clientes);
        }
//        DlgAgregarCliente agregarCliente = new DlgAgregarCliente(this, true, DlgAgregarCliente.CREAR);
//        agregarCliente.setVisible(true);
        cargarClientes();
        limpiar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientosActionPerformed
        DlgMovimientos dlgMovimientos = new DlgMovimientos(this, true);
        dlgMovimientos.setVisible(true);
    }//GEN-LAST:event_btnMovimientosActionPerformed

    private void btnGestionarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarCuentasActionPerformed
        DlgCuentas dlgcuentas = new DlgCuentas(this, true);
        dlgcuentas.setVisible(true);
    }//GEN-LAST:event_btnGestionarCuentasActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (operacion == MODIFICAR){
            Clientes clientes = new Clientes(txtDni.getText(), txtNombres.getText(), txtapPaterno.getText(), txtapMaterno.getText());
            ClienteDAO clienteDAO = new ClienteImplement();
            clienteDAO.modificar(clientes);
        
        }
        cargarClientes();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        int resultado = JOptionPane.showConfirmDialog(this, "¿Desea borrar este cliente?","Confirmacion",JOptionPane.YES_NO_OPTION);
        if(resultado == JOptionPane.YES_OPTION){
            int posicion = tblClientes.getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel)tblClientes.getModel();
            Clientes clientes = new Clientes(modelo.getValueAt(posicion, 0).toString());
            
            clienteDAO.borrar(clientes);
            
            cargarClientes();
        }
    }//GEN-LAST:event_btnBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGestionarCuentas;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMovimientos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtapMaterno;
    private javax.swing.JTextField txtapPaterno;
    // End of variables declaration//GEN-END:variables

    private void cargarClientes() {
        List<Clientes> clientes = clienteDAO.listar();
        DefaultTableModel modelo = (DefaultTableModel)tblClientes.getModel();
        
        modelo.getDataVector().clear();
        for (int i = 0; i < clientes.size(); i++) {
            modelo.addRow(new Object[] {clientes.get(i).getDni(), clientes.get(i).getNombres(), clientes.get(i).getApPaterno(), clientes.get(i).getApMaterno()});
        }
    }
    public void limpiar(){
         txtDni.setText("");
         txtNombres.setText("");
         txtapPaterno.setText("");
         txtapMaterno.setText("");
    }
    
}
