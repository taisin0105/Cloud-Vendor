package com.thinkconstructive.restdemo.repository;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository Layer

public interface CloudVendorRepository  extends JpaRepository<CloudVendor, String> {

}
