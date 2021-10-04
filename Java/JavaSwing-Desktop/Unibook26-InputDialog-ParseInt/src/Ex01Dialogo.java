import javax.swing.JOptionPane;

public class Ex01Dialogo {
    public static void main(String[] args) throws Exception {

        //opcoes da primeira caixa de dialogo
        Object [] tipos = {"Gerente", "Funcionario"};

        //inputs
        int idade;

        resposta = (String) JOptionPane.showInputDialog(null,
            "Digite a sua idade",
            "Por favor",
            JOptionPane.QUESTION_MESSAGE,
        );

        //converte a resposta em inteiro
        idade = Integer.parseInt(resposta);

        if (idade >= 18) {
            JOptionPane.showMessageDialog (null,
                "Voce é maior de idade, OK";
            );
        }else{
            JOptionPane.showMessageDialog(null,
                "Entrada proibida!",
                "Aviso",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
