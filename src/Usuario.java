public class Usuario {
   private String nombres;
   private String apellidos;
   private Double peso;
private Double altura;
   private String correo;
   private String contraseña;

   public Usuario(String nombres, String apellidos, Double peso, Double altura, String correo, String contraseña) {
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.peso = peso;
       this.altura = altura;
       this.correo = correo;
       this.contraseña = contraseña;
   }
   //Getters
    public String getNombres() {
         return nombres;
    }
    public String getApellidos() {
         return apellidos;
    }
     public Double getPeso() {
           return peso;
     }
     public Double getAltura() {
           return altura;
     }
    public String getCorreo() {
         return correo;
    }
    public String getContraseña() {
         return contraseña;
    }
    
    //Setters
    public void setNombres(String nombres) {
         this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
         this.apellidos = apellidos;
    }
     public void setPeso(Double peso) {
           this.peso = peso;
     }
     public void setAltura(Double altura) {
           this.altura = altura;
     }
    public void setCorreo(String correo) {
         this.correo = correo;
    }
    public void setContraseña(String contraseña) {
         this.contraseña = contraseña;
    }

    public void CalcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.println("El IMC es: " + imc);
        if (imc < 18.5) {
               System.out.print("Estas bajo de peso");
        } else if (imc >= 18.5 && imc < 25){
               System.out.print("Estas bien de peso");
        } else if (imc >= 25 && imc < 30){
               System.err.print("Estas con sobrepeso");
        } else if (imc >= 30 && imc < 35){
               System.out.print("Tienes Obesidad nivel 1");
        } else if (imc >= 35 && imc < 40){
               System.out.print("Tienes Obesidad nivel 2");
        } else if (imc >= 40){
               System.out.print("Tienes Obesidad nivel 3");
        }
    }
}
