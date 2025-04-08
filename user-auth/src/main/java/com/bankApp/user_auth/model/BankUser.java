package com.bankApp.user_auth.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class BankUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true, nullable = false)
    private long phnNum;
    private long acntNum;
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    public BankUser() {
    }

    public BankUser(long id, long phnNum, long acntNum, String name, String email, String password) {
        this.id = id;
        this.phnNum = phnNum;
        this.acntNum = acntNum;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(long phnNum) {
        this.phnNum = phnNum;
    }

    public long getAcntNum() {
        return acntNum;
    }

    public void setAcntNum(long acntNum) {
        this.acntNum = acntNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BankUser bankUser = (BankUser) o;
        return id == bankUser.id && phnNum == bankUser.phnNum && acntNum == bankUser.acntNum && Objects.equals(name, bankUser.name) && Objects.equals(email, bankUser.email) && Objects.equals(password, bankUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phnNum, acntNum, name, email, password);
    }
}
