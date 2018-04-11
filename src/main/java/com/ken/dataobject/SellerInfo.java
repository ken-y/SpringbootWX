package com.ken.dataobject;

import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;

@Entity
@Data
public class SellerInfo {
    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
