package parte1;

import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		// Este é um comentário em uma linha
		/* este 
		 * comentário 
		 * é em
		 * varias linhas
		 */
         // Comando de saida
		System.out.println("Hello\nWorld");
		System.out.println("Edmilson\tRoque");
		System.out.println(18);
		System.out.println("");
        // Variáveis e constantes  
        byte idade = 22;
        System.out.println(idade);
        short matricula =2058;
        System.out.println(matricula);
        int dinheiro = 5;
        System.out.println(dinheiro);
        long saldo = 51234567;
        System.out.println(saldo);
        float centavos =2.59f;
        System.out.println(centavos);
        double valorquebrado = 5.69;
        System.out.println(valorquebrado);
        //texto
        char letra = 'd';
        System.out.println(letra);
        String texto = "Senac Reference";
        System.out.println(texto);
        //boleanos
        boolean opcao = true;
        System.out.println(opcao);
        //imprimir uma frase com variavel
        byte idade1 = 22;
        System.out.println("a idade do aluno é: "+idade1+" Anos");
        // print formatado 
        // %d - inteiro. %s - String. %f - Float. %c - Caractere ... para pular uma linha apos a frase insira o \n 
        System.out.printf("a idade do aluno é de: %d anos\n", idade1);
        // operações matemáticas: somar => + subtrair -> multiplicar ->*
        // dividir
        int soma = 30 + 20;
        System.out.println(soma);
        int sub = 50 - 20;
        System.out.println(sub);
        int mult = 50 * 3;
        System.out.println(mult);
        int div = 50 / 2;
        System.out.println(div);
        int num1 = 20;
        int num2 = 30;
        int adicao = num1+num2;
        System.out.println(adicao);
        //Danzin mongol
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int number = input.nextInt();
        System.out.println(number);
        Scanner frase = new Scanner(System.in);
        System.out.println("Digite sua escola:");
        String escola = frase.nextLine();       
        System.out.printf("você estuda no %s ",escola);
       
        
        
        
       }
	
}