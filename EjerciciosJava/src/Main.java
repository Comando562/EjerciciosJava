import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main  app = new Main();
        app.metodo("parametro");  //app.FizzBuzz();
        //System.out.println(app.Palindromo("textoAEvaluar"));
    }

    public void FizzBuzz(){
        int n = 100;
        for(int i = 0; i < n; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else {
                System.out.println(i+"w");
            }
        }
    }

    public void Capicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();
        if(numberText.equals(reverseNumber)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es Capicua");
        }
    }

    public void DesordenarTexto(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }

    public void Volteartexto(){
        String palabra = "";
        int i;

        palabra ="Hola Mundo";
        for(i = palabra.length()-1; i >= 0 ; i --){ //Recorrer el arrego de la O a la H | -1 por el indice
            System.out.print(palabra.charAt(i)); // Todo se imprime en un mismo renglon
        }
        System.out.println("");
    }


}