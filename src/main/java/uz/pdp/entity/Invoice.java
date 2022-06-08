package uz.pdp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Invoice {
    private Integer id;
    private Integer ord_id;
    private Double amount;
    private Date issued;
    private Date due;
}
