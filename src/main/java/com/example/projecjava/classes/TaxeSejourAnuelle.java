package com.example.projecjava.classes;


import jakarta.persistence.*;


@Entity
public class TaxeSejourAnuelle {

    @Id @GeneratedValue

    private Long id;
    private int year;
    private  float totalAmount;
    private float howMuchPaid;
    private boolean paid;
    @JoinColumn(name = "redevable_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Redevable redevable;

    public float getHowMuchPaid() {
        return howMuchPaid;
    }

    public void setHowMuchPaid(float howMuchPaid) {
        this.howMuchPaid = howMuchPaid;
    }

    public Redevable getRedevable() {
        return redevable;
    }

    public void setRedevable(Redevable redevable) {
        this.redevable = redevable;
    }




    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float calculateTax(float tauxRate)
    {
        return totalAmount * tauxRate;

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
