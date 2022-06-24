package miu.edu.springdataunidirectional.model;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private int zip;
    private String City;
    @OneToOne
    private User user;
}
