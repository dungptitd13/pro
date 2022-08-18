package com.fpt.searchadvance.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Dealer {
	private String id;
	private String countryId;
	private String code;
	private String icon;
	private String name;
	private String nameLocal;
	private String phone;
	private String email;
	private String address;
	private String addressLocal;
	private Integer provinceId;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String fax;
	private String district;
	private String postalCode;
	private String parent;
	private String createBy;
	private LocalDateTime createAt;
	private String updateBy;
	private LocalDateTime updateAt;
	private String deleteBy;
	private LocalDateTime deleteAt;
}
