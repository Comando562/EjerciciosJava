public class Main {
    public static void main(String[] args) {

        Main  app = new Main();
        app.metodo("parametros");  //app.FizzBuzz();
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


}