package com.luv2code.springbootlibrary.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "checkout")
@Data
public class Checkout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    private Long id;

    @Column(name ="user_Email")
    private String userEmail;

    @Column(name ="checkout_Date")
    private String checkoutDate;

    @Column(name ="return_Date")
    private String returnDate;

    @Column(name ="book_id")
    private Long bookId;
    public Checkout() {

    }

    public Checkout(String userEmail, String checkoutDate, String returnDate, Long bookId) {
        this.userEmail = userEmail;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
    }

}
