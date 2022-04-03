package ru.geekbrains;

import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepositoryImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

class BootstrapListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ProductRepositoryImpl productRepository = new ProductRepositoryImpl();
        productRepository.insert(new Product("Product1"));
        productRepository.insert(new Product("Product2"));
        productRepository.insert(new Product("Product3"));
        sce.getServletContext().setAttribute("productRepository", productRepository);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
