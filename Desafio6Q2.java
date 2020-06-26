/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q2;

/**
 *
 * @author yasmi
 */
public class Desafio6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
       int idade, sexo, contPessoas, contMS100, maiorIdade, menorIdade;
        double salario, acSalario;
        contPessoas =  0 ; contMS100 =  0 ; acSalario =  0 ; menorIdade =  0 ;
        maiorIdade =  0 ;

        idade =  1 ;
        while (idade > =  0 ) {
            idade =  Inteiro . parseInt ( JOptionPane . showInputDialog ( " Inserir uma idade!!! \ n "
                    +  " Ou digite -1 para sair " ));
            if (idade > =  0 ) {
                if (contPessoas ==  0 ) {
                    maiorIdade = idade;
                    menorIdade = idade;
                }
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
                if (idade < menorIdade) {
                    menorIdade = idade;
                }
                sexo =  Inteiro . parseInt ( JOptionPane . showInputDialog ( " Informe o sexo!!! "
                        +  " \ n 1 - Feminino ou 2 - Masculino \ n Digite: " ));
                salario =  Duplo . parseDouble ( JOptionPane . showInputDialog ( " Informe o salário!!! "
                        +  " \ n Digite: " ));
                acSalario = acSalario + salario;
                contPessoas ++ ; 
                if (sexo ==  1  && salario <=  100 ) {
                    contMS100 ++ ; 
                }
            } mais {
                JOptionPane . showMessageDialog ( null , " até mais tchê! " );
            }
        }
        JOptionPane . showMessageDialog ( null , " Resultados \ n ------------- \ n "
         +  " A pesquisa contou com "  + contPessoas +  " pessoas entrevistadas \ n "
         +  " Média de Salários R $ "  + (acSalario / contPessoas) +  " \ n "
         +  " Quant. De mulheres com salário até R $ 100,00: "  + contMS100 +  " mulheres \ n "
         +  " Idade do novo grupo "  + menorIdade + " anos \ n "
         +  " Maior idade do grupo "  + maiorIdade + " anos " );
    }

}
}
