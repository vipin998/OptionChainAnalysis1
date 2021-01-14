package com.option.chain.analysis.model;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Option_Chain")
@Setter @Getter
public class OpJsonData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "symbol")
	private String symbol;

	@Column(name = "last_updated_time")
	Instant lastUpdatedTime;

	
	  @Column(name = "option_time_series",columnDefinition="CLOB NOT NULL") 
	  private String optionTimeSeries;
	  
	 // @Column(name = "total_option") private String totalOption;

	

}
