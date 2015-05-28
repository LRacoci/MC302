package fullApp;

import java.util.Scanner;

public class Main {

    public static final String root_dir = "bin/textFiles/";
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresse o tipo de personagem: ");
        String tipo = teclado.nextLine();
        teclado.close();

        IDirector dir;
        IBuilder builder = null;

        switch(tipo.toLowerCase())
        {
            case "soldier":
                builder =  new BuilderSoldier();
                dir =  new Director(builder);
                dir.construct();
                break;
            case "student":
                builder =  new BuilderStudent();
                dir =  new Director(builder);
                dir.construct();
                break;
            case "thief":
                builder =  new BuilderThief();
                dir =  new Director(builder);
                dir.construct();
                break;
            default:
                System.out.print("Tipo de personagem não suportado, por favor tente de novo");
                System.exit(1);
        }
        System.out.print(builder.getResult());
    }
}
