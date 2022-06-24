package Service;

import DTO.ProductDto;
import DTO.ReviewDto;
import Domain.Category;
import Domain.Product;
import Domain.Review;
import Repository.AllRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class AllImpl implements AllService {
    private final AllRepository allrepo;

    private final ModelMapper modelMapper;
    @Override
    public List<ProductDto> getByPriceIsGreaterThan(double minprice) {
        var data= allrepo.getByPriceIsGreaterThan(minprice);
        var result= new ArrayList<ProductDto>();
        for(Product p: data){
            var res= modelMapper.map(p, ProductDto.class);
            result.add(res);
        }
        return result;
      }
      @Override
    public List<ProductDto> getByCategoryAndPriceIsLessThan(Category cat, double maxprice) {
        var lists= allrepo.getByCategoryAndPriceIsLessThan(cat, maxprice);
        var last= new ArrayList<ProductDto>();
        for(Product p: lists){
            var res= modelMapper.map(p, ProductDto.class);
            last.add(res);
        }
        return last;
    }
    @Override
    public List<ProductDto> getByName(String name) {
        var data= allrepo.getByName(name);
        var myresult = new ArrayList<ProductDto>();
        for(Product product: data){
            var latest= modelMapper.map(product, ProductDto.class);
            myresult.add(latest);
        }
        return myresult;
        }

    @Override
    public List<ProductDto> getById(int userid) {
        var data= allrepo.getById(userid);
        var latest= new ArrayList<ProductDto>();
        for(Product x: data){
            var result= modelMapper.map(x, ProductDto.class);
            latest.add(result);}
          return latest;
    }

    @Override
    public List<ReviewDto> findById(int productid) {
        var x= allrepo.findById(productid);
        var last= new ArrayList<ReviewDto>();
        for(Review review: x){
            var result= modelMapper.map(review, ReviewDto.class);
            last.add(result);
        }
        return last;
    }
}
