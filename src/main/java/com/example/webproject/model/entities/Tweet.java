package com.example.webproject.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tweets")
public class Tweet extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    private String text;

    private Integer retweetCounter;

    private Integer likeCounter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tweet_id", referencedColumnName = "id")
    private Tweet tweet;

    private Instant createdDate;



}
