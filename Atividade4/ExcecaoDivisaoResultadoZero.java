package Atividade4;

public class ExcecaoDivisaoResultadoZero extends Exception {
    @Override
    public String getMessage(){
        return "O resultado é 0";
    }
    
}