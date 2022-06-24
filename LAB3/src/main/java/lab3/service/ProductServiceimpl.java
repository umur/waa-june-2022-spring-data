package lab3.service;

import lab3.DTO.ProductDto;
import lab3.DTO.ReviewDto;
import lab3.model.bidirectional.Category;
import lab3.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ProductServiceimpl implements ProductService{
    public final ProductRepository productRepository;

    public ProductServiceimpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public final ModelMapper modelMapper= new ModelMapper();

    @Override
    public List<ProductDto> getproGreaterMinPrice(double price) {
        var greater=new ArrayList<ProductDto>();
        productRepository.getproGreaterMinPrice(price).forEach(x->greater.add(modelMapper.map(x,ProductDto.class)));
        return greater;
    }

    @Override
    public List<ProductDto> getCatLessMinprice(Category cat, double price) {
        List<ProductDto> pri=new ArrayList<>();
        productRepository.getCatLessMinprice(cat,price).forEach(x->pri.add(modelMapper.map(x,ProductDto.class)));
        return pri;
    }

    @Override
    public List<ProductDto> getAllById(int id) {
        List<ProductDto> rr =new ArrayList<>();
        productRepository.getAllById(id).forEach(x->rr.add(modelMapper.map(x,ProductDto.class)));
        return rr;
    }

    @Override
    public List<ReviewDto> getProductId(int proid) {
        List<ReviewDto> proId=new ArrayList<>();
        productRepository.getProductId(proid).forEach(x->proId.add(modelMapper.map(x,ReviewDto.class)));
       return proId;
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductDto> allid=new ArrayList<>();
        productRepository.getAll().forEach(x->allid.add(modelMapper.map(x,ProductDto.class)));
        return null;
    }
}
