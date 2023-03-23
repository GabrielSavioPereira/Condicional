package treinoProva;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.print("Digite o nome do aluno: ");
String nome = scan.nextLine();
System.out.print("Digite a primeira nota: ");
 float nota1 = scan.nextFloat();
System.out.print("Digite a segunda nota: ");
float nota2 = scan.nextFloat();
float media = (nota1 + nota2 )/2;
if (media >= 6 ) {
    System.out.printf("O aluno " +nome+" Foi Aprovado Com Media %.1f ",media);

}else{
    System.out.printf("O aluno "+nome+" Não Foi Aprovado Com Media %.1f",media);
    System.out.println();
    System.out.print("Digite a nota de recuperação do ");
    float notaRec = scan.nextFloat();
     
    if (notaRec >= 6){
        System.out.println("O Aluno " + nome+ " Recuperou A Media E Foi Aprovado");
     
    }else{
        System.out.println("O Aluno " + nome+ " Não Recuperou A Media E Foi Reprovado");
    }
   
    

    

  
}

    }
    
}
