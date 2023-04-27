public class GestanteHipertensa extends Gestante{


    private float valorminimo;
    public GestanteHipertensa(String nome, int numeroHistorico, int idade, float valorminimo) {

        super(nome, numeroHistorico, idade);
        this.valorminimo =valorminimo;
    }

    @Override
    public boolean risco(){
      return (getValorminimo() >90) || super.risco();
    }
    public float getValorminimo() {
        return valorminimo;
    }



}
