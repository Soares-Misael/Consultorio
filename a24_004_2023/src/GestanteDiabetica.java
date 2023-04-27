import java.util.ArrayList;

public class GestanteDiabetica extends  Gestante {

    private float resultadoPTG;
    private final ArrayList<Gestante> gestantes = new ArrayList<>();

    public GestanteDiabetica(String nome, int num_Historico, int idade, float resultadoPTG) {
        super(nome, num_Historico, idade);
        this.resultadoPTG = resultadoPTG;

    }

    public boolean resultadoexamePTG() {
        boolean resultado = false;

        if (getResultadoPTG() > 4.4) {
            resultado = true;
        }
        return true;

    }

    public float gestanteMaiorPTG(){
    float maiorResultado = 0.0f;
        for(
    int i = 0;i<gestantes.size();i++)

    {
        if (getResultadoPTG() > maiorResultado) {
            maiorResultado = getResultadoPTG();
        }
    }
       return maiorResultado;
}
    @Override
    public boolean risco(){
        return  resultadoexamePTG() || super.risco();
    }

    public float getResultadoPTG() {
        return resultadoPTG;
    }
}
