package lab3.lab3.service.product;

import lab3.lab3.dto.ProductDTO;
import lab3.lab3.entity.entity_bi.Category_bi;
import lab3.lab3.entity.entity_bi.Product_bi;
import lab3.lab3.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;
    private final ModelMapper modelMapper;

    @Override
    public List<ProductDTO> getProducts() {

        return productRepo.findAll().stream().map(product -> modelMapper.map(product, ProductDTO.class)).toList();
    }

    @Override
    public void create(ProductDTO productdto) {
        productRepo.save(modelMapper.map(productdto, Product_bi.class));
    }

    @Override
    public void update(ProductDTO productdto, int id) {
        productRepo.save(modelMapper.map(productdto, Product_bi.class));
    }

    @Override
    public void delete(int id) {
        productRepo.deleteById(id);
    }

    @Override
    public List<ProductDTO> getProductCostMoreThan(double price) {
        return productRepo.findAllByPriceAfter(price)
                .stream()
                .map(product_bi -> modelMapper.map(product_bi, ProductDTO.class))
                .toList();
    }

    @Override
    public List<ProductDTO> getProductByCategoryCostLessThan(Category_bi category, double price) {
        return productRepo.findAllByCategoryAndPriceBefore(category, price)
                .stream()
                .map(product_bi -> modelMapper.map(product_bi, ProductDTO.class))
                .toList();
    }

    @Override
    public List<ProductDTO> getProductContainingKeyWord(String keyWord) {
        return productRepo.findAllByNameContains(keyWord)
                .stream()
                .map(product_bi -> modelMapper.map(product_bi, ProductDTO.class))
                .toList();
    }
}
