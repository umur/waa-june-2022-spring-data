package edu.miu.productreview.service;

import edu.miu.productreview.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    public List<Product> getAllProducts();
    public Optional<Product> getProductById(int id);
    public Product createProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProductById(int id);
    public void deleteAllProdut();
}
