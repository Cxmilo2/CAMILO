class Pendiente {
    public static void main(String[] args) {
        
        //primer objeto publico
        System.out.println(">>>>>>>Primer Objeto Publico<<<<<<<");
        Publico publico1 = new Publico(54321);
        publico1.ruta = "B-89";
        publico1.empresa = "Transmetro";
        publico1.ciudad = "Barranquilla";
        System.out.println(publico1.getInfo());
        System.out.println(publico1.getCodigo());
        
        //segundo objeto publico
        System.out.println(">>>>>>>Segundo Objeto Publico<<<<<<<");
        Publico publico2 = new Publico(54321);
        publico2.ruta = "S-10";
        publico2.empresa = "Transmilenio";
        publico2.ciudad = "Bogotá";
        System.out.println(publico2.getInfo());
        System.out.println(publico2.getCodigo());
        
        //primer objeto particular 
        System.out.println(">>>>>>>Primer Objeto Particular<<<<<<<");
        Particular particular1 = new Particular(2000);
        particular1.placa = "HFG978";
        particular1.color = "Rojo";
        particular1.ciudad = "Sincelejo";
        System.out.println(particular1.getInfo());
        System.out.println(particular1.getRtm());
        
        //segundo objeto particular
        System.out.println(">>>>>>>Segundo Objeto Particular<<<<<<<");
        Particular particular2 = new Particular(2020);
        particular2.placa = "GTU743";
        particular2.color = "Negro";
        particular2.ciudad = "Barranquilla";
        System.out.println(particular2.getInfo());
        System.out.println(particular2.getRtm());
    }
}

class Transporte {
    public String empresa;
    public String ciudad;
    String getInfo () {
    return "La empresa es " + empresa + " y la ciudad: " + ciudad;
    }
}

class Publico extends Transporte {
    private int numInterno;
    public String ruta;
    
    Publico(int n) {
        this.numInterno = n;
    }
    String getCodigo() {
    return "El numero interno del vehiculo es " + numInterno + " y su ruta es " + ruta;
    }
}
class Particular extends Transporte{
    public String placa;
    public String color;
    private int modelo;
    
    String getInfo () {
    return "La ciudad del vehiculo es: " + ciudad;
    }
    Particular(int mod){
        this.modelo = mod;
    }
    int getRtm () {
        int tm = modelo + 5;
    return tm;
    }
}