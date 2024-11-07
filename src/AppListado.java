import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppListado {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Se define la lista fuera del Ciclo While
        List<Persona> personas = new ArrayList<>();
        // Empezamos el menu
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(consola, personas);
            }catch (Exception e){

            }




            System.out.println();

        }


        }

        private static void mostrarMenu(){
        System.out.println("""
                **** Listado de personas APP ****
                
                1. Agregar
                2. Listar
                3. Salir
                
                """);

        System.out.print("Proporciona la opcion?");
        }



        private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;

        //Revisamos la opcion proporcionada
            switch (opcion){
                case 1 -> { // Agregar persona a la lista
                    System.out.print("Proporciona el nombre: ");
                    var nombre = consola.nextLine();
                    System.out.print("Proporcione el telefono: ");
                    var tel = consola.nextLine();
                    System.out.print("Proporcione el email: ");
                    var email = consola.nextLine();
                    // Crear objeto Persona

                    var persona = new Persona(nombre, tel, email);
                    // Lo agregamos a la lista
                    personas.add(persona);
                    System.out.println("La lista tiene: " + personas.size() + " elementos.");
                }//fin caso 1
             case 2 ->{  //Listar las personas
                 System.out.println("Listado de personas");
                 //Mejjora usando lambda y metodo de referencia
                 //personas.forEach((persona -> System.out.println(persona)));
                 personas.forEach(System.out::println);
             }   //Fin caso 2
             case 3 ->{ // Salimos de Ciclo
                 System.out.println("Hasta pronto....");
                 salir = true;

             }   // Fin caso 3
                default -> System.out.println("Opcion erronea: " + opcion);
            }//fin del switch
            return salir;

        }

    }
