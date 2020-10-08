package com.example.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Created Annotation
@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //constructor to handle our database
    public ReviewRepository() {
        Review Concord = new Review(1L,"Air Jordan 11","/images/AirJordan11.jpg","Sneaker Spotlight","The Air Jordan 11 was first introduced to the world through one of the greatest movies ever in Space Jam. (Ranked my #1)","10/7/2020");
        Review WhiteCement = new Review(2L,"Air Jordan 3","/images/AirJordan3.jpg","Sneaker Spotlight","Jordan made these famous during the 1988 Dunk Contest when His Airness took off from the free throw line and dunked it a la Julius Erving style. (Ranked my #2)","10/7/2020");
        Review Chicago = new Review(3L,"Air Jordan 1","/images/AirJordan1.jpg","Sneaker Spotlight","The one that started it all. (Ranked my #3)","10/7/2020");
        Review FireRed = new Review(4L,"Air Jordan 4","/images/AirJordan4.jpg","Sneaker Spotlight","When these shoes hit the court in 1988 they were doing battle against the “Bad Boy” Pistons. (Ranked my #4)","10/7/2020");
        Review WhiteInfrared = new Review(5L,"Air Jordan 6","/images/AirJordan6.jpg","Sneaker Spotlight","Michael Jordan won his very first NBA Championship during the 1990-1991 season in the Air Jordan 6. (Ranked my #5)","10/7/2020");
        Review Cherry = new Review(6L,"Air Jordan 12","/images/AirJordan12.jpg","Sneaker Spotlight","The 12’s are most famously known for being the shoes MJ wore during the famous “Flu Game” against the Utah Jazz in game 5. (Ranked my #6)","10/7/2020");



        reviewsList.put(Concord.getId(), Concord);
        reviewsList.put(WhiteCement.getId(), WhiteCement);
        reviewsList.put(Chicago.getId(), Chicago);
        reviewsList.put(FireRed.getId(),FireRed);
        reviewsList.put(WhiteInfrared.getId(), WhiteInfrared);
        reviewsList.put(Cherry.getId(),Cherry);
    }

    //constructor for testing purposes only...uses varArgs to add none or as many objects as we want
    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
            reviewsList.put(review.getId(), review);
        }
    }

    //Method to find one by id
    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    //Method to find all by id
    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}
