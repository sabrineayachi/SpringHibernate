package persistance;
// Generated 15 oct. 2016 16:32:47 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;

/**
 * Client generated by hbm2java
 */
public class Client  implements java.io.Serializable {


     private int idclient;
     private String adress;
     private String nom;
     private String prenom;
     private Integer tel;
     private Set reservations = new HashSet(0);

    public Client() {
    }

	
    public Client(int idclient) {
        this.idclient = idclient;
    }
    public Client(int idclient, String adress, String nom, String prenom, Integer tel, Set reservations) {
       this.idclient = idclient;
       this.adress = adress;
       this.nom = nom;
       this.prenom = prenom;
       this.tel = tel;
       this.reservations = reservations;
    }
   
    public int getIdclient() {
        return this.idclient;
    }
    
    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }
    public String getAdress() {
        return this.adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Integer getTel() {
        return this.tel;
    }
    
    public void setTel(Integer tel) {
        this.tel = tel;
    }
    public Set getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set reservations) {
        this.reservations = reservations;
    }




}


