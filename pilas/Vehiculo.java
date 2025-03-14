public class Vehiculo {

    private String Placa;
    private String NombreP;
    private int Cilindraje;
    private String Modelo;
    private String Disponible;
    public Vehiculo(String placa, String nombreP, int cilindraje, String modelo, String disponible) {
        Placa = placa;
        NombreP = nombreP;
        Cilindraje = cilindraje;
        Modelo = modelo;
        Disponible = disponible;
    }
    public String getPlaca() {
        return Placa;
    }
    public void setPlaca(String placa) {
        Placa = placa;
    }
    public String getNombreP() {
        return NombreP;
    }
    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }
    public int getCilindraje() {
        return Cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getDisponible() {
        return Disponible;
    }
    public void setDisponible(String disponible) {
        Disponible = disponible;
    }
    
    
}
