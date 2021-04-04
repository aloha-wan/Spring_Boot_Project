package com.example.study.model;

public class SearchParam {

    private String account;
    private String email;
    private int page;

    // 이클립스처럼 자동 생성 기능이 있다.
    // code -> Generate.. -> Getter and Setter
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
