/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_lineasTelefonicas
 * Autor: Equipo Cupi2
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.lineasTelefonicas.mundo;

/**
 * Clase que representa la empresa.
 */
public class Empresa
{

    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * L�nea telef�nica n�mero 1.
     */
    private LineaTelefonica linea1;

    /**
     * L�nea telef�nica n�mero 2.
     */
    private LineaTelefonica linea2;

    /**
     * L�nea telef�nica n�mero 3.
     */
    private LineaTelefonica linea3;

    //-----------------------------------------------------------------
    // M�todos
    //-----------------------------------------------------------------

    /**
     * Inicializa las l�neas telef�nicas de la empresa. <br>
     * <b>post: </b> Se inicializaron las 3 l�neas telef�nicas.
     */
    public Empresa( )
    {
        linea1 = new LineaTelefonica( );
        linea2 = new LineaTelefonica( );
        linea3 = new LineaTelefonica( );
    }

    /**
     * Retorna la lnea 1.
     * @return Lnea 1.
     */
    public LineaTelefonica darLinea1( )
    {
        return linea1;
    }

    /**
     * Retorna la lnea 2.
     * @return Lnea 2.
     */
    public LineaTelefonica darLinea2( )
    {
        return linea2;
    }

    /**
     * Retorna la lnea 3.
     * @return Lnea 3.
     */
    public LineaTelefonica darLinea3( )
    {
        return linea3;
    }

    /**
	 * Retorna el nmero total de llamadas realizadas.
	 * @return Total de llamadas de las tres lneas.
	 */
	public int darTotalNumeroLlamadas( )
	{
        return linea1.darNumeroLlamadas() + linea2.darNumeroLlamadas() + linea3.darNumeroLlamadas();
	}

	/**
	 * Retorna el total de minutos consumidos.
	 * @return Total de minutos de las tres lneas.
	 */
	public int darTotalMinutos( )
	{
        return linea1.darNumeroMinutos() + linea2.darNumeroMinutos() + linea3.darNumeroMinutos();
	}

	/**
	 * Retorna el costo total de las llamadas realizadas.
	 * @return Costo total de las tres lneas.
	 */
	public double darTotalCostoLlamadas( )
	{        
        return linea1.darCostoLlamadas() + linea2.darCostoLlamadas() + linea3.darCostoLlamadas();
	}

	/**
	 * Retorna el costo promedio de un minuto, segn los minutos consumidos. <br>
	 * @return Costo promedio por minuto.
	 */
	public double darCostoPromedioMinuto( )
	{
        int totalMinutos = darTotalMinutos();
        if (totalMinutos == 0) {
            return Double.NaN;
        }
        return darTotalCostoLlamadas() / totalMinutos;
	}

	/**
     * Agrega una llamada local a la lnea telefnica 1 <br>
     * <b>post: </b> Se agreg la llamada a la lnea 1.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea1( int pMinutos )
    {
        linea1.agregarLlamadaLocal( pMinutos );
    }

    /**
     * Agrega una llamada local a la lnea telefnica 2. <br>
     * <b>post: </b> Se agreg la llamada a la lnea 2.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea2( int pMinutos )
    {
        linea2.agregarLlamadaLocal( pMinutos );
    }

    /**
     * Agrega una llamada local a la lnea telefnica 3. <br>
     * <b>post: </b> Se agrega la llamada a la lnea 3.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLocalLinea3( int pMinutos )
    {
        linea3.agregarLlamadaLocal( pMinutos );
    }

    /**
     * Agrega una llamada de larga distancia a la lnea telefnica 1. <br>
     * <b>post: </b> Se agrega la llamada a la lnea 1.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea1( int pMinutos )
    {
    	linea1.agregarLlamadaLargaDistancia( pMinutos );
    }

    /**
     * Agrega una llamada de larga distancia a la l�nea telef�nica 2. <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 2.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea2( int pMinutos )
    {
        linea2.agregarLlamadaLargaDistancia( pMinutos );
    }

    /**
     * Agrega una llamada de larga distancia a la lnea telefnica 3. <br>
     * <b>post: </b> Se agrega la llamada a la lnea 3.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaLargaDistanciaLinea3( int pMinutos )
    {
        linea3.agregarLlamadaLargaDistancia( pMinutos );
    }

    /**
     * Agrega una llamada a celular a la lnea telefnica 1. <br>
     * <b>post: </b> Se agrega la llamada a la lnea 1.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea1( int pMinutos )
    {
    	linea1.agregarLlamadaCelular( pMinutos );
    }

    /**
     * Agrega una llamada a celular a la l�nea telef�nica 2. <br>
     * <b>post: </b> Se agrega la llamada a la l�nea 2.
     * @param pMinutos N�mero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea2( int pMinutos )
    {
        linea2.agregarLlamadaCelular( pMinutos );
    }

    /**
     * Agrega una llamada a celular a la lnea telefnica 3. <br>
     * <b>post: </b> Se agrega la llamada a la lnea 3.
     * @param pMinutos Nmero de minutos de la llamada. pMinutos > 0.
     */
    public void agregarLlamadaCelularLinea3( int pMinutos )
    {
        linea3.agregarLlamadaCelular( pMinutos );
    }

    /**
     * Reinicia todas las lneas telefnicas.
     * <b>post: </b> Se reinici la llamada a la lnea 1, 2 y 3.
     */
    public void reiniciar( )
    {
        linea1.reiniciar( );
        linea2.reiniciar( );
        linea3.reiniciar( );
    }

    //-----------------------------------------------------------------
    // Puntos de Extensin
    //-----------------------------------------------------------------

    /**
     * Mtodo para la extensin 1.
     * @return Respuesta 1.
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * Mtodo para la extensin 2.
     * @return Respuesta 2.
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }

}
