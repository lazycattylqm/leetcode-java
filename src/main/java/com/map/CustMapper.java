package com.map;

import org.mapstruct.MapMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.HashMap;
import java.util.Map;

@Mapper
public interface CustMapper {
    CustMapper INSTANCE = Mappers.getMapper(CustMapper.class);


    @Mapping(target = "key", source = "name")
    HashMap<String, Object> toMap(Bean bean);


    Bean toBean(Map<String, String> map);
}
