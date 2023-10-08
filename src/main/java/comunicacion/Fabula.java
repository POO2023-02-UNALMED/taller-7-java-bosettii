package comunicacion;

public class Fabula extends Escrito {
    
    private String ensenanza;
    private String interpretacion;

    public String getEnsenanza() {
        return this.ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public String interpretacion(){
        return this.interpretacion;
    }

    public Fabula(String origen, String titulo, String autor, int paginas,String ensenanza,String interpretacion){
        super(origen,titulo,autor,paginas);
        this.ensenanza =ensenanza;
        this.interpretacion = interpretacion;
    }

    public String toString() {
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+ getEnsenanza();
    }

    public int palabrasTotales(int i){
        return getPaginas()*i;
    }

}
