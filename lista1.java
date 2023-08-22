package exe01;

public class lista1 {
 
    public static void main(String[] args) {
       
        // Teste Exe1
        System.out.println(convertToDolar(1.0f) == 0.201207243f);
        System.out.println(convertToDolar(4.97f) == 1.0f);
        
        // Teste Exe2
        System.out.println(convertToReal(0) == 0.0f);
        System.out.println(convertToReal(1) == 4.97f);
        
        //Teste Exe3
        System.out.println(getParOuImpar(3) == "Impar");
        System.out.println(getParOuImpar(2) == "Par");
    }
    
    // Exercicio 1
    public static float convertToDolar(float valorEmReais) {
        float cotacaoDia = 4.97f;
        float resultadoConversaoReal = valorEmReais / cotacaoDia;
        return resultadoConversaoReal;
    }
    
    // Exercicio 2
     public static float convertToReal(float valorEmDolar) {
        float cotacaoDia = 4.97f;
        float resultadoConversaoDolar = valorEmDolar *  cotacaoDia;
        return resultadoConversaoDolar;
     }
     
     // Exercicio 3
     public static String getParOuImpar(int valor) {
         if (valor % 2==0){
             return "Par";
         }else {
             return "Impar";
         } // Ou pode ser feito como return valor % 2 == 0 ? "Par" : "Impar";
     }
}
