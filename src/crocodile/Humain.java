package crocodile;

public class Humain {
    private String nom;
    private int posx, posy;
    private int pointsdevie = 100;
    
    Humain(String nom) {
        this.nom = nom;
        this.posx =0;
        this.posy=0;
        System.out.println("Humain placé en "+this.posx+","+this.posy);
    }
    
    public void attaqueFatale(){
        System.out.println("Humain dévoré");
        this.pointsdevie = 0;
    }
    
    public void attaquePartielle(int val) throws IllegalArgumentException{
        System.out.println("Humain blessé");
        pointsdevie = pointsdevie - 50;
        if(val<0){
           throw new IllegalArgumentException("Nombre négatif pour un déplacement");
        }
    }
    
    public boolean aEteDevore(){
        return this.pointsdevie == 0;
    }
    
    public void deplacement(char direction) throws Exception {
        int newposx = posx;
        int newposy = posy;
        switch(direction) {
            case 'g' : newposx = this.posx - 1; break;
            case 'd' : newposx = this.posx + 1; break;
            case 'h' : newposy = this.posy - 1; break;
            case 'b' : newposy = this.posy + 1; break;
        }
        if(newposx < 0 || newposy < 0 || newposx > 49 || newposx > 29 ){
            throw new Exception("Déplacement impossible (hors limite)");
        }
        else {
            this.posx = newposx;
            this.posy = newposy;
            System.out.println("Déplacement en "+this.posx+","+this.posy);
        }
    }
    
    public String getNom() {
        return nom;
    }
    public int getPosx() {
        return posx;
    }
    public int getPosy() {
        return posy;
    }
    public int getPointsdevie() {
        System.out.println("Nombre de points de vie restants : "+pointsdevie);
        return pointsdevie;
    }
}