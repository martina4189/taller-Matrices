import java.util.Scanner;
import java.util.Stack;
import javax.swing.JOptionPane;

public class metodos {

    int opt = 0;
    Scanner sc = new Scanner(System.in);

    public Stack<Vehiculo> LLenarPila() {

        Stack<Vehiculo> pila = new Stack<>();
        boolean bandera = true;
        String Placa;
        String NombreP;
        int Cilindraje;
        String Modelo;
        String Disponible;

        while (bandera) {

            System.out.println("ingrese la marca");
            Placa = (JOptionPane.showInputDialog("Ingrese la placa del vehiculo"));
            NombreP = (JOptionPane.showInputDialog("Ingrese nombre del propietario"));
            Cilindraje = (Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje")));
            Modelo = (JOptionPane.showInputDialog("Ingrese el modelo del vehiculo"));
            Disponible = (JOptionPane.showInputDialog("Ingrese si esta disponible : SI NO"));

            Vehiculo o = new Vehiculo(Placa, NombreP, Cilindraje, Modelo, Disponible);
            pila.push(o);
            System.out.println("Desea agregar mas vehiculos 1: SI, 2: NO");
           // mostrar pila
            while (!sc.hasNextInt()) {
                System.out.println("esto no es un dato numerico");
                sc.next();
            }
            opt = sc.nextInt();
            while (opt < 1 || opt > 2) {
                System.out.println("esa opcion no existe por favor valide nuevo ");
                opt = sc.nextInt();
            }
            if (opt == 2) {
                bandera = false;
            }

        }
        return pila;
    }

    public void MostrarPila(Stack<Vehiculo> pila) {
        for (Vehiculo o : pila) {
            System.out.println(o.getPlaca());
            System.out.println(o.getNombreP());
            System.out.println(o.getCilindraje());
            System.out.println(o.getModelo());
            System.out.println(o.getDisponible());
        }
    }

    public void Retiro(Stack<Vehiculo> pila, int opt) {
        String placa = "";
        boolean existe = false;
        if (opt == 1) {
            System.out.println("ingrese la placa que desea retirar");
        } else {
            System.out.println("ingrese la placa que desea Retirar");
        }

        placa = sc.next();
        if (opt == 1) {
            for (Vehiculo o : pila) {
                if (placa.equalsIgnoreCase(o.getPlaca())) {
                    System.out.println(o.getNombreP());
                    System.out.println(o.getCilindraje());
                    System.out.println(o.getModelo());
                    System.out.println(o.getModelo());
                    System.out.println(o.getDisponible());

                    existe = true;
                }

            }
            if (!existe) {
                System.out.println("la placa no existe o ne se encuentra");
            }
        } else {
            Stack<Vehiculo> pilaaux = new Stack<>();
            for (Vehiculo v : pila) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    pila.remove(v);
                    System.out.println("placa eliminada");

                }
            }
            while (!pilaaux.isEmpty()) {
                pila.push(pilaaux.pop());
            }
            MostrarPila(pila);

        }

    }
}
