package ru.kmetha.gbpatterns.homework6.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import ru.kmetha.gbpatterns.homework6.entity.common.InfoEntity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "MANUFACTURER")
@EntityListeners(AuditingEntityListener.class)
public class Manufacturer extends InfoEntity {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "manufacturer", cascade = CascadeType.MERGE)
    private Set<Product> products;

    public boolean addProduct(Product product) {
        if (products == null) {
            products = new HashSet<>();
        }
        return products.add(product);
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    @Builder
    public Manufacturer(int version, String createdBy, LocalDateTime createdDate, String lastModifiedBy,
                        LocalDateTime lastModifiedDate, String name, Set<Product> products) {
        super(version, createdBy, createdDate, lastModifiedBy, lastModifiedDate);
        this.name = name;
        this.products = products;
    }
}
