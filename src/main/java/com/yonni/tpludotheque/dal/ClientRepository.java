package com.yonni.tpludotheque.dal;

import com.yonni.tpludotheque.bo.Client;

public interface ClientRepository {
    void save(Client client);
    //Client findByEmail(String email);
}
