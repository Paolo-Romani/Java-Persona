public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    /**
     * Costrutture dell'oggetto persona
     * @param nome
     * @param cognome
     * @param eta
     */
    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    /**
     * Metodo per modificare il nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo che restituisci l'attributo nome
     * @return
     */
    public String getNome() {
        return nome;
    }
    /**
     * Metodo per modificare il nome
     * @param cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    /**
     * Metodo che restituisci l'attributo cognome
     * @return
     */
    public String getCognome() {
        return cognome;
    }
    /**
     * Metodo per modificare il eta
     * @param eta
     */
    public void setEta(int eta) {
        this.eta = eta;
    }
    /**
     * Metodo che restituisci l'attributo eta
     * @return eta
     */
    public int getEta() {
        return eta;
    }
}
