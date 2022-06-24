package lab3.model.bidirectional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBi {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String street;
    private float zip;
    private String city;
    @OneToOne(fetch = FetchType.EAGER,mappedBy = "address")
    private User user;

}
