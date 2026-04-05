package net.balmir.sdiaspringmvc.web;
import net.balmir.sdiaspringmvc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class ProductController {
        @Autowired
        private ProductRepository productRepository;
    }


