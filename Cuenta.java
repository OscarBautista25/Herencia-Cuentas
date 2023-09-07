/**
 * Cuenta
 */
public class Cuenta {

    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual=0;
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public void consignar(float cantidad){
        saldo = saldo + cantidad;
    }
    public void retirar(float cantidad){
        float nuevoSaldo = saldo-cantidad;
        if (nuevoSaldo>=0) {
            saldo=saldo-cantidad;
        } else {
            System.out.println("No tiene saldo suficiente");
        }
    }
    public void calcularInteres(){
        float tasaMensual = tasaAnual/12;
        float interesMensual = saldo*tasaMensual;
        saldo = saldo + interesMensual;
    }

    public void extractoMensual(){
        saldo = saldo-comisionMensual;
        calcularInteres();
    }
}