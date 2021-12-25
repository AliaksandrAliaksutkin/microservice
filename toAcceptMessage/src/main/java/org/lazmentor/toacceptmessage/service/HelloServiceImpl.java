package org.lazmentor.toacceptmessage.service;

import lombok.RequiredArgsConstructor;
import org.lazmentor.toacceptmessage.model.Hello;
import org.lazmentor.toacceptmessage.repository.HelloRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService{

    private final HelloRepository helloRepository;

    @Override
    public void saveHello(Hello hello) {
        helloRepository.save(hello);
    }

    @Override
    public Long getCount() {
        return helloRepository.count();
    }
}
