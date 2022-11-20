package serhat.locationcontrolvenus.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
@Getter // todo: srht -> gerek varmı kontrol et
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String password;
}
