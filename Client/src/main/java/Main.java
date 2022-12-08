import com.baeldung.soap.ws.client.generated.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service1 service = new Service1();
        IService1 iService = service.getBasicHttpBindingIService1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenue ! Veuillez saisir une adresse de départ: ");
        String origine = scanner.nextLine();
        System.out.println("Veuillez saisir une adresse d'arrivée: ");
        String destination = scanner.nextLine();
        System.out.println("Veuillez patienter, nous recherchons un itinéraire...");
        iService.getItineraireActivemq(origine, destination);

        Client client = new Client();

        client.run();


        /*
        Itineraire itineraire = iService.getItineraire(origine, destination);

        if (itineraire.isErreur()) {
            System.out.println("Erreur, nous n'avons pas trouvé d'itinéraire.");
        } else {
            System.out.println();
            System.out.println(" -----------------------");
            System.out.println();
            for (Paths paths : itineraire.getEtape1().getValue().getPaths().getValue().getPaths()) {
                getInstructions(paths);
            }
            System.out.println();
            System.out.println(" --- Prenez un vélo ---");
            System.out.println();
            for (Paths paths : itineraire.getEtape2().getValue().getPaths().getValue().getPaths()) {
                getInstructions(paths);
            }
            System.out.println();
            System.out.println(" --- Reposez le vélo ---");
            System.out.println();
            for (Paths paths : itineraire.getEtape3().getValue().getPaths().getValue().getPaths()) {
                getInstructions(paths);
            }
            System.out.println();
            System.out.println(" -----------------------");
            System.out.println();
        }
        */

    }
}


