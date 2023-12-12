
package tela;

import cenaflix.Filme;
import cenaflix.FilmeDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Classe da tela de consulta de filmes
 * @author daviremzetti
 */
public class TelaConsulta extends javax.swing.JFrame {
    
    FilmeDAO dao = new FilmeDAO();
    String id;
    String nome;
    String datalancamento;
    String categoria;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDatalancamento() {
        return datalancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDatalancamento(String datalancamento) {
        this.datalancamento = datalancamento;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    public TelaConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        BtConsultar = new javax.swing.JButton();
        BtDeletar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbLista = new javax.swing.JTable();
        BtEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(873, 539));

        jPanel2.setBackground(new java.awt.Color(217, 217, 217));
        jPanel2.setPreferredSize(new java.awt.Dimension(246, 71));
        jPanel2.setSize(new java.awt.Dimension(246, 71));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 0, 48)); // NOI18N
        jLabel1.setText("CENAFLIX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jLabel2.setText("CONSULTA DE FILMES");

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        jLabel3.setText("Nome do filme:");

        TfNome.setFont(new java.awt.Font(".SF NS Text", 0, 18)); // NOI18N
        TfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomeActionPerformed(evt);
            }
        });
        TfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TfNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TfNomeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TfNomeKeyTyped(evt);
            }
        });

        BtConsultar.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        BtConsultar.setText("Consultar");
        BtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarActionPerformed(evt);
            }
        });

        BtDeletar.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        BtDeletar.setText("Deletar");
        BtDeletar.setEnabled(false);
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });

        String[] colunas = {"Id", "Nome","Categoria","Lançamento"};
        DefaultTableModel tabelaModelo = new DefaultTableModel(colunas,0);
        TbLista.setModel(tabelaModelo);
        TbLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TbListaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TbListaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(TbLista);

        BtEditar.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        BtEditar.setText("Editar");
        BtEditar.setEnabled(false);
        BtEditar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BtEditarItemStateChanged(evt);
            }
        });
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)
                        .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed

        String nome = TfNome.getText().toUpperCase();
        
        try {
            dao.conectar();
            if(nome.isEmpty()){
               ArrayList<Filme> lista = dao.listar();
               listar(lista);
            }else{
               Filme novoFilme = dao.consultar(nome);
               filtrar(novoFilme);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados");
        }
        try {
            dao.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtConsultarActionPerformed
    
    /**
     * Função para listar os filmes na tabela
     * @param novoFilme 
     */
    private void filtrar(Filme novoFilme){
        try{
            DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
            tabelaModelo.setNumRows(0);
            String [] linha = {
                String.valueOf(novoFilme.getId()),
                novoFilme.getNome(),
                novoFilme.getCategoria(),
                String.valueOf(novoFilme.getLancamento())
            };

            tabelaModelo.addRow(linha);
            TbLista.setModel(tabelaModelo);
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Filme não encontrado");
        }
    }
    
    private void listar(ArrayList<Filme> lista){
        try{
            DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
            tabelaModelo.setNumRows(0);
            for(int i = 0; i < lista.size(); i++){
                Filme novoFilme = lista.get(i);
                
                String [] linha = {
                String.valueOf(novoFilme.getId()),
                novoFilme.getNome(),
                novoFilme.getCategoria(),
                String.valueOf(novoFilme.getLancamento())
            };
                tabelaModelo.addRow(linha);
                TbLista.setModel(tabelaModelo);
            }           
            
        }catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Filme não encontrado");
        }
    }
    
    
    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir o fime selecionado?", "AVISO", JOptionPane.YES_NO_OPTION);
        if(opcao == 0){
            String selecionado = TbLista.getValueAt(TbLista.getSelectedRow(), 0).toString();
            int idFilme = Integer.parseInt(selecionado);
            try {
                dao.conectar();
                dao.deletar(idFilme);
                dao.desconectar();
                JOptionPane.showMessageDialog(null, "Filme deletado com sucesso.");
                DefaultTableModel tabelaModelo = (DefaultTableModel) TbLista.getModel();
                tabelaModelo.setNumRows(0);
                TfNome.setText("");
                BtDeletar.setEnabled(false);
                BtEditar.setEnabled(false);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Falha na conexao com o banco de dados: " + ex.getMessage());
            } catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null, "Selecione um filme");
            } 
        }
        
    }//GEN-LAST:event_BtDeletarActionPerformed
   
    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        
        try{
            String selecionado = TbLista.getValueAt(TbLista.getSelectedRow(), 0).toString();
            int idFilme = Integer.parseInt(selecionado);
            String nome = (String) TbLista.getValueAt(TbLista.getSelectedRow(), 1);
            LocalDate data = LocalDate.parse((CharSequence) TbLista.getValueAt(TbLista.getSelectedRow(), 3));
            String categoria = (String) TbLista.getValueAt(TbLista.getSelectedRow(), 2);


            Filme novoFilme = new Filme(nome, data, categoria);
            novoFilme.setId(idFilme);

            String dataString = formatarData(data.toString());

            TelaEditar novoEditar = new TelaEditar();
            novoEditar.setFilme(novoFilme);
            novoEditar.setCampos(nome, dataString, categoria);
            novoEditar.setVisible(true);
            BtDeletar.setEnabled(false);
            BtEditar.setEnabled(false);
        } catch (ArrayIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Selecionar um filme para editar");
        }
    }//GEN-LAST:event_BtEditarActionPerformed
    
    
    /**
     * Método para mudar a data no formato aaaa-mm-dd para o formato dd/mm/aaaa
     * @param data
     * @return 
     */
    private String formatarData(String data){
        
        String[] separador = data.split("-");
        String dataString = separador[2] + "/" + separador[1] + "/" + separador[0];
        return dataString;
    }
    private void BtEditarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BtEditarItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BtEditarItemStateChanged

    private void TbListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbListaMouseEntered
      
    }//GEN-LAST:event_TbListaMouseEntered
    /**
     * Função para habilitar os botões editar e deletar ao capturar o clique do mouse
     * @param evt 
     */
    private void TbListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbListaMousePressed
        BtEditar.setEnabled(true);
        BtDeletar.setEnabled(true);
    }//GEN-LAST:event_TbListaMousePressed

    private void TfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfNomeKeyTyped
        
    }//GEN-LAST:event_TfNomeKeyTyped
    /**
     * Função para habilitar os botões editar e deletar ao capturar alguma tecla digitada no teclado
     * @param evt 
     */
    private void TfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfNomeKeyReleased
   
    }//GEN-LAST:event_TfNomeKeyReleased

    private void TfNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TfNomeKeyPressed
        
    }//GEN-LAST:event_TfNomeKeyPressed

    private void TfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomeActionPerformed
        
    }//GEN-LAST:event_TfNomeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JTable TbLista;
    private javax.swing.JTextField TfNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
