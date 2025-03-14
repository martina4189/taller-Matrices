import java.util.Scanner;
import java.util.Stack;

public class parqueadero {

    public static void main(String[] args) {

        metodos m = new metodos();
        boolean continuar = true;
        int opt2 = 0;
        Scanner sc = new Scanner(System.in);
        Stack<Vehiculo> pila = m.LLenarPila();
        m.MostrarPila(pila);
        int opt = 0;
        while (continuar) {
            System.out.println("ingrese 1 si desea eliminar");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                
                    m.Retiro(pila, opt);
                    break;
                
                default:
                    System.out.println("pagina en mantenimiento ");
                    break;
            }

            System.out.println("deseas intentar de nuevo 1: si ,2: no");
            opt2 = sc.nextInt();
            if (opt2 == 2) {
                continuar = false;
            }
        }

    }

};