package com.ds.survey.com.ds.account.model;

import javax.persistence.*;

/**
 * Created by Mateusz Kaczmarczyk on 2016-11-22.
 */
@Entity
public class UserDetails {

    private Long id;
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
