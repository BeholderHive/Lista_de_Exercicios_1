package Atividades;

public class Principal extends Origin {

    public static void main (String[] args) {
        Origin og= new Origin();

		/*1. Dada uma sequencia de numeros inteiros nao-nulos, seguida por 0, imprimir seus
		quadrados.*/
        int[] seq = {2,3,1,4,7,0};
        og.setSeq1(seq);


        System.out.println("Sequencia original: ");
        for (int j = 0; j < og.getSeq1().length; j++) {
            System.out.print(og.getSeq1()[j] + " ");}
        System.out.println("\nSequencia ao quadrado:");
        for (int i = 0; i < og.getSeq1().length; i++) {
            System.out.print(Math.round(Math.pow(og.getSeq1()[i], 2)) + ", ");}

		/*2. Dado um numero inteiro positivo n, calcular a soma dos n primeiros numeros inteiros
		positivos.*/

        og.setN(9);

        System.out.println("\nA soma dos n primeiros inteiros positivos eh: " + Brain.soma(og.getN()));


		/*3. Dado um numero inteiro positivo n, imprimir os n primeiros naturais impares.
		Exemplo: Para n=4 a saida devera ser 1,3,5,7. */

        og.setN(15);
        System.out.println("Os n primeiros naturais impares: ");
        for (int i = 1; i <= og.getN(); i++) {
            if (i%2 != 0) {
                System.out.print(i + ", ");
            }
        }

        /*4. Dados um inteiro x e um inteiro nao-negativo n, calcular 'x' elevado a 'n'. */
        og.setAux(8); og.setN(4);

        System.out.println("\nO valor de x elevado a n eh: " + Brain.elev(og.getAux(), og.getN()));

		/*4,5. Uma loja de discos anota diariamente durante o mês de março a quantidade de discos
		vendidos. Determinar em que dia desse mes ocorreu a maior venda e qual foi a
		quantidade de discos vendida nesse dia. */
        int[] vendasDeMarco = {2,12,6,10,8,4,9,30,44,1,0,3,2,12,13,7,21,14,5,31,2,3,6,8,4,0,11,16,3,7,15};
        og.setSeq1(vendasDeMarco);

        System.out.print("A maior venda ocorreu no dia " + Brain.discos(og.getSeq1(), true) +
                ", e a sua quantidade foi: " + Brain.discos(og.getSeq1(), false));

        /*5. Dados n e uma sequencia de n numeros inteiros, determinar a soma dos numeros pares. */

        og.setN((int) Math.round(Math.random() * 15));

        System.out.println("\nA soma da sequencia de n inteiros pares eh: " + Brain.somaPares(og.getN()));

        /*6. Dado um inteiro nao-negativo n, determinar n!.*/
        og.setN(5);

        System.out.println ("O fatorial de n eh: "+ Brain.fato(og.getN()));

		/*7. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem
		crescente os n primeiros naturais que sao multiplos de i ou de j e ou de ambos.*/
        og.setN(16); og.setA(4); og.setB(3);

        System.out.println("Os n primeiros naturais que são múltiplos de i ou de j e ou de ambos :");
        for (int x = 0; x <= og.getN(); x++) {
            if ((x % og.getA() == 0) || (x % og.getB() == 0)) {
                System.out.print(x + ", ");
            }
        }

		/*8. Dizemos que um numero natural eh triangular se ele eh produto de tres numeros naturais
		consecutivos.
		Exemplo: 120 eh triangular, pois 4.5.6 = 120.
		Dado um inteiro nao-negativo n, verificar se n eh triangular.*/
        og.setN(120);

        if (Brain.tri(og.getN()) == og.getN()) { System.out.println("\nO numero "
                +og.getN()+" eh triangular."); }
        else { System.out.println("\nO numero "+og.getN()+" nao eh triangular."); }

        /*9.Dado um inteiro positivo n, verificar se n eh primo.*/
        og.setN(89);

        if (Brain.primo(og.getN())==2) {System.out.println("O numero "
                +og.getN()+" eh primo.");}
        else {System.out.println("O numero "+og.getN()+" nao eh primo.");}

		/*10. Dados dois numeros inteiros positivos, determinar o maximo divisor comum entre eles
		usando o algoritmo de Euclides.*/
        og.setA(24); og.setB(9);

        System.out.println("O MDC entre "+og.getA()+" e "
                +og.getB()+" eh: "+ Brain.mdc(og.getA(), og.getB()));

        /*11. Dizemos que um inteiro positivo n eh perfeito se for igual ah soma de seus divisores
		positivos diferentes de n.
		Exemplo: 6 eh perfeito, pois 1+2+3 = 6.
		Dado um inteiro positivo n, verificar se n eh perfeito.*/
        og.setN(6);

        if (Brain.perf(og.getN()) == og.getN()) {System.out.println("O numero "
                +og.getN()+" eh perfeito !");}
        else {System.out.println("O numero "+og.getN()+" nao eh perfeito.");}

        /*12. Um matematico italiano da idade media conseguiu modelar o ritmo de crescimento da
		populacao de coelhos  atraves de uma sequencia de numeros naturais que passou a
		ser conhecida como sequencia de Fibonacci.
		Faça um programa que, dado n, calcula Fn.*/
        og.setN(20);

        System.out.println("O "+og.getN()+"º numero da sequencia " +
                "de Fibonacci eh: "+ Brain.fib(10));

        /*13. Dizemos que um numero i eh congruente modulo m a j se i % m = j % m.
		Exemplo: 35 eh congruente modulo 4 a 39, pois
		35 % 4 = 3 = 39 % 4.
		Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j modulo
		m.*/
        og.setN(14); og.setA(4); og.setB(39);
        System.out.println("Os " + og.getN() + " primeiros naturais congruentes a "
                + og.getB() + " modulo " + og.getA() + " sao: ");
        for (int f = 0; og.getN() != 0; f++) {
            if (f % og.getA() == og.getB() % og.getA()) {
                System.out.print(f + ", ");
                og.setN(og.getN() - 1);
            }
        }

        /*14. Dado um numero natural na base binaria, transforma-lo para a base decimal.
		Exemplo:
		Dado 10010 a saida sera 18, pois 1. 2 4 + 0. 2 3 + 0. 2 2 + 1. 2 1 + 0. 2 0 = 18.*/
        og.setN(10010);

        System.out.println("\nO numero binario "+og.getN()+" quando transformado em "
                + "decimal se torna: "+ Brain.bina(og.getN()));

        /*15. Dado um numero natural na base decimal, transforma-lo para a base binaria.
		Exemplo: Dado 18 a saida devera ser 10010.*/
        og.setN(18);

        System.out.println("O numero decimal "+og.getN()+" quando transformado em "
                + "binario se torna: "+ Brain.deci(og.getN()));

        /*16. Dados tres numeros naturais, verificar se eles formam os lados de um triangulo
		retangulo.*/
        og.setA(7); og.setB(25); og.setC(24);


        if(Brain.catet(og.getA(), og.getB(), og.getC())) {
            System.out.println("Os numeros "+og.getA()+", "+og.getB()+" " +
                    "e "+og.getC()+" formam os lados de um triangulo retangulo ");
        }
        else {System.out.println("Os numeros "+og.getA()+", "+og.getB()+" " +
                "e "+og.getC()+" nao formam os lados de um triangulo retangulo ");}

        /*17. Dados tres numeros, imprimi-los em ordem crescente.*/
        og.setA(8); og.setB(7); og.setC(9);

        System.out.println("Os numeros na ordem crescente sao: "
                + Brain.maiorMenor(og.getA(), og.getB(), og.getC(), 1) +
                ", " + Brain.maiorMenor(og.getA(), og.getB(), og.getC(), 2) +
                ", " + Brain.maiorMenor(og.getA(), og.getB(), og.getC(), 3));

        /*18. Qualquer numero natural de quatro algarismos pode ser dividido em duas dezenas
		formadas pelos seus dois primeiros e dois ultimos digitos.
		Exemplos:
			• 1297: 12 e 97.
			• 5314: 53 e 14.
		Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz quadrada
		seja a soma das dezenas formadas pela divisao acima.
		Exemplo:
		raiz de 9801 = 99 = 98 + 0.1
		Portanto 9801 eh um dos números a ser impresso. */

        Brain.separa();

        /*1. Dados n e n sequencias de numeros inteiros nao-nulos, cada qual seguida por um 0,
		calcular a soma dos numeros pares de cada sequencia.*/
        int[] a = {7,2,4,6,3,0}; int[] b = {8,34,6,1,35,9,0};
        og.setSeq1(a); og.setSeq2(b);

        Brain.somaSeq(og.getSeq1(), og.getSeq2());

        /*2. Dado um numero inteiro positivo n, determinar todos os inteiros entre 1 e n que sao
		comprimento da hipotenusa de um triangulo retângulo com catetos inteiros.*/
        og.setN(25);

        System.out.println("Os inteiros entre 1 e n, que sao comprimento da hipotenusa\n" +
                "de um triangulo retangulo com catetos inteiros: ");
        Brain.piramid(og.getN());

        /*3. Dados dois naturais m e n determinar, entre todos os pares de numeros naturais (x,y)
		tais que x < m e y < n, um par para o qual o valor da expressao xy - (x elevado a 2) + y seja
		maximo e calcular tambem esse maximo.*/
        og.setA(22); og.setB(15);

        Brain.expre(og.getB(), og.getA());

        /*4. Dados n numeros inteiros positivos, calcular a soma dos que sao primos.*/
        og.setN(6);

        System.out.println("A soma dos numeros primos entre 0 e "
                +og.getN()+" eh: "+ Brain.somaPrimos(og.getN()));

        /*5. Sabe-se que um número da forma ('n' elevado a '3') é igual a soma de n impares consecutivos.
		Exemplo: 13= 1, 23= 3+5, 33= 7+9+11, 43= 13+15+17+19,...
		Dado m, determine os impares consecutivos cuja soma eh igual a ('n' elevado a '3')
		para n assumindo valores de 1 a m.*/
        og.setA(10);

        System.out.println("Os ímpares consecutivos cuja soma é igual a n3 para n assumindo\r\n" +
                "valores de 1 a m sao: \n");
        Brain.impConse(og.getA());

    }
}
