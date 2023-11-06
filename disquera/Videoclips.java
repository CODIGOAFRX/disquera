package disquera;

public class Videoclips {

    private String nombre, artista, Genero;
    private int VisitasYT;
    private double Regalias;

    public Videoclips() {
        // vamos a proceder a inicializar los calores por defecto. los string se ponene
        // con comillas vacias y los numero inicializados a 0
        nombre = "";
        artista = "";
        Genero = "";

        Regalias = 0;
        VisitasYT = 0;
        // si es booleano se pone true

    }

    public Videoclips(String nombre, double Regalias, int VisitasYT, String artista, String tipoArchivo) { // se pone
                                                                                                           // cada
                                                                                                           // parametro
                                                                                                           // dentro de
                                                                                                           // los
                                                                                                           // parentesis
                                                                                                           // de la
                                                                                                           // clase.

        // usamos los punteros "this" para indicar el atributo de mi clase
        this.nombre = nombre;
        this.Regalias = Regalias;
        this.VisitasYT = VisitasYT;
        this.artista = artista;
        this.Genero = Genero;

    }

    // creamos los getters para poder imprimir y llamar a nuestro metodo privado.
    public double getRegalias() {
        return Regalias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }

    public String getGenero() {
        return Genero;
    }

    public double getVisitasYT() {
        return VisitasYT;
    }

    // setter es lo mismo que con el getter pero sirve para asignarle un valor a un
    // metodo privado.

    public void setVisitasYT(int VisitasYT) {
        this.VisitasYT = VisitasYT;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setRegalias(int Regalias) {
        this.Regalias = Regalias;
    }

}// class
