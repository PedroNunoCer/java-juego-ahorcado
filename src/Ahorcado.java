import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner para que el usuario escriba
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos;
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        //Estructura de control: iterativa o bucle
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        //Estructura de control: iterativa o bucle
        while(!palabraAdivinada && intentos < intentosMaximos){

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) +  " (" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra, por favor");
            
            //clase scanner para solicitar letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            //Estructura de control: iterativa o bucle
            for (int i = 0; i < palabraSecreta.length(); i++) {
                
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;

                }

            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }
            
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades! has adiviando la palabra secreta: " + palabraSecreta);
            }

        }

        if(!palabraAdivinada){
            System.out.println("Que pena, te has quedado sin intentos! Intentalo de nuevo");
        }
        scanner.close();
    }
}
