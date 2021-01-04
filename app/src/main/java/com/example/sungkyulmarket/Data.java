package com.example.sungkyulmarket;

public class Data {
    private String Id;
    private String review;

    public Data(String id, String review) {
        this.Id = id;
        this.review = review;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
