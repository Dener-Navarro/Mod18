package br.com.dnavarro.exceptions;
import javax.swing.*;

public class AppCliente {

    public static void main(String args[]) throws ClienteNaoEncontrado2Exception {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        ClienteService.consutlarCliente(opcao);

//        try {
//            ClienteService.consultarCliente(opcao);
//        } catch(ClienteNaoEncontrado2Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
//        }

    }
}