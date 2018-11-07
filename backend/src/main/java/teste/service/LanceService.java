package teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import teste.repository.LanceRepository;

@Service
public class LanceService {

    @Autowired
    private LanceRepository lanceRepository;

    public void print() {
        System.out.println("chegou aqui");
    }
}
