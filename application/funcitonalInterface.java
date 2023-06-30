package application;
public class funcitonalInterface {
    @FunctionalInterface
    interface Diga{
        public String digaai();
    }
    public static void main(String[] args){
        Diga s = () -> {return "Eu não tenho nada a dizer.";};
        System.out.print(s.digaai());

    }

}

