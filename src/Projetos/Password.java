package Projetos;

import javax.swing.*;
import java.awt.*;

public class Password {

    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite sua senha : ");
        int contador=1;

        while(!senha.equals("devchris") && contador<=2) {
        senha = JOptionPane.showInputDialog("Senha Incorreta, Tente novamente :\nTentativas restantes : " +(3-contador));
            contador++;
        }

        System.out.println();
        if(senha.equals("devchris")) {
            JOptionPane.showMessageDialog(null, "ACESSO PERMITIDO");
        } else {
            JOptionPane.showMessageDialog(null, "Acesso Bloqueado (Senha Incorreta)");

        }

    }
}
