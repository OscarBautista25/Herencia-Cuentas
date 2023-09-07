public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros(float saldo, float tasaAnual){
    super(saldo, tasaAnual);
    if (saldo<10000) {
        activa=false;
        
    } else {
        activa=true;
    }
    }

    public void consignar(float cantidad){
        if (activa) {
            super.consignar(cantidad);
        }


    }
    public void retirar(float cantidad){
        if (activa) {
            super.retirar(cantidad);
        }
    }
    public void extractoMensual(){
        if (numeroRetiros>4) {
            comisionMensual = comisionMensual+(numeroRetiros-4)*1000;
            super.extractoMensual();
            if (saldo<10000) {
                activa=false;
                
            }
            
        }
    }
    
    
}
