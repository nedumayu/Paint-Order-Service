package paintorderservice;

public class Preorder {

    public enum Term {
        URGENT,     //срочный
        NONURGENT   //несрочный
    }

    private int number;  //номер предзаказа
    private String style;  //стиль
    private String genre;  //жанр
    private String technique;  //техника
    private String material;  //материал
    private int width;  //ширина работы
    private int length;  //высота работы
    private int copiesCount;  //количество копий
    private Term termType;  //тип срока выполнения
    private int daysCount;  //срок выполнения
    private String comment;  //комментарий
    private String picURL;  //адрес картинки
    private Client client;


    public Preorder(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTechnique() {
        return technique;
    }

    public void setTechnique(String technique) {
        this.technique = technique;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getCopiesCount() {
        return copiesCount;
    }

    public void setCopiesCount(int copiesCount) {
        this.copiesCount = copiesCount;
    }

    public Term getTermType() {
        return termType;
    }

    public void setTermType(Term termType) {
        this.termType = termType;
    }

    public int getDaysCount() {
        return daysCount;
    }

    public void setDaysCount(int daysCount) {
        this.daysCount = daysCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPicURL() {
        return picURL;
    }

    public void setPicURL(String picURL) {
        this.picURL = picURL;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
