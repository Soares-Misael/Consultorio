import java.util.ArrayList;

public class Consultorio {
    //   private Gestante  gestante;
    private final ArrayList<Gestante> gestantes = new ArrayList<>();
    //private final ArrayList<GestanteDiabetica> gestanteDiabeticas = new ArrayList<>();


    public int obterQuantidadeGestanteRisco() {
        int contagem = 0;

        for (Gestante ex : gestantes) {
            if (ex.risco()) {
                contagem += 1;
            }
        }
        return contagem;
    }

    public int obterQuantidadeGestanteRiscomaior35() {
        int contador = 0;
        for (Gestante ex : gestantes) {
            if (ex.risco() && ex.getIdade() > 35) {
                contador += 1;
            }
        }
        return contador;
    }

    public int obterQuantidadeGestante() {
        int contagem = 0;

        for (Gestante ex : gestantes) {
            contagem += 1;
        }
        return contagem;
    }

    public void addGestante(String nome, int numeroHistorico, int idade) {
        Gestante novogestante = new Gestante(nome, numeroHistorico, idade);
        gestantes.add(novogestante);
    }

  /*  public void addGestanteMais35(String nome, int numeroHistorico, int idade, boolean exameAmneossintise){
        Gestante novogestante = new GestanteMais35(nome,numeroHistorico,idade,exameAmneossintise);
        gestantes.add(novogestante);
    }*/

    public void addGestanteDiabetica(String nome, int num_Historico, int idade, float resultadoPTG) {
        Gestante novogestante = new GestanteDiabetica(nome, num_Historico, idade, resultadoPTG);
        gestantes.add(novogestante);

    }

    public void addGestanteHipertensa(String nome, int numeroHistorico, int idade, float valorminimo) {
        Gestante novogestante = new GestanteHipertensa(nome, numeroHistorico, idade, valorminimo);
        gestantes.add(novogestante);
    }

    public String buscarGestante(int numeroHistorico) {

        Gestante gestante = gestantes.get(0);
        for (int i = 0; i < gestantes.size(); i++) {
            if (numeroHistorico == gestantes.get(i).getNumeroHistorico()) {
                gestante = gestantes.get(i);
            }
        }
        return gestante.getNome();
    }

    public ArrayList<Gestante> getGestantes() {
        return gestantes;
    }

    public ArrayList<GestanteDiabetica> obterGestantesDiabeticas() {
        ArrayList<GestanteDiabetica> listagestantediabetica = new ArrayList<>();
        for (Gestante ex : gestantes) {
            if (ex instanceof GestanteDiabetica diabetica) {
                listagestantediabetica.add(diabetica);
            }
        }
        return listagestantediabetica;
    }

    public String gestanteMaiorPTG() {
        ArrayList<GestanteDiabetica> gestanteDiabeticas = obterGestantesDiabeticas();
        GestanteDiabetica gestante = gestanteDiabeticas.get(0);
        float maiorPTG = 0.0f;
        for (int i = 0; i < gestanteDiabeticas.size(); i++) {
            if (gestante.getResultadoPTG() > maiorPTG) {
                gestante = gestanteDiabeticas.get(i);
            }
        }
        return gestante.getNome();
    }
}


