package com.yonni.tpludotheque.dal;

import com.yonni.tpludotheque.bo.Client;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    NamedParameterJdbcTemplate jdbcTemplate;

    public ClientRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Client client) {

    }

//    @Override
//    public Client findByEmail(String email) {
//        String sql = "select * from client where email = :email";
//    }
}
