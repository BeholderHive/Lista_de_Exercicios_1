package lista_1;

public class Contas {
	
	public static int soma(int n) {
		int aux=0;
		for (int i = 0; i <= n; i++) {
			aux = aux + (n - i);
		}
		return aux;
	}
	
	public static int elev(int x, int n) {
		int aux = x;
		
		for (int i=1; i < n; i++) {
			aux = aux * x;
		}		
		return aux;
	}
	
	public static int discos(int v[], boolean saida) {
		int aux=0; int contador=0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] > aux) {
				aux = v[i];
				contador = i;
			}
		}
		contador += 1;
		if (saida == true) {return contador;}
		else {return aux;}
	}
	
	public static int somaPares(double n) {
		int aux=0;
		
		for (int i = 1; i <= n; i++) {
			if (i%2 == 0) {
				aux = aux + i;
			}
		}
		return aux;
	}
	
	public static int fato(int n) {
		int aux = 0;
		
		aux = n -1;
		while (aux > 0){
			n *= aux;
			aux--;
		}
		return n;
	}
	
	public static int tri(int n) {
		int aux = 0;
		
		for (int i=1; i <= n; i++) {
			aux += i;
			if (aux >= n) { i = n+1;}
		}
		return aux;
	}
	
	public static int primo(int n) {
		int aux = 0;
		
		for (int i = 1; i <= n; i++) {
			if ((n%i)==0) { aux += 1; }
		}
		return aux;
	}
	
	public static int mdc(int a,int b) {
		int aux = 0;
		
		aux=a%b;
        while(aux!=0)
        {
            a = b;
            b = aux;
            aux = a%b; 
		}
		return b;
	}
	
	public static int perf(int n) {
		int aux = 0;
		
		for (int i = 1; i < n; i++) {
			if ((n%i)==0) { aux += i; }
		}
		return aux;
	}
	
	public static int fib(int n) {
        if(n==0)
           return 0;
        else if(n <= 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
     }
	
	public static int bina(int n) {
		int aux = 0; int x=1;
		  
		  while (n != 0){
		    aux = aux + n % 10 * x;
		    n = n / 10;
		    x = x * 2;
		  }
		return aux;
	}
	
	public static int deci(int n) {
		int aux = 0; int x=1; int rec;
		  
		while (n > 0) {
		    rec = n % 2;
		    n = n / 2; 
		    aux = aux + rec * x;
		    x = x * 10;
		  }
		return aux;
	}
	
	public static boolean catet(int x, int y, int z) {
		/* "a soma dos quadrados de seus catetos 
		corresponde ao quadrado de sua hipotenusa."*/
		/*hipotenusa é o maior numero*/
		int aux = 0; boolean resposta = false;
		
		aux = Math.max(x, Math.max(y, z));
		
		if (aux == x) { aux = 1;}
			else if(aux == y) {aux = x; x = y; y = aux;}
				else {aux = x; x = y; y = aux;}
		
		if (Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2)) {resposta = true;}
		  else {resposta = false;}
			  
		return resposta;
	}
	
	public static int maiorMenor(int x,int y, int z, int saida) {
		int maior=0; int menor=0; int meio=0;
		
		maior = Math.max(x, Math.max(y, z));
		menor = Math.min(x, Math.min(y, z));
		if (x != maior && x != menor) {meio = x; }
			else if (y != maior && x != menor) {meio = y;}
				else {meio = z;}
		
		if (saida == 1) {return menor;}
			else if (saida == 2){return meio;}
				else {return maior;}
	}
	
	public static void separa() {
		int esq = 0; int dir = 0;
		/*  "/"	Divisão Inteira:
		 * Retorna a parte inteira do quociente	4 / 3 retorna 1*/
		/* "%"	Módulo	Retorna o resto da divisão	8% 3 retorna 2*/
		System.out.println("Os milhares em questão são: ");
		for (int i=1000; i <= 9999; i++) {
			esq = i / 100; dir = i % 100;
			if(Math.sqrt(i) == esq + dir) {
				System.out.print(i + ", "); 
			}
		}		
	}
	
	public static void somaSeq(int[] a, int[] b) {
		int aux = 0;int cont=0; int[] fusao = {0,0,0,0,0,0,0,0,0};
		int s1=0; int s2 = 0;
		
		for (int i=0; i < a.length; i++) {
			if ((a[i] % 2) == 0) {
				s1 += a[i];
				fusao[cont] = a[i];
				cont++;
			}
		}
		
		for (int i=0; i < b.length; i++) {
			if ((b[i] % 2) == 0) {
				s2 += b[i];
				fusao[cont] = b[i];
				cont++;
			}
		}
		
		for (int i=0; i < fusao.length; i++) {
			aux += fusao[i];
		}
		
		System.out.println("\nA soma dos numeros pares da primeira sequencia eh: "+ s1);
		System.out.println("A soma dos numeros pares da segunda sequencia eh: "+ s2);
		System.out.println("A soma total dos numeros pares eh: "+ aux);
	}
	
	public static void piramid(int x) {
		/* "a soma dos quadrados de seus catetos 
		corresponde ao quadrado de sua hipotenusa."*/
		/*hipotenusa = o maior numero*/
		int y =0; int z=0; int aux = 0;
		
		for(int i=1; i <= x; i++) {

			if ((i*i) == (y*y) + (z*z)) {}
			
			for (y = 1; y <= i ; y++) {
			      z = y;
			      while (y*y + z*z < i*i) { z++;}
			      if ((y*y + z*z == i*i) && i != aux){
			    	  System.out.print(i+", ");
			    	  aux = i;
			      }
			}
		}
	}
	
	public static void expre(int n, int m) {
		int aux = 0; int x=0; int y=0; int aux2 = 0; int x2=0; int y2=0;
		 
		for (x = 0; x <= n; x++) {
			for (y = 0; y <= m; y++) {
				aux = x*y - x*x + y;
				if (aux > aux2) {
					aux2 = aux;
		            x2 = x;
		            y2 = y;
			    }
			}  
		}	  
		System.out.println("\nX maximo = "+x2+" , Y maximo = "+y2+" , Resultado maximo = "+aux2);
	}
	
	public static int somaPrimos(int n) {
		int aux=0; int aju;
		for (int i = 0; i < n; i++) {
			aju=0;
			for (int j = 1; j <= i; j++) {
				if ((i%j)==0) { aju ++; }
			}
			if (aju == 2) {aux +=  i;}
		}
		return aux;
	}
	
	public static void impConse(int m) {
		int aux=1; int n=0; int i = 0; int aux2=0;

		for (n = 1; n <= m; n++) {
			System.out.print(n+"*"+n+"*"+n+" = "+aux);
		    for (i = 1; i < n; i++) {
		    	aux2= aux + 2 * i;
		    	System.out.print("+"+aux2);}
		    aux += 2 * n;
		    System.out.println("\n");   
		}			
	}
}
