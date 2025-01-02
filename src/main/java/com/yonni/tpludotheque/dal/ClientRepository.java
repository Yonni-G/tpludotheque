package com.yonni.tpludotheque.dal;

import com.yonni.tpludotheque.bo.Client;

import java.util.List;

public interface ClientRepository {
    void add(Client client);

    void update(Client client);

    boolean findByEmail(String email);

    List<Client> getAll();
}
