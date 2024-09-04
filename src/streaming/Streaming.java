package streaming;



import java.util.Scanner;

/**
 *
 * @author Aron
 */
public class Streaming {

    public static void main(String[] args) {

        Cancion cancion1 = new Cancion("Song 1", "Artist 1", 250, true, true);

        try (
                Scanner scanner = new Scanner(System.in)) {

            cancion1.imprimirDetalles();

            System.out.print("Ingrese la cantidad de segundos para adelantar la canción: ");
            int segundos = scanner.nextInt();

            cancion1.adelantar(segundos);

            cancion1.imprimirDetalles();

            System.out.println("La canción " + cancion1.getTitulo() + " es: " + cancion1.esLarga());

        }
    }
}