package ru.geekbrains;

import ru.geekbrains.persist.Product;
import ru.geekbrains.persist.ProductRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product/*")

public class ProductServlet extends HttpServlet {
    private ProductRepository productRepository;

    @Override
    public void init() throws ServletException {
       /* this.productRepository = new ProductRepository();
        this.productRepository.insert(new Product("Product1"));
        this.productRepository.insert(new Product("Product2"));
        this.productRepository.insert(new Product("Product3"));*/
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter wr = resp.getWriter();
        wr.println("<table>");
        wr.println("<tr>");
        wr.println("<th>Id</th>");
        wr.println("<th>Productname</th>");
        wr.println("</tr>");

        for (int i = 1; i <= 10; i++) {
            Product product = new Product("Product" + i);
            wr.println("<tr>");
            wr.println("<td><a href='" + "#link" + "'>" + i + "</a></td>");
            wr.println("<td>" + product.getTitlename() + "</td>");
            wr.println("</tr>");
        }


        wr.println("</table>");
    }
}
