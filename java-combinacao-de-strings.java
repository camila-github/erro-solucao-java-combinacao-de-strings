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