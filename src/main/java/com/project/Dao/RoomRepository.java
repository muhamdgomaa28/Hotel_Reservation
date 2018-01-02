package com.project.Dao;

import java.util.List;

import com.project.Models.RoomEntity;
import org.springframework.data.repository.CrudRepository;


public interface RoomRepository extends CrudRepository<RoomEntity, Integer> {
	
	RoomEntity findById(int id);
}
