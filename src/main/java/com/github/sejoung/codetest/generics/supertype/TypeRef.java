package com.github.sejoung.codetest.generics.supertype;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class TypeRef<T> {

    Type type;

    public TypeRef(){
        Type stype = getClass().getGenericSuperclass();
        if(stype instanceof ParameterizedType){
            this.type = ((ParameterizedType)stype).getActualTypeArguments()[0];
        }else throw new RuntimeException();
    }
    public int hashCode(){
        return type.hashCode(); //type을 기준으로 식별(type은 Class이므로 Class레벨만 식별됨)
    }
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass().getSuperclass() != o.getClass().getSuperclass()) return false;
        TypeRef<?> that = (TypeRef<?>) o;
        return type.equals(that.type); //마찬가지로 두 객체 간의 type을 비교
    }

}
