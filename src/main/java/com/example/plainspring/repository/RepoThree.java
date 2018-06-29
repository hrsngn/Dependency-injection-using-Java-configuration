package com.example.plainspring.repository;

import com.example.plainspring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class RepoThree {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public RepoThree(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void findAll(){
        System.out.println("REPOTHREE find All()");
        List<User> users = this.jdbcTemplate.query("select * from user", new BeanPropertyRowMapper(User.class));
        for (User u:users) {
            System.out.println(u.getUser_name());
        }
    }

    public int countUser(){
        int counter = this.jdbcTemplate.queryForObject("select count(*) from user", Integer.class);
        return counter;
    }
}
