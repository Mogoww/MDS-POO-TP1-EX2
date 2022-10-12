public class TestEtudiant {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant();
        // etudiant.affiche();
        //System.out.println("La moyenne de l'étudiant est : " + etudiant.moyenne());
        // System.out.println("L'étudiant est reçu : " + etudiant.recu());


        Etudiant etudiant2 = new Etudiant("Jean", new float[]{15, 11, 10, 0, 10, 20, 20});
        etudiant2.affiche();
        System.out.println("La moyenne de l'étudiant est : " + etudiant2.moyenne());
        System.out.println("L'étudiant est reçu : " + etudiant2.recu());
    }
}
