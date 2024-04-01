package com.hotel.app.model;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

	@Entity
	@Table(name="user")
	@Data
	public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		

		@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
		private Set<Reservation> reservations = new HashSet<>();

		@Column(name="first_name")
		private String firstName;

		@Column(name="last_name")
		private String lastName;

		@Column(name="email")
		private String email;
}
