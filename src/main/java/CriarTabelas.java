
import java.util.Date;
import javax.persistence.Persistence;

public class CriarTabelas {

    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("desembolsoPU");

//        Date hoje = new Date();
//        Date ontem = new Date(2016, 05, 26);
//        System.out.println(hoje);
//        System.out.println(ontem);
//        System.exit(0);
        
    }

}

