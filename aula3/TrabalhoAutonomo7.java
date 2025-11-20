/*
7. Criar uma função que indica a nota qualitativa dada uma nota
quantitativa. Assuma as seguintes escalas: Excelente (90%-100%),
Muito bom (80%-90%), Bom (70%-80%), Suficiente (50%-70%),
Insuficiente (30%-50%) e Muito Insuficiente (0%-30%). Caso a nota dada
esteja fora da escala, deve retornar Nota inválida. (Ex: getGrade(67) ->
“Suficiente”, getGrade(102) -> “Nota inválida”).
 */

package aula3;
import java.util.Scanner;
public class TrabalhoAutonomo7 {

    public static void main(String[] args) {
        Scanner notafinal= new Scanner(System.in); // Cria o Scanner para ler input
        System.out.println("Qual o valor da nota?"); // Pede a nota ao utilizador
        int nota = notafinal.nextInt(); // Lê o número inteiro (nextInt) que o utilizador escreveu
        String resultado = getGrade(nota);// Chama a função getGrade com a nota e guarda o resultado
        System.out.println("A nota equivale a " +getGrade(nota));
    }

    public static String getGrade(int nota) {
            if (nota >= 90 && nota <= 100)
                return "Excelente";
            else if (nota >= 80 && nota <= 89)
                return "Muito Bom";
            else if (nota >= 70 && nota <= 79)
                return "Bom";
            else if (nota >= 50 && nota <= 69)
                return "Suficiente";
            else if (nota >= 30 && nota <= 49)
                return "Insuficiente";
            else if (nota >= 0 && nota <= 29)
                return "Muito Insuficiente";
            else
                return "Nota inválida";
    }
}