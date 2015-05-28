package pt.c02classes.s01knowledge.s02app.actors;

public class Direction{
    String dir;
    int intfy(){
        switch(dir){
            case "leste":
                return 0;
            case "norte":
                return 1;
            case "oeste":
                return 2;
            case "sul":
                return 3;

        }
        return 5;
    }
    String stringficar(int in){
       switch(in){
           case 0:
               return "leste";
           case 1:
               return "norte";
           case 2:
               return "oeste";
           case 3:
               return "sul";

       }
       return "aqui";
   }


    public String revert(){
        return stringficar((intfy()+2)%3);
    }
    public String next(){
        return stringficar((intfy()+1)%3);
    }
    public String anterior(){
       return stringficar((intfy()-1)%3);
    }
}
