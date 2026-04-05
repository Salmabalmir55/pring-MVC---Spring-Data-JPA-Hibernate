package net.balmir.sdiaspringmvc;
import net.balmir.sdiaspringmvc.entities.Product;
import net.balmir.sdiaspringmvc.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class SdiaSpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SdiaSpringMvcApplication.class, args);
    }
        @Bean
        public CommandLineRunner start(ProductRepository productRepository) {
            return args -> {
                productRepository.save(net.balmir.sdiaspringmvc.entities.Product.builder()
                        .name("Computer")
                        .price(5400)
                        .quantity(12)
                        .build());

                productRepository.save(net.balmir.sdiaspringmvc.entities.Product.builder()
                        .name("Printer")
                        .price(1200)
                        .quantity(11)
                        .build());

                productRepository.save(net.balmir.sdiaspringmvc.entities.Product.builder()
                        .name("Smart Phone")
                        .price(1200)
                        .quantity(33)
                        .build());
                productRepository.findAll().forEach(p -> {
                    System.out.println(p.toString());
                });

            };

        }

    }


