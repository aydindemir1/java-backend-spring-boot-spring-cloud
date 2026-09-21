package com.aydindemir.mapper;

import com.aydindemir.dto.request.UserProfileSaveRequestDto;
import com.aydindemir.model.UserProfile;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IUserProfileMapper {

    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);

    UserProfile toUserProfile(UserProfileSaveRequestDto dto);
}
