package com.yonni.tpludotheque.services;

import com.yonni.tpludotheque.bo.Client;

import java.util.List;

public interface ClientService {
    boolean save(Client client);

    List<Client> getAll();
}
