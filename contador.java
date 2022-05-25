public class contador extends numero {
    public void zerar(){
        super.setNumero(0);
    }
    public void incrementar(){
        super.setNumero(super.getNumero()+1);
    }
    public int retornar(){
        return super.getNumero();
    }
}
