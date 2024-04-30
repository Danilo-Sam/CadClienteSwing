/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastroclienteswing;

/**
 *
 * @author danilo.sampaio
 */
public class CadastroClienteSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal tela = new TelaPrincipal();
                tela.setLocationRelativeTo(null); // Centralizar a janela
                tela.setVisible(true);
            }
        });
    }
    
}
