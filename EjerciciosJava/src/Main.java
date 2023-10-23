import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

    public void Fibonacci(){
        Scanner teclado = new Scanner(System.in);    //Scaner para ingresar datos
        int a = 0, b = 1, c ,n;                             //a Se inicializa en 0
        System.out.print("Por favor ingrese cantidad de elementos para la serie: ");  //Elementos que se van a calcular pedidos por el usuario
        n = teclado.nextInt();    //Dato se ingresa por teclado y se alamacena en la vairable n
        for (int i = 0; i < n; i++){//ciclo |1 varibale que se incializa en 0 | hasta cuando se va a repetir el ciclo | hasta que i sea menor que n | cuando se complan las dos anteriores se va incrementar en 1
            System.out.print(a);
            c = a + b;
            a = b;
            b = c; //b e sla suma de los dos digitos

        }
    }


}