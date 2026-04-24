package com.campuseat.models;

public class Etudiant {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private double solde;
    private boolean connecte;

    public Etudiant() {}

    public Etudiant(String nom, String prenom, String email, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.solde = 0.0;
        this.connecte = false;
    }

    // Prompt IA Sprint 2 : "Implémente la méthode sInscrire() en Java pour une 
    // classe Etudiant. Elle doit valider que le nom n'est pas vide, que l'email 
    // contient '@', et que le mot de passe a au moins 6 caractères."
    public boolean sInscrire() {
        if (nom == null || nom.isEmpty()) {
            System.out.println("❌ Erreur : le nom ne peut pas être vide.");
            return false;
        }
        if (!email.contains("@")) {
            System.out.println("❌ Erreur : email invalide.");
            return false;
        }
        if (motDePasse.length() < 6) {
            System.out.println("❌ Erreur : mot de passe trop court (min 6 caractères).");
            return false;
        }
        System.out.println("✅ Compte créé : " + prenom + " " + nom + " (" + email + ")");
        return true;
    }

    public boolean seConnecter(String emailSaisi, String mdpSaisi) {
        if (this.email.equals(emailSaisi) && this.motDePasse.equals(mdpSaisi)) {
            this.connecte = true;
            System.out.println("✅ Connexion réussie ! Bonjour " + prenom + " " + nom);
            return true;
        }
        System.out.println("❌ Email ou mot de passe incorrect.");
        return false;
    }

    public void rechargerSolde(double montant) {
        if (montant <= 0) { System.out.println("❌ Montant invalide."); return; }
        this.solde += montant;
        System.out.println("✅ Solde rechargé : +" + montant + " DT → Nouveau solde : " + solde + " DT");
    }

    public boolean debiterSolde(double montant) {
        if (montant > solde) {
            System.out.println("❌ Solde insuffisant. Solde actuel : " + solde + " DT");
            return false;
        }
        this.solde -= montant;
        System.out.println("✅ Paiement de " + montant + " DT effectué. Solde restant : " + solde + " DT");
        return true;
    }

    public void afficherProfil() {
        System.out.println("👤 Profil : " + prenom + " " + nom + " | Email : " + email + " | Solde : " + solde + " DT");
    }

    // Getters/Setters
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public double getSolde() { return solde; }
    public boolean isConnecte() { return connecte; }
}