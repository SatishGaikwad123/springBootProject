package com.nt.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Mobile {
	@Id
	@NonNull
	private Integer mNumber;
	private String mName;
	private String mModelName;

	@OneToMany
	@JoinColumn(name="cIdFk")
	private List<Company> companyList;
}
