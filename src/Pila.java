public class Pila {
    
    //Atributos
    int cima;
    int max;
    int espacio[];
 
    //Constructor
    public Pila(int tamanoPila) {
        cima = -1;
        max = tamanoPila;
        espacio = new int[max];
    }
 
    public void insertar(int dato) {
        if (llena())
            System.out.println("La pila esta llena, no se pueden insertar datos");
        else{
            cima = cima + 1;
            espacio[cima] = dato;
            System.out.println("Se inserto el dato en la pila");
        }
    }
 
    public int quitar() {
        int datoExtraido = 0;
        if (vacia())
            System.out.println("La pila esta vacia, no se puede sacar un dato");
        else{
            datoExtraido = espacio[cima];
            cima = cima - 1;
            System.out.println("Dato extraido de la pila: "+datoExtraido);
        }
        return datoExtraido;
    }
 
    public boolean vacia() {
        if (cima == -1){
            System.out.println("La pila esta vacia");
            return true;
        }else{
            System.out.println("La pila no esta vacia");
            return false;
        }
    }
 
    public boolean llena() {
        if (tamano() >= max){
            System.out.println("La pila esta llena");
            return true;
        }else{
            System.out.println("La pila no esta llena");
            return false;
        }
    }
 
    public int mostrarCima() {
        int ultimoElemento = 0;
        if (vacia())
            System.out.println("La pila esta vacia");
        else{
            ultimoElemento = espacio[cima];
            System.out.println("La cima es: "+ultimoElemento);
        }
        return ultimoElemento;
    }

    public void vaciar() {
        cima = -1;
        System.out.println("Se ha vaciado la pila");
    }

    public int tamano() {
        int tam = cima + 1;
        System.out.println("El tamano de la pila es: "+tam);
        return tam;
    }

}
