package com.kurtsevich.computerstore.configuration;

import com.kurtsevich.computerstore.entity.Computer;
import com.kurtsevich.computerstore.entity.Hdd;
import com.kurtsevich.computerstore.entity.Monitor;
import com.kurtsevich.computerstore.entity.Notebook;
import com.kurtsevich.computerstore.entity.enums.ComputerType;
import com.kurtsevich.computerstore.entity.enums.ScreenSize;
import com.kurtsevich.computerstore.repository.ComputerRepository;
import com.kurtsevich.computerstore.repository.HddRepository;
import com.kurtsevich.computerstore.repository.MonitorRepository;
import com.kurtsevich.computerstore.repository.NotebookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class AppConfig {

    @Bean
    public CommandLineRunner dataLoader(ComputerRepository computerRepository, HddRepository hddRepository,
                                        MonitorRepository monitorRepository, NotebookRepository notebookRepository){
        return args -> {
            computerRepository.save(Computer.builder()
                                            .computerType(ComputerType.DESKTOP)
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("Sony")
                                            .price(BigDecimal.valueOf(100))
                                            .count(3)
                                            .build());

            computerRepository.save(Computer.builder()
                                            .computerType(ComputerType.NET_TOP)
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("Dell")
                                            .price(BigDecimal.valueOf(150))
                                            .count(5)
                                            .build());

            computerRepository.save(Computer.builder()
                                            .computerType(ComputerType.MONO_BLOCK)
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("HP")
                                            .price(BigDecimal.valueOf(250))
                                            .count(10)
                                            .build());
            hddRepository.save(Hdd.builder()
                                       .capacity(256)
                                       .serialNumber(UUID.randomUUID().toString())
                                       .producer("WD")
                                       .price(BigDecimal.valueOf(74.2))
                                       .count(3)
                                       .build());
            hddRepository.save(Hdd.builder()
                                       .capacity(512)
                                       .serialNumber(UUID.randomUUID().toString())
                                       .producer("Samsung")
                                       .price(BigDecimal.valueOf(114.5))
                                       .count(1)
                                       .build());
            hddRepository.save(Hdd.builder()
                                       .capacity(1024)
                                       .serialNumber(UUID.randomUUID().toString())
                                       .producer("WD")
                                       .price(BigDecimal.valueOf(200))
                                       .count(6)
                                       .build());
            monitorRepository.save(Monitor.builder()
                                           .diagonal(24)
                                           .serialNumber(UUID.randomUUID().toString())
                                           .producer("Sony")
                                           .price(BigDecimal.valueOf(222))
                                           .count(12)
                                           .build());
            monitorRepository.save(Monitor.builder()
                                           .diagonal(31)
                                           .serialNumber(UUID.randomUUID().toString())
                                           .producer("HP")
                                           .price(BigDecimal.valueOf(333))
                                           .count(1)
                                           .build());
            monitorRepository.save(Monitor.builder()
                                           .diagonal(27)
                                           .serialNumber(UUID.randomUUID().toString())
                                           .producer("Sony")
                                           .price(BigDecimal.valueOf(444))
                                           .count(22)
                                           .build());
            notebookRepository.save(Notebook.builder()
                                            .screenSize(ScreenSize.getByValue(13))
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("Apple")
                                            .price(BigDecimal.valueOf(1222))
                                            .count(2)
                                            .build());
            notebookRepository.save(Notebook.builder()
                                            .screenSize(ScreenSize.getByValue(15))
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("HP")
                                            .price(BigDecimal.valueOf(717))
                                            .count(22)
                                            .build());
            notebookRepository.save(Notebook.builder()
                                            .screenSize(ScreenSize.getByValue(17))
                                            .serialNumber(UUID.randomUUID().toString())
                                            .producer("Lenovo")
                                            .price(BigDecimal.valueOf(800))
                                            .count(9)
                                            .build());

        };
    }
}
