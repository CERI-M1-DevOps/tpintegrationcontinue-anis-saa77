package liste;

public class ListeSimple {

    private long size;
    Noeud tete;

    /**
     * Retourne la taille actuelle de la liste.
     * @return La taille de la liste.
     */
    public long getSize() {
        return size;
    }

    /**
     * Ajoute un nouvel élément au début de la liste.
     * @param element L'élément à ajouter.
     */
    public void ajout(int element) {
        tete = new Noeud(element, tete);
        size++;
    }

    /**
     * Modifie la première occurrence d'un élément dans la liste.
     * @param element L'élément à rechercher.
     * @param nouvelleValeur La nouvelle valeur à attribuer.
     */
    public void modifiePremier(Object element, Object nouvelleValeur) {
        Noeud courant = tete;
        while (courant != null && courant.getElement() != element)
            courant = courant.getSuivant();
        if (courant != null)
            courant.setElement(nouvelleValeur);
    }

    /**
     * Modifie toutes les occurrences d'un élément dans la liste.
     * @param element L'élément à rechercher.
     * @param nouvelleValeur La nouvelle valeur à attribuer aux éléments trouvés.
     */
    public void modifieTous(Object element, Object nouvelleValeur) {
        Noeud courant = tete;
        while (courant != null) {
            if (courant.getElement() == element)
                courant.setElement(nouvelleValeur);
            courant = courant.getSuivant();
        }
    }

    /**
     * Supprime la première occurrence d'un élément dans la liste.
     * @param element L'élément à supprimer.
     */
    public void supprimePremier(Object element) {
        if (tete != null) {
            if (tete.getElement() == element) {
                tete = tete.getSuivant();
                size--;
                return;
            }
            Noeud precedent = tete;
            Noeud courant = tete.getSuivant();
            while (courant != null && courant.getElement() != element) {
                precedent = precedent.getSuivant();
                courant = courant.getSuivant();
            }
            if (courant != null) {
                precedent.setSuivant(courant.getSuivant());
                size--;
            }
        }
    }

    /**
     * Retourne une représentation en chaîne de caractères de la liste.
     * @return Une chaîne de caractères représentant les éléments de la liste.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder("ListeSimple(");
        Noeud n = tete;
        while (n != null) {
            sb.append(n);
            n = n.getSuivant();
            if (n != null)
                sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}
