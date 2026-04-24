import java.util.ArrayList;
public class Commande {
    public enum Statut {
        EN_ATTENTE, EN_PREPARATION, PRETE, LIVREE, ANNULEE
    }
    private int id;
    private Etudiant etudiant;
    private ArrayList<Plat> panier;
    private double total;
    private Statut statut;
    public Commande() { this.panier = new ArrayList<>(); }
    public Commande(int id, Etudiant etudiant) {
        this.id = id; this.etudiant = etudiant;
        this.panier = new ArrayList<>();
        this.statut = Statut.EN_ATTENTE;
    }
    public void ajouterPlat(Plat p) {}
    public double calculerTotal() { return 0; }
    public boolean passerCommande() { return false; } // logique Sprint 2
    public boolean annulerCommande() { return false; }
    public void afficherDetails() {}
    // getters/setters
}