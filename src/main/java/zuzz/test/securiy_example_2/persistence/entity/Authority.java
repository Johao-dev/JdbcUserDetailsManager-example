package zuzz.test.securiy_example_2.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authorities", uniqueConstraints = {
    @UniqueConstraint(name = "ix_auth_username", columnNames = {"username", "authority"})
})
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Authority {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "authority", length = 50, nullable = false)
    private String authority;
    
    @ManyToOne
    @JoinColumn(name = "username", nullable = false, foreignKey = @ForeignKey(name = "fk_authorites_users"))
    private UserEntity user;
}
