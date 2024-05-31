package carRent.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String ClientName;


    String Email;

    String telefon;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    private LocalDate Delivery;
    private LocalDate Handover;

//    @ManyToOne
//    @JoinColumn(name = "admin_id")
//    private Admin admin;


    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public LocalDate getDelivery() {
        return Delivery;
    }

    public void setDelivery(LocalDate delivery) {
        Delivery = delivery;
    }

    public LocalDate getHandover() {
        return Handover;
    }

    public void setHandover(LocalDate handover) {
        Handover = handover;
    }

//    public Admin getAdmin() {
//        return admin;
//    }
//
//    public void setAdmin(Admin admin) {
//        this.admin = admin;
//    }
}
