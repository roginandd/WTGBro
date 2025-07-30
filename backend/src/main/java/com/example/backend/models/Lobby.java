package com.example.backend.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
@Entity
@Data
public class Lobby {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name="host_user_id")
    private Users hostId;

    private String joinCode;

    @ManyToMany
    @JoinTable(
        name="lobby_members",
        joinColumns= @JoinColumn(name="lobby_id"),
        inverseJoinColumns=@JoinColumn(name="user_id")
    )
    private List<Users> members;

}
