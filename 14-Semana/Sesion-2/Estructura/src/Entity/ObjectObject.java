package Entity;

public class ObjectObject {
    private String nombre;
    private Double nota;
    private String correo;
    private Boolean estado;

    public ObjectObject() {
    }

    public ObjectObject(String nombre, Double nota, String correo) {
        this.nombre = nombre;
        this.nota = nota;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getEstado() {
        return estado;
    }

    private void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public  void CalcularNota(){
        this.setEstado(this.getNota()<3.0 ? false : true);
    }

    public void Mostar(){
        /*if(getNota() < 3.0){
            setEstado(false);
        }else{
            setEstado(false);
        }*/

        // x == y ? 'verdaderda' : 'false'

        System.out.println(
                        this.getNombre()+ " "+
                        this.getCorreo() + " " +
                        this.getNota()+ " "+
                        (this.getEstado()==true?"Aprobó":"Desaprobó")
        );
    }
}
