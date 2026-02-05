import java.util.*;

public class AgendaContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Set<Integer>> contactos = new HashMap<>();

        String nombre;
        int numero;

        do {
            System.out.println("Escriba el nombre del contacto (o 'fin' para terminar):");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("fin")){
                System.out.println("Escriba el numero del contacto:");
                numero = sc.nextInt();
                sc.nextLine();
                if (!contactos.containsKey(nombre)){
                    contactos.put(nombre, new HashSet<>(numero)); //si el contacto no existe crea su clave con la lista para los valores
                }
                contactos.get(nombre).add(numero); //añade el valor a la lista de esa clave
            }
        } while (!nombre.equalsIgnoreCase("fin"));

        System.out.println();
        System.out.println("AGENDA TELEFÓNICA");
        for (String nombres : contactos.keySet()) {
            System.out.println(nombres + ": " + contactos.get(nombres));
        }

    }
}