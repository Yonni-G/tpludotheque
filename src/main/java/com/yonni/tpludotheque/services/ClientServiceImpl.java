package com.yonni.tpludotheque.services;

import com.yonni.tpludotheque.bo.Client;
import com.yonni.tpludotheque.dal.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientServiceImpl implements ClientService{

    ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public boolean save(Client client) {
        if(client.getNoClient() == null) {
            // CREATE

            // on ajoute un nouveau client
            // => on s'assure de l'unicite de l'email
            if(clientRepository.findByEmail(client.getEmail())) return false;
            else {
                clientRepository.add(client);
                return true;
            }

        }
        else {
            // UPDATE
            //TODO on doit s'assurer que le client existe
//            Optional<Client> clientOpt = getById(client.getNoClient());
//            if (clientOpt.isPresent()) {
            clientRepository.update(client);
            return true;
        }
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.getAll();
    }
}
