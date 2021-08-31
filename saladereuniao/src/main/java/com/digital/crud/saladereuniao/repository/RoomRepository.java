package com.digital.crud.saladereuniao.repository;
import com.digital.crud.saladereuniao.model.Room;
import com.digital.crud.saladereuniao.repository.RoomRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {


}
