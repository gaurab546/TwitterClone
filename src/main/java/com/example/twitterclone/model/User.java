package com.example.twitterclone.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "optimized-sequence")
    private String userId;

@NonNull
@JsonIgnore
    private String password;
@NonNull
    private String screenName;
@NonNull
    private Role role;

    private String bio;

    private String profileImage;
    @ElementCollection
    private Set<String> following;

}
