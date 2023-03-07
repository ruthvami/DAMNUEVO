package reservas;

public class Reserva {

    private int checkin;
    private int checkout;
    private Hotel hotel;
    private final Cliente TITULAR;
    private double precio;
    private Proveedor PROVEEDOR;
    private boolean pagada;
    private final Agencia AGENCIA;
    private String estado;
    private int numconfirm = 123456;
    private int ID;

    public Reserva(int checkin, int checkout, Hotel hotel, Cliente titular, Proveedor proveedor, boolean pagada, Agencia agencia) {
        this.checkin = checkin;
        if (checkout > this.checkin) {
            this.checkout = checkout;
        } else {
            System.out.println("La reserva no será válida ya que la fecha de salida es anterior o igual a la de entrada.");
        }
        this.hotel = hotel;
        this.TITULAR = titular;
        this.PROVEEDOR = proveedor;
        this.pagada = pagada;
        this.AGENCIA = agencia;
        this.ID = (int) (100000 + Math.random() * (999999 - 100000 + 1));
        this.ConfirmarReserva();
        this.hotel.AnadirClientes(titular);
        this.precio = this.hotel.getPrecio() * (this.checkout - this.checkin);
    }

    private void ConfirmarReserva() {
        if (this.getHotel().isDisponibilidad() && this.isPagada() && this.getCheckout() > this.getCheckin()) {
            this.setEstado("Confirmada");
            this.setNumconfirm((int) (34000000 + Math.random() * (34999999 - 34000000 + 1)));
        } else if (!this.hotel.isDisponibilidad()) {
            this.setEstado("En busca de alternativa");
        } else if (!this.isPagada()) {
            this.setEstado("Reserva pendiente de pago");
        } else {
            this.setEstado("Reserva no válida: La fecha de salida es anterior o igual a la de entrada");
        }
    }

    public void AnularReserva() {
        this.setEstado("Anulada con gastos");
    }

    public void mostrar() {
        System.out.println("Fecha de entrada: " + this.getCheckin() + "/03/2023\n"
                + "Fecha de salida: " + this.getCheckout() + "/03/2023\n"
                + "Hotel: " + this.getHotel().getNOMBRE() + "\n"
                + "Titular: " + this.getTITULAR().getNOMBRE() + " " + this.getTITULAR().getAPELLIDOS() + "\n"
                + "Precio: " + this.getPrecio() + "€\n"
                + "Proveedor: " + this.getPROVEEDOR().getNOMBRE() + "\n"
                + "Agencia: " + this.getAGENCIA().getNOMBRE() + "\n"
                + "Estado: " + this.getEstado() + "\n"
                + "ID: " + this.getID());
        if (this.getEstado() == "Confirmada") {
            System.out.println("Número de confirmación: " + this.getNumconfirm());
        } else {
        }
    }

    public int numConf() {
        return (int) (34000000 + Math.random() * (34999999 - 34000000 + 1));
    }

    public int getCheckin() {
        return checkin;
    }

    public void setCheckin(int checkin) {
        this.checkin = checkin;
    }

    public int getCheckout() {
        return checkout;
    }

    public void setCheckout(int checkout) {
        this.checkout = checkout;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
        this.ConfirmarReserva();
    }

    public Cliente getTITULAR() {
        return TITULAR;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Proveedor getPROVEEDOR() {
        return PROVEEDOR;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Agencia getAGENCIA() {
        return AGENCIA;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumconfirm() {
        return numconfirm;
    }

    public void setNumconfirm(int numconfirm) {
        this.numconfirm = numconfirm;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPROVEEDOR(Proveedor PROVEEDOR) {
        this.PROVEEDOR = PROVEEDOR;
    }
}
