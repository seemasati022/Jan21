package com.slokam.picogo.cust.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.picogo.cust.entity.CustCountry;
				@Repository
				public interface CustCountryRepo extends JpaRepository<CustCountry, Integer> {

				}
