package reservas;

public class Reservas {

    public static void main(String[] args) {
        Cliente clt = new Cliente("Pablo Marcelo", "Escobar García", "84334717L", "+34 603 84 21 35", "pablogarcia@gmail.com", 30);
        Agencia smyrooms = new Agencia("Smyrooms", "Carrer Galileo Galilei, 07120, Illes Balears", "+34 971 08 06 35", "Verónica Fernández", "Grupo LogiTravel");
        DMC w2m = new DMC("DMC Mallorca", "C/ General Riera 154 07010 Palma de Mallorca, Illes Balears", "+34 971 594 100", "Sara Ribot", "España");
        Hotel hilton = new Hotel("Hilton Mallorca Galatzo", "Ctra. Andratx, Km 20, 07160 Costa de la Calma, Illes Balears", 5, "Islas Baleares", true, 126, w2m);

        smyrooms.AnadirClientes(clt);

        hilton.setProveedores(w2m);
        w2m.anadirhotel(hilton);

        Reserva rsv = new Reserva(10, 15, hilton, clt, w2m, true, smyrooms);

        System.out.println("\n------ Reserva Normal ------\n");
        rsv.mostrar();

        System.out.println("\n------ Reserva VIP ------\n");
        Cliente clt2 = new Cliente("Emily", "Anderson", "KB221971R", "+44 20 7123 4567", "emillyanderson@gmail.com", 26);
        ReservaVIP vip = new ReservaVIP(03, 20, hilton, clt2, w2m, true, smyrooms, 657984);
        vip.AvisarLateCheckIn();
        vip.mostrar();

        System.out.println("\n------ Hotel ------\n");
        hilton.mostrar();

        System.out.println("\n------ Bloqueamos el hotel ------");
        hilton.Bloquear();

        System.out.println("\n------ Reserva VIP 2 ------\n");
        Cliente clt3 = new Cliente("Lars", "Schneider", "37100969138", "+49 163 3456789", "larsschneider@gmail.com", 58);
        ReservaVIP vip2 = new ReservaVIP(03, 30, hilton, clt3, w2m, true, smyrooms, 624715);
        vip2.mostrar();

        Hotel holidayinn = new Hotel("Garden Holiday Village", "Carrer Circuit del Llac, s/n, 07458 Platja de Muro, Illes Balears", 4, "Islas Baleares", true, 114, w2m);
        w2m.anadirhotel(holidayinn);

        System.out.println("\n------ Cambio de hotel ------\n");
        vip2.CambioHotel(holidayinn);
        vip2.mostrar();

        System.out.println("\n------ Cambio de fechas 1 ------\n");
        vip.CambiarFecha(2, 6);
        vip.mostrar();

        System.out.println("\n------ Cambio de fechas 2 ------\n");
        vip2.CambiarFecha(9, 20);
        vip2.mostrar();

        System.out.println("\n------ Anular reserva  1 ------\n");
        vip.AnularReserva();
        vip.mostrar();

        System.out.println("\n------ Anular reserva 2 ------\n");
        rsv.AnularReserva();
        rsv.mostrar();

    }

}
