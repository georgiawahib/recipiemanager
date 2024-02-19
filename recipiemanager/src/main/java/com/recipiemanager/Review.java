package com.recipiemanager;

public class Review {
    int starCount;
    String feedback;
    String author;

    public Review(int starCount, String feedback, String author) {
        this.starCount = starCount;
        this.feedback = feedback;
        this.author = author;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public int getStarCount() {
        return this.starCount;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void printReview() {
        System.out.println("Star Rating: " + this.starCount);
        System.out.println("Written by: " + this.author);
        System.out.println(this.feedback);
    }
}
