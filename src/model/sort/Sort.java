package model.sort;

public class Sort {

	/**
	 * Ordenar datos aplicando el algoritmo ShellSort
	 * @param datos - conjunto de datos a ordenar (inicio) y conjunto de datos ordenados (final)
	 */
	public static void ordenarShellSort( Comparable[ ] datos ) {
		if (datos.length < 2) break;
		
		int n;
		for( int medio = datos.length / 2; medio > 0; medio /= 2 )
		{
			for( int i = medio; i < datos.length; i++ )
			{
				Comparable tmp = datos[ i ];
				for( n = i; n >= medio && tmp.compareTo( datos[ n - medio ] ) < 0; n -= medio )
				{
					datos[ n ] = datos[ n - medio ];
				}
				datos[ n ] = tmp;
			}
		}
	}
}
