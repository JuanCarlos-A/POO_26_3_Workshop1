import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
		
        return a+b; //Suma de Dos Numeros
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
      	
		// Condicionales 	
		if (a>= b && a >=c) {return a;}
    	if (b>=c) {return b;}
      	return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        // TODO: Implementar el método para retornar la tabla de multiplicar del número dado.
        // Ejemplo: Si numero = 2 y limite = 5, el resultado debería ser [2, 4, 6, 8, 10].

		// Declaracion de una lista de enteros para la tabla donde ya especifacmos el espacio
		int[] tabla = new int[limite];
		
		// Bucle para devolver una lista con la tabla de multiplicar comenzando con numero * 1
		for (int i = 0; i < limite; i++){
			// Asignamos los valores uno a uno comenzando en 0
			tabla[i] = numero * (i + 1);
		}
		return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        // TODO: Implementar el método para calcular el factorial de un número entero.
        // Ejemplo: Si n = 5, el resultado debería ser 120.
        // Lanzar IllegalArgumentException si n es negativo.

		// Condicional si n es negativo
		if (n < 0){throw new IllegalArgumentException("El numero " + n + " no puede ser negativo.");}

        // Condicional si n = 0
        if (n == 0) {return 1;}

        // Ciclo para factorial
        int i = 1; // Inicializamos la variable
        int facto = n;
        while(i < n){
            facto = facto * (n-i);
            i++;
        }

        return facto;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        // TODO: Implementar el método para verificar si un número es primo.
        // Ejemplo: Si numero = 7, el resultado debería ser true.
		// Condicional para asegurarnos que numero sea mayor a uno y cumpla el requisito de los numeros primos
		if (numero <= 1){ return false; }
		// Inicializamos la variable que aumentara para comprobar uno por uno que el numero no sea primo
		for (int divisor = 2; divisor < numero; divisor++){
			if((numero % divisor) == 0){return false;}
		}
			return true;
		}
	
    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        // TODO: Implementar el método para generar la serie de Fibonacci hasta el número n.
        // Ejemplo: Si n = 5, el resultado debería ser [0, 1, 1, 2, 3].
        // Lanzar IllegalArgumentException si n es negativo.
		
		// Condicional si n es negativo
		if (n < 0){throw new IllegalArgumentException("El numero " + n + " es negativo.");}

		// Inicializamos el arreglo y la variable para fibonacci
		int[] tabla = new int[n];
		int fib = 0;

		//Ciclo para generar la serie hasta el limite contenido en el parametro
		for (int i = 0; i < n; i++){
			tabla[i] = fib;
			if (fib == 0){
				fib++;
				continue;
			}
			fib = tabla[i-1] + fib;	
		}
        return tabla;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 15.

        // Inicializamos el contador
        int cont = 0;

        // Ciclo que ayudara a recorrer los elementos del arreglo y sumarlos
        for (int j : arreglo) {
            cont = cont + j;
        }

        return cont;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        // TODO: Implementar el método para calcular el promedio de los elementos de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 3.0.

        // Llamamos a la funcion de esta misma clase para tener la suma de los elementos, convertimos a double de forma implicita
        double sumaTotal = sumaElementos(arreglo);
        return sumaTotal / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento mayor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 5.

        // Inicializamos la variable para poder ir comparando
        int down = 0;
        int up = 0;
        int longitud = arreglo.length;

        // Ciclo para recorrer el arreglo hasta la mitad
        for (int i = 1; i <= Math.ceil((double) longitud / 2); i++){
            if (down < arreglo[i - 1]){ down = arreglo[i - 1]; } // Condicional para la base
            if (up < arreglo[longitud - i]){ up = arreglo[longitud - i]; } // Condicional para el techo
        }

        if (down > up){return down;}
        return up;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        // TODO: Implementar el método para encontrar el elemento menor en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser 1.

        // Inicializamos la variable para poder ir comparando

        int longitud = arreglo.length;
        int down = arreglo[0];
        int up = arreglo[longitud - 1];

        // Ciclo para recorrer el arreglo hasta la mitad
        for (int i = 1; i <= Math.ceil((double) longitud / 2); i++){
            if (down > arreglo[i - 1]){ down = arreglo[i - 1]; } // Condicional para la base
            if (up > arreglo[longitud - i]){ up = arreglo[longitud - i]; } // Condicional para el techo
        }

        if (down < up){return down;}
        return up;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        // TODO: Implementar el método para buscar un elemento en un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y elemento = 3, el resultado debería ser true.

        // Inicializamos la variable para poder ir comparando
        int longitud = arreglo.length;

        // Ciclo para recorrer el arreglo hasta la mitad
        for (int i = 1; i <= Math.ceil((double) longitud / 2); i++){
            if (elemento == arreglo[i - 1]){ return true; } // Condicional para la base
            if (elemento == arreglo[longitud - i]){ return true; } // Condicional para el techo
        }

        return false;
    }

    // Método que invierte un arreglo
    public static int[] invertirArreglo(int[] arreglo) {
        // TODO: Implementar el método para invertir un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5], el resultado debería ser [5, 4, 3, 2, 1].

        int longitud = arreglo.length;
        int down, up;

        // Ciclo para recorrer el arreglo hasta la mitad
        for (int i = 1; i <= Math.ceil((double) longitud / 2); i++){
            down = arreglo[i - 1];
            up = arreglo[longitud - i];
            arreglo[i - 1] = up;
            arreglo[longitud - i] = down;
        }
        return arreglo;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        // TODO: Implementar el método para ordenar un arreglo en orden ascendente.
        // Ejemplo: Si arreglo = [5, 4, 3, 2, 1], el resultado debería ser [1, 2, 3, 4, 5].

        //Inicializamos la variable para guardar el numero temporal
        int numTem;

        // Ciclo para recorrer la totalidad del arreglo y organizar el arreglo de manera ascendente
        for (int i = 0; i < arreglo.length; i++)
        {
            for (int j = i; j < arreglo.length; j++)
            {
                if (arreglo[i] > arreglo[j])
                {
                    numTem = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = numTem;
                }
            }
        }
        return arreglo;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        // TODO: Implementar el método para eliminar los duplicados de un arreglo.
        // Ejemplo: Si arreglo = [1, 2, 2, 3, 4, 4, 5], el resultado debería ser [1, 2, 3, 4, 5].

        // --- PASO 1: Contar cuántos elementos únicos existen ---
        int numUni = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean duplica = false;
            // Verificamos si el número ya apareció antes en el arreglo
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    duplica = true;
                    break; // Ya sabemos que está repetido, salimos del bucle interno
                }
            }
            // Si no se repitió antes, lo contamos como único
            if (!duplica) {
                numUni++;
            }
        }

        // --- PASO 2: Crear el nuevo arreglo y llenarlo ---
        int[] resultado = new int[numUni];
        int indiceResultado = 0;

        for (int i = 0; i < arreglo.length; i++) {
            boolean duplica = false;
            // Volvemos a verificar si ya apareció antes
            for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    duplica = true;
                    break;
                }
            }
            // Si es la primera vez que vemos el número, lo agregamos al resultado
            if (!duplica) {
                resultado[indiceResultado] = arreglo[i];
                indiceResultado++;
            }
        }

        return resultado;
    }


    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        // TODO: Implementar el método para combinar dos arreglos en uno solo.
        // Ejemplo: Si arreglo1 = [1, 2, 3, 4, 5] y arreglo2 = [6, 7, 8], el resultado debería ser [1, 2, 3, 4, 5, 6, 7, 8].

        // Inicializamos un arreglo con la longitud necesaria
        int[] nuevoArr = new int[arreglo1.length + arreglo2.length];

        // Ciclo para recorrer un arreglo e insertar en el nuevo
        for (int i = 0; i < arreglo1.length; i++)
        {
            nuevoArr[i] = arreglo1[i];
        }

        // NUevo ciclo para recorrer el segundo arreglo y agregar los elementos faltantes
        for (int i = 0; i < arreglo2.length; i++)
        {
            nuevoArr[arreglo1.length + i] = arreglo2[i];
        }

        return nuevoArr;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        // TODO: Implementar el método para rotar un arreglo n posiciones.
        // Ejemplo: Si arreglo = [1, 2, 3, 4, 5] y posiciones = 2, el resultado debería ser [3, 4, 5, 1, 2].
        int n = arreglo.length;

        // Normalizar las posiciones por si son mayores que el tamaño del arreglo
        // o si son negativas
        int despl = posiciones % n;
        if (despl < 0) {
            despl += n;
        }

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            // Calculamos la nueva posición de cada elemento
            int nuevaPos = (i + despl) % n;
            resultado[nuevaPos] = arreglo[i];
        }

        return resultado;

    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        // TODO: Implementar el método para contar el número de caracteres en una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser 5.

        // Usamos directamente el metodo de los objetos String
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        // TODO: Implementar el método para invertir una cadena.
        // Ejemplo: Si cadena = "Hello", el resultado debería ser "olleH".

        // Inicializamos una variable temporal para la letra
        int n = cadena.length();
        char[] invertido = new char[n];

        // Recorremos la cadena original de izquierda a derecha
        // y colocamos cada carácter en la posición opuesta del nuevo arreglo
        for (int i = 0; i < n; i++) {
            invertido[n - 1 - i] = cadena.charAt(i);
        }

        return new String(invertido);
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        // TODO: Implementar el método para verificar si una cadena es un palíndromo.
        // Ejemplo: Si cadena = "madam", el resultado debería ser true.

        int inicio = 0;
        int fin = cadena.length() - 1;

        while (inicio < fin) {
            char c1 = cadena.charAt(inicio);
            char c2 = cadena.charAt(fin);

            // Si el carácter de inicio no es una letra ni un dígito, lo saltamos
            if (!Character.isLetterOrDigit(c1)) {
                inicio++;
                continue;
            }

            // Si el carácter de fin no es una letra ni un dígito, lo saltamos
            if (!Character.isLetterOrDigit(c2)) {
                fin--;
                continue;
            }

            // Comparamos ignorando mayúsculas/minúsculas
            if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }

            inicio++;
            fin--;
        }

        return true;
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        // TODO: Implementar el método para contar el número de palabras en una cadena.
        // Ejemplo: Si cadena = "Este es un test", el resultado debería ser 4.

        // En caso de que no haya palabras
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }

        // trim() quita espacios al inicio/final
        // split("\\s+") separa por uno o más espacios en blanco
        String[] palabras = cadena.trim().split("\\s+");

        return palabras.length; // Retornamos la longitud del arreglo

    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a mayúsculas.
        // Ejemplo: Si cadena = "hello", el resultado debería ser "HELLO".

        // Usamos el metodo directamente
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        // TODO: Implementar el método para convertir una cadena a minúsculas.
        // Ejemplo: Si cadena = "HELLO", el resultado debería ser "hello".

        // Usamos los metodos de los objetos de la clase String
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".

        // Los strings ya cuentan con un metodo nativo
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.

        int n = cadena.length();
        int m = subcadena.length();

        // Recorremos cada posible posición de inicio en la cadena
        for (int i = 0; i <= n - m; i++) {
            // Verificamos si la subcadena coincide a partir de la posición i
            if (cadena.startsWith(subcadena, i)) {
                return i;
            }
        }

        // No se encontró la subcadena
        return -1;

        // Podemos usar el metodo nativo pero usemos otra forma
        //return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        // TODO: Implementar el método para validar un correo electrónico.
        // Ejemplo: Si correo = "test@example.com", el resultado debería ser true.
        // Método que valida un correo electrónico

        // Buscamos la posición del símbolo '@'
        int posArroba = correo.indexOf('@');

        // Debe existir un '@', no puede estar al inicio,
        // y no puede haber más de un '@'
        if (posArroba <= 0 || correo.indexOf('@', posArroba + 1) != -1) {
            return false;
        }

        // Separamos en parte local (antes del @) y dominio (después del @)
        String parteLocal = correo.substring(0, posArroba);
        String dominio = correo.substring(posArroba + 1);

        // El dominio no puede estar vacío
        if (dominio.isEmpty()) {
            return false;
        }

        // Buscamos el último punto en el dominio
        int posPunto = dominio.lastIndexOf('.');

        // Debe existir un punto en el dominio, no puede ser el primer carácter,
        // y debe haber al menos 2 caracteres después del punto (ej: ".com")
        if (posPunto <= 0 || posPunto == dominio.length() - 1
                || dominio.length() - posPunto - 1 < 2) {
            return false;
        }

        // Validamos que la parte local solo tenga caracteres permitidos
        // (letras, dígitos, punto, guion o guion bajo)
        for (int i = 0; i < parteLocal.length(); i++) {
            char c = parteLocal.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }

        // Validamos que el dominio solo tenga caracteres permitidos
        for (int i = 0; i < dominio.length(); i++) {
            char c = dominio.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '.' && c != '_' && c != '-') {
                return false;
            }
        }

        return true;
    }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.

        // Si la lista es null o está vacía, no hay promedio que calcular
        if (lista == null || lista.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        // Recorremos la lista sumando todos los elementos
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }

        // Dividimos entre el tamaño para obtener el promedio
        // Casteamos a double para evitar división entera
        return (double) suma / lista.size();
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        // Método que convierte un número en su representación binaria

        // Caso especial: el cero se representa como "0"
        if (numero == 0) {
            return "0";
        }

        boolean esNegativo = numero < 0;
        int n = Math.abs(numero);

        StringBuilder binario = new StringBuilder();

        // Dividimos repetidamente entre 2, guardando el residuo
        while (n > 0) {
            int residuo = n % 2;
            binario.append(residuo); // agregamos el residuo (0 o 1)
            n = n / 2;
        }

        // Los residuos quedaron en orden inverso, así que invertimos el resultado
        binario.reverse();

        // Si el número original era negativo, anteponemos el signo
        if (esNegativo) {
            binario.insert(0, "-");
        }

        return binario.toString();
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".

        // Caso especial: el cero se representa como "0"
        if (numero == 0) {
            return "0";
        }

        boolean esNegativo = numero < 0;
        int n = Math.abs(numero);

        // Dígitos hexadecimales, en orden (índice = valor)
        String digitos = "0123456789ABCDEF";

        StringBuilder hexadecimal = new StringBuilder();

        // Dividimos repetidamente entre 16, guardando el residuo
        while (n > 0) {
            int residuo = n % 16;
            hexadecimal.append(digitos.charAt(residuo)); // convertimos el residuo a su dígito hex
            n = n / 16;
        }

        // Los dígitos quedaron en orden inverso, así que invertimos el resultado
        hexadecimal.reverse();

        // Si el número original era negativo, anteponemos el signo
        if (esNegativo) {
            hexadecimal.insert(0, "-");
        }

        return hexadecimal.toString();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        // TODO: Implementar el método para el juego de Piedra, Papel, Tijera, Lagarto, Spock.
        // Las reglas del juego son:
        // - Piedra vence a Tijera y Lagarto
        // - Papel vence a Piedra y Spock
        // - Tijera vence a Papel y Lagarto
        // - Lagarto vence a Spock y Papel
        // - Spock vence a Tijera y Piedra


        // El método debe retornar un mensaje indicando el resultado del juego.
        // Ejemplo: Si la eleccionUsuario es "Piedra", el resultado podría ser "Ganaste" o "Perdiste" dependiendo de la elección de la computadora.

        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

        // Validamos que la elección del usuario sea válida
        boolean valida = false;
        for (int i = 0; i < opciones.length; i++) {
            if (opciones[i].equalsIgnoreCase(eleccionUsuario)) {
                valida = true;
                break;
            }
        }
        if (!valida) {
            return "Inválido";
        }

        // La computadora elige una opción al azar (0 a 4)
        int indiceComputadora = (int) (Math.random() * opciones.length);
        String eleccionComputadora = opciones[indiceComputadora];

        // Si ambos eligieron lo mismo, es empate
        if (eleccionComputadora.equalsIgnoreCase(eleccionUsuario)) {
            return "Empate";
        }

        // Verificamos si la elección del usuario vence a la de la computadora
        if (vence(eleccionUsuario, eleccionComputadora)) {
            return "Ganaste";
        } else {
            return "Perdiste";
        }
    }

    // Método auxiliar: determina si "opcionA" vence a "opcionB" según las reglas del juego
    private boolean vence(String opcionA, String opcionB) {
        String a = opcionA.toLowerCase();
        String b = opcionB.toLowerCase();

        if (a.equals("piedra")) {
            return b.equals("tijera") || b.equals("lagarto");
        }
        if (a.equals("papel")) {
            return b.equals("piedra") || b.equals("spock");
        }
        if (a.equals("tijera")) {
            return b.equals("papel") || b.equals("lagarto");
        }
        if (a.equals("lagarto")) {
            return b.equals("spock") || b.equals("papel");
        }
        if (a.equals("spock")) {
            return b.equals("tijera") || b.equals("piedra");
        }

        return false;
    }


    public String pptls2(String game[]) {
        //Retornar player ganador o empate
            /*
            Rock = R
            Paper = P
            Scissors = S
            Lizard = L
            Spock = V
            Scissors cuts Paper
            Paper covers Rock
            Rock crushes Lizard
            Lizard poisons Spock
            Spock smashes Scissors
            Scissors decapitates Lizard
            Lizard eats Paper
            Paper disproves Spock
            Spock vaporizes Rock
            Rock crushes Scissors
            */

            if (game == null || game.length < 2) {
                return "Inválido";
            }

            String jugador1 = game[0];
            String jugador2 = game[1];

            // Validamos que ambas elecciones sean válidas
            String opcionesValidas = "RPSLV";
            if (jugador1 == null || jugador2 == null
                    || jugador1.length() != 1 || jugador2.length() != 1
                    || opcionesValidas.indexOf(jugador1.toUpperCase().charAt(0)) == -1
                    || opcionesValidas.indexOf(jugador2.toUpperCase().charAt(0)) == -1) {
                return "Inválido";
            }

            char c1 = Character.toUpperCase(jugador1.charAt(0));
            char c2 = Character.toUpperCase(jugador2.charAt(0));

            // Empate si eligieron lo mismo
            if (c1 == c2) {
                return "Empate";
            }

            // Lista de combinaciones donde el primer carácter vence al segundo
            String[] combinacionesGanadoras = {
                    "SP", // Scissors cuts Paper
                    "PR", // Paper covers Rock
                    "RL", // Rock crushes Lizard
                    "LV", // Lizard poisons Spock
                    "VS", // Spock smashes Scissors
                    "SL", // Scissors decapitates Lizard
                    "LP", // Lizard eats Paper
                    "PV", // Paper disproves Spock
                    "VR", // Spock vaporizes Rock
                    "RS"  // Rock crushes Scissors
            };

            // Verificamos si jugador1 vence a jugador2
            String combinacion1 = "" + c1 + c2;
            for (int i = 0; i < combinacionesGanadoras.length; i++) {
                if (combinacionesGanadoras[i].equals(combinacion1)) {
                    return "Player 1";
                }
            }

            // Si no ganó jugador1, entonces gana jugador2
            return "Player 2";

    }

    public double areaCirculo(double radio) {
        return Math.pow(radio, 2) * Math.PI;
    }

    public String zoodiac(int day, int month) {
        // Switch-case para cada mes, dia y sus armaduras
        switch (month){
            case 1:
                if (day >= 1 && day <= 19){
                    return "Capricornio";
                }else if (day > 19 && day <= 31){
                    return "Acuario";
                }else{
                    return "Invalid Date";
                }

            case 2:
                if (day >= 1 && day <= 18){
                    return "Acuario";
                }else if (day > 18 && day <= 29){
                    return "Piscis";
                }else{
                    return "Invalid Date";
                }

            case 3:
                if (day >= 1 && day <= 20){
                    return "Piscis";
                }else if (day > 20 && day <= 31){
                    return "Aries";
                }else{
                    return "Invalid Date";
                }

            case 4:
                if (day >= 1 && day <= 19){
                    return "Aries";
                }else if (day > 19 && day <= 30){
                    return "Tauro";
                }else{
                    return "Invalid Date";
                }

            case 5:
                if (day >= 1 && day <= 20){
                    return "Tauro";
                }else if (day > 20 && day <= 31){
                    return "Geminis";
                }else{
                    return "Invalid Date";
                }
            case 6:
                if (day >= 1 && day <= 20){
                    return "Geminis";
                }else if (day > 20 && day <= 30){
                    return "Cancer";
                }else{
                    return "Invalid Date";
                }
            case 7:
                if (day >= 1 && day <= 22){
                    return "Cancer";
                }else if (day > 22 && day <= 31){
                    return "Leo";
                }else{
                    return "Invalid Date";
                }
            case 8:
                if (day >= 1 && day <= 22){
                    return "Leo";
                }else if (day > 22 && day <= 31){
                    return "Virgo";
                }else{
                    return "Invalid Date";
                }
        }

        return "Invalid Date";
    }


}

