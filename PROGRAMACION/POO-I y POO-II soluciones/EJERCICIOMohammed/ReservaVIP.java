package reservas;

public class ReservaVIP extends Reserva {

    private final int ID_VIP;

    public ReservaVIP(int checkin, int checkout, Hotel hotel, Cliente titular, Proveedor proveedor, boolean pagada, Agencia agencia, int id) {
        super(checkin, checkout, hotel, titular, proveedor, pagada, agencia);
        this.ID_VIP = id;
    }

    @Override
    public void AnularReserva() {
        this.setEstado("Anulada sin gastos");
        this.setPrecio(0);
    }

    public void AvisarLateCheckIn() {
        this.getHotel().AnadirNotas("Llegada tardía");
    }

    public void CambioHotel(Hotel h) {
        if (h.isDisponibilidad() && h.getCATEGORIA() <= this.getHotel().getCATEGORIA()) {
            this.setHotel(h);
            this.setPrecio(this.getHotel().getPrecio() * (this.getCheckout() - this.getCheckin()));
            this.setNumconfirm(this.numConf());
        } else if (!h.isDisponibilidad()) {
            System.out.println("No se ha podido hacer el cambio ya que el nuevo hotel solicitado no tiene disponibilidad");
        } else {
            System.out.println("No se ha podido hacer el cambio ya que el nuevo hotel solicitado es de categoría mayor");
        }
    }

    public void CambiarFecha(int e, int s) {
        if ((s - e) <= (this.getCheckout() - this.getCheckin()) && (e < s)) {
            this.setCheckin(e);
            this.setCheckout(s);
            this.setPrecio(this.getHotel().getPrecio() * (s - e));
        } else if (e > s) {
            System.out.println("No se han podido cambiar las fechas ya que la nueva fecha de salida es anterior a la de entrada");
        } else {
            System.out.println("No se han podido cambiar las fechas ya que la duracion de la nueva estancia es mayor que la original.");
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("ID VIP: " + this.getID_VIP());
    }

    public int getID_VIP() {
        return ID_VIP;
    }

}
