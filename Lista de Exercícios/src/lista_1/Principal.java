package lista_1;

public class Principal {
	
	public static void main (String[] args) {
		
		/*1. Dada uma seq��ncia de n�meros inteiros n�o-nulos, seguida por 0, imprimir seus
		quadrados.*/
		int[] seq = {2,3,1,4,7,0};
		
		System.out.println("Sequencia original: ");
		for (int j = 0; j < seq.length; j++) {
	         System.out.print(seq[j] + " ");}
		System.out.println("\nSequencia ao quadrado:");
		for (int i = 0; i < seq.length; i++) {
	         System.out.print(Math.pow(seq[i], 2) + ", ");}
		
		/*2. Dado um n�mero inteiro positivo n, calcular a soma dos n primeiros n�meros inteiros
		positivos.*/
		
		int n = 9;		
		System.out.println("\nA soma dos n primeiros inteiros positivos eh: " + Contas.soma(n));
		 
		 
		/*3. Dado um n�mero inteiro positivo n, imprimir os n primeiros naturais �mpares.
		Exemplo: Para n=4 a sa�da dever� ser 1,3,5,7. */
		 
		n = 15;
		System.out.println("Os n primeiros naturais impares: ");
		for (int i = 1; i <= n; i++) {
			if (i%2 != 0) {
				System.out.print(i + ", ");
			}
		}
		
		/*4. Dados um inteiro x e um inteiro n�o-negativo n, calcular x^n. */
		int aux=8; n = 4;
		
		System.out.println("\nO valor de x elevado a n eh: " + Contas.elev(aux, n));
		
		/*4,5. Uma loja de discos anota diariamente durante o m�s de mar�o a quantidade de discos
		vendidos. Determinar em que dia desse m�s ocorreu a maior venda e qual foi a
		quantidade de discos vendida nesse dia. */
		int[] vendasDeMarco = {2,12,6,10,8,4,9,30,44,1,0,3,2,12,13,7,21,14,5,31,2,3,6,8,4,0,11,16,3,7,15};
		
		System.out.print("A maior venda ocorreu no dia " + Contas.discos(vendasDeMarco, true) + 
				", e a sua quantidade foi: " + Contas.discos(vendasDeMarco, false));
		
		/*5. Dados n e uma seq��ncia de n n�meros inteiros, determinar a soma dos n�meros pares. */
		double n2=Math.random() * 15; 
		
		System.out.println("\nA soma da sequencia de n inteiros pares eh: " + Contas.somaPares(n2));
		
		/*6. Dado um inteiro n�o-negativo n, determinar n!.*/
		n=5; 
		
		System.out.println ("O fatorial de n eh: "+ Contas.fato(n));
		
		/*7. Dados n e dois n�meros inteiros positivos i e j diferentes de 0, imprimir em ordem
		crescente os n primeiros naturais que s�o m�ltiplos de i ou de j e ou de ambos.*/
		n = 16; int i = 4; int j = 3;
		
		System.out.println("Os n primeiros naturais que s�o m�ltiplos de i ou de j e ou de ambos :");
		for (int x = 0; x <= n; x++) {
			if ((x % i == 0) || (x % j == 0)) {
				System.out.print(x + ", ");
			}
		}
		
		/*8. Dizemos que um n�mero natural � triangular se ele � produto de tr�s n�meros naturais
		consecutivos.
		Exemplo: 120 � triangular, pois 4.5.6 = 120.
		Dado um inteiro n�o-negativo n, verificar se n � triangular.*/
		n = 120; 
		
		if (Contas.tri(n) == n) { System.out.println("\nO numero "+n+" eh triangular."); }
		else { System.out.println("\nO numero "+n+" nao eh triangular."); }
		
		/*9.Dado um inteiro positivo n, verificar se n � primo.*/
		n = 89;
		
		if (Contas.primo(n)==2) {System.out.println("O numero "+n+" eh primo.");}
		else {System.out.println("O numero "+n+" nao eh primo.");}
		
		/*10. Dados dois n�meros inteiros positivos, determinar o m�ximo divisor comum entre eles
		usando o algoritmo de Euclides.*/
		int a = 24; int b = 9;
	
        System.out.println("O MDC entre "+a+" e "+b+" eh: "+Contas.mdc(a, b));
        
        /*11. Dizemos que um inteiro positivo n � perfeito se for igual � soma de seus divisores
		positivos diferentes de n.
		Exemplo: 6 � perfeito, pois 1+2+3 = 6.
		Dado um inteiro positivo n, verificar se n � perfeito.*/
        n=6;
        
        if (Contas.perf(n) == n) {System.out.println("O numero "+n+" eh perfeito !");}
        else {System.out.println("O numero "+n+" nao eh perfeito.");}
		
        /*12. Um matem�tico italiano da idade m�dia conseguiu modelar o ritmo de crescimento da
		popula��o de coelhos (1) atrav�s de uma seq��ncia de n�meros naturais que passou a
		ser conhecida como seq��ncia de Fibonacci ( 2). 
		Fa�a um programa que, dado n, calcula Fn.*/
        n=20;
        
        System.out.println("O "+n+"� numero da sequencia de Fibonacci eh: "+Contas.fib(10));
        
        /*13. Dizemos que um n�mero i � congruente m�dulo m a j se i % m = j % m.
		Exemplo: 35 � congruente m�dulo 4 a 39, pois
		35 % 4 = 3 = 39 % 4.
		Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j m�dulo
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
        
        /*14. Dado um n�mero natural na base bin�ria, transform�-lo para a base decimal.
		Exemplo:
		Dado 10010 a sa�da ser� 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.*/
        n = 10010;
        
        System.out.println("\nO numero binario "+n+" quando transformado em "
        		+ "decimal se torna: "+Contas.bina(n));
        
        /*15. Dado um n�mero natural na base decimal, transform�-lo para a base bin�ria.
		Exemplo: Dado 18 a sa�da dever� ser 10010.*/
        n = 18;
        
        System.out.println("O numero decimal "+n+" quando transformado em "
        		+ "binario se torna: "+Contas.deci(n));
        
        /*16. Dados tr�s n�meros naturais, verificar se eles formam os lados de um tri�ngulo
		ret�ngulo.*/
        a = 7; b = 25; int c = 24;
        
        if(Contas.catet(a, b, c)==true) {
        	System.out.println("Os numeros "+a+", "+b+" e "+c+" formam os lados de "
            		+ "um triangulo retangulo ");
        }
        else {System.out.println("Os numeros "+a+", "+b+" e "+c+" nao formam os "
        		+ "lados de um triangulo retangulo ");}
        
        /*17. Dados tr�s n�meros, imprimi-los em ordem crescente.*/
        a = 8; b = 7; c =9;
        
        System.out.println("Os numeros na ordem crescente sao: " + Contas.maiorMenor(aux, b, c, 1) + 
			", " + Contas.maiorMenor(aux, b, c, 2) +", " + Contas.maiorMenor(aux, b, c, 3));
        
        /*18. Qualquer n�mero natural de quatro algarismos pode ser dividido em duas dezenas
		formadas pelos seus dois primeiros e dois �ltimos d�gitos.
		Exemplos:
			� 1297: 12 e 97.
			� 5314: 53 e 14.
		Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz quadrada 
		seja a soma das dezenas formadas pela divis�o acima.
		Exemplo:
		raiz de 9801 = 99 = 98 + 0.1
		Portanto 9801 � um dos n�meros a ser impresso. */
        
        Contas.separa();
        
        /*1. Dados n e n seq��ncias de n�meros inteiros n�o-nulos, cada qual seguida por um 0,
		calcular a soma dos n�meros pares de cada seq��ncia.*/
        int[] n1seq = {7,2,4,6,3,0}; int[] n2seq = {8,34,6,1,35,9,0};
        
        Contas.somaSeq(n1seq, n2seq);
        
        /*2. Dado um n�mero inteiro positivo n, determinar todos os inteiros entre 1 e n que s�o
		comprimento da hipotenusa de um tri�ngulo ret�ngulo com catetos inteiros.*/
        n = 25;
        
        System.out.println("Os inteiros entre 1 e n, que sao comprimento da hipotenusa\n" + 
        		"de um tri�ngulo retangulo com catetos inteiros: ");
        Contas.piramid(n);
        
        /*3. Dados dois naturais m e n determinar, entre todos os pares de n�meros naturais (x,y)
		tais que x < m e y < n, um par para o qual o valor da express�o xy - x^2 + y seja 
		m�ximo e calcular tamb�m esse m�ximo.*/
        m =22; n = 15;
        
        Contas.expre(n, m);
        
        /*4. Dados n n�meros inteiros positivos, calcular a soma dos que s�o primos.*/
        n = 6;
        
        System.out.println("A soma dos numeros primos entre 0 e "+n+" eh: "+Contas.somaPrimos(n));
        
        /*5. Sabe-se que um n�mero da forma n^3 � igual a soma de n �mpares consecutivos.
		Exemplo: 13= 1, 23= 3+5, 33= 7+9+11, 43= 13+15+17+19,...
		Dado m, determine os �mpares consecutivos cuja soma � igual a n^3 para n assumindo
		valores de 1 a m.*/
        m = 10;
        
        System.out.println("Os �mpares consecutivos cuja soma � igual a n3 para n assumindo\r\n" + 
        		"valores de 1 a m sao: \n");
        Contas.impConse(m);
        
	}
}
