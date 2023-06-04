package com.dslearn.programa.domain.utilitarios;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;
@Component("mapperUtil")
public class ModelMapperUtil {
    protected ModelMapper modelMapper;


    public ModelMapperUtil(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }


    public <S, D> D mapTo(S source, Class<D> destClass){
        return this.modelMapper.map(source, destClass);
    }

    public <S, D> List<D> toList(List<S> source, Type destClass){
        return this.modelMapper.map(source, destClass);
    }
}
