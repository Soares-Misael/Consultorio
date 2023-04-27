import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Consultorio consultorio = new Consultorio();

           consultorio.addGestante("joakina", 143, 38);
           consultorio.addGestanteDiabetica("joane", 123, 30, 4.0f);
           consultorio.addGestanteHipertensa("Maria", 465, 39, 98);
           consultorio.addGestanteDiabetica("Helen", 689, 89, 9.0f);

           ArrayList<Gestante> gestantes = consultorio.getGestantes();

           for(Gestante g : gestantes){
                   System.out.printf("Gestante: %s \nIdade: %d\nRisco: %b\n", g.getNome(), g.getIdade(),g.risco());
               System.out.printf("_________________________________________________________\n");

           }


        System.out.printf("Total Risco : %d\n",consultorio.obterQuantidadeGestanteRisco());
        System.out.printf("Total: %d\n",consultorio.obterQuantidadeGestante());
        System.out.printf("Gestante: %s\n",consultorio.buscarGestante(123));
        System.out.printf("Gestantes de risco maior que 35 anos: %d\n", consultorio.obterQuantidadeGestanteRiscomaior35());
        System.out.printf("Gestante maior PTG: %s",consultorio.gestanteMaiorPTG());

    }
}