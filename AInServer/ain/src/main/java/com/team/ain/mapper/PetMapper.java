package com.team.ain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.team.ain.dto.Pet;
import com.team.ain.dto.PetRegist;

@Mapper
public interface PetMapper {


    // 생성
    void insertPet(PetRegist pet);

    // ID 조회
    Pet selectPetById(int id);

    // 전체 조회
    List<Pet> selectAllPets();

    // 수정
    void updatePet(Pet pet);

    // 삭제
    void deletePet(int id);
    
    Pet findByMemberId(int id);
}
