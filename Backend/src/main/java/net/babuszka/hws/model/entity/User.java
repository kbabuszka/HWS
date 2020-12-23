package net.babuszka.hws.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "username")
    String userName;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    UserRole role;

    @Column(name = "active")
    boolean isActive;

    @OneToMany(mappedBy = "owner")
    private Set<Station> stations;

}
