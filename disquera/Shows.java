package disquera;

public class Shows {

    private String artista, localizacion;
    private int aforo;
    private double PrecioEntradas, Recaudacion;

    public Shows() {
        // vamos a proceder a inicializar los calores por defecto. los string se ponene
        // con comillas vacias y los numero inicializados a 0
        artista = "";
        localizacion = "";

        Recaudacion = 0;
        aforo = 0;
        PrecioEntradas = 0;
        // si es booleano se pone true

    }

    public Shows(String localizacion, double Recaudacion, int aforo, String artista, double precioEntradas) { // se pone
                                                                                                              // cada
                                                                                                              // parametro
                                                                                                              // dentro
                                                                                                              // de los
                                                                                                              // parentesis
                                                                                                              // de la
                                                                                                              // clase.

        // usamos los punteros "this" para indicar el atributo de mi clase
        this.localizacion = localizacion;
        this.Recaudacion = Recaudacion;
        this.aforo = aforo;
        this.artista = artista;
        this.PrecioEntradas = precioEntradas;

    }

    // creamos los getters para poder imprimir y llamar a nuestro metodo privado.
    public String getLocalizacion() {
        return localizacion;
    }

    public int getAforo() {
        return aforo;
    }

    public double getPrecioEntradas() {
        return PrecioEntradas;
    }

    public double getRecaudacion() {
        return Recaudacion;
    }

    public String getArtista() {
        return artista;
    }

    // setter es lo mismo que con el getter pero sirve para asignarle un valor a un
    // metodo privado.

    public void setPrecioEntradas(double PrecioEntradas) {
        this.PrecioEntradas = PrecioEntradas;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setRecaudacion(double Recaudacion) {
        this.Recaudacion = Recaudacion;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;

    }

}
// class
