public class GestanteMais35 extends Gestante {
    private boolean exameAmneossintise;

    public GestanteMais35(String nome, int numeroHistorico, int idade, boolean exameAmneossintise) {
        super(nome,numeroHistorico, idade);
        this.exameAmneossintise = exameAmneossintise;

    }

    public boolean getExameAmneossintise() {
        return exameAmneossintise;
    }

    @Override
    public boolean risco(){
        return exameAmneossintise || super.risco();
    }
}
