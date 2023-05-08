package com.allane.challenge.vehicle.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Year;

import javax.persistence.AttributeConverter;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Vehicle implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	//VIN may not be used as ID as it may be empty while creation of contract
	
	@Column(name = "vin", nullable = true, unique = true )
	private String vin;
	private String brand;
	private String model;
	@Convert(
		        converter = YearAttributeConverter.class
		    )
	private Year modelYear;
	private BigDecimal price;
	
}

@Converter(autoApply = true)
 class YearAttributeConverter
        implements AttributeConverter<Year, Integer> {
 
    @Override
    public Integer convertToDatabaseColumn(
            Year attribute) {
        if (attribute != null) {
            return (Integer) attribute.getValue();
        }
        return null;
    }
 
    @Override
    public Year convertToEntityAttribute(
    		Integer dbData) {
        if (dbData != null) {
            return Year.of(dbData);
        }
        return null;
    }
}
