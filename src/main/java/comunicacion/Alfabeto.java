package comunicacion;

public class Alfabeto extends Pictograma{

    private String[] letras;
    private String interpretacion;

    public String[] getLetras() {
        return this.letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public Alfabeto(String origen,String[] l,String interpretacion){
        super(origen);
        this.letras = l;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String interpretacion(){
        return this.interpretacion;
    }

    public String toString(){
        String abc = letras[0];
        for (int i =1;i<letras.length;i++)
            abc = abc + ", " + letras[i] ;
        return abc;
    }
    
}
