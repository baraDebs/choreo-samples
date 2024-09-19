package gov.ssb.iis.pim.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "lookup")
@ToString
public class LookupEntity {
    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name_en")
    private String nameEn;
    @Column(name = "name_ar")
    private String nameAr;
}
