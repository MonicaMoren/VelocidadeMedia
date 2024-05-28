public class Main {
  public static void main(String[] args) {
System.out.println ("Potencia e Consumo Eletrico");
    System.out.println("");
System.out.println("Exercício");
    System.out.println("");
System.out.println("1) Uma TV de 200 watts fica ligada aproximadamente 5horas diariamente. Determine o consumo elétrico mensal da TV?");
    System.out.println("");
    System.out.println("####################");
    System.out.println("#      Formula     #");
    System.out.println("# Potencia x Tempo #");
    System.out.println("# ---------------- #");
    System.out.println("#       1000       #");
    System.out.println("####################");

    System.out.println("");

    System.out.println("Primeiro Valor");
    int Potencia = 200 ;
    System.out.println(Potencia);

    System.out.println("");

    System.out.println("Segundo Valor");
    int Tempo = 5 ;
    System.out.println(Tempo);//

    System.out.println("");

    System.out.println("Preste Atenção que no enunciado está dizendo MENSALMENTE, ou seja 1 mes = 30 dias");

    System.out.println("");

    System.out.println("Terceiro Valor");
    int Mensalmente = 30 ;
    System.out.println(Mensalmente);

    System.out.println("");

    int ValorTempo = Mensalmente * Tempo ;
    System.out.println(ValorTempo);

    System.out.println("");

    System.out.println("Agora que você tem o valor do Tempo inteiro faz aplica a formula Potencia x tempo");

    System.out.println("");

int Resultado = ValorTempo * Potencia ; 
    System.out.println(Resultado);

  System.out.println("");

    System.out.println("Agora você irá dividir por 1000 de acordo com a Formula");

    int valorFormula = 1000;

int ResultadoFinal = Resultado / valorFormula ;
    System.out.println(ResultadoFinal);
     System.out.println("O resultado final vai ser 30watts de consumo eletrico");

}
}