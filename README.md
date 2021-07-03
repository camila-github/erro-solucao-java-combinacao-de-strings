## Exercicio (Java): Combinação de strings

O exercicio publicado é referente ao treinamento do Bootcamp Java - Resolvendo Algoritmos com Java 
(https://digitalinnovation.one)


#### Descrição do Desafio:

Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string. 

Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string e continuar dessa forma sucessivamente.

As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.

#### Entrada: 

A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.

#### Saída: 

Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.

Exemplos de Entrada  | Exemplos de Saída
------------- | -------------
2 | aBAb
aA Bb | abab
aa bb

#### Java　

```java
//SOLUCAO 1

import java.util.Scanner;

public class CombinacaoDeStrings {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int numeroDeCasos = Integer.parseInt(scan.nextLine());         
        
    for(int i = 1; i <= numeroDeCasos; i++) {
      StringBuilder verificarString = new StringBuilder();
      String[] arrayString = scan.nextLine().split(" ");
        
      int tamanhoMaximoString = Math.max (arrayString[0].length(), arrayString[1].length());
            
      for(int x = 0; x < tamanhoMaximoString; x++) {
        if(x < arrayString[0].length()) verificarString.append(arrayString[0].charAt(x));
        if(x < arrayString[1].length()) verificarString.append(arrayString[1].charAt(x));
      }
      System.out.println(verificarString.toString());
    }
  }
}
```

