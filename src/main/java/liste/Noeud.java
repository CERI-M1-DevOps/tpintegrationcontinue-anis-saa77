package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Constructeur de la classe Noeud.
     * Initialise un nouveau noeud avec un élément donné et un pointeur vers le noeud suivant.
     * @param e L'élément contenu dans ce noeud.
     * @param suivant Le noeud suivant dans la liste.
     */
    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Retourne l'élément contenu dans ce noeud.
     * @return L'élément du noeud.
     */
    public Object getElement() {
        return element;
    }

    /**
     * Modifie l'élément contenu dans ce noeud.
     * @param element Le nouvel élément à stocker dans le noeud.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Retourne le noeud suivant dans la liste.
     * @return Le noeud suivant.
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Modifie le noeud suivant dans la liste.
     * @param suivant Le nouveau noeud suivant.
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Retourne une représentation en chaîne de caractères de ce noeud.
     * @return Une chaîne de caractères représentant l'élément du noeud.
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
