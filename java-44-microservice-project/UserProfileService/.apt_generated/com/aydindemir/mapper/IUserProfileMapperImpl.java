package com.aydindemir.mapper;

import com.aydindemir.dto.request.UserProfileSaveRequestDto;
import com.aydindemir.model.UserProfile;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-09-22T03:49:26+0300",
    comments = "version: 1.6.3, compiler: Eclipse JDT (IDE) 3.46.100.v20260826-1225, environment: Java 25.0.4.1 (Eclipse Adoptium)"
)
@Component
public class IUserProfileMapperImpl implements IUserProfileMapper {

    @Override
    public UserProfile toUserProfile(UserProfileSaveRequestDto dto) {
        if ( dto == null ) {
            return null;
        }

        UserProfile.UserProfileBuilder<?, ?> userProfile = UserProfile.builder();

        userProfile.authId( dto.getAuthId() );
        userProfile.email( dto.getEmail() );
        userProfile.username( dto.getUsername() );

        return userProfile.build();
    }
}
