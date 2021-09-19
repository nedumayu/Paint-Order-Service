package paintorderservice;


import java.time.LocalDate;

public class Order {

    public enum Status {
        PROCESSED,   //обрабатывается
        CANCELED,    //отменен
        INPROGRESS,  //в работе
        COMPLETED    //выполнен
    }

    private int number;  //номер заказа
    private String status;  //статус
    private int payment;  // оплата
    private LocalDate startDate;  //дата начала работы
    private LocalDate endDate;  //дата окончания работы
    private Client client;
    private Artist artist;
    private Preorder preorder;

    public Order(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Preorder getPreorder() {
        return preorder;
    }

    public void setPreorder(Preorder preorder) {
        this.preorder = preorder;
    }
}
