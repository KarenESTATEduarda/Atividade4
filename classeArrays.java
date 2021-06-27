public  class  classeArrays   {

    double [] array1 =  novo  double [ 10 ];
    double [] array2 =  novo  double [ 10 ];

    public  void  adicionaArray1 ( int  valor , int  posi çã o ) {
        if (posição > =  0  && posição <=  9 ) {
            matriz1 [posição] = valor;
        }
        if (posição <  0  || posição >  9 ) {
            Sistema . para fora . println ( " Por favor digite um valor valido (de 0 a 9) " );
        }
    }

    public  void  adicionaArray2 ( int  valor , int  posi çã o ) {
        if (posição > =  0  && posição <=  9 ) {
            matriz2 [posição] = valor;
        }
        if (posição <  0  || posição >  9 ) {
            Sistema . para fora . println ( " Por favor digite um valor valido (de 0 a 9) " );
        }
    }

    public  void  CalculaDivisaoArrays () throws  ExcecaoDivisaoResultadoZero {
        // array popula
        para ( int i =  0 ; i <  10 ; i ++ ) {
            adicionaArray1 (( int ) gerador0a99 (), i);
            adicionaArray2 (( int ) gerador0a99 (), i);
        }
        para ( int i =  0 ; i <  10 ; i ++ ) {
            tente {
                resultado duplo ;
                resultado = cálculo (matriz1 [i], matriz2 [i]);
                Sistema . para fora . println ( " Divisão "  + i +  " = "  + resultado);      
                lance  novo  ExcecaoDivisaoResultadoZero ();
            }
            catch ( ExcecaoDivisaoResultadoZero aex) {
                if (matriz1 [i] / matriz2 [i] ==  0 ) {
                    Sistema . para fora . println (aex);
                }
            }
            finalmente {
                Sistema . para fora . println ( " A = "  + matriz1 [i] +  " B = "  + matriz2 [i]);
            }
    }
    }
    
     gerador duplo  público 0a99 () {
        duplo mínimo =  0 ;
        máximo duplo =  99 ;
        double valorAleatorio =  Math . chão ( matemática . aleatório () * (máx - mín +  1 ) + mín);
        return valorAleatorio;
    }

    
     cálculo duplo estático  público ( duplo a , duplo b ) {   
        tente {
            duplo c = a / b;
        } catch ( ArithmeticException aex) {
            Sistema . para fora . println ( " Digite um número válido, não é possível dividir por 0. Erro: \ n "  + aex);
        }        
        return a / b;
    }
     
    public  double [] getArray1 () {
        return array1;
    }

    public  void  setArray1 ( double [] array1 ) {
        isso . matriz1 = matriz1;
    }

    public  double [] getArray2 () {
        return array2;
    }

    public  void  setArray2 ( double [] array2 ) {
        isso . matriz2 = matriz2;
    }

}
