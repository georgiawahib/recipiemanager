package com.recipiemanager;

import java.util.ArrayList;

public class Rating {
    double averageStars;
    int numReviews;
    int totalStars;
    ArrayList<Review> reviews;

    public Rating() {
        this.totalStars = 0;
        this.numReviews = 0;
        this.averageStars = 0.0;
        this.reviews = new ArrayList<Review>();
    }

    public void addReview(Review review) throws Exception {
        if (review.getStarCount() > 5 || review.getStarCount() <= 0) {
            throw new Exception("Reviews must be between 1-5 stars");
        }

        this.numReviews++;
        this.totalStars += review.getStarCount();
        reviews.add(review);
        averageStars = this.calculateAverage();
    }

    private double calculateAverage() {
        return totalStars / numReviews;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }

    public double getAverageStars() {
        return this.averageStars;
    }

    public void printAllReviews() {
        for (int i = 0; i < reviews.size(); i++) {
            reviews.get(i).printReview();
        }
    }
}
