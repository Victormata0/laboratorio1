/*
 * 
 */
package washingsimulator;

/**
 *
 * @author Merari Angélica Perdomo
 *          Victor Rafael Mata
 */
public class WashingSimulator {
    
    //Definición y inicialización de variables
    // Código realizado por Victor
    private int kilos=0, Llenado=0,typeClothe=0, completeWash=0, Secado=0;
    
    // Diferenciación entre las variables del método
    //Ayuda a buscar las variables que el usuario nos brinda con las de la clase
    //Código Realizado por Victor
    public WashingSimulator(int kilos, int tipoRopa)
    {
        this.kilos= kilos;
        this.typeClothe=tipoRopa;
    }
    
    //Inicialización del método llenado
    //Este método ayuda a iniciar el ciclo del lavado
    //Código hecho por Merari
    private void Llenado()
    {
        if(kilos<=20)
        {
         completeWash=1;
         System.out.println("Llenando...");
         System.out.println("LLenado realizado");
        }else
        {
            System.out.println("Reduce la carga para comenzar el llenado");
        }
    }
    //Inicialización del método lavado
    //Este método inicializa el ciclo llamado lavado en el simulador
    //Código hecho por Merari
    private void Lavado()
    {
        Llenado();
        if(completeWash==1)
        {
            if(typeClothe==1)
            {
                System.out.println("Ropa blanca / modo smooth activado");
                System.out.println("Lavando...");
                completeWash=1;
            } else if(typeClothe==2)
            {
                System.out.println("Ropa colorida / Lavado con potencia");
                System.out.println("Lavando...");
                completeWash=1;
            } else
            {
                System.out.println("Este tipo de ropa no esta disponible");
                System.out.println("Se lavará en formato lavado rápido");
            }
        }
    }
    //Inicialización de método secado 
    //Código hecho por Victor
    private void Secado()
    {
        Lavado();
        if(completeWash==1)
        {
            System.out.println("Comenzando secado...");
            System.out.println("Ciclo de secado terminado");
            Secado=1;
        }
    }
    //Inicialización de método finalizado del ciclo
    //Código hecho por Victor
    public void CicloFinal()
    {
        Secado();
        if(Secado==1)
        {
            System.out.println("El lavado ha finalizado");
        }
    }
    //Inicio de entradas get y set
    //Código hecho por Merari
    public int getTC()
    {
        return typeClothe;
    }
    public void setTC(int typeClothe)
    {
        this.typeClothe= typeClothe;
    }
}

