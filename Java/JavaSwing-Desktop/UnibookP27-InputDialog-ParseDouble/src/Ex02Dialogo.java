import javax.swing.JOptionPane;

public class Ex02Dialogo {
    public static void main(String[] args) throws Exception {

        //opcoes da primeira caixa de dialogo
        Object [] tipos = {"Gerente", "Funcionario"};

        //inputs
        String resposta1, resposta2;
        double salario_bruto, salario_corrigido;

        //primeiro dialogo
        resposta1 = (String) JOptionPane.showInputDialog(null,
            "Selecione o tipo de funcionario:",
            "Por favor",
            JOptionPane.WARNING_MESSAGE,
            null,
            tipos,
            "Gerente"
        );

        resposta2 = (String) JOptionPane.showInputDialog(null,
            "Digite o salario do funcionario (com ponto):",
            "Por favor",
            JOptionPane.QUESTION_MESSAGE //icon
        );

            salario_bruto = Double.parseDouble(resposta2);

                switch(resposta1) {
                    case "Gerente":
                                salario_corrigido = salario_bruto * 1.15;
                                break;

                    case "Funcionario":
                                salario_corrigido = salario_bruto * 1.075;
                                break;

                    default:
                            salario_corrigido = 0.0;
                }

                JOptionPane.showMessageDialog(null,
                    "O salario corrigo é de R$ " + salario_corrigido
                    );
    }
}
