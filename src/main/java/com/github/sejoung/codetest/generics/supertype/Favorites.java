package com.github.sejoung.codetest.generics.supertype;

import java.lang.reflect.ParameterizedType;
import java.util.*;

public class Favorites {
    // 코드 33-3 타입 안전 이종 컨테이너 패턴 - 구현 (200쪽)
    private Map<TypeRef<?>, Object> favorites = new HashMap<>();

    public <T> T getFavorite(TypeRef<T> tr) {
        if(tr.type instanceof Class<?>){ //일반클래스인 경우
            return ((Class<T>)tr.type).cast(favorites.get(tr));
        }else{ //제네릭타입인 경우
            return ((Class<T>)((ParameterizedType)tr.type).getRawType()).cast(favorites.get(tr));
        }
    }

    // 코드 33-4 동적 형변환으로 런타임 타입 안전성 확보 (202쪽)
    public <T> void putFavorite(TypeRef<T> tr, T instance) {
        favorites.put(Objects.requireNonNull(tr), instance);
    }

    // 코드 33-2 타입 안전 이종 컨테이너 패턴 - 클라이언트 (199쪽)
    public static void main(String[] args) {
        Favorites f = new Favorites();
        f.putFavorite(new TypeRef<List<String>>(){}, Arrays.asList("바보","천재"));

        List<String> listOfString = f.getFavorite(new TypeRef<List<String>>(){});

        listOfString.forEach((s -> {
            System.out.println(s);
        }));


    }
}
