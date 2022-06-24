package lab3.lab3.controller;

import lab3.lab3.dto.AddressDTO;
import lab3.lab3.service.address.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @GetMapping
    public List<AddressDTO> getProducts() {
        return addressService.getAddresses();
    }

    @PostMapping
    public void save(@RequestBody AddressDTO userDTO) {
        addressService.create(userDTO);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        addressService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody AddressDTO userDTO, @PathVariable int id) {
        addressService.update(userDTO, id);
    }
}
