package main.java.com.apidemo.domain;

public class Transaction {
    private String Date;
    private String Ledger;
    private String Amount;
    private String Company;

    public Transaction(String date, String ledger, String amount, String company) {
        Date = date;
        Ledger = ledger;
        Amount = amount;
        Company = company;
    }

    public String getDate() {
        return Date;
    }

    public String getLedger() {
        return Ledger;
    }

    public String getAmount() {
        return Amount;
    }

    public String getCompany() {
        return Company;
    }
}
