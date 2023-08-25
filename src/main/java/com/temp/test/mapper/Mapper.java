package com.temp.test.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@org.mapstruct.Mapper
public interface Mapper {
    Mapper INSTANCE = Mappers.getMapper(Mapper.class);

    @Mappings({
            @Mapping(target = "i", source = "a"),
            @Mapping(target = "s", source = "b")
    })
    Re reToCl(Cl re);

    @Mappings({
            @Mapping(target = "a", source = "i"),
            @Mapping(target = "b", source = "s")
    })
    Cl clToRe(Re cl);
}
