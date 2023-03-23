package com.example.webproject.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@Table(name = "retweets")
@AllArgsConstructor
public class Retweet extends BaseSingleAction{
}
