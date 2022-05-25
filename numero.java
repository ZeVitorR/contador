public abstract class numero{
    private int numero;
    
    public numero() {
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public abstract void zerar();
    public abstract void incrementar();
    public abstract int retornar();
}