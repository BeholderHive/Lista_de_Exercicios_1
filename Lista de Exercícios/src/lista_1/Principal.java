package lista_1;

public class Principal {
	
	public static void main (String[] args) {
		
		/*1. Dada uma seqüência de números inteiros não-nulos, seguida por 0, imprimir seus
		quadrados.*/
		int[] seq = {2,3,1,4,7,0};
		
		System.out.println("Sequencia original: ");
		for (int j = 0; j < seq.length; j++) {
	         System.out.print(seq[j] + " ");}
		System.out.println("\nSequencia ao quadrado:");
		for (int i = 0; i < seq.length; i++) {
	         System.out.print(Math.pow(seq[i], 2) + ", ");}
		
		/*2. Dado um número inteiro positivo n, calcular a soma dos n primeiros números inteiros
		positivos.*/
		
		int n = 9;		
		System.out.println("\nA soma dos n primeiros inteiros positivos eh: " + Contas.soma(n));
		 
		 
		/*3. Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
		Exemplo: Para n=4 a saída deverá ser 1,3,5,7. */
		 
		n = 15;
		System.out.println("Os n primeiros naturais impares: ");
		for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				System.out.print(i + ", ");
			}
		}
		
		/*4. Dados um inteiro x e um inteiro não-negativo n, calcular x^n. */
		int aux=8; n = 4;
		
		System.out.println("\nO valor de x elevado a n eh: " + Contas.elev(aux, n));
		
		/*4,5. Uma loja de discos anota diariamente durante o mês de março a quantidade de discos
		vendidos. Determinar em que dia desse mês ocorreu a maior venda e qual foi a
		quantidade de discos vendida nesse dia. */
		int[] vendasDeMarco = {2,12,6,10,8,4,9,30,44,1,0,3,2,12,13,7,21,14,5,31,2,3,6,8,4,0,11,16,3,7,15};
		
		System.out.print("A maior venda ocorreu no dia " + Contas.discos(vendasDeMarco, true) + 
				", e a sua quantidade foi: " + Contas.discos(vendasDeMarco, false));
		
		/*5. Dados n e uma seqüência de n números inteiros, determinar a soma dos números pares. */
		double n2=Math.random() * 15; 
		
		System.out.println("\nA soma da sequencia de n inteiros pares eh: " + Contas.somaPares(n2));
		
		/*6. Dado um inteiro não-negativo n, determinar n!.*/
		n=5; 
		
		System.out.println ("O fatorial de n eh: "+ Contas.fato(n));
		
		/*7. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem
		crescente os n primeiros naturais que são múltiplos de i ou de j e ou de ambos.*/
		n = 16; int i = 4; int j = 3;
		
		System.out.println("Os n primeiros naturais que são múltiplos de i ou de j e ou de ambos :");
		for (int x = 0; x <= n; x++) {
			if ((x % i == 0) || (x % j == 0)) {
				System.out.print(x + ", ");
			}
		}
		
		/*8. Dizemos que um número natural é triangular se ele é produto de três números naturais
		consecutivos.
		Exemplo: 120 é triangular, pois 4.5.6 = 120.
		Dado um inteiro não-negativo n, verificar se n é triangular.*/
		n = 120; 
		
		if (Contas.tri(n) == n) { System.out.println("\nO numero "+n+" eh triangular."); }
		else { System.out.println("\nO numero "+n+" nao eh triangular."); }
		
		/*9.Dado um inteiro positivo n, verificar se n é primo.*/
		n = 89;
		
		if (Contas.primo(n)==2) {System.out.println("O numero "+n+" eh primo.");}
		else {System.out.println("O numero "+n+" nao eh primo.");}
		
		/*10. Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles
		usando o algoritmo de Euclides.*/
		int a = 24; int b = 9;
	
        System.out.println("O MDC entre "+a+" e "+b+" eh: "+Contas.mdc(a, b));
        
        /*11. Dizemos que um inteiro positivo n é perfeito se for igual à soma de seus divisores
		positivos diferentes de n.
		Exemplo: 6 é perfeito, pois 1+2+3 = 6.
		Dado um inteiro positivo n, verificar se n é perfeito.*/
        n=6;
        
        if (Contas.perf(n) == n) {System.out.println("O numero "+n+" eh perfeito !");}
        else {System.out.println("O numero "+n+" nao eh perfeito.");}
		
        /*12. Um matemático italiano da idade média conseguiu modelar o ritmo de crescimento da
		população de coelhos (1) através de uma seqüência de números naturais que passou a
		ser conhecida como seqüência de Fibonacci ( 2). 
		Faça um programa que, dado n, calcula Fn.*/
        n=20;
        
        System.out.println("O "+n+"º numero da sequencia de Fibonacci eh: "+Contas.fib(10));
        
        /*13. Dizemos que um número i é congruente módulo m a j se i % m = j % m.
		Exemplo: 35 é congruente módulo 4 a 39, pois
		35 % 4 = 3 = 39 % 4.
		Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j módulo
		m.*/
        n=14; int m = 4; j = 39;
        System.out.println("Os " + n + " primeiros naturais congruentes a "
        + j + " modulo " + m + " sao: ");
        for (int f = 0; n != 0; f++) { 
			if (f % m == j % m) {
				System.out.print(f + ", ");
				n = n - 1;
		    }
		}
        
        /*14. Dado um número natural na base binária, transformá-lo para a base decimal.
		Exemplo:
		Dado 10010 a saída será 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.*/
        n = 10010;
        
        System.out.println("\nO numero binario "+n+" quando transformado em "
        		+ "decimal se torna: "+Contas.bina(n));
        
        /*15. Dado um número natural na base decimal, transformá-lo para a base binária.
		Exemplo: Dado 18 a saída deverá ser 10010.*/
        n = 18;
        
        System.out.println("O numero decimal "+n+" quando transformado em "
        		+ "binario se torna: "+Contas.deci(n));
        
        /*16. Dados três números naturais, verificar se eles formam os lados de um triângulo
		retângulo.*/
        a = 7; b = 25; int c = 24;
        
        if(Contas.catet(a, b, c)==true) {
        	System.out.println("Os numeros "+a+", "+b+" e "+c+" formam os lados de "
            		+ "um triangulo retangulo ");
        }
        else {System.out.println("Os numeros "+a+", "+b+" e "+c+" nao formam os "
        		+ "lados de um triangulo retangulo ");}
        
        /*17. Dados três números, imprimi-los em ordem crescente.*/
        a = 8; b = 7; c =9;
        
        System.out.println("Os numeros na ordem crescente sao: " + Contas.maiorMenor(aux, b, c, 1) + 
			", " + Contas.maiorMenor(aux, b, c, 2) +", " + Contas.maiorMenor(aux, b, c, 3));
        
        /*18. Qualquer número natural de quatro algarismos pode ser dividido em duas dezenas
		formadas pelos seus dois primeiros e dois últimos dígitos.
		Exemplos:
			• 1297: 12 e 97.
			• 5314: 53 e 14.
		Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz quadrada 
		seja a soma das dezenas formadas pela divisão acima.
		Exemplo:
		raiz de 9801 = 99 = 98 + 0.1
		Portanto 9801 é um dos números a ser impresso. */
        
        Contas.separa();
        
        /*1. Dados n e n seqüências de números inteiros não-nulos, cada qual seguida por um 0,
		calcular a soma dos números pares de cada seqüência.*/
        int[] n1seq = {7,2,4,6,3,0}; int[] n2seq = {8,34,6,1,35,9,0};
        
        Contas.somaSeq(n1seq, n2seq);
        
        /*2. Dado um número inteiro positivo n, determinar todos os inteiros entre 1 e n que são
		comprimento da hipotenusa de um triângulo retângulo com catetos inteiros.*/
        n = 25;
        
        System.out.println("Os inteiros entre 1 e n, que sao comprimento da hipotenusa\n" + 
        		"de um triângulo retangulo com catetos inteiros: ");
        Contas.piramid(n);
        
        /*3. Dados dois naturais m e n determinar, entre todos os pares de números naturais (x,y)
		tais que x < m e y < n, um par para o qual o valor da expressão xy - x^2 + y seja 
		máximo e calcular também esse máximo.*/
        m =22; n = 15;
        
        Contas.expre(n, m);
        
        /*4. Dados n números inteiros positivos, calcular a soma dos que são primos.*/
        n = 6;
        
        System.out.println("A soma dos numeros primos entre 0 e "+n+" eh: "+Contas.somaPrimos(n));
        
        /*5. Sabe-se que um número da forma n^3 é igual a soma de n ímpares consecutivos.
		Exemplo: 13= 1, 23= 3+5, 33= 7+9+11, 43= 13+15+17+19,...
		Dado m, determine os ímpares consecutivos cuja soma é igual a n^3 para n assumindo
		valores de 1 a m.*/
        m = 10;
        
        System.out.println("Os ímpares consecutivos cuja soma é igual a n3 para n assumindo\r\n" + 
        		"valores de 1 a m sao: \n");
        Contas.impConse(m);
        
	}
}
