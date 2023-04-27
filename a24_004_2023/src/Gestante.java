import java.util.ArrayList;

public  class Gestante {
    private Gestante  gestante;
    private String nome;
    private Gestante g;
    private int numeroHistorico;
    private int idade;
    public String getNome() {
        return nome;
    }

    private  final ArrayList<Gestante> gestantes= new ArrayList<>();
    private  final ArrayList<GestanteDiabetica> gestanteDiabeticas= new ArrayList<>();
    public int getNumeroHistorico() {
        return numeroHistorico;
    }
    public int getIdade() {
        return idade;
    }
    private final ArrayList<Exame> exames = new ArrayList<>();


    public Gestante(String nome, int numeroHistorico, int idade) {
        this.nome = nome;
        this.numeroHistorico = numeroHistorico;
        this.idade = idade;
    }


    public boolean risco(){

       boolean resultado = false;
        for (Exame ex:exames){
            if (ex.getResultado()) {
                resultado = true;
            }
        }
       return resultado;
    }




}
