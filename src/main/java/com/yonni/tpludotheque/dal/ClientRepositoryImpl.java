package com.yonni.tpludotheque.dal;

import com.yonni.tpludotheque.bo.Client;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    NamedParameterJdbcTemplate jdbcTemplate;

    public ClientRepositoryImpl(NamedParameterJdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public void add(Client client) {
        String sql = "INSERT INTO client (nom, prenom, email, no_tel, rue, code_postal, ville)" +
                "VALUES (:nom, :prenom, :email, :noTel, :rue, :codePostal, :ville)";
        namedParameterJdbcTemplate.update(sql, new BeanPropertySqlParameterSource(client));
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public boolean findByEmail(String email) {
        String sql = "SELECT COUNT(*) FROM client WHERE email = :email";
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("email", email);
        Integer count = namedParameterJdbcTemplate.queryForObject(sql, params, Integer.class);

        return (count != null && count > 0);
    }

    @Override
    public List<Client> getAll() {
        String sql = "SELECT c.* FROM client c";

        return namedParameterJdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Client.class));
    }

}
