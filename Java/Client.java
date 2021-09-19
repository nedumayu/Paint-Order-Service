package paintorderservice;

public class Client {

    public enum Status {
        ACTIVE,
        INACTIVE
    }

    private String fullName;  //полное имя
    private String phoneNumber;  //контактный телефон
    private String email;  //электронная почта
    private Status status;  //статус

    public Client(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
