public class Pago {
    private String Titular;
    private String numeroTarjeta;
    private String fechaVencimiento;
    private String cvv;
    
    public Pago(String titular, String numeroTarjeta, String fechaVencimiento, String cvv) {
        this.Titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.cvv = cvv;
    }
    //setters
    public void setTitular(String titular){
        this.Titular = titular;
    }
    public void setNumeroTarjeta(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    public void setCvv(String cvv){
        this.cvv = cvv;
    }

    //getters
    public String getTitular(){
        return Titular;
    }
    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }
    public String getFechaVencimiento(){
        return fechaVencimiento;
    }
    public String getCvv(){
        return cvv;
    }
    public void pagar(){
        System.out.print("Pago realizado con exito!");
    }
}
