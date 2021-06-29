public class ExcecaoDivisaoResultadoZero extends Exception {
    @Override
    public String getMessage(){
        return "O resultado da divisão é 0";
    }
    
}