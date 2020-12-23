package net.babuszka.hws.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Data
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "role")
    Set<User> users;
}
