package com.aydindemir.mapper;

import com.aydindemir.dto.request.DoRegisterRequestDto;
import com.aydindemir.dto.request.UserProfileSaveRequestDto;
import com.aydindemir.model.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);

    Auth toAuth(DoRegisterRequestDto dto);

    @Mapping(target = "authId", source = "id")
    UserProfileSaveRequestDto fromAuth(Auth auth);
}
