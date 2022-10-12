import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Etudiant {
    private String nom;
    private float[] notes = new float[10];

    public static String litChaine() {
        String chaine = "";
        // Scanner sc = new Scanner(System.in);
        // chaine = sc.nextLine();
        // return chaine;
        try {
            chaine = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            System.out.println("Erreur de saisie");
        }
        return chaine;
    }
    public static float litFloat() {
        float flottant = 0;
        try {
            flottant = Float.parseFloat(litChaine());
        } catch (NumberFormatException e) {
            System.out.println("Erreur de saisie");
        }
        return flottant;
    }

    public Etudiant() {
        System.out.println("Entrez le nom de l'étudiant :");
        nom = litChaine();
        notes = new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Entrez la note " + (i + 1) + " :");
            notes[i] = litFloat();
        }
    }

    public Etudiant(String nom, float[] notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public float moyenne() {
        float somme = 0;
        for (float note : notes) {
            somme += note;
        }
        return somme / notes.length;
    }

    public boolean recu() {
        return moyenne() >= 10;
    }

    public void affiche() {
        System.out.println("Nom : " + nom);
        for(float note : notes) {
            System.out.println("Note : " + note);
        }
    }

}
