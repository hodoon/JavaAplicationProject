package exam;

public class Phone {
    private String pName;
    private String company;
    private int price;

    public Phone(){}
    public Phone(String pName, String company, int price) {
        this.pName = pName;
        this.company = company;
        this.price = price;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "pName='" + pName + '\'' +
                ", company='" + company + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
