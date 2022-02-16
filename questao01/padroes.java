/**
 * 1º Questão desafio Academia Capgemini 2022
 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A última linha não deve conter nenhum espaço.
 * 
 * @author: Edclydson Sousa
 */
public class padroes
{
/**
 * 
 * @param args
 */
    public static void main(String[] args) 
    {
        int qtndEstrelas = 6;
        estrelinhas(qtndEstrelas);        
    }
    /**
     * 
     * @param estrelas
     */
    public static void estrelinhas(int estrelas)
    {
        for(int indiceExt = 1; indiceExt <= estrelas;indiceExt++)
        {
            for(int indiceInt = 1;indiceInt<=indiceExt;indiceInt++){System.out.print("*");}
            System.out.println("");
        }
    }
}